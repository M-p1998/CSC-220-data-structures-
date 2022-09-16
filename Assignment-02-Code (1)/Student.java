/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Student.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.ArrayList;

public final class Student extends Person {

    //
    // Instance Data Fields
    //
    private String first_name;
    private String last_name;
    private String email;

    //
    // Constructors
    //
    public Student() {
    }

    // getters/accessors and setters/mutators
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirst_name() {
        return first_name;
    }public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    
    //
    // Instance Methods
    //

    //
    // Additional Methods
    //

    //
    // Language
    //

    //
    // Override
    //
}