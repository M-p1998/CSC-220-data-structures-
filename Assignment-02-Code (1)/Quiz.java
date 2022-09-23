/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Quiz.java
 * Author: Duc Ta
 * @author: <Mya > <Phyu>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.ArrayList;

public final class Quiz {

    //
    // Instance Data Fields
    //
     private Club club;
    private String teacher;
    private String student;
    private final String topic;
    private final ArrayList<QuestionAnswer> questionAnswer;


     public static String getQuestions(int index){
         ArrayList<String> question = new ArrayList<>();
         question.add("Which type of class has 'protected' constructors?");
         question.add("Which type of method did Java 8 add to 'interface'?");
         question.add("What new keyword did Java 13 add to 'switch' statement?");
         question.add("In Java 15, what keyword pairs with 'sealed'?");
         question.add("Giants in Spanish?");
         question.add("Take me out to the...?");
         return question.get(index);
        
     }
     public static String getAnswer(int index){
         ArrayList<String> answer = new ArrayList<>();
         answer.add("abstract");
         answer.add("default?");
         answer.add("yield");
         answer.add("permits");
         answer.add("gigantes");
         answer.add("ball game");
         return answer.get(index);
        
     }

    //
    // Constructors
    //
    // public Quiz() {
    // }

    public Quiz() {
        this.questionAnswer = new ArrayList();
        this.topic = "OOP & SF Giants";
        this.makeDefaultQuiz();}

    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //
    public void printQuiz() {

    }
    public boolean runQuiz() {
        
    }

    //
    // Language
    //
}