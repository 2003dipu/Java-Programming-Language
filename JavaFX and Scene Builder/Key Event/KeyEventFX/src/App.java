// Poject name: How to detect Key Events in JavaFX

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene1.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        Scene scene = new Scene(root);

        scene.setOnKeyPressed(event -> {

            switch (event.getCode()) {  // Or use W, S, A, D if required
                case UP:
                    controller.moveUp();
                    break;
                case DOWN:
                    controller.moveDown();
                    break;
                case LEFT:
                    controller.moveLeft();
                    break;
                case RIGHT:
                    controller.moveRight();
                    break;

                default:
                    break;
            }
        });

        stage.setScene(scene);
        stage.setTitle("JavaFX Menu Bar ~ Ahan mor future minok or ning a!");

        stage.show();
    }
}

/*
Alternative to this to shorten code:
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;

scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

            //int n = 0;

            @Override
            public void handle(KeyEvent event) {
                //n++;
                // System.out.println(n + "\t" + event.getCode());
                switch (event.getCode()) {
                    case UP :
                        controller.moveUp();
                        break;
                    case DOWN:
                        controller.moveDown();
                        break;
                    case LEFT:
                        controller.moveLeft();
                        break;
                    case RIGHT:
                        controller.moveRight();
                        break;

                    default:
                        break;
                }
            }
        });
------------------------------------------------------------------------
// Lambda Expression
scene.setOneKeyPressed(event -> {

    switch (event.getCode()) {
                    case UP :
                        controller.moveUp();
                        break;
                    case DOWN:
                        controller.moveDown();
                        break;
                    case LEFT:
                        controller.moveLeft();
                        break;
                    case RIGHT:
                        controller.moveRight();
                        break;

                    default:
                        break;
                }
});
 */