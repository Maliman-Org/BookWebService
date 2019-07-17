
package booksservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manno
 */
@XmlRootElement(name="Book")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book implements Serializable{
    @XmlTransient
    private int id;
    private String title;
    private int likeNum,dislikeNum;
    private int userRate;

    public Book() {
    }

    public Book(int id, String title, int likeNum, int dislikeNum, int userRate) {
        this.id = id;
        this.title = title;
        this.likeNum = likeNum;
        this.dislikeNum = dislikeNum;
        this.userRate = userRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public int getDislikeNum() {
        return dislikeNum;
    }

    public void setDislikeNum(int dislikeNum) {
        this.dislikeNum = dislikeNum;
    }

    public int getUserRate() {
        return userRate;
    }

    public void setUserRate(int userRate) {
        this.userRate = userRate;
    }
    
    
}
