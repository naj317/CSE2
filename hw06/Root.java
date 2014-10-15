//Natalie Jacobs
//October 11, 2014
//CSE 2
//HW 06: Getting Loopy
//Program 2



//import scanner
import java.util.Scanner;

//define a class
public class Root {
    
    //define main method
    public static void main (String [] arg) {
    
        //declare scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.print("Enter a double to find the square root: ");
        double R = myScanner.nextDouble();
        
        //define variable
        double low = 0;
        double high = 1 + R;
        double difference = high - low;
        double middle = (difference/2)+low;
        double midSquare = Math.pow(middle,2);
        
        //while statement should stop once difference is small enough
        while (difference < (.0000001*(1+R))) {
            if (midSquare>R) {
                midSquare = high;
            }
            else if (midSquare<R) {
                midSquare = low;
            
            }
                
        difference ++;    
        midSquare ++;
        }
        
        System.out.println("The square root of " + R + " is " + middle);
        
    }//close main method
}//close class
