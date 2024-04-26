package himanshukhadka.analogclock;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class DrawClock extends Pane {
    public DrawClock(){
        Circle circle = new Circle();
        circle.centerXProperty().bind(widthProperty().divide(2).subtract(50));
        circle.centerYProperty().bind(heightProperty().divide(2).subtract(50));
        circle.setRadius(200);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(4);
        circle.setFill(Color.WHITE);

        getChildren().add(circle);
    }
}
