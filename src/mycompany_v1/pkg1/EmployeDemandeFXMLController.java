/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany_v1.pkg1;

import bean.Salarie;
import helper.DemandeAugmentationFxHelper;
import helper.DemandeAvanceFxHelper;
import helper.DemandeCongeFxHelper;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import service.DemandeFacade;
import util.Session;

/**
 * FXML Controller class
 *
 * @author hamza
 */
public class EmployeDemandeFXMLController implements Initializable {

    DemandeFacade demandeFacade = new DemandeFacade();
    
    private DemandeCongeFxHelper demandeCongeFxHelper;
    private DemandeAvanceFxHelper demandeAvanceFxHelper;
    private DemandeAugmentationFxHelper demandeAugmentationFxHelper;

    @FXML
    private Label close;
    
    @FXML
    private Button minimize;
    
    @FXML
    private Label fullname;
    
    @FXML
    private Button demandesButton;
    @FXML
    private Button inboxButton;
    @FXML
    private Button profileButton;
    @FXML
    private Button seDeconnecterButton;
    
    @FXML
    private Button ajouterConge;

    @FXML
    private TableView congeTableView = new TableView();
    
    @FXML
    private TableView avanceTableView = new TableView();
    
    @FXML
    private TableView augmentationTableView = new TableView();
    

    /**
     * Initializes the controller class.
     */
    private void initHelper() {
        demandeCongeFxHelper = new DemandeCongeFxHelper(congeTableView, demandeFacade.getAllDemandesConges());
        demandeAvanceFxHelper = new DemandeAvanceFxHelper(avanceTableView, demandeFacade.getAllDemandesAvance());
        demandeAugmentationFxHelper = new DemandeAugmentationFxHelper(augmentationTableView, demandeFacade.getAllDemandesAugmentations());
    }

    
     @FXML
    private void ajouterConge(ActionEvent actionEvent) throws IOException{
        ViewLauncher.forward(actionEvent, "DemandeCongeFXML.fxml", this.getClass());
    }
    
    @FXML
    private void toMesDemandes(){
        System.out.println("***********");
    }
    @FXML
    private void toBoiteReception(ActionEvent actionEvent) throws IOException{
        ViewLauncher.forward(actionEvent, "BoiteFXML.fxml", this.getClass());
    }
    @FXML
    private void toProfile(){
        System.out.println("***********");
    }
    @FXML
    private void seDeconnecter(ActionEvent actionEvent) throws IOException{
        Session.clear();
        ViewLauncher.forward(actionEvent, "LoginFXML.fxml", this.getClass());
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        Salarie sal = ((Salarie) Session.getAttribut("connectedUser"));
        String name = sal.getNom()+" "+sal.getPrenom();
        fullname.setText(name);
        initHelper();
        
    }

    public TableView getCongeTableView() {
        return congeTableView;
    }

    public void setCongeTableView(TableView congeTableView) {
        this.congeTableView = congeTableView;
    }

}
