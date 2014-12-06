//Natalie Jacobs
//October 10, 2014
//CSE 2
//Lab 06 Part 1

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

//import scanner
import java.util.Scanner;

//define class
public class Enigma0 {

    //define main method
    public static void main(String [] args){ // [] in the wrong place
    
    //must declare instance of scanner
    Scanner Scanner;
    Scanner = new Scanner (System.in);
    System.out.print("Enter an int- ");
    int n=Scanner.nextInt(); //declare variable

    if(n>0){ //scanner interger has been declared and can be used in if statement
      System.out.println("You entered "+n);
    }
    else{
      System.out.println("You did not enter an integer."); //else statement should include anything that is not an integer
    }
    
    int k=4,p=6,q=7,r=8; //if you need to get sum n is not needed here
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("Sum is 25");
      default:
        System.out.println("Again, you entered "+n);
    }
  }
}

/* Error report:
 *  Expand this comment:
 *  Explain the error(s) that occurred here, and then fix them
 *  line 20 when defining main method, [] was in the wrong place
 *  instance of scanner needed to be declared
 *  int n needed to be defined outside of if/switch statement; scope error
 *  else statement should include anything that is not an integer
 *  line 35 when declaring int, n was already declared and it is not needed in sum
 */

