package gr.aueb.cf.challenges.tasks3;

import java.util.Scanner;

/**
 * Displays a menu with 5 choices and gives feedback
 * for every choice selected.
 */
public class MenuTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα απο τα παρακάτω:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            choice =in.nextInt();

            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή\n");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή\n");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση\n");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση\n");
            } else if (choice == 5) {
                System.out.println("Επιλέξατε Έξοδο\n");
                break;
            } else {
                System.out.println("Η επιλογή σας δεν ήταν έγκυρη!\n");
            }
        } while (choice != 5);
    }
}
