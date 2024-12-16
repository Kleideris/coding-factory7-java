package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Να λαμβάνει ως input απο το χρήστη ενα
 * διψήφιο ακέραιο και να υπολογίζει και να
 * εκτυπώνει το άθροισμα των ψηφίων του.
 * (πχ 15 -> 1 + 5 = 6)
 */
public class DigitsSum {

    public static void main(String[] args) {

        int inputNumber;
        int leftDigit = 0;
        int rightDigit = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Insert a two digit integer");
        inputNumber = in.nextInt();

        leftDigit = inputNumber / 10; // Με div 10 παίρνουμε το αριστερό ψηφίο.
        rightDigit = inputNumber % 10; // Με mod 10 παίρνουμε το δεξί ψηφίο.
        sum = leftDigit + rightDigit;

        System.out.printf("Input num: %d, Left digit: %d, Right digit: %d Sum: %d",
                inputNumber, leftDigit, rightDigit, sum);
    }
}
