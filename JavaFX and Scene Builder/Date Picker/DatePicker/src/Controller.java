import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private DatePicker myDatePicker;
    @FXML
    private Label myLabel;

    public void getDate(ActionEvent event) {

        LocalDate myDate = myDatePicker.getValue();
        //String myFormattedString = myDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        myLabel.setText(myFormattedDate);
        myLabel.setStyle("-fx-background-color: cyan;");
    }

}