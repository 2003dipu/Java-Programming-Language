

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//import javafx.animation.*;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Hello Dipu Singha, JavaFX!");
        btn.setOnAction(event -> System.out.println("Hello, World!\nMy name is Dipu Singha"));

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("HelloFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

