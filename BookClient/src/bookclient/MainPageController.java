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
import javafx.scene.layout.VBox;

/**
 *
 * @author Manno
 */
public class MainPageController implements Initializable {

    BookWs stub;
    @FXML
    private JFXTextField bookIndicationEDTX;

    @FXML
    private VBox bookContainer1;

    @FXML
    private ImageView bookImg1;

    @FXML
    private Label bookTitleLabel1;

    @FXML
    private ImageView likeIcon1;

    @FXML
    private Label likeNumLabel2, likeNumLabel1;

    @FXML
    private ImageView dislikeIcon1;

    @FXML
    private Label dislikeNumLabel1;

    @FXML
    private VBox bookContainer2;

    @FXML
    private ImageView bookImg2;

    @FXML
    private Label bookTitleLabel2;

    @FXML
    private ImageView likeIcon2,loupeImg;

    @FXML
    private ImageView dislikeIcon2, searchBtn;

    @FXML
    private Label dislikeNumLabel2, msgLabel;

    Book book1, book2;
    String indication;

    @FXML
    public void search(MouseEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stub = new BookWSService().getBookWsPort();
        msgLabel.setAlignment(Pos.CENTER);
        bookTitleLabel1.setAlignment(Pos.CENTER);
        bookTitleLabel2.setAlignment(Pos.CENTER);
        searchBtn.setOnMouseClicked(e -> {
            indication = bookIndicationEDTX.getText();
            if (indication != null) {
                updateTheList();
            }

        });
        dislikeIcon1.setOnMouseClicked(e -> {
            if (book1 != null) {
                if (book1.getUserRate() == 2) {
                    stub.cancelRate(book1);
                    updateTheList();
                    return;
                }
                if (book1.getUserRate() != 0) {
                    stub.cancelRate(book1);
                }
                if (stub.like(book1, false)) {
                    updateTheList();
                } else {
                    //error like
                }
            }
        });
        dislikeIcon2.setOnMouseClicked(e -> {
            if (book2 != null) {
                if (book2.getUserRate() == 2) {
                    stub.cancelRate(book2);
                    updateTheList();
                    return;
                }
                if (book2.getUserRate() != 0) {
                    stub.cancelRate(book2);
                }
                if (stub.like(book2, false)) {
                    updateTheList();
                } else {
                    //error like
                }
            }
        });
        likeIcon1.setOnMouseClicked(e -> {
            if (book1 != null) {
                if (book1.getUserRate() == 1) {
                    stub.cancelRate(book1);
                    updateTheList();
                    return;
                }
                if (book1.getUserRate() != 0) {
                    stub.cancelRate(book1);
                }
                if (stub.like(book1, true)) {
                    updateTheList();
                } else {
                    //error like
                }
            }
        });
        likeIcon2.setOnMouseClicked(e -> {
            if (book2 != null) {
                if (book2.getUserRate() == 1) {
                    stub.cancelRate(book2);
                    updateTheList();
                    return;
                }
                if (book2.getUserRate() != 0 && book2.getUserRate() != 1) {
                    stub.cancelRate(book2);
                }
                if (stub.like(book2, true)) {
                    updateTheList();
                } else {
                    //error like
                }
            }
        });

    }

    private void updateTheList() {
        if (indication != null) {
            List<Book> list = stub.searchBooks(indication.trim().toLowerCase());
            if (list.size() > 0) {
                loupeImg.setVisible(false);
                msgLabel.setVisible(false);
                bookContainer1.setVisible(true);
                book1 = list.get(0);
                likeNumLabel1.setText(String.valueOf(book1.getLikeNum()));
                dislikeNumLabel1.setText(String.valueOf(book1.getDislikeNum()));
                bookTitleLabel1.setText(book1.getTitle());
                bookImg1.setImage(new Image("http://localhost/Books/" + book1.getId()+ ".jpg"));
                if (book1.getUserRate() > 0) {
                    
                    if (book1.getUserRate() == 1) {
                        //like
                        likeIcon1.setImage(new Image("http://localhost/Books/"+"thumbs-up-hand-symbol.png"));
                        dislikeIcon1.setImage(new Image("http://localhost/Books/"+"thumb-down.png"));
                    } else {
                        //dislike
                        likeIcon1.setImage(new Image("http://localhost/Books/"+"thumbs-up.png"));
                        dislikeIcon1.setImage(new Image("http://localhost/Books/"+"thumbs-down-silhouette.png"));
                    }
                } else {
                    //none
                    likeIcon1.setImage(new Image("http://localhost/Books/"+"thumbs-up.png"));
                    dislikeIcon1.setImage(new Image("http://localhost/Books/"+"thumb-down.png"));
                }
                if (list.size() >= 2) {
                    msgLabel.setVisible(true);
                    msgLabel.setText("Here are the related TOP 2 Books");
                    bookContainer2.setVisible(true);
                    book2 = list.get(1);
                    likeNumLabel2.setText(String.valueOf(book2.getLikeNum()));
                    dislikeNumLabel2.setText(String.valueOf(book2.getDislikeNum()));
                    bookTitleLabel2.setText(book2.getTitle());
                    bookImg2.setImage(new Image("http://localhost/Books/" + book2.getId()+ ".jpg"));
                    if (book2.getUserRate() > 0) {
                        if (book2.getUserRate() == 1) {
                            //like
                            likeIcon2.setImage(new Image("http://localhost/Books/"+"thumbs-up-hand-symbol.png"));
                            dislikeIcon2.setImage(new Image("http://localhost/Books/"+"thumb-down.png"));
                        } else {
                            //dislike
                            likeIcon2.setImage(new Image("http://localhost/Books/"+"thumbs-up.png"));
                            dislikeIcon2.setImage(new Image("http://localhost/Books/"+"thumbs-down-silhouette.png"));
                        }
                    } else {
                        //none
                        likeIcon2.setImage(new Image("http://localhost/Books/"+"thumbs-up.png"));
                        dislikeIcon2.setImage(new Image("http://localhost/Books/"+"thumb-down.png"));
                    }
                } else {
                    bookContainer2.setVisible(false);
                }
            } else {
                bookContainer2.setVisible(false);
                bookContainer1.setVisible(false);
                indication = null;
                book1 = null;
                book2 = null;
                msgLabel.setVisible(true);
                msgLabel.setText("no result");
            }

        }
    }

}
