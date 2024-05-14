package himanshukhadka.analogclock;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DrawClock extends Pane {
    private Line secondArm, minuteArm, hourArm;
    private final double radius = 200;
    private Timeline timeline;
    private Label digitalClock;

    // DrawClock constructor
    public DrawClock() {
        Circle mainCircle = new Circle(radius); // Creates circle with given radius
        // binding circle radius x and y to width and height property of the pane
        mainCircle.centerXProperty().bind(widthProperty().divide(2));
        mainCircle.centerYProperty().bind(heightProperty().divide(2));
        // Setting up circle Color and stroke properties
        mainCircle.setFill(Color.WHITE);
        mainCircle.setStroke(Color.BLACK);
        mainCircle.setStrokeWidth(5);

        getChildren().add(mainCircle); // Adding circle to the pane
        // Adding lines to the pane
        secondArm = new Line();
        minuteArm = new Line();
        hourArm = new Line();
        getChildren().addAll(secondArm, minuteArm, hourArm);

        // Adding digital clock label
        digitalClock = new Label();
        digitalClock.layoutXProperty().bind(widthProperty().subtract(digitalClock.widthProperty()).divide(2));
        digitalClock.layoutYProperty().bind(heightProperty().subtract(30));
        getChildren().add(digitalClock);

        // Setting up clock hands and starting clock
        setupClockHands();
        startClock();
    }

    private void setupClockHands() {
        secondArm.setStroke(Color.RED);
        secondArm.setStrokeWidth(2);

        minuteArm.setStroke(Color.BLACK);
        minuteArm.setStrokeWidth(3);

        hourArm.setStroke(Color.BLACK);
        hourArm.setStrokeWidth(4);

        updateClockHands();
    }

    private void startClock() {
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> updateClock()));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void updateClock() {
        updateClockHands();
        updateDigitalClock();
    }

    private void updateClockHands() {
        Calendar calendar = new GregorianCalendar();
        double second = calendar.get(Calendar.SECOND);
        double minute = calendar.get(Calendar.MINUTE);
        double hour = calendar.get(Calendar.HOUR);

        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        secondArm.setStartX(centerX);
        secondArm.setStartY(centerY);
        secondArm.setEndX(centerX + radius * 0.8 * Math.sin(second * (2 * Math.PI / 60)));
        secondArm.setEndY(centerY - radius * 0.8 * Math.cos(second * (2 * Math.PI / 60)));

        minuteArm.setStartX(centerX);
        minuteArm.setStartY(centerY);
        minuteArm.setEndX(centerX + radius * 0.65 * Math.sin((minute + second / 60) * (2 * Math.PI / 60)));
        minuteArm.setEndY(centerY - radius * 0.65 * Math.cos((minute + second / 60) * (2 * Math.PI / 60)));

        hourArm.setStartX(centerX);
        hourArm.setStartY(centerY);
        hourArm.setEndX(centerX + radius * 0.5 * Math.sin((hour + minute / 60) * (2 * Math.PI / 12)));
        hourArm.setEndY(centerY - radius * 0.5 * Math.cos((hour + minute / 60) * (2 * Math.PI / 12)));
    }

    private void updateDigitalClock() {
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        digitalClock.setText(sdf.format(calendar.getTime()));
    }
}
