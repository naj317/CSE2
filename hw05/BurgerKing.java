//
//Natalie Jacobs
//Sept 26, 2014
//CSE 02
//HW05 
//Burger King order
//
//
//Write a program that prompts the user to order
//  a burger (with or without cheese),
//  soda (Pepsi, Coke, Sprite, or Mountain Dew), or
//  fries (large or small)
//
//  compile
//      javac BurgerKing.java
//  run
//      java BurgerKing
//
//
//input scanner
import java.util.Scanner;

//define class
public class BurgerKing {
    
    //define main method
    public static void main (String [] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //ask for user input
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("   Burger (B or b)");
        System.out.println("   Soda (S or s)");
        System.out.println("   Fries (F or f)");
        System.out.print("I would like:");
        String Order = myScanner.next();

        //generate order
        switch (Order) {
            case "B":
            case "b": 
                System.out.println("Enter A or a for \"all the fixins\"");
                System.out.println("C or c for cheese");
                System.out.print("N of n for no toppings: ");

                String burger = myScanner.next();
                switch(burger) {
                    case "A":
                    case "a": System.out.println("You ordered a burger with all the fixins.");break;
                    case "C":
                    case "c": System.out.println("You ordered a burger with cheese."); break;
                    case "N":
                    case "n": System.out.println("You ordered a burger without toppings."); break;
                }break;
            case "S":
            case "s": System.out.print("Do you want Pepsi? (P or p), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m):");
            
                String soda = myScanner.next();
                switch(soda) {
                    case "P": 
                    case "p": System.out.println("You ordered a Pepsi."); break;
                    case "C":
                    case "c": System.out.println("You ordered a Coke."); break;
                    case "S": 
                    case "s": System.out.println("You ordered a Sprite."); break;
                    case "M":
                    case "m": System.out.println("You ordered a Mountain Dew."); break;
                }break;
            case "F":
            case "f": System.out.print("Do you want a large or small order of fries? (L,l,S,s):");
            
                String fries = myScanner.next();
                switch(fries) {
                    case "L":
                    case "l": System.out.println("You ordered large fries.");break;
                    case "S":
                    case "s": System.out.println("You ordered small fries.");break;
                }break;
            default: //works like else
                        if (Order.length()>1) {
                            System.out.println("A single character was expected");
                            return;
                        }
                        else {
                            System.out.println("You did not enter B/b, S/s, or F/f");
                            return;
                        }
        }
        
    }
}