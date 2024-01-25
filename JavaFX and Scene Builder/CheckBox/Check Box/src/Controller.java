import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private CheckBox myCheckBox;
    @FXML
    private Label myLabel;
    @FXML
    private ImageView myImageView;

    Image myImage1 = new Image(getClass().getResourceAsStream("light1.png"));
    Image myImage2 = new Image(getClass().getResourceAsStream("light2.png"));

    public void change(ActionEvent event) {

        if (myCheckBox.isSelected()) {
            //System.out.println("On");
            myLabel.setText("On");
            myImageView.setImage(myImage1);
        } else {
            //System.out.println("Off");
            myLabel.setText("Off");
            myImageView.setImage(myImage2);
        }
    }

}
