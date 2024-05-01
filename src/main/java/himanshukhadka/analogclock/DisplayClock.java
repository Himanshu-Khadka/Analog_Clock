package himanshukhadka.analogclock;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DisplayClock extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new DrawClock());
        stage.setScene(scene);
        stage.show();
    }
}
