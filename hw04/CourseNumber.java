//
//Natalie Jacobs
//Sept 22, 2014
//CSE2
//HW 04
//
//Prompt user to enter 6 digit number
//First four didgits give the year
//Last two digits give the course number:
//  10 Spring
//  20 Summer 1
//  30 Summer 2
//  40 Fall
//Year range 1865-2014
//
//  Compile
//      javac CourseNumber.java
//  Run
//      java CourseNumber
//
//import Scanner
import java.util.Scanner;

//define class
public class CourseNumber {

    //define main method
    public static void main (String [] args) {

        //declare instance of Scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
    
        System.out.print(
        "Enter a six digit number giving the course semester: ");
        int nCourse = myScanner.nextInt();
        
        int nCN = nCourse%100;
        int nCY = (nCourse/100)-(nCN/100);
        
        if ((nCourse >= 186510) && (nCourse <= 201440) && (nCY >= 1865) && (nCY <= 2014)) {
            
            if (nCN == 10) {
                System.out.println("The course was offered in Spring semester of " + nCY);
                return;
            }
            if (nCN == 20) {
                System.out.println("The course was offered in Summer 1 semester of " + nCY);
                return;
            }
            if (nCN == 30) {
                System.out.println("The course was offered in Summer 2 Semester of " + nCY);
                return;
            }
            if (nCN == 40) {
                System.out.println("The course was offered in the Fall semester of " + nCY);
                return;
            }
            else {
                System.out.println(nCN + " is not a legitimate semester.");
            }
        }
        
        else {
        System.out.println("The number was outside the range [186510,201440]");
        }    
        
    }
}