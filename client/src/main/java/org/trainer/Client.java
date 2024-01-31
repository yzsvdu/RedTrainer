package org.trainer;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//import static jdk.internal.agent.Agent.startAgent;

public class Client extends Application {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Red Trainer Control Panel");

        // Create ToggleButton
        ToggleButton agentToggleButton = new ToggleButton("Enable Agent");
        agentToggleButton.setStyle("-fx-background-color: green;"); // Set initial style

        // Create Checkboxes
        CheckBox autoBattleCheckBox = new CheckBox("Auto Battle");
        CheckBox autoWalkCheckBox = new CheckBox("Auto Walk");

        // Create ToggleButton HBox
        HBox toggleButtonBox = new HBox(agentToggleButton);
        toggleButtonBox.setPadding(new Insets(10));

        // Create Checkboxes VBox
        VBox checkBoxesBox = new VBox(5, autoBattleCheckBox, autoWalkCheckBox);
        checkBoxesBox.setPadding(new Insets(10));

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

            } else {
                agentToggleButton.setText("Enable Agent");
                agentToggleButton.setStyle("-fx-background-color: #88e088;");
                // Add your disable logic here
            }
        });

        // Set up the scene
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);

        primaryStage.show();

        new Thread(() -> connectToServer(serverMessagesTextArea)).start();


    }

    private void connectToServer(TextArea serverMessagesTextArea) {
        try {
            // Replace "localhost" with the actual IP address or hostname of your server
            String serverAddress = "localhost";
            int serverPort = 12343;

            // Create a socket connection to the server
            Socket socket = new Socket(serverAddress, serverPort);

            // Create input and output streams for communication
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            writer.println("Hello from the client!");

            // Continuously listen for messages from the server
            while (true) {
                String message = reader.readLine();
                if (message == null) {
                    break; // End the loop if the server closes the connection
                }

                // Display the message in the TextArea
                Platform.runLater(() -> serverMessagesTextArea.appendText(message + "\n"));
            }

            // Close the socket when done
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage(String message, PrintWriter writer) {
        writer.println(message);
    }


}
