import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MultiDimesionalArrays {

    //Задание 5.а
    public static void taskA() {
        int rows = 8;
        int columns = 8;

        int min = 1;
        int max = 99;

        int sum1 = 0;
        int sum2 = 0;
        long mult1 = 1;
        long mult2 = 1;
        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = RandomCreation.rnd(min, max);
                if (i == j) {
                    sum1 += array[i][j];
                    mult1 *= array[i][j];
                }
                if (i == columns - j + 1) {
                    sum2 += array[i][j];
                    mult2 *= array[i][j];
                }
            }
        }
            System.out.println("Sum of elements of main diagonal = " + sum1);
            System.out.println("Multiplication of elements of main diagonal = " + mult1);
            System.out.println("Sum of elements of side diagonal = " + sum2);
            System.out.println("Multiplication of elements of side diagonal = " + mult2);
    }

    //Задание 5.b
    public static void taskB() {
        int rows = 8;
        int columns = 5;

        int min = -99;
        int max = 99;
        int maxValue = -100;
        int indexOfMaxValueI = 0;
        int indexOfMaxValueJ = 0;
        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = RandomCreation.rnd(min, max);
                if(maxValue < array[i][j]) {
                    maxValue = array[i][j];
                    indexOfMaxValueI = i;
                    indexOfMaxValueJ = j;
                }
                System.out.printf("%3d ",array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Max value = " + maxValue + ". It`s indexes : i = " + indexOfMaxValueI + ", j = " + indexOfMaxValueJ);
    }

    //Задание  4.с
    public static void taskC() {
        int rows = 8;
        int columns = 5;

        int min = -10;
        int max = 10;

        int mult = 1;
        int maxValueOfRows;
        int indexOfMaxRow;
        int[][] array = new int[rows][columns];
        int[] maximums = new int[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = RandomCreation.rnd(min, max);
                mult = mult * array[i][j];
                System.out.printf("%3d ",array[i][j]);
            }
            maximums[i] = Math.abs(mult);
            mult = 1;
            System.out.println();
        }
        maxValueOfRows = maximums[0];
        indexOfMaxRow = 0;
        for(int i = 1; i < rows; i++) {
            if(maxValueOfRows < maximums[i]) {
                indexOfMaxRow = i;
            }
        }
        System.out.println("Index of max row = " + indexOfMaxRow);
    }

    //Задание 4.d
    public static void taskD() {
        int rows = 10;
        int columns = 7;

        int min = 0;
        int max = 100;
        Integer[][] array = new Integer[rows][columns];

        System.out.println("Unsorted array :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = RandomCreation.rnd(min, max);
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            Arrays.sort(array[i], Collections.reverseOrder());
        }

        System.out.println("Sorted array in descending order :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }

    }

}
