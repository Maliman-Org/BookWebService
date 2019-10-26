package booksservice;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Manno
 */
public class BooksService {

    public static void main(String[] args) {
        String url = "http://localhost:8585/";
        Endpoint.publish(url, new BookWS());
        System.out.println("THE Book Service Actif : "+url);
    }

}
