public class NestedLoops {

    public static void rectangleDiaz1(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangleDiaz1(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if(i >= j)
                System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void triangleDiaz2(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if(j >= i)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void triangleDiaz3(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i >= (size - j + 1))
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void rectangleDiaz2(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}
