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
    // private University university;
    // private String studentEmail;

    private int StId;

    private string StName;

    private int Rollno;

    private string Address;

    private string School;
    

    //
    // Constructors
    //
    public Student() {
    }

    public Student(int StId, string StName, int Rollno, string Address, string School){

   this.StId = StId;

   this.StName = StName;

   this.Rollno = Rollno;

   this.Address = Address;

   this.School = School;
 }

    // getters/accessors and setters/mutators
    public University getUniversity() {
        return university;
    }
    public void setUniversity(University university) {
        this.university = university;
    }
    public String getStudentEmail() {
        return studentEmail;
    }
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    

    //
    // Instance Methods
    //
    public void StudentDetails(){

       System.out.println("The Id of the Student is :", StId );

       System.out.println("The Name of the Student is :", StName );

       System.out.println("The Roll No of the Student is :", Rollno);

       System.out.println("The Address of the Student is :", Address);

       System.out.println("The School of the Student is :", School);

   }  

    //
    // Additional Methods
    //
    public void SDAdditional(){

       System.out.println("The Id of the Student is :", &StId );

       System.out.println("The Name of the Student is :", &StName );

       System.out.println("The Roll No of the Student is :", &Rollno);

       System.out.println("The Address of the Student is :", &Address);

       System.out.println("The School of the Student is :", &School);

      }  



    //
    // Language
    //

    //
    // Override
    //
    // @override
    //    public void SDAdditional(){

    //    System.out.println("-------------After overriding , the details of the student is shown below--------------);

    //    System.out.println("The Id of the Student is :", &StId );

    //    System.out.println("The Name of the Student is :", &StName );

    //    System.out.println("The Roll No of the Student is :", &Rollno);

    //    System.out.println("The Address of the Student is :", &Address);

    //    System.out.println("The School of the Student is :", &School);

    //   }  
}