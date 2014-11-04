//Natalie Jacobs
//CSE 2
//HW 10 - Blocked Again

//
//
//
//

//import scanner
import java.util.Scanner;
    
//define class
public class BlockedAgain{
        
    //define main method
    public static void main(String []s){
            
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); //calls on getInt() method to make sure user input matches parameters
        allBlocks(m); //calls on allBlocks method
            
    }
            
    public static int getInt() {
            
        int checkNumber; //int to be return into main method
        
            System.out.print("Enter an integer between 1 and 9 inclusive: "); //prompts user for input
            checkNumber = checkRange(); //goes into checkRange() then to checkInt() and the back to checkRange() to check parameters
            return checkNumber; //integer returned from checkRange() to be returned to main method
            
    }
        
    public static String checkInt() {
            
        Scanner UserInput;
        UserInput = new Scanner(System.in); //initalizes scanner
            
        while (!UserInput.hasNextInt()) { //any user input that is not an integer will go through loop
            UserInput.next(); //this ensures that non-integers will be accepted, show the following print statement, without crashing
            System.out.print("You did not enter an int; try again: ");//error print statement 
        }
        return (UserInput.nextInt() + ""); //if user enter int, method returns that int and goes into checkRange() method before being returned into main method
    }
        
    public static int checkRange() {
            
        String numbers = "123456789"; //makes possible input a string
                
        String input = (checkInt()); //take the user input from checkInt() method above
        String a;
                
        int run = 0; //outside counter
        int counter = 0; //inside counter
        int integer; //return value as an integer
    
            while (run == 0) { //outer loop
        
                while (counter<numbers.length() && numbers.charAt(counter)!= ' ') { //checks length of input and 
                    a = numbers.charAt(counter) + ""; //changes char to string
        
                    if (a.equals(input)) { //if input equal anything within string
                        integer = (input.charAt(0)-'0'); //changes from string to integer (found online)
                        return integer; //returns an integer
                    }
                counter++; //increments counter
                }
        
            System.out.print("You did not enter an int in [1,9]; try again: ");
            input = checkInt(); //goes back to checkInt() method to get a new user input
            counter = 0; //resets counter
            }
                
        return ' '; //system wants return statement
    }
        
    public static void allBlocks (int input) {
        
        int i = 0; //integer i for outer loop
        int Block;
        int Line;
            
        for (i = 0; i < input; i++) {
            Block = block(input, i); //calls on block() method to print out number block pattern
            Line = line(input, i); //calls on line() method to print out line pattern between blocks
        }
    }
        
    public static int block(int input, int i) { //method prints out number block pattern; input is the user input that has been returned from getInt() method
        
        //initialize variables to be used within loop
        int k = 0;
        int j = 0;
        int l = 0;
        
        for (k = 0; k < i + 1; k++) {
            for (j = 0; j < (input - i); j++) {
                System.out.print(" ");
            }
            for (l = 0; l < ((i * 2) + 1); l++) {
                System.out.print(i + 1);
            }
            System.out.println();
                
        } //this loop takes care of the spaces followed by the number that should be printed
        return ' ';  
    }
        
    public static int line(int input, int i) { //method prints out incrementing number of "-" after/between number block and returns printed statements to allBlocks() method
        
        //initializes varibles
        int m = 0;
        int n = 0;
            
        for (m = 0; m < (input - i); m++) {
            System.out.print(" ");
        }//spaces before "-"
            
        for (n = 0; n < ((i * 2) + 1); n++) {
            System.out.print("-");
        }//prints the proper amount of "-"
        System.out.println();//next line
        return ' ';
    }

}

