/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Color.java
 * @author: Duc Ta
 * @author: <Mya > <Phyu>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Color {

    //
    // Static Data Fields
    //
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";

    public static void main(String[] args) {
    System.out.println("Before");
    System.out.println(ANSI_PURPLE_BACKGROUND + ANSI_YELLOW + "Test colors..." + ANSI_RESET);
    System.out.println("After");
    }
    


    //
    // Constructors
    //
    public Color() {
    }

    //
    // Static Methods
    //

    //
    // Instance Methods
    //

    //
    // Language
    //
}