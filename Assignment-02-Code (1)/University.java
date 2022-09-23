/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: University.java
 * Author: Duc Ta
 * @author: <Mya > <Phyu>
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
     private String motto;
     private String location;
     private String address;
     private String colors;

//     getters and setters


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    //
    // Constructors
    //
    public University() {
    }

    @Override
    public void displayAbout() {

    }

    @Override
    public void displayMission() {

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