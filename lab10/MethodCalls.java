//Natalie Jacobs
//CSE02
//Lab 10 - Calling Methods

//Practice writing methods that call methods
//

//  compile 
//      javac MethodCalls.java
//  run
//      java MethodCalls

/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/


//define class
public class MethodCalls {

    //define main method
    public static void main(String[] args) {

        //define variables
        int a = 784, b = 22, c;

        c = addDigit(a, 3);
        System.out.println("Add 3 to " + a + " to get " + c);

        c = addDigit(addDigit(c, 4), 5);
        System.out.println("Add 3, 4, and 5 to " + a + " to get " + c);
        System.out.println("Add 3 to -98 to get: " + addDigit(-98, 3));

        c = join(a, b);
        System.out.println("Join " + a + " to " + b + " to get " + c);
        System.out.println("Join 87, 42, and 83 to get " + join(87, join(42, 83)));
        System.out.println("Join -9 and -90 to get " + join(-9, -90));
    }

    //method 
    public static int addDigit(int x, int y) {
        if (y >= 0 && y <= 9) {
            String XX;
            String YY;
            String result;
            if (x < 0) {
                XX = "" + Math.abs(x);
                YY = "" + y;
                result = "-" + YY + XX;
            }
            else {
                XX = "" + x;
                YY = "" + y;
                result = YY + XX;
            }
            int number = Integer.parseInt(result);
            return number;
        }
        else {
            return x;
        }
    }

    public static int join (int a, int b) {
        String AA = ""+ Math.abs(a);
        String BB = ""+ Math.abs(b);
        String result = AA + BB;
        int number = Integer.parseInt(result);
        return number;
    }
}

