/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Student.java
 * Author: Duc Ta
 * @author: <Mya > <Phyu>
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




    private String firstName;

    private String lastName;

    private String Address;

    private String School;

    private String email;

    private University university;
    

    //
    // Constructors
    //
    public Student() {
    }

    public Student(String firstName, String lastName, String email, String Address, String School){

       this.firstName = firstName;

       this.lastName = lastName;

       this.Address = Address;

       this.School = School;

       this.email = email;
 }

    // getters/accessors and setters/mutators
    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }



    //
    // Instance Methods
    //
    public void StudentDetails(){

       System.out.println("The Id of the Student is :" +  firstName );

       System.out.println("The Name of the Student is :"+  lastName );

       System.out.println("The Address of the Student is :" + Address);

       System.out.println("The School of the Student is :"+ School);
        System.out.println("The School of the Student is :"+ email);

   }  

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