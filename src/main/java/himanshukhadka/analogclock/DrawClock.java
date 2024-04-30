package himanshukhadka.analogclock;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class DrawClock extends Pane {

    public int second;
    public int minute;
    public int hour;

    Calendar calendar = new GregorianCalendar();

    public void setTime(){
        this.hour = calendar.get(GregorianCalendar.HOUR_OF_DAY);
        this.minute = calendar.get(GregorianCalendar.MINUTE);
        this.second = calendar.get(GregorianCalendar.SECOND);
    }

    public void setSecond(int second){
        this.second = second;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }



    public DrawClock(){
        double armLength = Math.min(getHeight(), getWidth()) * 0.8 * 0.5;

        double centerX = getWidth()/2;
        double centerY = getHeight()/2;

        Circle mainCircle = new Circle();
        mainCircle.setCenterX(centerX);
        mainCircle.setCenterY(centerY);
        mainCircle.setRadius(200);
        mainCircle.setFill(Color.WHITE);
        mainCircle.setStroke(Color.BLACK);
        mainCircle.setStrokeWidth(5);

        Line secondArm = new Line();
        secondArm.setStartX(centerX);
        secondArm.setStartY(centerY);
        secondArm.setStroke(Color.BLACK);
        secondArm.setStrokeWidth(3);
        secondArm.setEndX(centerX+(armLength*Math.sin(getSecond()*(2*Math.PI)/60)));
        secondArm.setEndY(centerY-(armLength*Math.cos((getSecond())*(2*Math.PI)/60)));

        Line minuteArm = new Line();
        minuteArm.setStartX(centerX);
        minuteArm.setStartY(centerY);
        minuteArm.setStroke(Color.BLACK);
        minuteArm.setStrokeWidth(5);
        minuteArm.setEndX(centerX+(armLength+Math.sin((getSecond()/60 + getMinute())*(2*Math.PI)/60)));
        minuteArm.setEndY(centerY-(armLength*Math.cos((getSecond()/60 + getMinute())*(2*Math.PI)/60)));

        Line hourArm = new Line();
        hourArm.setStartX(centerX);
        hourArm.setStartY(centerY);
        hourArm.setStroke(Color.BLACK);
        hourArm.setStrokeWidth(5);
        hourArm.setEndX(centerX+(armLength+Math.sin((getSecond()/60 + getMinute()/60 + getHour())*(2*Math.PI)/60)));
        hourArm.setEndY(centerY-(armLength*Math.cos((getSecond()/60 + getMinute()/60 + getHour())*(2*Math.PI)/60)));

        getChildren().addAll(mainCircle,secondArm,minuteArm,hourArm);
    }
}
