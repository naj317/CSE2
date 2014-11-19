//Natalie Jacobs
//CSE2
//

//import random 
import java.util.Random;

//import scanner
import java.util.Scanner;

//define class
public class PokerOdds{
    
    public static void main(String [] arg){ //main method
        showHands();
        //simulateOdds();
    }
    
    public static void showHands() {
        int[]deck = new int [52]; //array of 52 entries (0 to 51) representing deck of cards
        for(int i=0; i<deck.length; i++){ //assigns value to each of the 52 cards
            deck[i] = i; //initializes array at first value of i(0)
        }
        int[]hand = new int [5]; //array of 5 entries representing a hand
        for (int j=0; j<hand.length;j++) { //assigns value for all 5 hands
            hand[j] = -1; //initializes array at -1
        }
    }
    
    //public static void simulateOdds() {
        
    //}
}
