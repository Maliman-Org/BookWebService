
package booksservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour book complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété title.
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
     * Définit la valeur de la propriété title.
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
     * Obtient la valeur de la propriété likeNum.
     * 
     */
    public int getLikeNum() {
        return likeNum;
    }

    /**
     * Définit la valeur de la propriété likeNum.
     * 
     */
    public void setLikeNum(int value) {
        this.likeNum = value;
    }

    /**
     * Obtient la valeur de la propriété dislikeNum.
     * 
     */
    public int getDislikeNum() {
        return dislikeNum;
    }

    /**
     * Définit la valeur de la propriété dislikeNum.
     * 
     */
    public void setDislikeNum(int value) {
        this.dislikeNum = value;
    }

    /**
     * Obtient la valeur de la propriété userRate.
     * 
     */
    public int getUserRate() {
        return userRate;
    }

    /**
     * Définit la valeur de la propriété userRate.
     * 
     */
    public void setUserRate(int value) {
        this.userRate = value;
    }

}
