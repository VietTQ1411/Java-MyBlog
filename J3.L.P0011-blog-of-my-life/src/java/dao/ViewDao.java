/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 * Purpose: Connect with database and update view Date : Feb 21, 2020, 9:59:13
 * AM
 *
 * @author viettqhe130524
 */
public class ViewDao extends GennericDAO {

    /**
     * Update view total of all blog 
     * Date : Feb 21, 2020, 9:59:13 AM 
     * 
     * view total = view current + 1
     *
     * @return true if update success and false if error
     */
    public boolean UpdateView() {
        String sql = "UPDATE [dbo].[View]\n"
                + "   SET [ViewCount] = ?\n"
                + " WHERE id = 1;";
        return update(sql, getView() + 1);
    }

    /**
     * Take the current total of view
     * Date : Feb 21, 2020, 9:59:13 AM
     * @return -1 if error or current view
     */
    public int getView() {
        String sql = "SELECT [ViewCount]\n"
                + "  FROM [dbo].[View]\n"
                + "  where id = 1";
        return count(sql);
    }
}
