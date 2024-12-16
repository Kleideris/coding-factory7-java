package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπάρχει ενα SECRET που είναι integer και ο
 * χρήστης με μία όνο προσπάθεια θα προσπαθήσει
 * να το βρεί.
 */
public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert a num to guess the secret");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Secret fount!!!");
        } else {    //num != SECRET
            System.out.println("Failure!!");
        }
    }
}
