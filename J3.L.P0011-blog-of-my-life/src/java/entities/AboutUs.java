
package entities;

/**
 * AboutUs.<br>
 *
 * <pre>
 * Class mô tả đối tượng AboutUs
 * Trong class này sẽ tiến hành các xử lí dưới đây
 * 
 * @author viettqhe130524
 * @version 1.0
 */
public class AboutUs {

    /**
     * Store id.
     */

    private int id;
    /**
     * Store content.
     */

    private String content;
    /**
     * Store name.
     */

    private String name;

    /**
     * Constructor full parameter<br>
     *
     * @param id
     * @param content
     * @param name
     *
     */
    public AboutUs(int id, String content, String name) {
        this.id = id;
        this.content = content;
        this.name = name;
    }

    /**
     * Get id.<br>
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set id.<br>
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get content.<br>
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * Set content.<br>
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Set name.<br>
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.<br>
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
