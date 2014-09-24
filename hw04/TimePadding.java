//
//Natalie Jacobs
//Sept 23, 2014
//CSE 02
//HW 04
//
//Prompt user to enter positive integer giving number of seconds
//  that have passed in the day
//
//  compile
//      javac TimePadding.java
//  run
//      java TimePadding
//
//import Scanner
import java.util.Scanner;

//define class
public class TimePadding {
    
    //define main method
    public static void main (String [] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        System.out.print(
        "Enter the time in seconds: ");
        int TotalSeconds = myScanner.nextInt();

        //identify variables
        int nHour = (TotalSeconds/3600);
        int nMin = ((TotalSeconds%3600)/60);
        int nSec = (TotalSeconds%60);

        if ((nMin < 10) && (nSec <10)) {
            System.out.println("The time is " + nHour + ":0" + nMin + ":0" + nSec);
            return;
        }    
        if (nMin < 10) {
            System.out.println("The time is " + nHour + ":0" + nMin + ":" + nSec);
            return;
        }
        if (nSec < 10) {
            System.out.println("The time is " + nHour + ":" + nMin + ":0" + nSec);
            return;
        }
        else {
            System.out.println("The time is " + nHour +":" + nMin + ":" + nSec);
        }
        
    } //end of main method
}   //end of class

