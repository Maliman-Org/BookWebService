package booksservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Manno
 */
@WebService(name = "BookWs")
public class BookWS {

    public static final String DATABASE_SERVER_PATH = "jdbc:mysql://localhost:3306/bookdb",
            DATABASE_USER = "root",
            DATABASE_PASSWORD = "";
    public static Connection connection;

    public static Statement statement;

    public static ResultSet resultSet;

    public static PreparedStatement preparedStatement;

    public BookWS() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                connection = DriverManager.getConnection(DATABASE_SERVER_PATH, DATABASE_USER, DATABASE_PASSWORD);
                try {
                    statement = connection.createStatement();
                } catch (SQLException ex) {
                    Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @WebMethod(operationName = "cancelRate")
    public boolean cancelRate(@WebParam(name = "theBook") Book book) {
        return decrease(book, (book.getUserRate() == 1));
    }

    @WebMethod
    public boolean like(@WebParam(name = "book") Book book, @WebParam(name = "iLike") boolean liked) {
        boolean b = false;
        if (liked) {
            b = increase(book, true);
        } else {
            b = increase(book, false);
        }
        return b;
    }

    @WebMethod(operationName = "searchBooks")
    
    public ArrayList<Book> getBooks(@WebParam(name = "language") String indication) {
        try {
            ArrayList<Book> list = new ArrayList<>();
            Book aBook;
            String query = "SELECT * FROM `livre` WHERE `title` LIKE '%"+indication+"%'";
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                aBook = new Book(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3),
                        resultSet.getInt(4), resultSet.getInt(5),resultSet.getDate(6));
                list.add(aBook);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    private boolean increase(Book book, boolean like) {

        try {
            String query;
            if (like) {
                query = "UPDATE `livre` SET `likes`=`likes`+1 , `userRate`=1 WHERE "
                        + "(`id`=?);";
            } else {
                query = "UPDATE `livre` SET `dislikes`=`dislikes`+1 , `userRate`=2 WHERE "
                        + "(`id`=?);";
            }
            preparedStatement = connection.prepareCall(query);
            preparedStatement.setString(1, String.valueOf(book.getId()));
            try {
                if (preparedStatement.executeUpdate() == 0) {
                    return false;
                } else {
                    if(like) book.setUserRate(1);
                    else book.setUserRate(2);
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private boolean decrease(Book book, boolean like) {
        String query;
        if (like) {
            query = "UPDATE `livre` SET `likes`=`likes`-1 , `userRate`=0 WHERE "
                    + "(`id`=?);";
        } else {
            query = "UPDATE `livre` SET `dislikes`=`dislikes`-1 , `userRate`=0 WHERE "
                    + "(`id`=?);";
        }
        try {

            preparedStatement = connection.prepareCall(query);
            preparedStatement.setString(1, String.valueOf(book.getId()));
            try {
                if (preparedStatement.executeUpdate() == 0) {
                    return false;
                } else {
                    book.setUserRate(1);
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    

}
