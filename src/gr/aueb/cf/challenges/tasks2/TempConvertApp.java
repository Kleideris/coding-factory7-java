package gr.aueb.cf.challenges.tasks2;

import java.util.Scanner;

/**
 * Task 1: Δέχεται μια θερμοκρασία σε °F, την μετατρέπει σε °C
 * και εκτυπώνει το αποτέλεσμα.
 *
 * @author klei
 */
public class TempConvertApp {

    public static void main(String[] args) {
        int tempInCelsius = 0;
        int tempInFahrenhait = 0;

        Scanner f = new Scanner(System.in);



        System.out.println("Δώστε την τιμή της θερμοκρασία σε βαθμούς Fahrenhait");
        tempInFahrenhait = f.nextInt();


        tempInCelsius = 5 * (tempInFahrenhait - 32) / 9;


        System.out.printf("Θερμοκρασία %d°F = %d°C", tempInFahrenhait, tempInCelsius);
    }
}
