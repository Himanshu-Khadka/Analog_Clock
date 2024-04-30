package himanshukhadka.analogclock;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.awt.*;
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

    }
}
