// JavaFX CSS styling

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JfxCs extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        
        try {

            Parent root = FXMLLoader.load(getClass().getResource("cssStyle.fxml"));
            Scene scene = new Scene(root);

            //scene.getStylesheets().add(getClass().getResource("myfirst.css")).toExternalForm();
            String css = this.getClass().getResource("myfirst.css").toExternalForm();
            scene.getStylesheets().add(css);
            stage.setScene(scene);
            stage.setTitle("This is my first experience with CSS along with JavaFX and scene Builder");

            stage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
        Application.launch(args);
    }
    
}
