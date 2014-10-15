//Natalie Jacobs
//October 11, 2014
//CSE 2
//HW 06: Getting Loopy
//Program 2



//import scanner
import java.util.Scanner;

//define a class
public class Root {
    
    //defin main method
    public static void main (String [] arg) {
    
        //declare scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.print("Enter a double to find the square root: ");
        double R = myScanner.nextDouble();
        
        double low = 0;
        double high = 1 + R;
        double difference; 
        double middle = 0;
      
        int Loop=1;
        
        while (Loop==1) {
            middle= (high+low)/2;
            if ((Math.pow(middle,2))>R) {
                high = middle;
            }
            else if ((Math.pow(middle,2))<R) {
                low = middle;
            }
              
            difference = (high - low);    
        
            if(difference <= (.0000001*(1+R))){
            Loop++;
            }
       
        }
        System.out.println("The square root of " + R + " is " + (middle)+"");
    }
}