/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany_v1.pkg1;

import bean.Salarie;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import service.SalarieFacade;
import util.Session;

/**
 * FXML Controller class
 *
 * @author CHAACHAI Youssef
 */
public class LoginFXMLController implements Initializable {

    SalarieFacade sf = new SalarieFacade();

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
    public void connect(ActionEvent actionEvent) throws IOException {
        int res = sf.login(login.getText(), password.getText());
        switch (res) {
            case 1:
                System.out.println("welcome");
                Salarie sal = sf.getSalarieByLogin(login.getText());
                Session.setAttribut(sal, "connectedUser");
                switch (sal.getRole()) {
                    case 1:
                        System.out.println("vous etes le directeur");
                        break;
                    case 2:
                        ViewLauncher.forward(actionEvent, "EmployeDemandeFXML.fxml", this.getClass());
                        System.out.println("vous etes un responnsable");
                        break;
                    case 3:
                        System.out.println("vous etes un employe");
                        break;
                    default:
                        break;
                }
                break;
            case -1:
                JOptionPane.showMessageDialog(null, "L'identifiant ou le mot de passe est incorrect !", "Echec de la connexion", JOptionPane.ERROR_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "something bad happened, please try again later !", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    private boolean testChamps() {
        if (login.getText().equals("")) {
            return false;
        } else if (password.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    @FXML
    public void closeApp() {
        Stage stage = (Stage) close.getScene().getWindow();

        stage.close();
    }

    @FXML
    public void minimizeApp(ActionEvent event) {
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
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
