//Natalie Jacobs
//October 16, 2014
//CSE 002
//Lab07 - part II

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