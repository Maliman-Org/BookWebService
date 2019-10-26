/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookclient;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import booksservice.*;
import com.jfoenix.controls.JFXTextField;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Manno
 */
public class MainPageController implements Initializable {
    Book book1, book2;
    int thisUserLikedBook1,thisUserLikedBook2; // 1 for like ,2 for dilike and 0 for none
    BookWs stub;
    @FXML
    private JFXTextField bookIndicationEDTX;

    @FXML
    private VBox bookContainer1,bookContainer2;

    @FXML
    private ImageView bookImg1,bookImg2,
                  likeIcon1,likeIcon2,
                  dislikeIcon1,dislikeIcon2;

    @FXML
    private Label bookTitleLabel1,bookTitleLabel2,
                  likeNumLabel1, likeNumLabel2,
                  dislikeNumLabel1,dislikeNumLabel2;
    @FXML
    private ImageView loupeImg;

    @FXML
    private ImageView searchBtn;

    @FXML
    private Label msgLabel;
    
    @FXML
    private AnchorPane resultBooksContainer;
    
    String indication;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stub = new BookWSService().getBookWsPort();
        msgLabel.setAlignment(Pos.CENTER);
        bookTitleLabel1.setAlignment(Pos.CENTER);
        bookTitleLabel2.setAlignment(Pos.CENTER);
        searchBtn.setOnMouseClicked(e -> {
            indication = bookIndicationEDTX.getText();
            if (indication != null) {
                thisUserLikedBook1=0;
                thisUserLikedBook2=0;
                updateTheList();
            }

        });
        dislikeIcon1.setOnMouseClicked(e -> {
            if (book1 != null) {
                if (thisUserLikedBook1== 2) {
                    //the user wants to cancel his dislike
                    stub.cancelMyRate(book1,false);
                    thisUserLikedBook1=0;
                    updateTheList();
                    return;
                }else{
                if (thisUserLikedBook1 != 0) {
                    // the user wants to dislike afer he liked
                    stub.cancelMyRate(book1,true);
                    thisUserLikedBook1=0;
                }
                if (stub.like(book1, false)) {
                    thisUserLikedBook1=2;
                    updateTheList();
                } else {
                    //error dislike
                }
            }
            }
        });
        dislikeIcon2.setOnMouseClicked(e -> {
            if (book2 != null) {
                if (thisUserLikedBook2 == 2) {
                    stub.cancelMyRate(book2,false);
                    thisUserLikedBook2=0;
                    updateTheList();
                    return;
                }else{
                if (thisUserLikedBook2 != 0) {
                    stub.cancelMyRate(book2,true);
                    thisUserLikedBook2=0;
                }
                if (stub.like(book2, false)) {
                    thisUserLikedBook2=2;
                    updateTheList();
                } else {
                    //error like
                }
                }
            }
        });
        likeIcon1.setOnMouseClicked(e -> {
            if (book1 != null) {
                if (thisUserLikedBook1 == 1) {
                    stub.cancelMyRate(book1,true);
                    thisUserLikedBook1=0;
                    updateTheList();
                    return;
                }else{
                if (thisUserLikedBook1 != 0) {
                    stub.cancelMyRate(book1,false);
                    thisUserLikedBook1=0;
                }
                if (stub.like(book1, true)) {
                    thisUserLikedBook1=1;
                    updateTheList();
                } else {
                    //error like
                }
            }
            }
        });
        likeIcon2.setOnMouseClicked(e -> {
            if (book2 != null) {
                if (thisUserLikedBook2 == 1) {
                    stub.cancelMyRate(book2,true);
                    thisUserLikedBook2=0;
                    updateTheList();
                    return;
                }else{
                if (thisUserLikedBook2 != 0) {
                    stub.cancelMyRate(book2,false);
                    thisUserLikedBook2=0;
                }
                if (stub.like(book2, true)) {
                    thisUserLikedBook2=1;
                    updateTheList();
                } else {
                    //error like
                }
                }
            }
        });

    }

    private void updateTheList() {
        if (indication != null) {
            List<Book> list = stub.searchBooks(indication.trim());
            if (list.size() > 0) {
                loupeImg.setVisible(false);
                resultBooksContainer.setVisible(true);
                bookContainer1.setVisible(true);
                book1 = list.get(0);
                likeNumLabel1.setText(String.valueOf(book1.getNumberOfLikes()));
                dislikeNumLabel1.setText(String.valueOf(book1.getNumberOfDislikes()));
                bookTitleLabel1.setText(book1.getTitle());
                bookImg1.setImage(new Image("/Book/" + book1.getId()+ ".jpg"));
                likeIcon1.setImage(new Image("/Images/"+"thumbs-up.png"));
                dislikeIcon1.setImage(new Image("/Images/"+"thumb-down.png"));
                if (list.size() >= 2) {
                    msgLabel.setVisible(true);
                    msgLabel.setText("Here are the related TOP 2 Books");
                    bookContainer2.setVisible(true);
                    book2 = list.get(1);
                    likeNumLabel2.setText(String.valueOf(book2.getNumberOfLikes()));
                    dislikeNumLabel2.setText(String.valueOf(book2.getNumberOfDislikes()));
                    bookTitleLabel2.setText(book2.getTitle());
                    bookImg2.setImage(new Image("/Book/" + book2.getId()+ ".jpg"));
                    likeIcon2.setImage(new Image("/Images/"+"thumbs-up.png"));
                    dislikeIcon2.setImage(new Image("/Images/"+"thumb-down.png"));
                } else {
                    bookContainer2.setVisible(false);
                }
        
            } else {
                thisUserLikedBook1=0;
                thisUserLikedBook2=0;
                bookContainer2.setVisible(false);
                bookContainer1.setVisible(false);
                indication = null;
                book1 = null;
                book2 = null;
                msgLabel.setVisible(true);
                msgLabel.setText("no result");
            }

        }
        if(thisUserLikedBook1==1) likeIcon1.setImage(new Image("/Images/"+"thumbs-up-hand-symbol.png"));
        else if(thisUserLikedBook1==2) dislikeIcon1.setImage(new Image("/Images/"+"thumbs-down-silhouette.png"));
        if(thisUserLikedBook2==1) likeIcon2.setImage(new Image("/Images/"+"thumbs-up-hand-symbol.png"));
        else if(thisUserLikedBook2==2) dislikeIcon2.setImage(new Image("/Images/"+"thumbs-down-silhouette.png"));
    }

}
