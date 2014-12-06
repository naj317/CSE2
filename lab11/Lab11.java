//Natalie Jacobs
//CSE2
//lab 11

////  compile
//      javac Lab11.java
//  run
//      java Lab11


//import scaner
import java.util.Scanner;

//define class
public class Lab11 {
    
    public static void main (String [] args) {
        
        Scanner input = new Scanner (System.in); 
            
            int [] list1 = new int [10];
            
            System.out.print("Enter 10 integers: ");
            
            int low = 0;
            int high = 0;
            int sum = 0;
            
            for (int i=0; i<10; i++) {
                list1[i]=input.nextInt();
            
                if (i==0) {
                    low = list1[i];
                    high = list1[i];
                }    
                if (low > list1[i]) {
                    low = list1[i];
                }
                if (high < list1[i]) {
                    high = list1[i];
                }
                
                sum += list1[i]; 

            } 
            
            System.out.println("The lowest integer is " + low);
            System.out.println("The highest integer is " + high);
            System.out.println("The sum of the integers is " + sum);
            
            int [] list2 = new int [10];
            
            for (int i = 0; i <10; i++) {
                list2[i] = list1[9-i];
                
                System.out.println(list1[i] + " " + list2[i]);
                
            }
            
    }
}