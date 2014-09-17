//Natalie Jacobs
//Sept 16, 2014
//CSE 002
//HW 03 
//
//Enter the number of counts
//Enter the number of seconds
//Calculate the distance travelled, the minutes it took and
//Calculate the average miles per hour
//
//  compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle
//
//import scanner
import java.util.Scanner;

//define a class
public class Bicycle {
    
    //add main method
    public static void main (String [] args) {
    
    //declare instance of scanner
    Scanner myScanner;
    myScanner = new Scanner (System.in);
    
    System.out.print (
    "Enter the number of seconds (an integer > 0): ");
    int nSeconds = myScanner.nextInt ();
    
    System.out.print (
    "Enter the number of counts (an integer > 0): ");
    int nCounts = myScanner.nextInt ();
    
        //variables
        double wheelDiameter=27.0,  //diameter of wheel
            PI=3.14159,//define Pi
            feetPerMile=5280,   //feet per mile
            inchesPerFoot=12,   //inches per foot
            secondsPerMinute=60;    //seconds per minute
        double totalDistance, nHoursTotal;
        
        //get total distance in miles
        totalDistance = nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        nHoursTotal = ((nSeconds/secondsPerMinute)/60);
        
        System.out.println("The distance travelled was " + totalDistance + 
        " and took " + (nSeconds/60) + " minutes.");
        
        System.out.println("The average mph was " + (totalDistance/nHoursTotal) + ".");
    
    }
}