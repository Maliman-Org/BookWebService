
package booksservice;

import java.io.Serializable;
import java.util.Date;
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
    
    private int id;
    private String title;
    private int numberOfLikes,numberOfDislikes;

    public Book() {
    }

    public Book(int id, String title, int likeNum, int dislikeNum) {
        this.id = id;
        this.title = title;
        this.numberOfLikes = likeNum;
        this.numberOfDislikes = dislikeNum;
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
        return numberOfLikes;
    }

    public void setLikeNum(int likeNum) {
        this.numberOfLikes = likeNum;
    }

    public int getDislikeNum() {
        return numberOfDislikes;
    }

    public void setDislikeNum(int dislikeNum) {
        this.numberOfDislikes = dislikeNum;
    }
    
    
}
