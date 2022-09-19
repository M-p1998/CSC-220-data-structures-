/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Player.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Player extends Person {

    // Instance Data Fields
   private int PId;

   private string PlayerName;

   private int Code;

   private string Team;

   private string Club;

    //
    // Constructors
    //
    public Player() {
    }

    public Player(int PId, string PlayerName, int Code, string Team, string Club) {

    this.PId = PId;

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

        System.out.println("The PId of the person is :", PId );

        System.out.println("The PlayerName of the person is :", PlayerName );

        System.out.println("The Code of the person is :", Code);

        System.out.println("The Team of the person is :", Team);

        System.out.println("The Club of the person is :", Club);

    }  

    //
    // Additional Instance Methods
    //
    public void PDAdditional()

       {

        System.out.println("The PId of the person is :", PId );

        System.out.println("The PlayerName of the person is :", PlayerName );

        System.out.println("The Code of the person is :", Code);

        System.out.println("The Team of the person is :", team);

        System.out.println("The Club of the person is :", Club);

       }  

    //
    // Language
    //

    //
    // @Override
    //

    // @Override
    //     public void PDAdditional(){

    //     System.out.println("-------------After overriding , the details of the player is shown below--------------);

    //     System.out.println("The PId of the person is :", &PId );

    //     System.out.println("The PlayerName of the person is :", &PlayerName );

    //     System.out.println("The Code of the person is :", &Code);

    //     System.out.println("The Team of the person is :", &Team);

    //     System.out.println("The Club of the person is :", &Club);

    //    }  
}
