package org.trainer.payloads;
public class ResponsePayload implements Payload {
    private String type = "RESPONSE";
    private String message;
    private long timestampMillis; // Using long to store milliseconds

    // Constructors, getters, and setters for EventLogPayload


    public void setType(String type) {
        this.type = type;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestampMillis() {
        return timestampMillis;
    }

    public void setTimestampMillis(long timestampMillis) {
        this.timestampMillis = timestampMillis;
    }

    // Other methods...

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
