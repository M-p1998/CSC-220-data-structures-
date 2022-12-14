/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: StdOutStdErrTee.java
 * Author: Duc Ta
 * @author: <Mya > <Phyu>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.io.OutputStream;
import java.io.PrintStream;

public class StdOutStdErrTee extends OutputStream {

    //
    // Static Data Fields
    //
    

    //
    // Instance Data Fields
    //
    private String stdOutFilePath;
    private String stdErrFilePath;
    private OutputStream[] streamsToConsoleToFile;

    //
    // Constructors
    //
    public StdOutStdErrTee() {
        
    }
    public StdOutStdErrTee(PrintStream printStream, FileOutputStream fileOutputStream) {
        this.streamsToConsoleToFile = new OutputStream[2];
        streamsToConsoleToFile[0] = printStream;
        streamsToConsoleToFile[1] = fileOutputStream;
    }

    public StdOutStdErrTee(String stdOutFilePath, String stdErrFilePath) {
        this.stdOutFilePath = stdOutFilePath;
        this.stdErrFilePath = stdErrFilePath;
    }


    //
    // Instance Methods
    //
    public void startLog() {
        try {
            FileOutputStream stdOutFile = new FileOutputStream(new File(this.stdOutFilePath));
            FileOutputStream stdErrFile = new FileOutputStream(new File(this.stdErrFilePath));

            StdOutStdErrTee allStdOut = new StdOutStdErrTee(System.out, stdOutFile);
            StdOutStdErrTee allStdErr = new StdOutStdErrTee(System.err, stdErrFile);

            PrintStream stdOut = new PrintStream(allStdOut);
            PrintStream stdErr = new PrintStream(allStdErr);

            System.setOut(stdOut);
            System.setErr(stdErr);

        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void stopLog() {
        //
        // Add code which our own implementation needs
        //
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
    @Override
    public void write(int b) throws IOException {
        for (OutputStream out : this.streamsToConsoleToFile) {
            out.write(b);
            out.flush();
        }
    }
}