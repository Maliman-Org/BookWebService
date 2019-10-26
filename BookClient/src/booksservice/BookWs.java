
package booksservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BookWs", targetNamespace = "http://booksservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookWs {


    /**
     * 
     * @param ofthisBook
     * @param thatIliked
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cancelMyRate", targetNamespace = "http://booksservice/", className = "booksservice.CancelMyRate")
    @ResponseWrapper(localName = "cancelMyRateResponse", targetNamespace = "http://booksservice/", className = "booksservice.CancelMyRateResponse")
    @Action(input = "http://booksservice/BookWs/cancelMyRateRequest", output = "http://booksservice/BookWs/cancelMyRateResponse")
    public boolean cancelMyRate(
        @WebParam(name = "ofthisBook", targetNamespace = "")
        Book ofthisBook,
        @WebParam(name = "thatIliked", targetNamespace = "")
        boolean thatIliked);

    /**
     * 
     * @param iLikeIt
     * @param thisBook
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "like", targetNamespace = "http://booksservice/", className = "booksservice.Like")
    @ResponseWrapper(localName = "likeResponse", targetNamespace = "http://booksservice/", className = "booksservice.LikeResponse")
    @Action(input = "http://booksservice/BookWs/likeRequest", output = "http://booksservice/BookWs/likeResponse")
    public boolean like(
        @WebParam(name = "thisBook", targetNamespace = "")
        Book thisBook,
        @WebParam(name = "iLikeIt", targetNamespace = "")
        boolean iLikeIt);

    /**
     * 
     * @param whateverYourRemeberAboutTheTitle
     * @return
     *     returns java.util.List<booksservice.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchBooks", targetNamespace = "http://booksservice/", className = "booksservice.SearchBooks")
    @ResponseWrapper(localName = "searchBooksResponse", targetNamespace = "http://booksservice/", className = "booksservice.SearchBooksResponse")
    @Action(input = "http://booksservice/BookWs/searchBooksRequest", output = "http://booksservice/BookWs/searchBooksResponse")
    public List<Book> searchBooks(
        @WebParam(name = "whateverYourRemeberAboutTheTitle", targetNamespace = "")
        String whateverYourRemeberAboutTheTitle);

}