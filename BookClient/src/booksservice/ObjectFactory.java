
package booksservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the booksservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CancelMyRate_QNAME = new QName("http://booksservice/", "cancelMyRate");
    private final static QName _CancelMyRateResponse_QNAME = new QName("http://booksservice/", "cancelMyRateResponse");
    private final static QName _LikeResponse_QNAME = new QName("http://booksservice/", "likeResponse");
    private final static QName _SearchBooks_QNAME = new QName("http://booksservice/", "searchBooks");
    private final static QName _Book_QNAME = new QName("http://booksservice/", "Book");
    private final static QName _Like_QNAME = new QName("http://booksservice/", "like");
    private final static QName _SearchBooksResponse_QNAME = new QName("http://booksservice/", "searchBooksResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: booksservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchBooks }
     * 
     */
    public SearchBooks createSearchBooks() {
        return new SearchBooks();
    }

    /**
     * Create an instance of {@link SearchBooksResponse }
     * 
     */
    public SearchBooksResponse createSearchBooksResponse() {
        return new SearchBooksResponse();
    }

    /**
     * Create an instance of {@link Like }
     * 
     */
    public Like createLike() {
        return new Like();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link CancelMyRate }
     * 
     */
    public CancelMyRate createCancelMyRate() {
        return new CancelMyRate();
    }

    /**
     * Create an instance of {@link CancelMyRateResponse }
     * 
     */
    public CancelMyRateResponse createCancelMyRateResponse() {
        return new CancelMyRateResponse();
    }

    /**
     * Create an instance of {@link LikeResponse }
     * 
     */
    public LikeResponse createLikeResponse() {
        return new LikeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelMyRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booksservice/", name = "cancelMyRate")
    public JAXBElement<CancelMyRate> createCancelMyRate(CancelMyRate value) {
        return new JAXBElement<CancelMyRate>(_CancelMyRate_QNAME, CancelMyRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelMyRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booksservice/", name = "cancelMyRateResponse")
    public JAXBElement<CancelMyRateResponse> createCancelMyRateResponse(CancelMyRateResponse value) {
        return new JAXBElement<CancelMyRateResponse>(_CancelMyRateResponse_QNAME, CancelMyRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LikeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booksservice/", name = "likeResponse")
    public JAXBElement<LikeResponse> createLikeResponse(LikeResponse value) {
        return new JAXBElement<LikeResponse>(_LikeResponse_QNAME, LikeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booksservice/", name = "searchBooks")
    public JAXBElement<SearchBooks> createSearchBooks(SearchBooks value) {
        return new JAXBElement<SearchBooks>(_SearchBooks_QNAME, SearchBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booksservice/", name = "Book")
    public JAXBElement<Book> createBook(Book value) {
        return new JAXBElement<Book>(_Book_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Like }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booksservice/", name = "like")
    public JAXBElement<Like> createLike(Like value) {
        return new JAXBElement<Like>(_Like_QNAME, Like.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booksservice/", name = "searchBooksResponse")
    public JAXBElement<SearchBooksResponse> createSearchBooksResponse(SearchBooksResponse value) {
        return new JAXBElement<SearchBooksResponse>(_SearchBooksResponse_QNAME, SearchBooksResponse.class, null, value);
    }

}
