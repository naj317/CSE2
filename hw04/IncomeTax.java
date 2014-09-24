//
//Natalie Jacobs
//Sept 22, 2014
//CSE2
//HW 04
//
//Determining Income Tax
//
//promt user for integer
//print int in thousands of dollars
//determine tax amount
//tax brackets:
//  < 20, 5%
//  >= 20 and < 40, 7%
//  >= 40 and < 78, 12%
//  >= 78, 14%
//
//  compile program
//      javac IncomeTax.java
//  run program
//      java IncomeTax
//
//import Scanner
import java.util.Scanner;

//define class
public class IncomeTax {
    
    //define main method
    public static void main (String [] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        System.out.print(
        "To determine Income Tax enter an int giving the number of thousands:");
        int Income = myScanner.nextInt ();
        
        if (Income>=0 && Income<=20) {
            System.out.println("The tax on $" + (Income*1000) + " is 5% and the tax is $" +
            (Income*.05*1000));
        }
        else if (Income>=20 && Income<=40) {
            System.out.println("The tax on $" + (Income*1000) + " is %7 and the tax is $" +
            (Income*.07*1000));
        }    
        else if (Income>=40 && Income<=78) {
            System.out.println("The tax on $" + (Income*1000) + " is 12% and the tax is $" +
            (Income*.12*1000));
        }
        else if (Income>=78) {
            System.out.println("The tax on $" + (Income*1000) + " is 14% and the tax is $" +
            (Income*.14*1000));
        }
        else {
            System.out.println("You did not enter a positive integer.");
            return; //terminate the program
        }
            
    }
}

