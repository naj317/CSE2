/*
Natalie Jacobs
CSE2 - lab 13
*/




import java.util.Arrays;

public class RaggedArrays {
    public static void main (String [] args) {
        
        int [][] array = new int [5][];
        
        for (int i = 0; i<array.length; i++){
            array [i] = new int [i*3+5];
        }
        
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++) {
                array[i][j] = (int)(Math.random()*40);
            }
        }
        
        System.out.println("The array before sorting: "); 
        for (int [] line: array) {
            for (int space: line) {
                System.out.print(space + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The array after sorting: ");
        for (int [] line: array) {
            Arrays.sort(line);
        }
        for (int [] line: array) {
            for (int space: line) {
                System.out.print(space + " ");
            }
            System.out.println();
        }
        
    }
}

