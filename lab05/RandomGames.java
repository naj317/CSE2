//
//Natalie Jacobs
//CSE 02
//Lab05
//Random Games Generator
//
//Write a program that uses the Scanner class to obtain from the user 
//one of three choices for a game of chance: 
//  (1) Roulette 
//  (2) Craps or 
//  (3) Picking a card from a deck of playing cards
//
//  compile
//      javac RandomGames.java
//  run
//      java RandomGames
//
//input scanner
import java.util.Scanner;

//define class
public class RandomGames {
    
    //define main method
    public static void main (String [] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        System.out.print("Enter R or r for Roulette, C or c for Craps, P or p for Picking a card:" );
        String RG = myScanner.next(); //RG stands for Random Game
        
        if (RG.equals("R")||RG.equals("r")) {
            int R = (int)(Math.random()*37);
            
                if (R == 37) {
                R = 00;
                return;
                }
                
        System.out.println("Roulette: " + R);
        return;
        }
        
        if (RG.equals("C")||RG.equals("c")) {
            int dice1 = (int)(Math.random()*6);
            int dice2 = (int)(Math.random()*6);
            int total = (dice1 + dice2);
            System.out.println(dice1 + "+" + dice2 + "=" + total);
            return;
        }
        if (RG.equals("P")||RG.equals("p")) {
            int D = (int)(Math.random()*13); //number drawn
            int S = (int)(Math.random()*4); //suite drawn
            
            switch (D % 13) {
                case 0: System.out.print("Ace of "); break;
                case 1: System.out.print("2 of "); break;
                case 2: System.out.println("3 of "); break;
                case 3: System.out.println("4 of "); break;
                case 4: System.out.println("5 of "); break;
                case 5: System.out.println("6 of "); break;
                case 6: System.out.println("7 of "); break;
                case 7: System.out.println("8 of "); break;
                case 8: System.out.println("9 of "); break;
                case 9: System.out.println("10 of "); break;
                case 10: System.out.println("Jack of "); break;
                case 11: System.out.println("Queen of "); break;
                case 12: System.out.println("King of "); break;
            }
            switch (S % 4) {
                case 0: System.out.println("Spades"); break;
                case 1: System.out.println("Clover"); break;
                case 2: System.out.println("Hearts"); break;
                case 3: System.out.println("Diamonds"); break;
            }
        return;
        }
        
        else {
            if (RG.length()>1) {
            System.out.println ("You did not input a single character");
            return;
            }
            else {
            System.out.println ("'"+RG+"'"+"is not R/r, C/c, or P/p");
            }
            
        }
        
    }
}