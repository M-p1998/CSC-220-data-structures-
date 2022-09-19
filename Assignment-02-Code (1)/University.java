/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: University.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class University extends Organization {
    //
    // Static Data Fields
    //
    
    //
    // Instance Data Fields
    //
    //
    private String universityName;
    
    //  private String name;
    // private String motto_in_latin;
    // private String motto_in_english;
    // private int year_of_establishment;
    // private String type;
    // private String location;
    // private String address;
    // private String colors;
    // private String mascot;
    // private String website;

    //
    // Constructors
    //
    public University() {
    }
    public University(String universityName){
        this.universityName = universityName;
    }

    //
    // Instance Methods
    //

    //
    // Additional Methods
    //
    public String displayInfo() {
        return "University: " + this.universityName;
    }

    //
    // Language
    //

    //
    // Override
    //
}