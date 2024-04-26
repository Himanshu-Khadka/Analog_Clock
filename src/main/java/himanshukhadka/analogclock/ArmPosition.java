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

    public double getEndXSecond(double centerX, double lengthOfArm){
        return centerX + lengthOfArm * Math.sin(getSecond()*(Math.PI/60));
    }
    public double getEndYSecond(double centerY, double lengthOfArm){
        return centerY + lengthOfArm * Math.cos(getSecond()*(Math.PI/60));
    }

    public double getEndXMinute(double centerX, double lengthOfArm){
        return centerX + lengthOfArm * Math.sin((getMinute()+getSecond()/60)*(Math.PI/60));
    }
    public double getEndYMinute(double centerY, double lengthOfArm){
        return centerY + lengthOfArm * Math.cos((getMinute()+getSecond()/60)*(Math.PI/60));
    }

    public double getEndXHour(double centerX, double lengthOfArm){
        return centerX + lengthOfArm * Math.sin((getHour()+getMinute()/60+getSecond()/(60*60))*(Math.PI/60));
    }
    public double getEndYHour(double centerY, double lengthOfArm){
        return centerY + lengthOfArm * Math.cos((getHour()+getMinute()/60+getSecond()/(60*60))*(Math.PI/60));
    }


    @Override
    public String toString() {
        return HOUR +":"+MINUTE+":"+SECOND;
    }
}
