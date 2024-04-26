package himanshukhadka.analogclock;

import java.util.GregorianCalendar;

public class ArmPosition {

    //Creating time
    GregorianCalendar calnder = new GregorianCalendar();

    public double HOUR = calnder.HOUR;
    public double MINUTE = calnder.MINUTE;
    public double SECOND = calnder.SECOND;

    public double getHour(){
        return HOUR;
    }
    public double getMinute(){
        return MINUTE;
    }
    public double getSecond(){
        return SECOND;
    }

    @Override
    public String toString() {
        return HOUR +":"+MINUTE+":"+SECOND;
    }
}
