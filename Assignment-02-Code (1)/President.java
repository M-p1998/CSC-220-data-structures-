/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: President.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class President extends Person {

    //
    // Instance Data Fields
    //
    private int PrId;

    private string PrName;

    private int DeptId;

    private string Membership;

    private string Dept;

    //
    // Constructors
    //
    public President() {
    }

    public President(int PrId, string PrName, int DeptId, string Membership, string Dept) {

    this.PrId = PrId;

    this.PrName= PrName;

    this.DeptId= DeptId;

    this.Membership= Membership;

    this.Dept= Dept;
  }

    //
    // Instance Methods
    //
    public void PresidentDetails()

    {

        System.out.println("The PrId of the person is :", PrId );

        System.out.println("The PrName of the person is :", PrName);

        System.out.println("The DeptId of the person is :", DeptId);

        System.out.println("The Membership of the person is :", Membership);

        System.out.println("The Dept of the person is :", Dept);

    }  


    //
    // Language
    //

    //
    // Override
    //
    // @override
    //     public void PresidentDetails()

    //    {

    //     System.out.println("-------------After overriding , the details of the president is shown below--------------);

    //     System.out.println("The PrId of the person is :", &PrId );

    //     System.out.println("The PrName of the person is :", &PrName);

    //     System.out.println("The DeptId of the person is :", &DeptId);

    //     System.out.println("The Membership of the person is :", &Membership);

    //     System.out.println("The Dept of the person is :", &Dept);

    //    }  
}
