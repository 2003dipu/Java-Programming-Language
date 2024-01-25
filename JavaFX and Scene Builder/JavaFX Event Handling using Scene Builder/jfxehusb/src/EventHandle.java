
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EventHandle extends Application {

    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("my_ui.fxml"));

            Scene scene = new Scene(root);

            stage.setTitle("Hello World");
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        System.out.println();

        Application.launch(args);

        System.out.println();
    }
}

/*
 * D:\Software\Programming language
 * Projects\ProgrammingProjects\JavaProjects\projects\
 * JavaFX Projects\JavaFX Event Handling using Scene Builder
 */