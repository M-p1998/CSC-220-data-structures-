/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: GeneralManager.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class GeneralManager extends Person {

    //
    // Instance Data Fields
    //
    private int GMrId;

    private string GMrName;

    private int DeptId;

    private string SDomain;

    private string Dept;

    //
    // Constructors
    //
    public GeneralManager() {
    }

    public GeneralManager(int GMrId, string GMrName, int DeptId, string Domain, string BUnit){

   this.GMrId= GMrId;

   this.GMrName= GMrName;

   this.DeptId= DeptId;

   this.SDomain= SDomain;

   this.Dept = Dept;
 }

    //
    // Instance Methods
    //
    public void GManagerDetails()

   {

       System.out.println("The Id of the General Manager is :" + GMrId );

       System.out.println("The Name of the General Manager is :" + GMrName);

       System.out.println("The DeptId of the General Manager is :" + DeptId);

       System.out.println("The Super Domain of the General Manager is :" + SDomain);

       System.out.println("The Department of the General Manager is :" + Dept);

   }  

    //
    // Language
    //

    //
    // Override
    //
    // @override
    //    public void GManagerDetails()

    //   {

    //    System.out.println("-------------After overriding , the details of the general manager is shown below--------------);

    //    System.out.println("The Id of the General Manager is :", &GMrId );

    //    System.out.println("The Name of the General Manager is :", &GMrName);

    //    System.out.println("The DeptId of the General Manager is :", &DeptId);

    //    System.out.println("The Super Domain of the General Manager is :", &SDomain);

    //    System.out.println("The Department of the General Manager is :", &Dept);
    //   } 

//    public static void main(String args[])
//
//     {
//
//      Person pn = new Person();
//      pn.PersonDetails();                                                                        // calling PersonDetails() method
//
//
//
//     Player pl = new Player();
//     pl.PlayerDetails();                                                                             // calling PlayerDetails() method
//     pl.PDAdditional();                                                                             // calling PDAdditional() method
//
//
//
//     President pt = new President();
//     pt.PresidentDetails();                                                                      // calling PresidentDetails() method
//
//
//
//     Manager mr = new Manager();
//     mr.ManagerDetails();                                                                      // calling ManagerDetails() method
//
//
//
//     Student st = new Student();
//     st.StudentDetails();                                                                         // calling StudentDetails() method
//     st.SDAdditional();                                                                            // calling SDAdditional() method
//
//
//
//     GeneralManager gmr = new GeneralManager();
//     gmr.GManagerDetails();                                                                 // calling GManagerDetails() method
//
//     }

    @Override
    public void sayGreeting(String string) {

    }
}