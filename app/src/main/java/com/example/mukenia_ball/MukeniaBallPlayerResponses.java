
package com.example.mukenia_ball;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MukeniaBallPlayerResponses {

    @SerializedName("player")
    @Expose
    private List<Player> player = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MukeniaBallPlayerResponses() {
    }

    /**
     * 
     * @param player
     */
    public MukeniaBallPlayerResponses(List<Player> player) {
        super();
        this.player = player;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }

}
