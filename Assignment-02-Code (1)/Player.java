/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Player.java
 * Author: Duc Ta
 * @author: <Mya > <Phyu>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Player extends Person {

    // Instance Data Fields


   private String PlayerName;

   private int Code;

   private String Team;

   private String Club;

//   getters and setters


    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public String getClub() {
        return Club;
    }

    public void setClub(String club) {
        Club = club;
    }

    //
    // Constructors
    //
    public Player() {
    }

    public Player(String PlayerName, int Code, String Team, String Club) {



    this.PlayerName= PlayerName;

    this.Code= Code;

    this.Team= Team;

    this.Club= Club;
  }

    //
    // Instance Methods
    //
    public void PlayerDetails()

    {

    }  

    //
    // Additional Instance Methods
    //

    @Override
    public String toString() {
        return "Player{" +
                "PlayerName='" + PlayerName + '\'' +
                ", Code=" + Code +
                ", Team='" + Team + '\'' +
                ", Club='" + Club + '\'' +
                '}';
    }


    //
    // Language
    //

    //
    // @Override
    //


}
