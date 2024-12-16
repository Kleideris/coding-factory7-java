package gr.aueb.cf.challenges.tasks8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * printMenu and getChoice methods error handling
 */
public class PrintMenuAndGetChoiceMethods {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        while (true) {
            try {
                printMenu();
                choice = getChoice();
                if (choice == 5) break;
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Choice. Please try again.\n");
            }
        }
        System.out.println("You chose: 5  Now exiting...");
    }

    public static void printMenu() {
        System.out.println("Choose one of the following");
        System.out.println("1 - 1st Choice");
        System.out.println("2 - 2ηd Choice");
        System.out.println("3 - 3rd Choice");
        System.out.println("4 - 4th Choice");
        System.out.println("5 - Exit");
    }

    public static int getChoice() throws IllegalArgumentException {
        int choice;

        while (!in.hasNextInt()) {
            System.out.println("Please insert an integer between 1-5");
            in.nextLine();
        }
        choice = in.nextInt();
        in.nextLine();


        if (!choiceIsValid(choice)) {
            throw new IllegalArgumentException("Error. Choice: " + choice + "\nChoice must be between 1-5\n");
        }

        return choice;
    }

    public static boolean choiceIsValid(int choice) {
        return (choice >= 1 && choice <= 5);
    }

    public static void printChoice(int choice) {
        System.out.println("You chose option: " + choice + "\n");
    }
}
