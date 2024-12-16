package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει μια τιμή που συμβολίζει μια θερμοκρασία απο το χρήστη
 * και εμφανίζει κατάλληλο μήνυμα.
 */
public class TempApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTemperatureBelowZero;

        System.out.println("Please insert the current temperature");
        temp = in.nextInt();

        isTemperatureBelowZero = temp < 0;

        System.out.println("Temperature is below zero: " + isTemperatureBelowZero);
    }
}
