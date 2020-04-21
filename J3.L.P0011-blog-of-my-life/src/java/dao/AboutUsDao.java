
package dao;

import Mapper.AboutMapper;
import entities.AboutUs;
import java.util.List;

/**
 * AboutUsDaoDao
 *
 * Connect with database and take all off About
 * @author viettqhe130524
 */
public class AboutUsDao extends GennericDAO{

    /**
     * getAllIn4
     *
     * Get all of about information
     *
     * @return a AboutUs
     */
    public AboutUs getAllIn4() {
        String query = "select * from Information";
        
        List<AboutUs> About = query(query, new AboutMapper());
        return About.isEmpty() ? null : About.get(0);
    }

}
