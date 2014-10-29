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
public class LoopTheLoop2 {
    
    //define main method
    public static void main (String [] args) {
        
        Scanner scan;
        scan = new Scanner (System.in);

        int loop = 0;
        int nStars = 0;
        int i = 0;
        
        
        while (loop==0) {
        
        System.out.print("Enter an integer between 1 and 15: ");
        int input = scan.nextInt();

        if (input>=1 && input<=15) {
            
            for (nStars = 0; nStars < input; nStars++) {
                System.out.print("*");
            }
            System.out.println();
            for (nStars = 1; nStars <= input; nStars++) {
                for (i = 0; i < nStars; i++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.print("Enter Y or y to continue (N or n to stop):");
            String cont = scan.next();
            
            if (cont=="Y" || cont=="y")
                loop++;
            else if (cont=="N" || cont=="n"){
                System.out.println();
                return;
            }
        }
        
        else {
            System.out.println("You did not enter an integer between 1 and 15");
            return;
        }
        
//        System.out.print("Enter Y or y to continue (N or n to stop):");
//        String cont = scan.next();
        
//        if (cont=="N" || cont=="n")
        
//        return;   
        }
           

        
        
    }//end of main method
}//end of class