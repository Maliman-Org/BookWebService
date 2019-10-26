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

    public static final String 
            DATABASE_SERVER_PATH = "jdbc:mysql://localhost:3306/bookdb",
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

    @WebMethod(operationName = "cancelMyRate")
    public boolean cancelRate(@WebParam(name = "ofthisBook") Book book
            ,@WebParam(name = "thatIliked") boolean like) {
        return decrease(book, like);
    }

    @WebMethod
    public boolean like(@WebParam(name = "thisBook") Book book, @WebParam(name = "iLikeIt") boolean liked) {
        boolean actionWellDone = false;
        if (liked) {
            actionWellDone = increase(book, true);
        } else {
            actionWellDone = increase(book, false);
        }
        return actionWellDone;
    }

    @WebMethod(operationName = "searchBooks")
    public ArrayList<Book> getBooks(@WebParam(name = "whateverYourRemeberAboutTheTitle") String indication) {
        try {
            ArrayList<Book> list = new ArrayList<>();
            Book aBook;
            String query = "SELECT * FROM `book` WHERE `title` LIKE '%"+indication+"%' ORDER BY `book`.`likes` DESC";
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                aBook = new Book(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3),
                        resultSet.getInt(4));
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
                query = "UPDATE `book` SET `likes`=`likes`+1 WHERE "
                        + "(`id`=?);";
            } else {
                query = "UPDATE `book` SET `dislikes`=`dislikes`+1 WHERE "
                        + "(`id`=?);";
            }
            preparedStatement = connection.prepareCall(query);
            preparedStatement.setString(1, String.valueOf(book.getId()));
            try {
                if (preparedStatement.executeUpdate() == 0) {
                    return false;
                } else {
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
            query = "UPDATE `book` SET `likes`=`likes`-1 WHERE "
                    + "(`id`=?);";
        } else {
            query = "UPDATE `book` SET `dislikes`=`dislikes`-1  WHERE "
                    + "(`id`=?);";
        }
        try {

            preparedStatement = connection.prepareCall(query);
            preparedStatement.setString(1, String.valueOf(book.getId()));
            try {
                if (preparedStatement.executeUpdate() == 0) {
                    return false;
                } else {
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
