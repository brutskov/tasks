package org.example.testproject.task1;

public class MainClass3 {

    /**
     * What will be written in the console?
     */
    public static void main(String[] args) {
        String dayOfWeek = getDayOdWeek();

        switch (dayOfWeek) {
            case "monday":
                System.out.println("lion");
            case "tuesday":
                System.out.println("cat");
            case "wednesday":
                System.out.println("bird");
            case "thursday":
                System.out.println("fish");
            case "friday":
                System.out.println("human");
            case "saturday":
                System.out.println("girl");
            case "sunday":
                System.out.println("boy");
        }

        int counter = generateCounter(0);

        if ("monday".equals(dayOfWeek)) {
            if (counter == 0) {
                System.out.println("lion");
            } else if ("monday".equals(dayOfWeek)) {
                System.out.println("human");
            } else if (counter != 1 && counter < 12) {
                System.out.println("fish");
            } else {
                System.out.println("girl");
            }
        }
    }

    private static String getDayOdWeek() {
        return "monday";
    }

    private static int generateCounter(int initialValue) {
        int counter = initialValue;
        counter++;
        counter++;
        counter--;
        return counter == 0 ? 12 : counter;
    }
}
