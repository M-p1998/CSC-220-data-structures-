/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Person.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
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
    private int Id;

    private String Name;

    private int PhoneNo;

    private String Address;

    private String Dept;
    

    // static member
    // private static int noOfColors=0;

    //
    // Constructors
    //
    public Person() {
    } 

    public Person(int Id, String Name, int PhoneNo, String Address, String Dept) {
    this.Id = Id;
    this.Name= Name;
    this.PhoneNo = PhoneNo ;
    this.Address= Address;
    this.Dept= Dept;
  }

    // Instance Methods
    public void PersonDetails()  {

    System.out.println("The Id of the person is :" +  Id);

    System.out.println("The Name of the person is :" + Name);

    System.out.println("The Phone number of the person is :" + PhoneNo);

    System.out.println("The Address of the person is :" + Address);

    System.out.println("The Department of the person is :" + Dept);

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
    // Language
    //
    // public void Language() {
    //     System.out.println("Language:");
    // }

    // static method only belongs to the class
    // public static int colors(){
    //     return noOfColors;
    // }

    //
    // @override
    //
    // @Override
    // public String toString() {
    //     // TODO Auto-generated method stub
    //     return super.toString();
    // }
//     @Override
//     public void PersonDetails(){

//     System.out.println("-------------After overriding , the details of the person is shown below--------------);

//     System.out.println("The Id of the person is :", &Id);

//     System.out.println("The Name of the person is :", &Name);

//     System.out.println("The Phone number of the person is :", &PhoneNo);

//     System.out.println("The Address of the person is :", &Address);

//     System.out.println("The Department of the person is :", &Dept);

//   }
}