
package booksservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour like complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="like">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="thisBook" type="{http://booksservice/}book" minOccurs="0"/>
 *         &lt;element name="iLikeIt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "like", propOrder = {
    "thisBook",
    "iLikeIt"
})
public class Like {

    protected Book thisBook;
    protected boolean iLikeIt;

    /**
     * Obtient la valeur de la propri�t� thisBook.
     * 
     * @return
     *     possible object is
     *     {@link Book }
     *     
     */
    public Book getThisBook() {
        return thisBook;
    }

    /**
     * D�finit la valeur de la propri�t� thisBook.
     * 
     * @param value
     *     allowed object is
     *     {@link Book }
     *     
     */
    public void setThisBook(Book value) {
        this.thisBook = value;
    }

    /**
     * Obtient la valeur de la propri�t� iLikeIt.
     * 
     */
    public boolean isILikeIt() {
        return iLikeIt;
    }

    /**
     * D�finit la valeur de la propri�t� iLikeIt.
     * 
     */
    public void setILikeIt(boolean value) {
        this.iLikeIt = value;
    }

}
