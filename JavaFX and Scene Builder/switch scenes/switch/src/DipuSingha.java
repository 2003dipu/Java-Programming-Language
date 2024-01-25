import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DipuSingha extends Application{

    @Override
    public void start(Stage stage) throws Exception{

        try {

            Parent root = FXMLLoader.load(getClass().getResource("sScene1.fxml"));
            Scene scene1 = new Scene(root);

            stage.setScene(scene1);
            stage.setTitle("JavaFX Switch Scenes");

            stage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public static void main(String[] args) throws Exception {

        //System.out.println("Hello, World!\nThis is a project on JavaFX switch scenes using Scene Builder");
        Application.launch(args);
    }

    
}
