package org.trainer.payloads;

import com.google.gson.*;

public class PayloadDeserializer implements JsonDeserializer<Payload> {
    @Override
    public Payload deserialize(JsonElement json, java.lang.reflect.Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String type = jsonObject.get("type").getAsString();

        switch (type) {
            case "TOGGLE-PROPERTY":
                return context.deserialize(json, TogglePropertyPayload.class);
            case "SET-PROPERTY":
                return context.deserialize(json, SetPropertyPayload.class);
            case "RESPONSE":
                return context.deserialize(json, ResponsePayload.class);
            case "PARTY-STATS":
                return context.deserialize(json, PartyStatsPayload.class);
            default:
                throw new JsonParseException("Unknown payload type: " + type);
        }
    }
}