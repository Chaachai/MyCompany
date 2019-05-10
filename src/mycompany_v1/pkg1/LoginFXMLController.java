/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany_v1.pkg1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author CHAACHAI Youssef
 */
public class LoginFXMLController implements Initializable {

    @FXML
    private Button loginButton;

    @FXML
    private Label close;
    @FXML
    private Button minimize;
    @FXML
    private AnchorPane anchorpane;
    @FXML
    private TextField login;
    @FXML
    private PasswordField password;
    
    @FXML
    public void connect(){
        System.out.println("Login = "+login.getText()+" Password = "+password.getText());
    }

    @FXML
    public void closeApp() {
        Stage stage = (Stage) close.getScene().getWindow();

        stage.close();
    }
    
    @FXML
    public void minimizeApp(ActionEvent event) {
        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }

}
