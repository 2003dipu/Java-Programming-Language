
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // Add Scene
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("pic13.png");

        // Stage or the GUI or Webpage
        //Stage stage = new Stage();
        stage.setTitle("Huna Bopa GUI JavaFX window. Not a webpage yet");
        stage.setWidth(800);
        stage.setHeight(420);
        //stage.setResizable(false);
        //stage.setX(50);
        //stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You can't escape unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.getIcons().add(icon);
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {

        //Application.launch(args);
        launch(args);

    }
}
