package gr.aueb.cf.challenges.tasks3;

import java.util.Scanner;

/**
 * Calculates whether a year is a leap year or not.
 *
 * @author klei
 */
public class LeapYearTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputYear = 0;
        boolean isLeapYear = false;

        System.out.println("Please insert the year");
        inputYear = in.nextInt();

        isLeapYear = (inputYear % 4 == 0) && (inputYear % 100 != 0) || (inputYear % 400 == 0);

        if (isLeapYear) {
            System.out.printf("The year: %d IS a Leap Year", inputYear);
        } else {
            System.out.printf("The year: %d is NOT a leap year", inputYear);
        }
    }
}
