import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SceneController {

    private Stage stage;
    private Scene scene;
    //private Parent root;

    public void switchToScene1(ActionEvent event){

        try {

            Parent root = FXMLLoader.load(getClass().getResource("sScene1.fxml"));
            stage = (Stage)(((Node) event.getSource()).getScene().getWindow());
            scene = new Scene(root);
            stage.setScene(scene);
            
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void switchToScene2(ActionEvent event){

        try {

            Parent root = FXMLLoader.load(getClass().getResource("sScene2.fxml"));
            stage = (Stage)(((Node) event.getSource()).getScene().getWindow());
            scene = new Scene(root);
            stage.setScene(scene);
            
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
