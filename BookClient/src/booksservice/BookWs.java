
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
     * @param theBook
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cancelRate", targetNamespace = "http://booksservice/", className = "booksservice.CancelRate")
    @ResponseWrapper(localName = "cancelRateResponse", targetNamespace = "http://booksservice/", className = "booksservice.CancelRateResponse")
    @Action(input = "http://booksservice/BookWs/cancelRateRequest", output = "http://booksservice/BookWs/cancelRateResponse")
    public boolean cancelRate(
        @WebParam(name = "theBook", targetNamespace = "")
        Book theBook);

    /**
     * 
     * @param book
     * @param iLike
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "like", targetNamespace = "http://booksservice/", className = "booksservice.Like")
    @ResponseWrapper(localName = "likeResponse", targetNamespace = "http://booksservice/", className = "booksservice.LikeResponse")
    @Action(input = "http://booksservice/BookWs/likeRequest", output = "http://booksservice/BookWs/likeResponse")
    public boolean like(
        @WebParam(name = "book", targetNamespace = "")
        Book book,
        @WebParam(name = "iLike", targetNamespace = "")
        boolean iLike);

    /**
     * 
     * @param language
     * @return
     *     returns java.util.List<booksservice.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchBooks", targetNamespace = "http://booksservice/", className = "booksservice.SearchBooks")
    @ResponseWrapper(localName = "searchBooksResponse", targetNamespace = "http://booksservice/", className = "booksservice.SearchBooksResponse")
    @Action(input = "http://booksservice/BookWs/searchBooksRequest", output = "http://booksservice/BookWs/searchBooksResponse")
    public List<Book> searchBooks(
        @WebParam(name = "language", targetNamespace = "")
        String language);

}