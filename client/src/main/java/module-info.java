module org.trainer.client {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.google.gson;
    requires java.desktop;

    opens org.trainer.client to javafx.fxml;
    opens org.trainer.payloads to com.google.gson;
    opens org.trainer.gameinfo to com.google.gson;
    exports org.trainer.client;
    exports org.trainer.payloads;
}