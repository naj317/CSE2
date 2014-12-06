//Natalie Jacobs
//October 21, 2014
//CSE 002
//HW 07 - Number Stacking

//Use FOR, WHILE, and DO-WHILE statments to print out following pattern

//  compile
//      javac NumberStack.java
//  run
//      java NumberStack

//import scanner
import java.util.Scanner;

//define class
public class NumberStack {

    //define main method
    public static void main(String[] args) {

        //name scanner
        Scanner scan;
        scan = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 9: "); //prompting user
        int input = scan.nextInt(); //user input variable

        //define variables
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;


        if ((input >= 1) && (input <= 9)) { //conditional statement. MUST BE BETWEEN 1 AND 9.
            
            System.out.println("Using for loops:");
            for (i = 0; i < input; i++) {
                for (k = 0; k < i + 1; k++) {
                    for (j = 0; j < (input - i); j++) {
                        System.out.print(" ");
                    }
                    for (l = 0; l < ((i * 2) + 1); l++) {
                        System.out.print(i + 1);
                    }
                    System.out.println();
                } //this loop takes care of the spaces followed by the number that should be printed
                for (m = 0; m < (input - i); m++) {
                    System.out.print(" ");
                }//spaces before "-"
                for (n = 0; n < ((i * 2) + 1); n++) {
                    System.out.print("-");
                }
                System.out.println();
            }

            //reinstate variables for WHILE loop
            i = 0;
            j = 0;
            k = 0;
            l = 0;
            m = 0;
            n = 0;

            System.out.println("Using while loops:");
            while (i < input) {
                while (k < i + 1) {
                    while (j < (input - i)) {
                        System.out.print(" ");
                        j++; //increment
                    }
                    j = 0; //reinstate variable
                    while (l < ((i * 2) + 1)) {
                        System.out.print(i + 1);
                        l++; //increment
                    }
                    l = 0;//reinstate variable
                    System.out.println();
                    k++;//increment
                }
                k = 0;//reinstate variable
                while (m < (input - i)) {
                    System.out.print(" ");
                    m++;//increment
                }
                m = 0;//reinstate variable
                while (n < ((i * 2) + 1)) {
                    System.out.print("-");
                    n++;//increment
                }
                n = 0;//reinstate variable
                System.out.println();
                i++;//increment initial while loop
            }

            //reinstate variables for DO-WHILE loop
            i = 0;
            j = 0;
            k = 0;
            l = 0;
            m = 0;
            n = 0;

            System.out.println("Using while loops:");

            do {
                do {
                    do {
                        System.out.print(" ");
                        j++;
                    } while (j < (input - i));
                    j = 0;

                    do {
                        System.out.print(i + 1);
                        l++;
                    } while (l < ((i * 2) + 1));
                    l = 0;

                    System.out.println();

                    k++;
                } while (k < i + 1);
                k = 0;

                do {
                    System.out.print(" ");
                    m++;
                } while (m < (input - i));
                m = 0;

                do {
                    System.out.print("-");
                    n++;
                } while (n < ((i * 2) + 1));
                n = 0;

                System.out.println();

                i++;
            } while (i < input);
        }
        
        else //if user input does not satisfy if statement
            System.out.println("You did not enter an integer between 1 and 9");

    }//end main method
}//end class