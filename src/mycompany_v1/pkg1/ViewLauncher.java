/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany_v1.pkg1;

import java.io.IOException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author CHAACHAI Youssef
 */
public class ViewLauncher extends Application {

    private double xOffset = 0;
    private double yOffset = 0;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("BoiteFXML.fxml"));

        Scene scene = new Scene(root);

        stage.initStyle(StageStyle.UNDECORATED);

        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });

        Platform.runLater(() -> root.requestFocus());
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
     public static void forward(ActionEvent actionEvent, String pageName, Class myClass) throws IOException {
        Parent parent = FXMLLoader.load(myClass.getResource(pageName));
        Scene scene = new Scene(parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(scene);
        app_stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        launch(args);
    }

}
