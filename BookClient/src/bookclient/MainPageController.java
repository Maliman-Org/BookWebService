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
    private Label likeNumLabel2;

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
    private ImageView likeIcon2;

    @FXML
    private ImageView dislikeIcon2,searchBtn;

    @FXML
    private Label dislikeNumLabel2,msgLabel;

    @FXML
    public void search(MouseEvent event) {
        
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stub = new BookWSService().getBookWsPort();
        msgLabel.setAlignment(Pos.CENTER);
        bookTitleLabel1.setAlignment(Pos.CENTER);
        bookTitleLabel2.setAlignment(Pos.CENTER);
        
    }
    

}
