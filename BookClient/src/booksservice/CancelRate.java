
package booksservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour cancelRate complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cancelRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="theBook" type="{http://booksservice/}book" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelRate", propOrder = {
    "theBook"
})
public class CancelRate {

    protected Book theBook;

    /**
     * Obtient la valeur de la propriété theBook.
     * 
     * @return
     *     possible object is
     *     {@link Book }
     *     
     */
    public Book getTheBook() {
        return theBook;
    }

    /**
     * Définit la valeur de la propriété theBook.
     * 
     * @param value
     *     allowed object is
     *     {@link Book }
     *     
     */
    public void setTheBook(Book value) {
        this.theBook = value;
    }

}
