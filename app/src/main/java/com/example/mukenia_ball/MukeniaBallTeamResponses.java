
package com.example.mukenia_ball;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MukeniaBallTeamResponses {

    @SerializedName("teams")
    @Expose
    private List<Team> teams = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MukeniaBallTeamResponses() {
    }

    /**
     * 
     * @param teams
     */
    public MukeniaBallTeamResponses(List<Team> teams) {
        super();
        this.teams = teams;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

}
