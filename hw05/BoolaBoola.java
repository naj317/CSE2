//
//Natalie Jacobs
//Sept 30, 2014
//CSE 02
//HW05
//Booleans
//
//Write a program that has three boolean variables 
//  to each of which the value of true or false 
//  is randomly assigned.
//
////input scanner
import java.util.Scanner;

//define class
public class BoolaBoola {
    
    //define main method
    public static void main (String [] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //variables
        boolean one = false, two = false, three = false;
        int oneB = (int)(Math.random()*2);
        int twoB = (int)(Math.random()*2);
        int threeB = (int)(Math.random()*2);
        String oneA = "";
        String twoA = "";
        String threeA = "";
        
        //repeat above code for 2 operators 
        int operator1 = (int)(Math.random()*2);
        int operator2 = (int)(Math.random()*2);
        
        switch(oneB){
            case 0: one = false;
                    oneA = "false";
                    break;
            case 1: one = true;
                    oneA = "true";
                    break;
        }
       
        switch(twoB){
            case 0: two = false; 
                    twoA = "false";
                    break;
            case 1: two = true;
                    twoA = "true";
                    break;
        }
    
        switch(threeB){
            case 0: three = false;
                    threeA = "false";
                    break;
            case 1: three = true;
                    threeA = "true";
                    break;
        }
        
        String operator1String = "";
        switch(operator1){
            case 0: operator1String = "&&"; break;
            case 1: operator1String = "||"; break;
        }
        
        String operator2String = "";
        switch(twoB){
            case 0: operator2String = "&&"; break;
            case 1: operator2String = "||"; break;
        }
        
        System.out.println("Does " + oneA + " " + operator1String + " " + twoA + " " + operator2String + " " + threeA + " have the value true (T/t) or false (F/f)");
        String statement = myScanner.next();
        boolean input = false;
        switch(statement){
            case "T":
            case "t":
                input = true;
                break;
            case "F":
            case "f":
                input = false;
                break;
        }
        
        boolean answer = false;
        
        if ((statement.equals("F"))||(statement.equals("f"))||(statement.equals("T"))||(statement.equals("t"))) {
            
            
            if (operator1String.equals("||") && operator2String.equals("||")) {
                if(one || two || three)
                    answer = true;
                else
                    answer = false;
            }
            else if (operator1String.equals("||") && operator2String.equals("&&")) {
                if(one || two && three)
                    answer = true;
                else
                    answer = false;
            }
            else if (operator1String.equals("&&") && operator2String.equals("||")) {
                if(one && two || three)
                    answer = true;
                else
                    answer = false;
                
            }
            else if (operator1String.equals("&&") && operator2String.equals("&&")) {
                if(one && two && three)
                    answer = true;
                else
                    answer = false;
                
            }
            
            if (answer && input)
                System.out.println("correct the boolean is true");
            else if(!answer && input)
                System.out.println("incorrect answer");
            else if(answer && !input)
                System.out.println("incorrect answer");
            else if(!answer && !input)
                System.out.println("correct the boolean is false");
            
        }
        else
            System.out.println("Wrong; try again");
    }
}
        