/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Manager.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Manager extends Person {

    //
    // Instance Data Fields
    //
    private int MrId;

    private String MrName;

    private int DeptId;

    private String Domain;

    private String BUnit;

    //
    // Constructors
    //
    public Manager() {
    }
    
    public Manager(int MrId, String MrName, int DeptId, String Domain, String BUnit){

   this.MrId= MrId;

   this.MrName= MrName;

   this.DeptId= DeptId;

   this.Domain= Domain;

   this.BUnit= BUnit;
 }

    //
    // Instance Methods
    //
    public void ManagerDetails(){

       System.out.println("The Id of the Manager is :" + MrId );

       System.out.println("The Name of the Manager is :" + MrName);

       System.out.println("The DeptId of the Manager is :" +  DeptId);

       System.out.println("The Domain of the Manager is :" + Domain);

       System.out.println("The BUnit of the Manager is :"+ BUnit);

   }

    @Override
    public void sayGreeting(String string) {

    }

    //
    // Language
    //

    //
    // Override
    //
    // @override
    //    public void ManagerDetails(){

    //    System.out.println("-------------After overriding , the details of the manager is shown below--------------);

    //    System.out.println("The Id of the Manager is :", &MrId );

    //    System.out.println("The Name of the Manager is :", &MrName);

    //    System.out.println("The DeptId of the Manager is :", &DeptId);

    //    System.out.println("The Domain of the Manager is :", &Domain);

    //    System.out.println("The BUnit of the Manager is :", &BUnit);
    //   }  
}