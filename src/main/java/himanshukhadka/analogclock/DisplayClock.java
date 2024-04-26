package himanshukhadka.analogclock;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisplayClock extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane mainPane = new BorderPane();
        mainPane.setCenter(new DrawClock());

        //Creating ArmPosition class
        Calendar calander = new GregorianCalendar();
        String timeString = calander.get(Calendar.HOUR_OF_DAY)+":"+calander.get(Calendar.MINUTE)+":"+calander.get(Calendar.SECOND);

        Text timeInText = new Text(timeString);
        mainPane.setBottom(timeInText);
        mainPane.setPadding(new Insets(10, 10,10,10));
        BorderPane.setAlignment(timeInText, Pos.CENTER);

        Scene scene = new Scene(mainPane,500,500);
        stage.setTitle("Analog Clock");
        stage.setScene(scene);
        stage.show();
    }
}
