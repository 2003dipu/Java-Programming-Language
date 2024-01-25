import javafx.fxml.FXML;
import javafx.scene.control.Label;
//import javafx.scene.paint.Color;

public class Scene2Controller {

    @FXML
    Label nameLabel;

    public void displayName(String username) {
        nameLabel.setText("Hello " + username);
    }

}
