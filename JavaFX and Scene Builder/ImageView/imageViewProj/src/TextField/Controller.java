package TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;
    @FXML

    int age;

    public void submit(ActionEvent event) {

        try {
            age = Integer.parseInt(myTextField.getText());
            
            if (age >= 18) {
                myLabel.setText("You are now signed up");
                myTextField.setStyle("-fx-background-color: cyan;");
                myLabel.setStyle("-fx-background-color: green");
            }
            else{
                myLabel.setText("You must be 18 + to sign up");
                myLabel.setStyle("-fx-background-color: red");
            }
        } 
        catch(NumberFormatException e){
            myLabel.setText("Enter only numbers plz");
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
}
