/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany_v1.pkg1;

import bean.Salarie;
import helper.DemandeAvanceFxHelper;
import helper.DemandeCongeFxHelper;
import helper.DemandeAugmentationFxHelper1 ;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import service.DemandeCongeFacade;
import util.Session;

/**
 * FXML Controller class
 *
 * @author hamza
 */
public class EmployeDemandeFXMLController implements Initializable {

    DemandeCongeFacade demandeCongeFacade = new DemandeCongeFacade();
    
    private DemandeCongeFxHelper demandeCongeFxHelper;
    private DemandeAvanceFxHelper demandeAvanceFxHelper;

    @FXML
    private Label close;
    
    @FXML
    private Button minimize;
    
    @FXML
    private Label fullname;

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
        demandeCongeFxHelper = new DemandeCongeFxHelper(congeTableView, demandeCongeFacade.getAllDemandes());
//      demandeAvanceFxHelper = new DemandeAvanceFxHelper(avanceTableView, demandeAvanceFacade.getAllDemandes());
/      demandeAugmentationFxHelper = new DemandeAugmentationFxHelper(augmentationTableView, demandeAugmentationFacade.getAllDemandes());
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
