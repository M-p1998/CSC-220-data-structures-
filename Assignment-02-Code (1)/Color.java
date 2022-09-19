/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Color.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
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
    

    // public class ANSIColors {
    //     247 public static void main(String[] args) {
    //     248 final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    //     249 final String ANSI_WHITE = "\u001B[37m";
    //     250 final String ANSI_RESET = "\u001B[0m";
    //     251
    //     252 System.out.println("Before");
    //     253 System.out.println(ANSI_BLACK_BACKGROUND + ANSI_WHITE + "Test colors...” + ANSI_RESET);
    //     254 System.out.println("After");
    //     255 }
    //     256 }
    //     257 // ANSI Escape Code: 
    //
    // Instance Data Fields
    //

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