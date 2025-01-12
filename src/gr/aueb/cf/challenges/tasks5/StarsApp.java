package gr.aueb.cf.challenges.tasks5;

import java.util.Scanner;

/**
 * Prints menu with choices on how to print stars and then executes the choice.
 * Is made with the use of functions.
 *
 * @author klei
 */
public class StarsApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            printMenu();
            choice = getChoice();

            if (choice == 6) {
                System.out.println("Τερματισμός προγράμματος...");
                System.exit(0);
            }

            getResultOnChoice(choice);
        } while (true);
    }

    public static void printMenu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 εως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n εως 1");
        System.out.println("6. Έξοδος απο το πρόγραμμα");
        System.out.println("Δώσε επιλογή:");
    }

    public static int getChoice() {
        return scanner.nextInt();
    }

    public static void getResultOnChoice(int choice) {
        int n = getNumberOfStars();

        switch (choice) {
            case 1:
                printHorizontalStars(n);
                break;
            case 2:
                printVerticalStars(n);
                break;
            case 3:
                printNRowsWithNStars(n);
                break;
            case 4:
                printNRowsWith1ToNStars(n);
                break;
            case 5:
                printNRowsWithNto1Stars(n);
                break;
            case 7:
                callAllFunctionsForTesting(n);
                break;
            default:
                System.out.println("Η επιλογή μπορεί να είναι απο 1 - 6");
                break;
        }
    }

    public static int getNumberOfStars() {
        System.out.println("Δώσε τον αριθμό των αστεριών που θές να εκτυπωθούν:");
        return scanner.nextInt();
    }

    public static void printHorizontalStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*  ");
        }
        System.out.println();
    }

    public static void printVerticalStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*  ");
        }
    }

    public static void printNRowsWithNStars(int n) {
        for (int i = 1; i <= n; i++) {
            printHorizontalStars(n);
        }
    }

    public static void printNRowsWith1ToNStars(int n) {
        for (int i =1; i <= n; i++) {
            printHorizontalStars(i);
        }
    }

    public static void printNRowsWithNto1Stars(int n) {
        for (int i = n; i >= 1; i--) {
            printHorizontalStars(i);
        }
    }

    public static void callAllFunctionsForTesting(int n) {
        printHorizontalStars(n);
        System.out.println();

        printVerticalStars(n);
        System.out.println();

        printNRowsWithNStars(n);
        System.out.println();

        printNRowsWith1ToNStars(n);
        System.out.println();

        printNRowsWithNto1Stars(n);
        System.out.println();

        return;
    }
}