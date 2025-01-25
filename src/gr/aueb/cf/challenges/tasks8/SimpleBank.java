package gr.aueb.cf.challenges.tasks8;

import java.security.spec.ECField;
import java.util.Scanner;

public class SimpleBank {
    static double balance = 500;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Simple Bank Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        deposit(50);
                    } catch (Exception e) {
                        System.out.println("The deposit could not be performed.");
                    }
                    break;
                case 2:
                    try {
                        withdraw(100);
                    } catch (Exception e) {
                        System.out.println("Unsuccessful withdraw.");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: $" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using Simple Bank. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    public static void deposit(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive.");
            }
            balance += amount;
            System.out.println("Successfully deposited: " + amount);        //log
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());          //log
            throw e;
        }

    }

    public static void withdraw(double amount) throws Exception{
        try {
            if (amount < 0) {
                throw new Exception("amount cant be negative");
            }
            if (amount > balance) {
                throw new IllegalArgumentException("Amount cant be more than balance");
            }
            balance -= amount;
            System.out.println("Successfully withdrew:  " + amount + "\n");
        } catch (Exception e) {
            System.err.println("Error " + e.getMessage());
            throw e;
        }
    }
}