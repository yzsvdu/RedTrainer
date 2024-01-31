package org.trainer;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//import static jdk.internal.agent.Agent.startAgent;

public class Client extends Application {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Red Trainer v1");

        // Create buttons
        ToggleButton enableAgentButton = new ToggleButton("Enable Agent", "Disable Agent");
        ToggleButton startTrainingButton = new ToggleButton("Start Training", "Stop Training");
        ToggleButton startCirclingButton = new ToggleButton("Start Circling", "Stop Circling");
        ToggleButton startAutoBattleButton = new ToggleButton("Start AutoBattle", "Stop AutoBattle");

        // Create layout
        VBox vbox = new VBox(10); // 10 pixels spacing
        vbox.setPadding(new Insets(20)); // 20 pixels padding
        vbox.getChildren().addAll(enableAgentButton, startTrainingButton, startCirclingButton, startAutoBattleButton);

        // Create banner
        Label bannerLabel = new Label("Red Trainer v1");

        // Create root layout
        StackPane root = new StackPane();
        root.getChildren().addAll(vbox, bannerLabel);

        // Create scene
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);

        // Show stage
        primaryStage.show();
    }

    private static class ToggleButton extends Button {
        private boolean isRunning;

        ToggleButton(String startText, String stopText) {
            super(startText);
            setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white;");
            setOnAction(event -> {
                isRunning = !isRunning;
                setText(isRunning ? stopText : startText);
                setStyle(isRunning ? "-fx-background-color: #FF0000; -fx-text-fill: white;" :
                        "-fx-background-color: #4CAF50; -fx-text-fill: white;");
            });
        }
    }

    private static void connectToServer() {
        try {
            // Replace "localhost" with the actual IP address or hostname of your server
            String serverAddress = "localhost";
            int serverPort = 12343;

            // Create a socket connection to the server
            Socket socket = new Socket(serverAddress, serverPort);

            // Create input and output streams for communication
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // Example: Sending a message to the server
            writer.println("Hello from the client!");

            // Example: Receiving a response from the server
            String response = reader.readLine();
            System.out.println("Server response: " + response);

            // Close the socket when done
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
