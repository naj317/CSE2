//Natalie Jacobs
//CSE 02
//Lab 08

//The purpose of this lab is to practice
//writing methods, overloading methods, and 
//in forcing the user to enter good input.

//  compile
//      javac HW8.java
//  run
//      java HW8

//import Scanner
import java.util.Scanner;

//define class
public class HW8{
    
    public static String inputLength (Scanner scan) {//this method ensure the length of the user input is one
    
        String check = scan.next(); //gets user input
        
        while (!(check.length() == 1)) { //while loop ensures user input is of length 1

            System.out.print("You should enter exactly one character; try again: ");
            check = scan.next();
           
        }
        return check;
    }
    
    public static char getInput (Scanner scan, String line1) { //this method makes user enter C or c
        
        String letter = inputLength(scan); //strings output from inputLenth method
        String a;
        
        int run = 0; //outside counter
        int counter = 0; //inside counter
        
        while (run == 0) {
        
            while (counter<line1.length() && line1.charAt(counter)!= ' ') {
                a = line1.charAt(counter) + "";
            
                if (a.equals(letter)) { 
                    return letter.charAt(0);
                }
                counter++;    
            }
            
            System.out.print("You did not enter a character from the list " +line1+ "; try again: ");
            letter = inputLength(scan);
            counter = 0;
        }
        return ' ';
    }
    
   
    //define method for Y, y, N, n
    public static char getInput (Scanner scan, String line2, int digit1) { //this method forces user to input Y, y, N, or n
    
        String a;
        
        int run = 0; //outside loop
        int counter = 0;
        
        
        while (run<digit1) {//gives user 5 tries to enter input that it's satisfied with
            
            String input = scan.next(); //user input
            
            while (counter<line2.length() && line2.charAt(counter)!= ' ') {
                a = line2.charAt(counter)+"";
                
                if(a.equals(input)){
                    return input.charAt(0);
                }
                counter++;
            }
            
            System.out.print("You did not enter a character from the list "+line2+"; try again; ");
            counter = 0;
            run++;
        }
        System.out.println();
        System.out.println("You failed after 5 attempts.");
        
        return ' '; 
    }
    

    public static String inputLength2 (Scanner scan) { //method to ensure length is 1
    
        String check = scan.next();
        
        while (!(check.length() == 1)) {
            
            System.out.println("Enter exactly one character.");
            System.out.println("Choose a digit.");
            System.out.println("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':");
            check = scan.next();
           
        }
        return check;
    }
    
    
    //define method for chooosing digit
    public static char getInput (Scanner scan, String line3, String digit2) {//asks user to enter digits 1-9 using strings
        
        System.out.println(""+line3+"");
        System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':");
        String letter = inputLength2(scan);//strings output from inputLenth method
        String a;
        
        int run = 0;
        int counter = 0;
        
        
        while (run == 0) {
            
            while (counter<digit2.length() && digit2.charAt(counter)!= ' ') {
                a = digit2.charAt(counter) + "";
            
                if (a.equals(letter)) {
                    return letter.charAt(0);
                }
                counter++;    
            }
            
            System.out.println("You did not enter an acceptable character.");
            System.out.println(""+line3+"");
            System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':");
        
            letter = inputLength2(scan);
            counter = 0;
        }
        return ' ';
        
    }
    
    
    
    //define main method
    public static void main(String []arg){
        
	    char input;
	    
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	    input=getInput(scan,"Cc");
	    System.out.println("You entered '"+input+"'");
	    
	    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	    input=getInput(scan,"yYnN",5); //give up after 5 attempts
	    

	    if(input!=' '){
   	    System.out.println("You entered '"+input+"'");
	    }
	    
	    input=getInput(scan,"Choose a digit.","0123456789");
	    System.out.println("You entered '"+input+"'");
        
        
    }//end method  
}//end class
