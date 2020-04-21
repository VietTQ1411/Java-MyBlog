package dao;

import Mapper.HomeMapper;
import entities.Home;
import java.util.List;

/**
 * HomeDao
 *
 * Connect with database for Home entity object
 * 
 * @author viettqhe130524
 * @version 1.0
 */
public class HomeDao extends GennericDAO {

    /**
     * 
     * get Detail of Home object with id input
     *
     * @param id
     * @return a Home
     */
    public Home getDetailsPost(int id){

        Home home = null;
        String query = "SELECT [id]\n"
                + "      ,[type]\n"
                + "      ,[title]\n"
                + "      ,[imgLink]\n"
                + "      ,[fullContent] as Content\n"
                + "      ,[author]\n"
                + "      ,[createDate]\n"
                + "  FROM [dbo].[Home] where id = ?";

        List<Home> Home = query(query, new HomeMapper(), id);
        return Home.isEmpty() ? null : Home.get(0);
    }

    /**
     * get the list of blog with short content to show in to home
     *
     *
     * @param page
     * @param pageSize
     *
     * @return a list
     * @throws java.lang.Exception
     */
    public List<Home> getPost(int page, int pageSize) throws Exception {
        int from = page * pageSize - (pageSize - 1);
        int to = page * pageSize;

        String query = "SELECT [id]\n"
                + "      ,[type]\n"
                + "      ,[title]\n"
                + "      ,[imgLink]\n"
                + "      ,[shortContent] as Content\n"
                + "      ,[author]\n"
                + "      ,[createDate]\n"
                + "  FROM  "
                + "( select *, ROW_NUMBER() over (order by createDate) as rownumber from Home) "
                + "as home where home.rownumber >= ? and home.rownumber <= ?";

        return query(query, new HomeMapper(), from, to);
    }

    /**
     * Count total page with pageSize of blog
     *
     * @param pageSize
     * @return a number of new
     */
    public int getTotalPage(int pageSize){
        String query = "select count(*) from Home";

        int totalPage = count(query);
        if(totalPage == -1){
            return totalPage;
        }
        
        //tính tổng số trang để hiển thị 
        if (totalPage % pageSize == 0) {
            totalPage = totalPage / pageSize;
        } else {
            totalPage = totalPage / pageSize + 1;
        }
        return totalPage;
    }

}
