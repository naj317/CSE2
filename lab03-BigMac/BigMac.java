//Natalie Jaocbs
//Sept 12, 2014
//CSE 002

//Big Mac lab03: Arithmetic Calculations and Input
//Use scanner to get input from user

//calculate number of Big Macs bought
//calculate the price of each Big Mac
//calculate the percentage cost of a Big Mac (6% in PA)
//calculate total cost

//  compile program
//      javac BigMac.java
//  run the program
//      java BigMac

//  import scanner
import java.util.Scanner;

//  define class
public class BigMac{
    
    //  add main method
    public static void main(String [] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        myScanner =  new Scanner (System.in);
    
        System.out.print(
        "Enter the number of Big Macs (an integer > 0): ");
        int nBigMacs = myScanner.nextInt ();
    
        System.out.print("Enter the cost per Big Mac as " + 
        "a double (in the form xx.xx): ");
        double BigMac$ = myScanner.nextDouble();
    
        System.out.print("Enter the percent tax as a whole numer (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100;   //user enters percent, but I want proportion
    
        double cost$;
        int dollars,    //whole dollar amount of cost
            dimes, pennies; //for storing digits
            //to the right of the decimal point
            //for the cost$
        cost$ = nBigMacs*BigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars = (int)cost$;
        //get dimes amount, 
        //examples:
        //(int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //% (mod) operater returns the remainder
        //after the division: 583 % 100 - > 83, 27 % 5 - > 2
        dimes = (int)(cost$*10)%10;
        pennies = (int)(cost$*100)%10;
    
        System.out.println("The total cost of "+ nBigMacs +
        " Big Macs, at $" + BigMac$ + " per Big Mac, with a sales tax of " +
        (int)(taxRate*100) + "%, is $" + dollars + '.' + dimes + pennies);
    
    }   //end of main method
}   //end of class