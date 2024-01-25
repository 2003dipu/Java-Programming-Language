// JavaFX scenes + drawing stuff 

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScenesJavaFX extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, 800, 400, Color.SKYBLUE);
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("Longevity Protocol: What & How much to eat? When to eat? When not to eat?");
        text.setX(30);
        text.setY(50);
        text.setFont(Font.font("Verdana", 20));
        text.setFill(Color.BLACK);

        Line line = new Line();
        line.setStartX(30);
        line.setStartY(61);
        line.setEndX(820);
        line.setEndY(60);
        line.setStrokeWidth(5);
        line.setStroke(Color.ORANGERED);
        line.setOpacity(0.5);
        line.setRotate(180);

        Rectangle square = new Rectangle();
        square.setX(100);
        square.setY(100);
        square.setWidth(100);
        square.setHeight(100);
        square.setFill(Color.DARKBLUE);
        square.setStrokeWidth(5);
        square.setStroke(Color.BLACK);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(   // adjusted the coordinates to position the triangle next to the square
                200.0, 100.0,
                300.0, 100.0,
                200.0, 200.0);
        triangle.setFill(Color.YELLOW);
        triangle.setRotate(-90);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(150);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        Image image = new Image("pic13.png");
        ImageView iView = new ImageView(image);
        iView.setX(450);
        iView.setY(100);
        // Set the desired width and height
        double desiredWidth = 180;
        double desiredHeight = 200;
        iView.setFitWidth(desiredWidth);
        iView.setFitHeight(desiredHeight);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(square);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(iView);

        stage.setTitle("Live a healthy productive long life");
        stage.setScene(scene);

        stage.show();
    }

}
