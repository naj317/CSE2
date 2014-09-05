//Natalie Jacobs
//September 4, 2014
//CSE 002
//
//Cyclometer Lab02: Arithmetic Calculus
//Measure the speed, distance, etc of a bike!
//
//print number of minutes for each trip
//print number of counts for each trip
//print distance of each trip in miles
//print distance for the two trips combined
//
//  compile program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//
//
//  define a class
public class Cyclometer{
//    
//  add main method
    public static void main(String [] args) {
        
        // the input data
        int secsTrip1=480;  //seconds for trip 1
        int secsTrip2=3220; //seconds for trip 2
        int countsTrip1=1561;   //number of rotations for trip 1
        int countsTrip2=9037;   //number of rotations for trip 2
        
        // variables
        double wheelDiameter=27.0,  //diameter of wheel
            PI=3.14159,//define Pi
            feetPerMile=5280,   //feet per mile
            inchesPerFoot=12,   //inches per foot
            secondsPerMinute=60;    //seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance; //
        
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        //run the calculations; store the values. 
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels)
        distanceTrip1/=inchesPerFoot*feetPerMile;   // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
//
    }   //end of main method
}   //end of class