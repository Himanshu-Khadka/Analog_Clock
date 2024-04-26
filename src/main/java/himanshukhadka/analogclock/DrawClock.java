package himanshukhadka.analogclock;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class DrawClock extends Pane {
    public DrawClock(){
        Circle circle = new Circle();
        circle.centerXProperty().bind(widthProperty().divide(2));
        circle.centerYProperty().bind(heightProperty().divide(2));
        circle.setRadius(200);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(4);
        circle.setFill(Color.WHITE);

        Line secondArm = new Line();
        secondArm.startXProperty().bind(widthProperty().divide(2));
        secondArm.startYProperty().bind(heightProperty().divide(2));
        secondArm.setStrokeWidth(3);
        secondArm.setStroke(Color.BLACK);



        getChildren().addAll(circle,secondArm);


    }
}
