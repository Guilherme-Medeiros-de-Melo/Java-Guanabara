/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Gui
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMens;
    private Label btnClic;
    
    @FXML
    private void cBotao(ActionEvent event) {
        lblMens.setText("OIOIOIOIOIOIOI");
        btnClic.setText("OIOIOIOIOIOIOI");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
