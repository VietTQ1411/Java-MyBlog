/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import entities.Home;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Purpose: Mapping data of Article
 *
 * Feb 21, 2020, 9:59:13 AM
 *
 * @author viettqhe130524
 */
public class HomeMapper implements RowMapper<Home> {

    /**
     * Purpose: Mapping data of Article with Result set Return Home if
     * mapping success and null if error
     *
     * Date : Feb 21, 2020, 9:59:13 AM
     *
     * @author viettqhe130524
     */
    @Override
    public Home mapRow(ResultSet rs) {
        try {
            //create object with data from database
            int id = rs.getInt("id");
            String type = rs.getString("type");
            String title = rs.getString("title");
            String imgLink = rs.getString("imgLink");
            String content = rs.getString("Content");
            String author = rs.getString("author");
            String createDate = formatDate("dd-MM-yyyy", rs.getString("createDate"));
            Home home = new Home(id, type, title, imgLink, content, author, createDate);

            return home;
        } catch (SQLException e) {
            System.out.println("Can't get Data from database,Some fied error");
            return null;
        }
    }
    
    /**
     * formatDate.
     * Covert date input form yyyy-MM-dd type into pattern type 
     * 
     * @param pattern - string date convert to
     * @param input
     * @return a string date or null
     */
    public String formatDate(String pattern, String input) {
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = df.parse(input);
        } catch (ParseException ex) {
            System.err.println("Can't covert date");
        }
        return date==null?null:format.format(date);
    }

    public static void main(String[] args) {
        System.out.println(new HomeMapper().formatDate("dd-MM-yyyy", "1991-12-12"));
    }
}
