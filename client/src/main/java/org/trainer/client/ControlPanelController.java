package org.trainer.client;


import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import org.trainer.gameinfo.Pokemon;
import org.trainer.payloads.*;


import java.net.URL;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ControlPanelController implements Initializable {
    @FXML
    private ToggleButton agentToggleButton;
    @FXML
    private CheckBox autoBattleCheckBox;
    @FXML
    private CheckBox autoCatchCheckBox;
    @FXML
    private CheckBox autoFishCheckBox;
    @FXML
    private CheckBox autoWalkCheckBox;
    @FXML
    private ComboBox<String> pokemonComboBox;
    @FXML
    private ComboBox<String> walkPatternComboBox;
    @FXML
    private VBox slot1mon;
    @FXML
    private VBox slot2mon;
    @FXML
    private VBox slot3mon;
    @FXML
    private VBox slot4mon;
    @FXML
    private VBox slot5mon;
    @FXML
    private VBox slot6mon;
    @FXML
    private TextArea consoleLogArea;
    @FXML
    private ComboBox<String> move1priority;
    @FXML
    private ComboBox<String> move2priority;
    @FXML
    private ComboBox<String> move3priority;
    @FXML
    private ComboBox<String> move4priority;
    @FXML
    private ComboBox<Double> walkRadiusComboBox;
    @FXML
    private Label connectionStatusLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pokemonComboBox.getItems().removeAll(pokemonComboBox.getItems());
        pokemonComboBox.getItems().addAll("Any", "Magikarp", "Dratini", "Meowth");
        pokemonComboBox.getSelectionModel().select("Any");

        walkPatternComboBox.getItems().removeAll(walkPatternComboBox.getItems());
        walkPatternComboBox.getItems().addAll("Left-Right", "Up-Down", "Circle", "Random");
        walkPatternComboBox.getSelectionModel().select("Circle");

        move1priority.getItems().addAll("FIRST", "SECOND", "THIRD", "FOURTH");
        move1priority.getSelectionModel().select("FIRST");

        move2priority.getItems().addAll("FIRST", "SECOND", "THIRD", "FOURTH");
        move2priority.getSelectionModel().select("SECOND");

        move3priority.getItems().addAll("FIRST", "SECOND", "THIRD", "FOURTH");
        move3priority.getSelectionModel().select("THIRD");

        move4priority.getItems().addAll("FIRST", "SECOND", "THIRD", "FOURTH");
        move4priority.getSelectionModel().select("FOURTH");

        walkRadiusComboBox.getItems().addAll( 1.0, 3.0, 7.0, 10.0);
        walkRadiusComboBox.getSelectionModel().select(3.0);

        pokemonComboBox.valueProperty().addListener((observable, oldValue, newValue) -> {
            onPokemonComboBoxChange(newValue);

        });
        walkPatternComboBox.valueProperty().addListener((observable, oldValue, newValue) -> {
            onWalkPatternComboBoxChange(newValue);
        });
        // Listeners for ComboBoxes
        move1priority.valueProperty().addListener((observable, oldValue, newValue) -> {
            handlePriorityChange(move1priority, oldValue, newValue);
        });

        move2priority.valueProperty().addListener((observable, oldValue, newValue) -> {
            handlePriorityChange(move2priority, oldValue, newValue);
        });

        move3priority.valueProperty().addListener((observable, oldValue, newValue) -> {
            handlePriorityChange(move3priority, oldValue, newValue);
        });

        move4priority.valueProperty().addListener((observable, oldValue, newValue) -> {
            handlePriorityChange(move4priority, oldValue, newValue);
        });

        walkRadiusComboBox.valueProperty().addListener((observable, oldValue, newValue) -> {
            handleWalkRadiusChange(newValue);
        });
    }

    private void handleWalkRadiusChange(double newRadius) {
        String propertyName = "WalkRadius";
        SetPropertyPayload setPropertyPayload = new SetPropertyPayload(propertyName, newRadius);
        sendPayloadToServer(setPropertyPayload);
    }

    // Method to handle swapping logic
    private void handlePriorityChange(ComboBox<String> changedComboBox, String oldValue, String newValue) {
        // Check if any other ComboBox has the same new value
        if (move1priority != changedComboBox && move1priority.getValue().equals(newValue)) {
            move1priority.getSelectionModel().select(oldValue);
        } else if (move2priority != changedComboBox && move2priority.getValue().equals(newValue)) {
            move2priority.getSelectionModel().select(oldValue);
        } else if (move3priority != changedComboBox && move3priority.getValue().equals(newValue)) {
            move3priority.getSelectionModel().select(oldValue);
        } else if (move4priority != changedComboBox && move4priority.getValue().equals(newValue)) {
            move4priority.getSelectionModel().select(oldValue);
        }

        // After swapping, send all priorities
        sendAllMovePriorities();
    }

    private void sendAllMovePriorities() {
        // Collecting all priorities
        String priority1 = move1priority.getValue();
        String priority2 = move2priority.getValue();
        String priority3 = move3priority.getValue();
        String priority4 = move4priority.getValue();

        // Sending payloads for all priorities
        sendPayloadToServer(new SetPropertyPayload("PRIORITY-SLOT-1", priority1));
        sendPayloadToServer(new SetPropertyPayload("PRIORITY-SLOT-2", priority2));
        sendPayloadToServer(new SetPropertyPayload("PRIORITY-SLOT-3", priority3));
        sendPayloadToServer(new SetPropertyPayload("PRIORITY-SLOT-4", priority4));
    }

    // Method to handle ComboBox value changes
    private void onPokemonComboBoxChange(String newValue) {
        String propertyName = "SearchforPokemon";
        SetPropertyPayload setPropertyPayload = new SetPropertyPayload(propertyName, newValue);
        sendPayloadToServer(setPropertyPayload);
    }

    private void onWalkPatternComboBoxChange(String newValue) {
        String propertyName = "WalkPattern";
        SetPropertyPayload setPropertyPayload = new SetPropertyPayload(propertyName, newValue);
        sendPayloadToServer(setPropertyPayload);
    }

    @FXML
    protected void onAgentToggleButtonClick() {
        if (agentToggleButton.isSelected()) {
            agentToggleButton.setText("Disable Bot");
            agentToggleButton.setStyle("-fx-background-color: #e75050;");
            TogglePropertyPayload togglePropertyPayload = new TogglePropertyPayload("AgentEnabled", 1);
            sendPayloadToServer(togglePropertyPayload);

        } else {
            agentToggleButton.setText("Enable Bot");
            agentToggleButton.setStyle("-fx-background-color: #88e088;");
            TogglePropertyPayload togglePropertyPayload = new TogglePropertyPayload("AgentEnabled", 0);
            sendPayloadToServer(togglePropertyPayload);
        }
    }

    @FXML
    protected void onAutoBattleCheckBoxClick() {
        boolean isSelected = autoBattleCheckBox.isSelected();
        int propertyStatus;
        if(isSelected) propertyStatus = 1;
        else propertyStatus = 0;

        String propertyName = "AutoBattleEnabled";
        TogglePropertyPayload togglePropertyPayload = new TogglePropertyPayload(propertyName, propertyStatus);
        sendPayloadToServer(togglePropertyPayload);
    }

    @FXML
    protected void onAutoWalkCheckBoxClick() {
        boolean isSelected = autoWalkCheckBox.isSelected();
        int propertyStatus;
        if(isSelected) propertyStatus = 1;
        else propertyStatus = 0;

        String propertyName = "AutoWalkEnabled";
        TogglePropertyPayload togglePropertyPayload = new TogglePropertyPayload(propertyName, propertyStatus);
        sendPayloadToServer(togglePropertyPayload);
    }

    @FXML
    protected void onAutoFishCheckBoxClick() {
        boolean isSelected = autoFishCheckBox.isSelected();
        int propertyStatus;
        if(isSelected) propertyStatus = 1;
        else propertyStatus = 0;

        String propertyName = "AutoFishEnabled";
        TogglePropertyPayload togglePropertyPayload = new TogglePropertyPayload(propertyName, propertyStatus);
        sendPayloadToServer(togglePropertyPayload);
    }

    @FXML
    protected void setAutoCatchCheckBox() {
        boolean isSelected = autoCatchCheckBox.isSelected();
        int propertyStatus;
        if(isSelected) propertyStatus = 1;
        else propertyStatus = 0;

        String propertyName = "AutoCatchEnabled";
        TogglePropertyPayload togglePropertyPayload = new TogglePropertyPayload(propertyName, propertyStatus);
        sendPayloadToServer(togglePropertyPayload);
    }

    private void sendPayloadToServer(Payload payload) {
        Client client = Client.getInstance();  // Get the instance of Client
        if (client != null) {
            client.sendPayload(payload);  // Send the payload to the server
        } else {
            System.out.println("Error: Client instance is not available.");
        }
    }



    public void updatePartyStats(PartyStatsPayload partyStatsPayload) {
        List<Pokemon> partyMons = partyStatsPayload.getPartyPokemons();
        List<VBox> slots = Arrays.asList(slot1mon, slot2mon, slot3mon, slot4mon, slot5mon, slot6mon);

        for (int i = 0; i < partyMons.size() && i < slots.size(); i++) {
            updateSlot(slots.get(i), partyMons.get(i));
        }
    }

    private void updateSlot(VBox slot, Pokemon pokemon) {
        HBox hbox = null;
        Line currentHpLine = null;
        for (Node node : slot.getChildren()) {
            if (node instanceof HBox) {
                hbox = (HBox) node;
            } else if (node instanceof Line) {
                currentHpLine = (Line) node;
                break;
            }
        }
        if (hbox != null) {
            if (hbox.getChildren().size() >= 4) {
                Label name = (Label) hbox.getChildren().get(1);
                Label level = (Label) hbox.getChildren().get(2);
                Label health = (Label) hbox.getChildren().get(3);

                // Set text for the 2nd, 3rd, and 4th labels
                name.setText(pokemon.getName());
                level.setText("Lv. " + pokemon.getLevel());
                health.setText("HP: " + pokemon.getCurrentHp() + " / " + pokemon.getMaxHp());
                if (currentHpLine != null) {
                    currentHpLine.setEndX((double) pokemon.getCurrentHp() / pokemon.getMaxHp() * 200);
                }
            } else {
                System.out.println("Not enough labels in HBox.");
            }
        } else {
            System.out.println("HBox not found in VBox.");
        }
    }

    public void updateConsoleLog(Payload payload) {
        ResponsePayload responsePayload = (ResponsePayload) payload;
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(responsePayload.getTimestampMillis()), ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd@HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        String consoleLog = "[" + formattedDateTime + "] " + responsePayload.getMessage() + "\n";
        Platform.runLater(() -> consoleLogArea.appendText(consoleLog));
    }

    public void updateConnectionStatus(boolean isConnected) {
        if (isConnected) {
            connectionStatusLabel.setText("Connected to Agent");
            connectionStatusLabel.setStyle("-fx-text-fill: #88e088;");
        } else {
            connectionStatusLabel.setText("Disconnected from Agent");
            connectionStatusLabel.setStyle("-fx-text-fill: #e75050;");
        }
    }

}