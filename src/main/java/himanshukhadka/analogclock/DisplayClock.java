package himanshukhadka.analogclock;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayClock extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane mainPane = new BorderPane();
        mainPane.setCenter(new DrawClock());

        Scene scene = new Scene(mainPane,500,500);
        stage.setTitle("Analog Clock");
        stage.setScene(scene);
        stage.show();
    }
}
