import java.util.Arrays;
import java.util.Random;

public class MyArrays {

    private static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    private static void selectionSort(int[] array){
        for (int i = array.length - 1; i > 0; i--) {
            int max = array[i];
            int max_i = i;
            for (int j = 0; j < i; j++) {
                if (array[j] > max) {
                    max = array[j];
                    max_i = j;
                }
            }

            if (i != max_i) {
                int tmp = array[i];
                array[i] = array[max_i];
                array[max_i] = tmp;
            }
        }
    }

    public static void arrayFunction(int n) {
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] array3 = new int[n];
        final Random myRandom = new Random();
        for (int i = 0; i < n; i++) {
            array1[i] = myRandom.nextInt();
            array2[i] = myRandom.nextInt();
            array3[i] = myRandom.nextInt();
        }

        //ESTIMATES for ARRAYS
        long startTime;
        startTime = System.nanoTime();
        Arrays.sort(array1);
        long estimatedTimeForDefaultSort = System.nanoTime() - startTime;
        //double secondsForDefaultSort = (double)estimatedTimeForDefaultSort / 1_000_000_000.0;
        System.out.println("Time for method sort() from Arrays = " + estimatedTimeForDefaultSort + " nanoseconds");

        startTime = System.nanoTime();
        MyArrays.selectionSort(array2);
        long estimatedTimeForSelectionSort = System.nanoTime() - startTime;
        //double secondsForSelectionSort = (double)estimatedTimeForSelectionSort / 1_000_000_000.0;
        System.out.println("Time for method selectionSort = " + estimatedTimeForSelectionSort + " nanoseconds");

        startTime = System.nanoTime();
        MyArrays.bubbleSort(array3);
        long estimatedTimeForBubbleSort = System.nanoTime() - startTime;
        //double secondsForBubbleSort = (double)estimatedTimeForBubbleSort / 1_000_000_000.0;
        System.out.println("Time for method bubbleSort = " + estimatedTimeForBubbleSort + " nanoseconds");
        System.out.println("The fastest method is sort() from Arrays, the slowest is bubble sort");
        System.out.println();
    }
}
