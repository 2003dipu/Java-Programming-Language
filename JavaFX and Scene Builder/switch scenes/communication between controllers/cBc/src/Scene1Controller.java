import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene1Controller {

    @FXML
    TextField nameTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event){

        try {

            String username = nameTextField.getText();
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
            root = loader.load();
            
            Scene2Controller s2Controller = loader.getController();
            s2Controller.displayName(username);
                        
            //root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
            stage = (Stage)(((Node)event.getSource()).getScene().getWindow());
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
