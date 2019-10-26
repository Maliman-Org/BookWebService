
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfLikes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfDislikes" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "id",
    "title",
    "numberOfLikes",
    "numberOfDislikes"
})
public class Book {

    protected int id;
    protected String title;
    protected int numberOfLikes;
    protected int numberOfDislikes;

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

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
     * Obtient la valeur de la propri�t� numberOfLikes.
     * 
     */
    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    /**
     * D�finit la valeur de la propri�t� numberOfLikes.
     * 
     */
    public void setNumberOfLikes(int value) {
        this.numberOfLikes = value;
    }

    /**
     * Obtient la valeur de la propri�t� numberOfDislikes.
     * 
     */
    public int getNumberOfDislikes() {
        return numberOfDislikes;
    }

    /**
     * D�finit la valeur de la propri�t� numberOfDislikes.
     * 
     */
    public void setNumberOfDislikes(int value) {
        this.numberOfDislikes = value;
    }

}
