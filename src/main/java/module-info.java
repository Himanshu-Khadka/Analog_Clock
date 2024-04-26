module himanshukhadka.analogclock {
    requires javafx.controls;
    requires javafx.fxml;


    opens himanshukhadka.analogclock to javafx.fxml;
    exports himanshukhadka.analogclock;
}