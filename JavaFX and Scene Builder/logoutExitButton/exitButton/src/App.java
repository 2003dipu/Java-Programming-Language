import javafx.application.Application;
//import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage) {

        try {

            Parent root = FXMLLoader.load(getClass().getResource("exit.fxml"));
            Scene scene1 = new Scene(root);

            stage.setScene(scene1);
            stage.setTitle("JavaFX logout/exit button using Scene Builder ~ Huna Bopa Singha");

            stage.show();

            stage.setOnCloseRequest(event -> {
                event.consume();
                logout(stage);
            });
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void logout(Stage stage) {

        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to log out!");
        alert.setContentText("Do you want to save before exiting? ");

        if (alert.showAndWait().get() == ButtonType.OK) {

            //stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("You successfully logged out!");
            stage.close();
        }
    }
    
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
}
