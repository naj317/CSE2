//Natalie Jacobs
//October 11, 2014
//CSE 2
//HW 06: Getting Loopy
//Program 1

//

//define class
public class Roulette {
    
    //define main method
    public static void main (String [] arg) {
        
        int myNum = (int)(Math.random()*39); //number between 0 and 38 that gambler might choose to bet on
        int counter1 = 0; //for 1000 loop
        int counter2 = 0; //for storing how many times you win in a 100 rounds
        int countWin = 0; //counts wins
        int countProfit = 0; //counts how many times you made a profit (over 3 wins; over $100)
        int countLoss = 0; //how many times you didnt win anything
        int winnings = 0; //amount of money made
        
        
        while (counter1 < 1000) {

            while (counter2 <100) { 
                int randomNum = (int)(Math.random()*39); //random number generated by game each time
                if (myNum == randomNum) {//win
                    countWin = countWin +1;
                }
                counter2++;
            } //stores values 100 times

            if (countWin >=3){
                countProfit = countProfit +1;
            } //how many times your bet equals the randomly generated number
            
            else if (countWin == 0){
                countLoss = countLoss +1;
            } //how many times your bet does not equal randomly generated number
            
            winnings = (countWin * 36) + winnings;
            //each time you win you get $36
            
            countWin = 0; 
            counter2 = 0;
            counter1++;
            //must reset counters within the 1000 loop
            
        } //store values 100000 times

        System.out.println("You didn't win anythining " + countLoss + " times.");
        System.out.println("You profited " + countProfit + " times.");
        System.out.println("You made $" + winnings);
        System.out.println("You made a profit of $" + (100000 - winnings));
    
        
    }//close main method
}//close class
