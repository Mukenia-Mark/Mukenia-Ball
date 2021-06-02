
package com.example.mukenia_ball;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Player {

    @SerializedName("strNationality")
    @Expose
    private String strNationality;
    @SerializedName("strPlayer")
    @Expose
    private String strPlayer;
    @SerializedName("strTeam")
    @Expose
    private String strTeam;
    @SerializedName("strTeam2")
    @Expose
    private String strTeam2;
    @SerializedName("dateBorn")
    @Expose
    private String dateBorn;
    @SerializedName("strNumber")
    @Expose
    private String strNumber;
    @SerializedName("strSide")
    @Expose
    private String strSide;
    @SerializedName("strPosition")
    @Expose
    private String strPosition;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Player() {
    }

    /**
     * 
     * @param strNumber
     * @param strPlayer
     * @param strTeam
     * @param strPosition
     * @param dateBorn
     * @param strSide
     * @param strNationality
     * @param strTeam2
     */
    public Player(String strNationality, String strPlayer, String strTeam, String strTeam2, String dateBorn, String strNumber, String strSide, String strPosition) {
        super();
        this.strNationality = strNationality;
        this.strPlayer = strPlayer;
        this.strTeam = strTeam;
        this.strTeam2 = strTeam2;
        this.dateBorn = dateBorn;
        this.strNumber = strNumber;
        this.strSide = strSide;
        this.strPosition = strPosition;
    }

    public String getStrNationality() {
        return strNationality;
    }

    public void setStrNationality(String strNationality) {
        this.strNationality = strNationality;
    }

    public String getStrPlayer() {
        return strPlayer;
    }

    public void setStrPlayer(String strPlayer) {
        this.strPlayer = strPlayer;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }

    public String getStrTeam2() {
        return strTeam2;
    }

    public void setStrTeam2(String strTeam2) {
        this.strTeam2 = strTeam2;
    }

    public String getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(String dateBorn) {
        this.dateBorn = dateBorn;
    }

    public String getStrNumber() {
        return strNumber;
    }

    public void setStrNumber(String strNumber) {
        this.strNumber = strNumber;
    }

    public String getStrSide() {
        return strSide;
    }

    public void setStrSide(String strSide) {
        this.strSide = strSide;
    }

    public String getStrPosition() {
        return strPosition;
    }

    public void setStrPosition(String strPosition) {
        this.strPosition = strPosition;
    }

}
