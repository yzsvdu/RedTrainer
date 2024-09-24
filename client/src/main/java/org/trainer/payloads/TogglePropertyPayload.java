package org.trainer.payloads;

public class TogglePropertyPayload implements Payload {
    private String type = "TOGGLE-PROPERTY";
    private String propertyName;
    private int propertyStatus;

    // Constructors, getters, and setters for TogglePropertyPayload


    public TogglePropertyPayload(String propertyName, int propertyStatus) {
        this.propertyName = propertyName;
        this.propertyStatus = propertyStatus;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public int getPropertyStatus() {
        return propertyStatus;
    }

    public void setPropertyStatus(int propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getMessage() {
        // Customize as needed
        return "TogglePropertyPayload message";
    }
}
