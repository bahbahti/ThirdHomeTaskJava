public class ElseIfSwitchCaseEnum {
    //Задание 6.a
    public static void switchCaseFunction() {
        WorkDays day = WorkDays.FRIDAY;
        long startTime = System.nanoTime();

        switch (day) {
            case MONDAY:
                System.out.println("It`s monday");
                break;
            case TUESDAY:
                System.out.println("It`s tuesday");
                break;
            case WEDNESDAY:
                System.out.println("It`s wednesday");
                break;
            case THURSDAY:
                System.out.println("It`s thuesday");
                break;
            case FRIDAY:
                System.out.println("It`s friday");
                break;
        }

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("TIme for switch-case construction : " + estimatedTime + " nanoseconds");
    }

    public static void elseIfFunction() {
        WorkDays day = WorkDays.FRIDAY;
        long startTime = System.nanoTime();

        if (day == WorkDays.MONDAY) {
            System.out.println("It`s monday");
        } else if (day == WorkDays.TUESDAY) {
            System.out.println("It`s tuesday");
        } else if (day == WorkDays.WEDNESDAY) {
            System.out.println("It`s wednesday");
        } else if (day == WorkDays.THURSDAY) {
            System.out.println("It`s thursday");
        } else if (day == WorkDays.FRIDAY)
            System.out.println("It`s friday");

    long estimatedTime = System.nanoTime() - startTime;
        System.out.println("TIme for if-else construction : "+estimatedTime +" nanoseconds");
    }
}
