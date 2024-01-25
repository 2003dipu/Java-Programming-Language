
// Project name: JavaFX Slider(Temperature) using scene builder
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        try {

            Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("JavaFX Slider Temperature ~ Huna Bopa Singha'or ning a!");

            stage.show();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    public static void main(String[] args) throws Exception {

        Application.launch(args);
    }

}
