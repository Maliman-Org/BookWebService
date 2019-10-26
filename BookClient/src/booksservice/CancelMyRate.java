
package booksservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour cancelMyRate complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cancelMyRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ofthisBook" type="{http://booksservice/}book" minOccurs="0"/>
 *         &lt;element name="thatIliked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelMyRate", propOrder = {
    "ofthisBook",
    "thatIliked"
})
public class CancelMyRate {

    protected Book ofthisBook;
    protected boolean thatIliked;

    /**
     * Obtient la valeur de la propriété ofthisBook.
     * 
     * @return
     *     possible object is
     *     {@link Book }
     *     
     */
    public Book getOfthisBook() {
        return ofthisBook;
    }

    /**
     * Définit la valeur de la propriété ofthisBook.
     * 
     * @param value
     *     allowed object is
     *     {@link Book }
     *     
     */
    public void setOfthisBook(Book value) {
        this.ofthisBook = value;
    }

    /**
     * Obtient la valeur de la propriété thatIliked.
     * 
     */
    public boolean isThatIliked() {
        return thatIliked;
    }

    /**
     * Définit la valeur de la propriété thatIliked.
     * 
     */
    public void setThatIliked(boolean value) {
        this.thatIliked = value;
    }

}
