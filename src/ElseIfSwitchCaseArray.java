public class ElseIfSwitchCaseArray {

    private static int[] arrayCreation() {
        int size = 50;
        int min = 0;
        int max = 10;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = RandomCreation.rnd(min, max);
        }
        return array;
    }

    //Задание 6.b
    public static void switchCaseFunction() {
        int[] array = arrayCreation();
        int[] count = new int[11];
        long startTime = System.nanoTime();

        for (int i = 0; i < array.length; i++) {

            switch (array[i]) {
                case 0:
                    count[0]++;
                    break;
                case 1:
                    count[1]++;
                    break;
                case 2:
                    count[2]++;
                    break;
                case 3:
                    count[3]++;
                    break;
                case 4:
                    count[4]++;
                    break;
                case 5:
                    count[5]++;
                    break;
                case 6:
                    count[6]++;
                    break;
                case 7:
                    count[7]++;
                    break;
                case 8:
                    count[8]++;
                    break;
                case 9:
                    count[9]++;
                    break;
                case 10:
                    count[10]++;
                    break;
            }

        }

        long estimatedTime = System.nanoTime() - startTime;
        for (int i = 0; i < count.length; i++) {
            System.out.println("Number " + i + " appeared in array " + count[i] + " times");
        }
        System.out.println("TIme for switch-case construction : " + estimatedTime + " nanoseconds");
    }

    public static void elseIfFunction() {
        int[] array = arrayCreation();
        int[] count = new int[11];
        long startTime = System.nanoTime();

        for (int i = 0; i < array.length; i++) {

            if(array[i] == 0) count[0]++;
            else if(array[i] == 1) count[1]++;
            else if(array[i] == 2) count[2]++;
            else if(array[i] == 3) count[3]++;
            else if(array[i] == 4) count[4]++;
            else if(array[i] == 5) count[5]++;
            else if(array[i] == 6) count[6]++;
            else if(array[i] == 7) count[7]++;
            else if(array[i] == 8) count[8]++;
            else if(array[i] == 9) count[9]++;
            else if(array[i] == 10) count[10]++;
        }

        long estimatedTime = System.nanoTime() - startTime;
        for (int i = 0; i < count.length; i++) {
            System.out.println("Number " + i + " appeared in array " + count[i] + " times");
        }
        System.out.println("TIme for else-if construction : " + estimatedTime + " nanoseconds");

    }

}
