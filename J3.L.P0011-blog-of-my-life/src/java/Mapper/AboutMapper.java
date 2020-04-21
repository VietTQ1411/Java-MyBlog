/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import entities.AboutUs;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Purpose: Mapping data of Article
 *
 * Feb 21, 2020, 9:59:13 AM
 *
 * @author viettqhe130524
 */
public class AboutMapper implements RowMapper<AboutUs> {

    /**
     * Purpose: Mapping data of Article with Result set Return Home if
     * mapping success and null if error
     *
     * Date : Feb 21, 2020, 9:59:13 AM
     *
     * @author viettqhe130524
     */
    @Override
    public AboutUs mapRow(ResultSet rs) {
        try {
            int id = rs.getInt("id");
            String content = rs.getString("content");
            String name = rs.getString("name");
            
            return new AboutUs(id, content, name);
        } catch (SQLException e) {
             System.out.println("Can't get Data from database,Some fied error");
            return null;
        }
    }

}
