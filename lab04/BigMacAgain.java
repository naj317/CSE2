//
//Natalie Jacobs
//Sept 19, 2014
//CSE 2 
//Lab 04

//Big Mac...Again...
//Use scanner to obtain input from user
//How many Big Macs?
//Fries or no fries?
//Total cost

//  compile
//  run

//import scanner
import java.util.Scanner;

//define class
public class BigMacAgain {
    
    //define main method
    public static void main (String [] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //declare variables
        double CostBigMacs = 2.22;
        double CostFries = 2.15;

        System.out.print(
        "How many Big Macs would you like to order?: ");    //asks for user input
        int nBigMacs = myScanner.nextInt ();
        
        if(nBigMacs>0) {
            System.out.println ("You ordered " + nBigMacs + " Big Macs for a cost of " +
            nBigMacs + " x $" + CostBigMacs + "= $" + (nBigMacs*CostBigMacs));
        }
        else {
            System.out.println("You did not enter an integer > 0.");
            return; //terminate program
        }
        
        System.out.print(
        "Do you want an order of Fries (Y//y//N//n)?: ");
        String response = myScanner.next();
        
        if(response.equals("Y")||response.equals("y")) {
            System.out.println("You ordered fries at a cost of $" + CostFries);
            System.out.println("The total cost of your meal is $" + ((nBigMacs*CostBigMacs)+CostFries)*100/100.0);
        }
            else if(response.equals("N")||response.equals("n")) {
                System.out.println("The total cost of your meal is $" + (nBigMacs*CostBigMacs)*100/100.0);
            }
        else {
            System.out.println("You did not enter Y, y, N, or n.");
            return; //terminate program
        }
        
    }
}

