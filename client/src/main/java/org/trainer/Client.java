package org.trainer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.trainer.payloads.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Client extends Application {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);
    private static String serverAddress = "localhost";
    private static int serverPort = 12343;
    private PrintWriter agentWriter;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Red Trainer CPanel");

        // Create ToggleButton
        ToggleButton agentToggleButton = new ToggleButton("Enable Agent");
        agentToggleButton.setStyle("-fx-background-color: #85d785;"); // Set initial style

        // Create Checkboxes
        CheckBox autoBattleCheckBox = new CheckBox("Auto Battle");
        CheckBox autoWalkCheckBox = new CheckBox("Auto Walk");

        // Create ToggleButton HBox
        HBox toggleButtonBox = new HBox(agentToggleButton);
        toggleButtonBox.setPadding(new Insets(10));

        // Create ComboBox for walk options
        ComboBox<String> walkOptionsComboBox = new ComboBox<>();
        walkOptionsComboBox.getItems().addAll("Circle", "Left-Right", "Up-Down", "Random");
        walkOptionsComboBox.setValue("Circle"); // Set default value

        Label label = new Label("Radius");
        ComboBox<Integer> radiusComboBox = new ComboBox<>();
        radiusComboBox.getItems().addAll(1, 2, 3, 4, 5, 6);
        radiusComboBox.setValue(3);

        // Create HBox for autoWalkCheckBox and ComboBox
        HBox autoWalkBox = new HBox(autoWalkCheckBox, walkOptionsComboBox, label,  radiusComboBox);
        autoWalkBox.setAlignment(Pos.CENTER_LEFT);
        autoWalkBox.setSpacing(15);

        // Create Checkboxes VBox
        VBox checkBoxesBox = new VBox(5, autoBattleCheckBox);
        checkBoxesBox.setPadding(new Insets(10));

        // Set alignment for checkBoxesBox
        checkBoxesBox.setAlignment(Pos.TOP_LEFT); // Set vertical alignment to top and horizontal alignment to left

        // Update the layout
        checkBoxesBox.getChildren().addAll(autoWalkBox);

        // Create TextArea for server messages
        TextArea serverMessagesTextArea = new TextArea();
        serverMessagesTextArea.setEditable(false);

        // Make the TextArea scrollable
        VBox scrollableArea = new VBox(serverMessagesTextArea);
        scrollableArea.setPadding(new Insets(10));
        scrollableArea.setMinHeight(200);
        scrollableArea.setMaxHeight(400);

        // Create the main layout
        BorderPane root = new BorderPane();
        root.setTop(toggleButtonBox);
        root.setCenter(checkBoxesBox);
        root.setBottom(scrollableArea);

        // Set actions for ToggleButton
        agentToggleButton.setOnAction(e -> {
            if (agentToggleButton.isSelected()) {
                agentToggleButton.setText("Disable Agent");
                agentToggleButton.setStyle("-fx-background-color: #e75050;");
                TogglePropertyPayload togglePropertyPayload = new TogglePropertyPayload("AgentEnabled", 1);
                sendPayload(togglePropertyPayload);

            } else {
                agentToggleButton.setText("Enable Agent");
                agentToggleButton.setStyle("-fx-background-color: #88e088;");
                TogglePropertyPayload togglePropertyPayload = new TogglePropertyPayload("AgentEnabled", 0);
                sendPayload(togglePropertyPayload);
            }
        });

        autoBattleCheckBox.setOnAction(e -> {
            boolean isSelected = autoBattleCheckBox.isSelected();
            int propertyStatus;
            if(isSelected) propertyStatus = 1;
            else propertyStatus = 0;

            System.out.println(propertyStatus);
            String propertyName = "AutoBattleEnabled";
            TogglePropertyPayload togglePropertyPayload = new TogglePropertyPayload(propertyName, propertyStatus);
            sendPayload(togglePropertyPayload);

        });

        autoWalkCheckBox.setOnAction(e -> {
            boolean isSelected = autoWalkCheckBox.isSelected();
            int propertyStatus;
            if(isSelected) propertyStatus = 1;
            else propertyStatus = 0;

            String propertyName = "AutoWalkEnabled";
            TogglePropertyPayload togglePropertyPayload = new TogglePropertyPayload(propertyName, propertyStatus);
            sendPayload(togglePropertyPayload);

        });

        walkOptionsComboBox.setOnAction(e -> {
            String selectedWalkOption = walkOptionsComboBox.getValue();
            String propertyName = "WalkPattern";
            SetPropertyPayload setPropertyPayload = new SetPropertyPayload(propertyName, selectedWalkOption);
            sendPayload(setPropertyPayload);
        });

        // Add event handler to radiusComboBox
        radiusComboBox.setOnAction(e -> {
            Integer selectedRadius = radiusComboBox.getValue();
            String propertyName = "WalkRadius";
            SetPropertyPayload setPropertyPayload = new SetPropertyPayload(propertyName, selectedRadius);
            sendPayload(setPropertyPayload);

        });



        // Set up the scene
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(event -> handleWindowClose());
        primaryStage.show();

        // start the socket thread
        new Thread(() -> connectToAgent(serverMessagesTextArea)).start();

    }

    private void connectToAgent(TextArea serverMessagesTextArea) {
        try {
            Socket socket = new Socket(serverAddress, serverPort);

            // Create input and output streams for communication
            agentWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Gson gson = new GsonBuilder().registerTypeAdapter(Payload.class, new PayloadDeserializer()).create();

            while (true) {
                Payload receivedPayload = gson.fromJson(reader.readLine(), Payload.class);
                if (receivedPayload == null) break;

                if ("RESPONSE".equals(receivedPayload.getType())) {
                    ResponsePayload responsePayload = (ResponsePayload) receivedPayload;
                    LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(responsePayload.getTimestampMillis()), ZoneId.systemDefault());
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd@HH:mm:ss");
                    String formattedDateTime = dateTime.format(formatter);
                    String consoleLog = "[" + formattedDateTime + "] " + responsePayload.getMessage() + "\n";
                    Platform.runLater(() -> serverMessagesTextArea.appendText(consoleLog));

                }
            }

            // Close the socket when done
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private void sendPayload(Payload payload) {
        if (agentWriter != null) {
            String jsonPayload = new Gson().toJson(payload);
            agentWriter.println(jsonPayload);

        } else {
            System.out.println("Error: PrintWriter is not initialized.");

        }
    }

    private void handleWindowClose() {
        logger.info("Closing client...");

        // Terminate the agent process
        if (agentWriter != null) {
            sendPayload(new TogglePropertyPayload("AgentEnabled", 0));
        }

        // Close the socket and exit the application
        Platform.exit();
    }

}
