public class Factorial {

    private static int factorialRecursion(int n) {
        if(n < 0) {
            System.out.println("Wrong number");
            return -1;
        }
        else if(n == 0 || n == 1) {
            return n;
        }
        else {
            return n * factorialRecursion(n - 1);
        }
    }

    private static int factorialLoop(int n) {
        int sum = 1;
        if(n < 0) {
            System.out.println("Wrong number");
            return -1;
        }
        else if(n == 0 && n ==1) {
            return 1;
        }
        else {
            for(int i = 2; i <= n; i++) {
                sum = sum * i;
                }
                return sum;
        }
    }

    public static void factorialFunction(int n) {
        //ESTIMATES for FACTORIALS
        long startTime;
        startTime = System.nanoTime();
        Factorial.factorialRecursion(n);
        long estimatedTimeForFactorialRecursion = System.nanoTime() - startTime;
        //double secondsFactorialRecursion = (double)estimatedTimeForFactorialRecursion / 1_000_000_000.0;
        System.out.println("Time for recursion factorial = " + estimatedTimeForFactorialRecursion + " nanoseconds");

        startTime = System.nanoTime();
        Factorial.factorialLoop(n);
        long estimatedTimeForFactorialLoop = System.nanoTime() - startTime;
        //double secondsFactorialLoop = (double)estimatedTimeForFactorialLoop / 1_000_000_000.0;
        System.out.println("Time for loop recursion = " + estimatedTimeForFactorialLoop + " nanoseconds");
        System.out.println("Loop factorial works faster then recursion factorial");
    }
}
