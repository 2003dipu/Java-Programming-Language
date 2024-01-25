import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
//import javafx.scene.shape.Shape;
import javafx.util.Duration;

public class Controller implements Initializable {

    //@FXML
    //private Shape myShape;

    @FXML
    private ImageView myImage;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        /*
        // Translate
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(myImage);
        translate.setDuration(Duration.millis(1500));
        //translate.setCycleCount(2);
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByX(280);
        translate.setByY(-150);
        translate.setAutoReverse(true);
        translate.play();

        */
        /*
        // Rotate
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(myImage);
        rotate.setDuration(Duration.millis(500));
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);
        //rotate.setAxis(Rotate.Y_AXIS);
        rotate.play();
         */

         /* Fade
         FadeTransition fade = new FadeTransition();
         fade.setNode(myImage);
         fade.setDuration(Duration.millis(1500));
         fade.setCycleCount(TranslateTransition.INDEFINITE);
         fade.setInterpolator(Interpolator.LINEAR);
         fade.setFromValue(0);
         fade.setToValue(1);
         fade.play();
         */
         // scale
         ScaleTransition scale = new ScaleTransition();
         scale.setNode(myImage);
         scale.setDuration(Duration.millis(1500));
         scale.setCycleCount(TranslateTransition.INDEFINITE);
         scale.setInterpolator(Interpolator.LINEAR);
         scale.setByX(2.0);
         scale.setByY(2.0);
         scale.setAutoReverse(true);
         
         scale.play();
    }

}
