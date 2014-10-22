//Natalie Jacobs
//October 16, 2014
//CSE 002
//Lab07 - part III

//
//
//
//
//
//

//import scanner
import java.util.Scanner;

//define class
public class LoopTheLoop1 {
    
    //define main method
    public static void main (String [] args) {
        
        Scanner scan;
        scan = new Scanner (System.in);
        System.out.print("Enter an integer between 1 and 15: ");
        int input = scan.nextInt();
        
        int nStars = 0;
        int i = 0;
        
        for (nStars = 0; nStars <= 10; nStars++) {
            for (i = 0; i < nStars; i++){
                System.out.print("*");
            }
            System.out.println("");    
        }
    }
}