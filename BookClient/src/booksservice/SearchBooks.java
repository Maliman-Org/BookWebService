
package booksservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchBooks complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchBooks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="whateverYourRemeberAboutTheTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchBooks", propOrder = {
    "whateverYourRemeberAboutTheTitle"
})
public class SearchBooks {

    protected String whateverYourRemeberAboutTheTitle;

    /**
     * Obtient la valeur de la propriété whateverYourRemeberAboutTheTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhateverYourRemeberAboutTheTitle() {
        return whateverYourRemeberAboutTheTitle;
    }

    /**
     * Définit la valeur de la propriété whateverYourRemeberAboutTheTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhateverYourRemeberAboutTheTitle(String value) {
        this.whateverYourRemeberAboutTheTitle = value;
    }

}
