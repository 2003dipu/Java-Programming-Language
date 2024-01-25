import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Parent root;
            root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("JavaFX Menu Bar ~ Ahan mor future minok or ning a!");

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
 * style="-fx-background-color: #808000;"
 * 
 * Sky blue: #87CEEB
 * ● Lime green: #00FF7F
 * ● Aquamarine: #7FFFD4
 * ● Maroon: #800000
 * ● Olive: #808000
 * ● Gray: #808080
 * ● Silver: #C0C0C0
 * ● Gold: #FFD700
 * ● Beige: #F5F5DC
 * ● Ivory: #FFFFF0
 * ● Transparent: #00000000
 * 
 * Black: #000000
 * ● White: #FFFFFF
 * ● Red: #FF0000
 * ● Green: #00FF00
 * ● Blue: #0000FF
 * ● Yellow: #FFFF00
 * ● Cyan: #00FFFF
 * ● Magenta: #FF00FF
 * ● Pink: #FFC0CB
 * ● Orange: #FF8C00
 * ● Purple: #800080
 * ● Brown: #A52A2A
 * ● Teal: #008080
 * ● Navy: #000080
 */