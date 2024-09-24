package org.trainer.gameinfo;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Pokemon> party;

    public Player(String name) {
        this.name = name;
        this.party = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getParty() {
        return party;
    }

    public void setParty(List<Pokemon> party) {
        this.party = party;
    }
}
