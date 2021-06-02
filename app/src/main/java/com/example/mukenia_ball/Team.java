
package com.example.mukenia_ball;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Team {

    @SerializedName("strTeam")
    @Expose
    private String strTeam;
    @SerializedName("intFormedYear")
    @Expose
    private String intFormedYear;
    @SerializedName("strLeague")
    @Expose
    private String strLeague;
    @SerializedName("strLeague2")
    @Expose
    private String strLeague2;
    @SerializedName("strLeague3")
    @Expose
    private String strLeague3;
    @SerializedName("strLeague4")
    @Expose
    private String strLeague4;
    @SerializedName("strLeague5")
    @Expose
    private String strLeague5;
    @SerializedName("strLeague6")
    @Expose
    private String strLeague6;
    @SerializedName("strLeague7")
    @Expose
    private String strLeague7;
    @SerializedName("strManager")
    @Expose
    private String strManager;
    @SerializedName("strStadium")
    @Expose
    private String strStadium;
    @SerializedName("strKeywords")
    @Expose
    private String strKeywords;
    @SerializedName("strCountry")
    @Expose
    private String strCountry;
    @SerializedName("strTeamBadge")
    @Expose
    private String strTeamBadge;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Team() {
    }

    /**
     * 
     * @param strTeam
     * @param intFormedYear
     * @param strStadium
     * @param strTeamBadge
     * @param strLeague2
     * @param strLeague3
     * @param strCountry
     * @param strLeague4
     * @param strLeague5
     * @param strLeague6
     * @param strLeague7
     * @param strLeague
     * @param strManager
     * @param strKeywords
     */
    public Team(String strTeam, String intFormedYear, String strLeague, String strLeague2, String strLeague3, String strLeague4, String strLeague5, String strLeague6, String strLeague7, String strManager, String strStadium, String strKeywords, String strCountry, String strTeamBadge) {
        super();
        this.strTeam = strTeam;
        this.intFormedYear = intFormedYear;
        this.strLeague = strLeague;
        this.strLeague2 = strLeague2;
        this.strLeague3 = strLeague3;
        this.strLeague4 = strLeague4;
        this.strLeague5 = strLeague5;
        this.strLeague6 = strLeague6;
        this.strLeague7 = strLeague7;
        this.strManager = strManager;
        this.strStadium = strStadium;
        this.strKeywords = strKeywords;
        this.strCountry = strCountry;
        this.strTeamBadge = strTeamBadge;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }

    public String getIntFormedYear() {
        return intFormedYear;
    }

    public void setIntFormedYear(String intFormedYear) {
        this.intFormedYear = intFormedYear;
    }

    public String getStrLeague() {
        return strLeague;
    }

    public void setStrLeague(String strLeague) {
        this.strLeague = strLeague;
    }

    public String getStrLeague2() {
        return strLeague2;
    }

    public void setStrLeague2(String strLeague2) {
        this.strLeague2 = strLeague2;
    }

    public String getStrLeague3() {
        return strLeague3;
    }

    public void setStrLeague3(String strLeague3) {
        this.strLeague3 = strLeague3;
    }

    public String getStrLeague4() {
        return strLeague4;
    }

    public void setStrLeague4(String strLeague4) {
        this.strLeague4 = strLeague4;
    }

    public String getStrLeague5() {
        return strLeague5;
    }

    public void setStrLeague5(String strLeague5) {
        this.strLeague5 = strLeague5;
    }

    public String getStrLeague6() {
        return strLeague6;
    }

    public void setStrLeague6(String strLeague6) {
        this.strLeague6 = strLeague6;
    }

    public String getStrLeague7() {
        return strLeague7;
    }

    public void setStrLeague7(String strLeague7) {
        this.strLeague7 = strLeague7;
    }

    public String getStrManager() {
        return strManager;
    }

    public void setStrManager(String strManager) {
        this.strManager = strManager;
    }

    public String getStrStadium() {
        return strStadium;
    }

    public void setStrStadium(String strStadium) {
        this.strStadium = strStadium;
    }

    public String getStrKeywords() {
        return strKeywords;
    }

    public void setStrKeywords(String strKeywords) {
        this.strKeywords = strKeywords;
    }

    public String getStrCountry() {
        return strCountry;
    }

    public void setStrCountry(String strCountry) {
        this.strCountry = strCountry;
    }

    public String getStrTeamBadge() {
        return strTeamBadge;
    }

    public void setStrTeamBadge(String strTeamBadge) {
        this.strTeamBadge = strTeamBadge;
    }

}
