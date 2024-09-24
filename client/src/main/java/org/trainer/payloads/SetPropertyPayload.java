package org.trainer.payloads;

public class SetPropertyPayload implements Payload {
    public String type = "SET-PROPERTY";
    public String propertyName;
    public Object value;

    public SetPropertyPayload(String propertyName, Object value) {
        this.propertyName = propertyName;
        this.value = value;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getMessage() {
        return null;
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

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
