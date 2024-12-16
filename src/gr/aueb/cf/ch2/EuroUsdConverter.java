package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Δέχεται μια τιμή σε ευρώ και την μετατρέπει σε cents και δολάρια
 *
 * @author klei
 */
public class EuroUsdConverter {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int euroValue = 0;
        int centValue = 0;
        int dollarValue = 0;
        final int CONVERSION_RATE = 99;
        Scanner in = new Scanner(System.in);

        //Εντολές
        System.out.println("Please insert price in Euro");
        euroValue = in.nextInt();

        centValue = euroValue * CONVERSION_RATE;
        dollarValue = centValue / 100;
        centValue %= 100;

        //Αποτελέσματα
        System.out.printf("%d\u20AC = \u0024%d and %d cents", euroValue, dollarValue, centValue);
    }
}
