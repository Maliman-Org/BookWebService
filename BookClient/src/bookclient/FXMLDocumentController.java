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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manno
 */
public class FXMLDocumentController implements Initializable {

    BookWs stub;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stub = new BookWSService().getBookWsPort();

    }

}
