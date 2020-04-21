
package entities;

/**
 * Home.<br>
 *
 * <pre>
 * Class mô tả đối tượng AboutUs
 * Trong class này sẽ tiến hành các xử lí dưới đây
 *
 * . GetId.
 * . SetId.
 * . GetType.
 * . SetType.
 * . GetTitle.
 * . setTitle.
 * . GetimgLink.
 * . setimgLink.
 * . SetContent.
 *  . GetContent.
 * . SetAuthor.
 * . GetAuthor.
 * . SetCreatDate.
 *  . GetCreatDate.
 *
 *
 * </pre>
 *
 * @author viettqhe130524
 * @version 1.0
 */
public class Home {
/**
     * Store id.
     */

    private int id;
    /**
     * Store type.
     */

    private String type;
    /**
     * Store title.
     */

    private String title;
    /**
     * Store image link.
     */

    private String imgLink;
    /**
     * Store short or full content.
     */

    private String content;
    /**
     * Store author.
     */

    private String author;
    /**
     * Store written date .
     */

    private String createDate;
/**
     * Constructor full parameter<br>
     *
     * @param id
     * @param type
     * @param title
     * @param imgLink
     * @param content
     * @param author
     * @param createDate
     *
     */
    public Home(int id, String type, String title, String imgLink, String content, String author, String createDate) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.imgLink = imgLink;
        this.content = content;
        this.author = author;
        this.createDate = createDate;
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
     * Set type.<br>
     *
     * @return 
     */
    public String getType() {
        return type;
    }
 /**
     * Set type.<br>
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
 /**
     * Get title.<br>
     *
     * @return 
     */
    public String getTitle() {
        return title;
    }
/**
     * Set title.<br>
     *
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }
 /**
     * Get imgLink.<br>
     *
     * @return 
     */
    public String getImgLink() {
        return imgLink;
    }
 /**
     * Set imgLink.<br>
     *
     * @param imgLink
     */
    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }
 /**
     * Get content.<br>
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
     * Get author.<br>
     *
     * @return 
     */
    public String getAuthor() {
        return author;
    }
 /**
     * Set author.<br>
     *
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }
 /**
     * Get createDate.<br>
     *
     * @return 
     */
    public String getCreateDate() {
        return createDate;
    }
 /**
     * Set createDate.<br>
     *
     * @param createDate
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

  

}
