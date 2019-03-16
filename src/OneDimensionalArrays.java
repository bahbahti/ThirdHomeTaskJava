import java.util.Arrays;
import java.util.Random;

public class OneDimensionalArrays {

    //массив нечетных чисел. Задание 4.а
    public static void taskA(int size) {
        int min = 1;
        int max = 99;
        int tmp;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            tmp = RandomCreation.rnd(min, max);
            while((tmp % 2) == 0) {
                tmp = RandomCreation.rnd(min, max);
            }
            array[i] = tmp;
        }

        System.out.println("Unsorted array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);

        System.out.println("In ascending order : " );
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("In descending order : ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
    //Задание 4.б
    public static void taskB () {
        int size = 20;
        int even = 0;
        int uneven = 0;
        int[] array = new int[size];
        final Random myRandom = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = myRandom.nextInt(11);
        }

        System.out.println("Unsorted array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            if((array[i]) % 2 == 0) {
                even ++;
            }
            else {
                uneven ++;
            }
        }
        System.out.println("Quantity of even numbers = " + even);
        System.out.println("Quantity of uneven numbers = " + uneven);

    }
    //Задание 4.c
    public static void taskC() {
        int size = 10;
        int[] array = new int[size];
        int min = 1;
        int max = 100;

        System.out.println("Unsorted array : ");
        for (int i = 0; i < size; i++) {
            array[i] = RandomCreation.rnd(min, max);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Now each uneven number = 0  : ");
        for (int i = 0; i < size; i++) {
            if((array[i] % 2) !=0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Задание 4.d
    public static void taskD() {
        int size = 15;
        int[] array = new int[size];
        int min = -50;
        int max = 50;
        int minArrayValue;
        int maxArrayValue;
        int indexOfMinValue;
        int indexOfMaxValue;

        System.out.println("Unsorted array : ");
        for (int i = 0; i < size; i++) {
            array[i] = RandomCreation.rnd(min, max);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        minArrayValue = array[0];
        maxArrayValue = array[0];
        indexOfMaxValue = 0;
        indexOfMinValue = 0;
        for (int i = 1; i < size; i++) {
            if(array[i] >= maxArrayValue) {
                maxArrayValue = array[i];
                indexOfMaxValue = i;
            }
            if(array[i] <= minArrayValue) {
                minArrayValue = array[i];
                indexOfMinValue = i;
            }
        }
        System.out.println("Max array element = " + maxArrayValue + ". It`s index = " + indexOfMaxValue);
        System.out.println("Min array element = " + minArrayValue + ". It`s index = " + indexOfMinValue);
    }

    //Задание 4.e
    public static void taskE() {
        int size = 10;
        int sum1 = 0;
        int sum2 = 0;
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        final Random myRandom = new Random();

        System.out.println("First array :");
        for (int i = 0; i < size; i++) {
            array1[i] = myRandom.nextInt(11);
            sum1 += array1[i];
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Arithmetic mean of first arrays = " + sum1 / size);

        System.out.println("Second array :");
        for (int i = 0; i < size; i++) {
            array2[i] = myRandom.nextInt(11);
            sum2 += array2[i];
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.println("Arithmetic mean of second arrays = " + sum2 / size);

        if (sum1 / size > sum2 / size) {
            System.out.println("Arithmetic mean of first array is bigger");
        }
        else if (sum1 / size < sum2 / size) {
            System.out.println("Arithmetic mean of second array is bigger");
        }
        else {
            System.out.println("Arithmetic means are equal");
        }
    }

    //Задание 4.f
    public static void taskF() {
        int size = 20;
        int min = -1;
        int max = 1;
        int count0 = 0;
        int count1 = 0;
        int countMinus1 = 0;
        int[] array = new int[size];

        System.out.println("Array : ");
        for (int i = 0; i < size; i++) {
                array[i] = RandomCreation.rnd(min, max);
                System.out.print(array[i] + " ");
                if (array[i] == -1) {
                    countMinus1++;
                } else if (array[i] == 1) {
                    count1++;
                } else {
                    count0++;
                }
            }
            System.out.println();

            if (countMinus1 > count0 && countMinus1 > count1) {
                System.out.println("The most common element : " + -1);
            }
            else if (count0 > countMinus1 && count0 > count1) {
                System.out.println("The most common element : " + 0);
            }
            else if (count1 > count0 && count1 > countMinus1) {
                System.out.println("The most common element : " + 1);
            }
            else if (countMinus1 == count0) {
                System.out.println("The most common elements : " + -1 + " and " + 0);
            }
            else if (count0 == count1) {
                System.out.println("The most common elements : " + 0 + " and " + 1);
            }
            else if (countMinus1 == count0) {
                System.out.println("The most common elements : " + -1 + " and " + 0);
            }
            else if (countMinus1 == count1) {
                System.out.println("The most common elements : " + -1 + " and " + 1);
            }
            else {
                System.out.println("The most common elements : " + -1 + " and " + 0 + " and " + 1);

            }
        }
    }
