//Natalie Jacobs
//CSE 002
//hw 10 - FindDuplicates

//  compile
//      javac FindDuplicates.java
//  run
//      java FindDuplicates


//import scanner
import java.util.Scanner;

//define class
public class FindDuplicates{
    
    //define main method
    public static void main(String [] arg){
        
        //initialize scanner
        Scanner scan=new Scanner(System.in);
        
        int num[]=new int[10];
        String answer="";
        
        do{
            System.out.print("Enter 10 ints- ");
            for(int j=0;j<10;j++){
                num[j]=scan.nextInt();
            }
            String out="The array ";
            out+=listArray(num); //return a string of the form "{2, 3, -9}"   
            if(hasDups(num)){
                out+="has ";
            }
            else{
                out+="does not have ";
            }
            out+="duplicates.";
            System.out.println(out);
            out="The array ";
            out+=listArray(num);    
            if(exactlyOneDup(num)){
                out+="has ";
            }
            else{
                out+="does not have ";
            }
            out+="exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
        } while(answer.equals("Y") || answer.equals("y"));
    }
    
    public static String listArray(int num[]){ 
        String out="{";
        
        for(int j=0;j<num.length;j++){
            if(j>0){
                out+=", ";
            }
            out+=num[j];
        }
        out+="} ";
        return out;
    }
    
    public static boolean hasDups(int[] num) {
        for (int i=0; i<num.length; i++) { //goes through length of array
            for (int j=i+1; j<num.length; j++) { //checks each number against the previous
                if (num[i] == num[j]) { // if finds at least one set pair, returns true
                    return true; 
                }
            }
        } return false; //if there are no pairs
    }
    
    public static boolean exactlyOneDup(int[] num) {
        boolean x = false;
        int count = 0; //counter to ensure only one pair is found
        for (int i=0; i<num.length; i++) { //goes through length of array
            for (int j = i+1; j<num.length; j++) { //checks each number against the previous
                if (num[i] == num[j]){ //finds pairs
                    count++; //continues cycling through until it finds pairs
                }
            }
        }
        if (count==1) { //if only one pair is found
            x = true; 
        }
        return x; //if there is more than one duplicate pair
    }
}
