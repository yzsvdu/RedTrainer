package org.trainer.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.trainer.payloads.PartyStatsPayload;
import org.trainer.payloads.Payload;
import org.trainer.payloads.PayloadDeserializer;
import org.trainer.payloads.ResponsePayload;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client extends Application {

    private static Client instance;
    private static String serverAddress = "localhost";
    private static int serverPort = 12343;
    private PrintWriter agentWriter;
    private ControlPanelController controller;
    private boolean isConnectedToServer = false;
    private Thread connectionThread; // Add a reference to the connection thread

    @Override
    public void start(Stage stage) throws IOException {
        instance = this;  // Set the instance to this Client object
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("control-panel-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Red Trainer Control Panel");
        stage.setScene(scene);
        stage.show();

        // Set up a close request handler to clean up resources
        stage.setOnCloseRequest(event -> {
            if (connectionThread != null) {
                connectionThread.interrupt(); // Interrupt the connection thread if it's running
            }
            Platform.exit(); // Shutdown JavaFX application
            System.exit(0); // Ensure the application exits completely
        });

        controller = fxmlLoader.getController();
        connectionThread = new Thread(this::connectToAgent); // Use method reference for clarity
        connectionThread.start();
    }

    public static Client getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        launch();
    }

    private void connectToAgent() {
        while (true) {  // Keep trying to connect indefinitely
            try {
                System.out.println("Attempting to connect to the server...");
                Socket socket = new Socket(serverAddress, serverPort);
                isConnectedToServer = true;
                Platform.runLater(() -> controller.updateConnectionStatus(isConnectedToServer));

                // Create input and output streams for communication
                agentWriter = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                Gson gson = new GsonBuilder().registerTypeAdapter(Payload.class, new PayloadDeserializer()).create();

                // Listen for messages from the server
                listenToServer(reader, gson, socket);

            } catch (IOException e) {
                System.out.println("Failed to connect to server. Retrying in 5 seconds...");
                isConnectedToServer = false;
                Platform.runLater(() -> controller.updateConnectionStatus(isConnectedToServer));
                try {
                    Thread.sleep(5000); // Wait for 5 seconds before retrying
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt(); // Restore interrupted status
                    return;
                }
            }
        }
    }

    private void listenToServer(BufferedReader reader, Gson gson, Socket socket) {
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                Payload receivedPayload = gson.fromJson(line, Payload.class);
                if (receivedPayload == null) continue;

                switch (receivedPayload.getType()) {
                    case "RESPONSE":
                        ResponsePayload responsePayload = (ResponsePayload) receivedPayload;
                        Platform.runLater(() -> controller.updateConsoleLog(responsePayload));
                        break;
                    case "PARTY-STATS":
                        PartyStatsPayload partyStatsPayload = (PartyStatsPayload) receivedPayload;
                        Platform.runLater(() -> controller.updatePartyStats(partyStatsPayload));
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("Disconnected from server. Attempting to reconnect...");
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            isConnectedToServer = false;
            Platform.runLater(() -> controller.updateConnectionStatus(isConnectedToServer));
        }
    }



    void sendPayload(Payload payload) {
        if (agentWriter != null) {
            String jsonPayload = new Gson().toJson(payload);
            agentWriter.println(jsonPayload);

        } else {
            System.out.println("Error: PrintWriter is not initialized.");

        }
    }


}

