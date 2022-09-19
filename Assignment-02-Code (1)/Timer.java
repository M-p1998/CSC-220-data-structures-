/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Timer.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.Scanner;

public class Timer {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss [ms 'ms']");

    public Timer(String defaultTime) {

    }
    public void pstTimer() {
        TimeZone pstTime = TimeZone.getTimeZone("PST");
        dateFormat.setTimeZone(pstTime);
    }

    public void estTimer (String eastern_standard_time){
        TimeZone estTime = TimeZone.getTimeZone("EST");
        dateFormat.setTimeZone(estTime);
    }
    public void cstTimer (String central_standard_time){
        TimeZone cstTime = TimeZone.getTimeZone("CST");
        dateFormat.setTimeZone(cstTime);
    }
    public String getNowTime(String s) {
        return null;
    }
    

    //
    // Static Data Fields
    //

    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    // public Timer(String timeZone) {

    // }

    // DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss [ms 'ms']");

    // Scanner sc = new Scanner(System.in);
    // String timeZone = sc.nextLine();

    // if (timeZone.equals("Pacific Standard Time")){
    //     dateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
    //     System.out.println(timeZone + ": " + dateFormat.format(new Date()));
    // }
    // else if (timeZone.equals("Central Standard Time")){
    //     dateFormat.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
    //     System.out.println(timeZone + ": " + dateFormat.format(new Date()));
    // }
    // else if (timeZone.equals("Eastern Standard Time")){
    //     dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
    //     System.out.println(timeZone + ": " + dateFormat.format(new Date()));
    // }
    // else{
    //     System.out.println("");
    // }

    // public String getNowTime(String s){
    //     return null;
    // }
 

 
 

 
 



    //
    // Static Methods
    //

    //
    // Additional Static Methods
    //

    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //

    //
    // Language
    //
}