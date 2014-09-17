//Natalie Jacobs
//Sept 9 2014
//CSE 002
//HW 02 Walmart Shopping
//
//Compute cost of items bought at Walmart 
//with PA sales tax of 6%.
//
//Calculate total cost of each item seperately (socks, drinking glasses, envelopes) including sales tax
//Calculate total cost of purchases (before tax)
//Calculate total cost of transaction (include tax)
//
//print items being bought
//print how many of each is being bought
//print cost per item
//print cost of each item with tax
//print cost of total purchase with no tax
//print total sales tax
//print total cost of purchases with tax
//
//  compile program
//      javac Arithmetic.java
//  run program
//      java Arithmetic//
//
//  define a class
public class Arithmetic {
//
//  add main method
    public static void main (String [] args) {

    //input data
    int nSocks=3; //number of pairs of socks
    int nGlasses=6; //number of drinking glasses
    int nEnvelopes=1; //number of boxes of evelopes
    
    //variables
    double sockCost$=2.58,  //cost of pair of socks
        glassCost$=2.29,    //cost of drinking glasses
        envelopeCost$=3.25, //cost of box of envelopes
        taxPercent=0.06;    //PA sales tax
    double totalSockCost$, //socks + tax
        totalGlassCost$, //drinking glasses + tax
        totalEnvelopeCost$, //envelopes + tax
        totalPurchase, //total cost of items without tax
        totalTax, //tax on total purchase
        totalTransaction; //totalPurchase + totalTax 
        
    //print out input data
    System.out.println("There are " + nSocks + " pairs of socks being bought at $" +
    sockCost$ + " per pair.");
    System.out.println("There are " + nGlasses + " drinking glasses being bought at $" +
    glassCost$ + " per glass.");
    System.out.println("There is " + nEnvelopes + " box of envelopes being bought at $" +
    envelopeCost$ + ".");
    
    //run calculations
    totalSockCost$=(nSocks*sockCost$+nSocks*sockCost$*taxPercent);
    totalGlassCost$=(nGlasses*glassCost$+nGlasses*glassCost$*taxPercent);
    totalEnvelopeCost$=(nEnvelopes*envelopeCost$+nEnvelopes*envelopeCost$*taxPercent);
    totalPurchase=(nSocks*sockCost$+nGlasses*glassCost$+nEnvelopes*envelopeCost$);
    totalTax=totalPurchase*taxPercent;
    totalTransaction=totalPurchase+totalTax;
    
    //print out output data
    System.out.println("The total costs of " + nSocks + " pairs of socks with tax is $" +
    (int)(totalSockCost$*100)/100.0 + ".");
    System.out.println("The total cost of " + nGlasses + " drinking glasses with tax is $" +
    (int)(totalGlassCost$*100)/100.0 + ".");
    System.out.println("The total cost of " + nEnvelopes + " box of envelopes with tax is $" +
    (int)(totalEnvelopeCost$*100)/100.0 + ".");
    System.out.println("The total cost of the socks, drinking glasses, and envelopes is $" +
    totalPurchase + ".");
    System.out.println("The sales tax on the total purchase is $" + (int)(totalTax*100)/100.0 + ".");
    System.out.println("The total cost of the transaction is $" + (int)(totalTransaction*100)/100.0 + ".");
    
    }   //end of main method
}   //end of class
