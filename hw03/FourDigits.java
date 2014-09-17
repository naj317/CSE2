//Natalie Jacobs
//Sept 16, 2014
//CSE 002
//HW 03 

//Prompt user to enter a double 
//then print out the first four digits
//to the right of the decimal place

//  compile program
//      javac FourDigits.java
//  run the program
//      java FourDigits

//  import scanner
import java.util.Scanner;

//  define class
public class FourDigits{
    
    //  add main method
    public static void main(String [] args) {
    
        //declare instance of Scanner
        Scanner myScanner;
        myScanner =  new Scanner (System.in);
        
        System.out.print (
        "Enter a double (xx.xx) and then display the four digits to the right of the decimal: ");
        double ndecimal = myScanner.nextDouble ();
        
        double fourDecimal, nodecimal, FourDigits;
        fourDecimal = ndecimal - (int)(ndecimal);
        nodecimal = (fourDecimal * 10000);
        FourDigits = (int)nodecimal;
        
        System.out.println ("The four digits are: " + (int)FourDigits );
        
    }
}
