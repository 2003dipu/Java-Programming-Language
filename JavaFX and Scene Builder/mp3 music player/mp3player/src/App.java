// Project name: JavaFX mp3 Music Player

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("JavaFX mp3 music player ~ Hongkorani nungay ise baro himpelu khani!");

        stage.show();



        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

            @Override
            public void handle(WindowEvent event) {
                Platform.exit();
                System.exit(0);
            }
            
        });
    }

    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
}
/*
This is a big project. I did this in a evening of 24 January 2024
volumeSlider.setStyle("-fx-accent: #00FF00;");

 */