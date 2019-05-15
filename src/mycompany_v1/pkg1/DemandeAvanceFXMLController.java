/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany_v1.pkg1;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import service.DemandeFacade;

/**
 * FXML Controller class
 *
 * @author CHAACHAI Youssef
 */
public class DemandeAvanceFXMLController implements Initializable {

    DemandeFacade demandeFacade = new DemandeFacade();

    @FXML
    private Label close;
    @FXML
    private Button minimize;

    @FXML
    private TextArea commentaire;

    @FXML
    private Button annuler;
    @FXML
    private Button envoyer;

    @FXML
    public void annuler(ActionEvent actionEvent) throws IOException {
        ViewLauncher.forward(actionEvent, "EmployeDemandeFXML.fxml", this.getClass());
    }

    @FXML
    public void envoyerDemande(ActionEvent actionEvent) throws IOException {
    }

//    private boolean testChamps() {
//    }

    public void alert(String contenttext, String headertext) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(headertext);
        alert.setContentText(contenttext);
        alert.setTitle("Information");
        alert.show();
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
