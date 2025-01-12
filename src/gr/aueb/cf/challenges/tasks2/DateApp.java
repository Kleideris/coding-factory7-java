package gr.aueb.cf.challenges.tasks2;

import java.util.Scanner;

/**
 * Task 2: Διαβάζει 3 ακέραιους αριθμούς που αναπαριστούν Ημερομηνία
 * και τους μετατρέπει σε μορφή ημερομηνίας
 *
 * @author klei
 */
public class DateApp {

    public static void main(String[] args) {
        int day = 0;
        int month = 0;
        int year = 0;

        Scanner sc = new Scanner(System.in);


        System.out.println("Δώστε τον αριθμό της Ημέρας");
        day = sc.nextInt();

        System.out.println("Δώστε τον αριθμό του Μήνα");
        month = sc.nextInt();

        System.out.println("Δώστε τον αριθμό του Έτους");
        year = sc.nextInt();


        System.out.printf("Η ημερομηνία είναι: %02d/%02d/%d", day, month, year);
    }
}
