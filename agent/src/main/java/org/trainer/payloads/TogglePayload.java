package org.trainer.payloads;

public class TogglePayload extends Payload {
    private String propertyName;
    public int state;
    public TogglePayload() {
        this.setType("TOGGLE");
    }

    public TogglePayload(String propertyName, int state) {
        this.propertyName = propertyName;
        this.state = state;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
