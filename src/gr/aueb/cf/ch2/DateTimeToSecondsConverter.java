package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Μετατρέπει ημέρες, ώρες, λεπτά δευτερόλεπτα,
 * σε συνολικά δευτερόλεπτα
 */
public class DateTimeToSecondsConverter {

    public static void main(String[] args) {
        final int SEC_PER_MIN = 60;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_DAY = 24 * 3600;

        Scanner in = new Scanner(System.in);
        int inputDays;
        int inputHours;
        int inputMinutes;
        int inputSeconds;
        int totalSeconds = 0;



        System.out.println("Please insert the days, hours, minutes, seconds");
        inputDays = in.nextInt();
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSeconds = inputDays * SEC_PER_DAY + inputHours * SEC_PER_HOUR
                + inputMinutes * SEC_PER_MIN + inputSeconds;

        System.out.printf(Locale.US,"Total seconds = %,d ", totalSeconds);
    }
}
