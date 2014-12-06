//Natalie Jacobs
//Exam 3 Practice
//
//

//Arrays

import java.util.Scanner;
public class ArraysPractice {
    public static void main (String [] args) {
    
        Scanner input = new Scanner (System.in);
        
        
int[] a = {3, 7, 10, 15, 91, 110, 150}; // a sorted array not containing duplicates
int target = 91; // the element to be searched
int left = 0;
int middle;
int right = a.length - 1;
while (left <= right) {
    middle = (left + right) / 2;
    if (a[middle] == target) {
        System.out.println("Element found at index " + middle);
        break;
    } else if (a[middle] < target) {
        left = middle + 1;
    } else if (a[middle] > target) {
        right = middle - 1;
    }
}  

}

}

//int cardNumber = (int)(Math.random()*deck.length);
//String suit = suits[cardNumber/13];
//String rank = ranks[cardNumber%13];
//System.out.println("Card number " + cardNumber + ": " + rank + " of " + suit);