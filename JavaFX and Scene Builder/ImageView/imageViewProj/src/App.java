import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage) {

        try {

            Parent root = FXMLLoader.load(getClass().getResource("myScene.fxml"));
            Scene scene1 = new Scene(root);

            stage.setScene(scene1);
            stage.setTitle("JavaFX ImageView using Scene Builder");

            stage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) throws Exception {

        Application.launch(args);
    }
}
