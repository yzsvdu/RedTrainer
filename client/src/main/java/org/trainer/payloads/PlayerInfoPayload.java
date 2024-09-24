package org.trainer.payloads;

public class PlayerInfoPayload implements Payload {
    private String type = "PLAYER-INFO";

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getMessage() {
        return "Player Info Payload";
    }

}
