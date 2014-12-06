/*
Natalie Jacobs
CSE2 - HW 12


  compile
      javac MatrixSorter.java
  run
      java MatrixSorter
*/

//import Array
import java.util.Arrays;

public class MatrixSorter {

    public static void main(String arg[]) {
        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is " +
            findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }

    public static int[][][] buildMat3d() {

        int[][][] array = new int[3][][];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new int[i + j + 1];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = (int)(Math.random() * 100);
                }
            }
        }
    }

    public static void show(int[][][] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("---------------------------Slab " + (i + 1));
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println(array[i][j][k]);
                }
                System.out.println();
            }
        }
    }

    public static void findMin(int[][][] array) {
        int min = array[0][0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k] < min)
                        min = array[i][j][k];
                }
            }
        }
    }

    public static void sort(int[][] array) {
        //selection sort
        
        int i, j, min, temp;
        int n = array.length;
        for (i = 0; i < n - 1; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (array[j] < array[min])
                    min = j;
                if (min != i) {
                    temp = array[i];
                    array[i] = array[minIndex];
                    array[min] = temp;
                }
            }
        }
        //insertion sort
        if (array.length >= 2) {
            for (int i = 1; i <= array.length - 1; i++) {
                int[] hold = array[i];
                int[] holdP = array[i - 1];

                int j = i;

                while (j > 0 && hold[0] < holdP[0]) {
                    hold = array[j];
                    holdP = array[j - 1];

                    array[j] = holdP;
                    array[j - 1] = hold;
                    j--;
                }
            }
        }
    }
} //end of class
