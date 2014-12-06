//Natalie Jacobs
//
//

import java.util.Scanner;

//define class
public class ExamPractice {
    
    //define main method
    public static void main (String [] args) {
        /*
        int j = 0;
        int i = 0;
        int k = 0;
        
        
        for (j = 0; j < 5; j++) {
            for (i = j+1; i > 0; i--){
                System.out.print(j);
                }
        System.out.println();
        }
        
        for (i=0; i <3 ; i++) {
            for (j=i+1; j>0; j--) {
                for (k =j; k>0; k--)
                    System.out.print("b");
            }System.out.println();
        }
        
      int j = 1;
      int i = 3;
      for (i = 6; i >-6; i = i-2){
        j = j*2;
      }System.out.println(j);
    */
    
    /*
    Scanner input = new Scanner (System.in);
    
    System.out.print("Enter and int: ");
    int c = input.nextInt();
    
    while (c>0) {
        System.out.println("Enter an int greater than " + c + ":");
        int d = input.nextInt();
        
        if (d>0 && d>c) {
            System.out.println (c + " + ... + " + d + " = " + sum(c,d));
            return;
        }
        else {
            System.out.println("Sorry, you entered " + d + " <= " + c);
        }
    }
        
    }//end of main method
    
    public static int sum (int low, int high) {

        int count = low;
        int sum = 0;
        
        
        while (count <= high) {
            sum = sum + count;
            count ++;    
        } 
        return sum;
        
    }  
    */
    int i = 0;
    int j = 0;
    
    for (i = 9; i >0; i--) {
        for (j = i -1; j>0; j--){
            System.out.print(" ");
        }
        System.out.println(i);
    }
    
        
    }
    
         
}