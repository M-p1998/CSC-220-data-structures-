/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Card.java
 * @author: Duc Ta
 * @author: <Mya > <Phyu>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Card {

    private assignment02PartB.Student student;
    private String cardRecipient;
    private String cardMessage;
    private int numCards =0;
    //
    // Instance Data Fields
    //
    private int artSize = 0;     // Please change artSize, if needed, to get an identical output
    private String artFont = ""; // Please change artFont, if needed, to get an identical output

    // private String card_name;
    // private String card_symbol;
    //
    // Constructors
    //
    public Card() {
    }

    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //


    //
    // Language
    //

    @Override
    public String toString()
    {
        String returnString;
        returnString = "From: "+ this.student + " \t Recipient: "+ this.cardRecipient+ " \t Message: "+ this.cardMessage;
        return returnString;
    }

    public void setStudent(assignment02PartB.Student student) {
        this.student = student;
    }
    public void setCardRecipient(String cardRecipient) {
        this.cardRecipient = cardRecipient;
    }

    public void setCardMessage(String cardMessage) {
        this.cardMessage = cardMessage;
    }
    public void setNumCards(int numCards) {
        this.numCards = numCards;
    }

}
