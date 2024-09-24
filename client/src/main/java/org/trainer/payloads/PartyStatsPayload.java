package org.trainer.payloads;

import org.trainer.gameinfo.Pokemon;

import java.util.List;

public class PartyStatsPayload implements Payload {
    private String type = "PARTY-STATS";
    private List<Pokemon> partyPokemons;

    public PartyStatsPayload(List<Pokemon> partyPokemons) {
        this.partyPokemons = partyPokemons;
    }
    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getMessage() {
        return "Party Statistics Payload";
    }

    public List<Pokemon> getPartyPokemons() {
        return partyPokemons;
    }

    public void setPartyPokemons(List<Pokemon> partyPokemons) {
        this.partyPokemons = partyPokemons;
    }
}
