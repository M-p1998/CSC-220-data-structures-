/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Person.java
 * Author: Duc Ta
 * @author: <Mya > <Phyu>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

// JAVA 15, 2020, added "sealed" and "permits" to Java classes.
// We are learning the new elements of JAVA 15.
// "sealed" and "permits" are used here so that we will have one more example to reference.
// We do not need to understand "sealed" and "permits" in order to start and complete this assignment.
public sealed abstract class Person implements Greeting permits Student, Player, President, GeneralManager, Manager {

    //
    // Instance Data Fields
    //

    private String first_name;
    private String last_name;
    private String email;


    

    // static member
    // private static int noOfColors=0;

    //
    // Constructors
    //
    public Person() {
    } 

    public Person(String first_name, String last_name, String email) {
    this.first_name = first_name;
    this.last_name= last_name;
    this.email = email ;

  }

    // Instance Methods
    public void PersonDetails()  {



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
    
    
    public static void name() {
        
    }

    //
    // Language
    //

    //
    // @override
    //

}