//Natalie Jacobs
//Sept 16, 2014
//CSE 002
//HW 03 
//
//Prompt user to enter double
//Print out the cube root of the number
//Use scanner
//
//  compile program
//      javac Root.java
//  run the program
//      java Root

//  import scanner
import java.util.Scanner;

//  define class
public class Root{
    
    //  add main method
    public static void main(String [] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        myScanner =  new Scanner (System.in);
        
        //user input
        System.out.print(
        "Enter a number to be cubed (xx.xx): ");
        double nCubed = myScanner.nextDouble();
        
        double nCubedRoot;
        nCubedRoot = Math.pow (nCubed, (1.0/3));
        
        System.out.println("The cubed root of " + nCubed + " is " + nCubedRoot + ".");
        System.out.println(nCubedRoot + " * " + nCubedRoot + " * " + nCubedRoot +
        " = " + nCubed + ".");
            
    }     
}       