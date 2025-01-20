package gr.aueb.cf.challenges.tasks13.bankapp;

import gr.aueb.cf.challenges.tasks13.bankapp.model.JointAccount;
import gr.aueb.cf.challenges.tasks13.bankapp.model.OverDraftAccount;

public class Main {

    public static void main(String[] args) {
        int amount1 = 100; int amount2 = 300; int amount3 = 1000; int amount4 = 1600;

        // Creating an Overdraft Account.
        OverDraftAccount overDraftAccount = new OverDraftAccount(500, 1000);

        // Getting accounts details.
        System.out.println("Overdraft Account Balance: " + overDraftAccount.getBalance() +"\n");


        // Deposited amount to the account.
        overDraftAccount.deposit(amount1);
        System.out.println("New overdraft-account balance: " + overDraftAccount.getBalance() +"\n");

        // Withdrew amount from the account.
        try {
            overDraftAccount.withdraw(amount2);
            System.out.println("New overDraft-account balance: " + overDraftAccount.getBalance() +"\n");


            overDraftAccount.withdraw(amount3);
            System.out.println("New overDraft-account balance: " + overDraftAccount.getOverdraft() +"\n");

            // Withdrawing more than the accounts balance
            overDraftAccount.withdraw(amount4);
        } catch (Exception e) {
            System.out.println("Your withdraw could not be executed.");
        }
        System.out.println();


        // Creating a Joint Account.
        JointAccount jointAccount = new JointAccount("Customer1", "Customer2", 500);

        // Getting accounts details.
        System.out.println("Joint Account Balance: " + jointAccount.getBalance());
        System.out.println("Joint Account holders:  holder1: " + jointAccount.getHolder1() +
                ", holder2: " + jointAccount.getHolder2() +"\n");

        // Deposited amount to the account.
        jointAccount.deposit(amount1);
        System.out.println("New joint-account balance: " + jointAccount.getBalance() +"\n");

        // Withdrew amount from the account.
        try {
            jointAccount.withdraw(amount2);
            System.out.println("Successfully withdrew " + amount2 + " from the joint-account");

            System.out.println("New joint-account balance: " + jointAccount.getBalance() +"\n");

            // Withdrawing more than the accounts balance
            jointAccount.withdraw(amount3);
        } catch (Exception e) {
            System.out.println("Your withdraw could not be executed.");
        }

    }



}
