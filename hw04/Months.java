//
//Natalie Jacobs
//Sept 22, 2014
//CSE2
//HW 04
//
//Prompt user for integer
//Assign month to integer
//Print number of days in month
//For Feb, ask for year and then print number of days 28/29
//
//  compile
//      javac Months.java
//  run
//      java Months
//
//
//import scanner
import java.util.Scanner;

//define class
public class Months {
    
    //define main method
    public static void main (String [] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        System.out.print(
        "Enter an int giving the number of the month (1-12): ");
        int Month = myScanner.nextInt ();
        
        if ((Month>0) && (Month<12)) { 
            
            if ((Month==1) || (Month==3) || (Month==5) || (Month==7) || (Month==8) || (Month==10) || (Month==12)) {
                System.out.println ("The month has 31 days.");
            }
            else if (Month==2) {
                    System.out.println("Enter an integer giving the year: ");
                    int Year = myScanner.nextInt ();
                    boolean LeapYear = ((Year % 4 == 0) && (Year % 100 != 0) || (Year % 400 == 0));
                
                    if (LeapYear) {
                        System.out.println (Year + " has 29 days.");
                    }
                    else {
                        System.out.println (Year + " has 28 days.");
                    }
            }
            else {
                System.out.println ("The month has 30 days.");
            }
        }    
        else {
            System.out.println ("You did not enter an int between 1 and 12.");
        }
            
        }
    }