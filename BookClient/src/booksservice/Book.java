
package booksservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour book complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="book">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="likeNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dislikeNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userRate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "book", propOrder = {
    "title",
    "likeNum",
    "dislikeNum",
    "userRate"
})
public class Book {

    protected String title;
    protected int likeNum;
    protected int dislikeNum;
    protected int userRate;

    /**
     * Obtient la valeur de la propri�t� title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * D�finit la valeur de la propri�t� title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propri�t� likeNum.
     * 
     */
    public int getLikeNum() {
        return likeNum;
    }

    /**
     * D�finit la valeur de la propri�t� likeNum.
     * 
     */
    public void setLikeNum(int value) {
        this.likeNum = value;
    }

    /**
     * Obtient la valeur de la propri�t� dislikeNum.
     * 
     */
    public int getDislikeNum() {
        return dislikeNum;
    }

    /**
     * D�finit la valeur de la propri�t� dislikeNum.
     * 
     */
    public void setDislikeNum(int value) {
        this.dislikeNum = value;
    }

    /**
     * Obtient la valeur de la propri�t� userRate.
     * 
     */
    public int getUserRate() {
        return userRate;
    }

    /**
     * D�finit la valeur de la propri�t� userRate.
     * 
     */
    public void setUserRate(int value) {
        this.userRate = value;
    }

}
