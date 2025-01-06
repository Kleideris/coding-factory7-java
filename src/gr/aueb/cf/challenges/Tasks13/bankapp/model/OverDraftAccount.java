package gr.aueb.cf.challenges.Tasks13.bankapp.model;

/**
 * An account app that allows the  withdrawal of amounts that are more than the account balance,
 * effectively overdrafting the account.
 */
public class OverDraftAccount {
    double balance;
    double overdraft;
    double overdraftLimit;

    // Overloaded Constructor.
    public OverDraftAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraft = overdraft;
        this.overdraftLimit = overdraftLimit;
    }

    // Getters and Setters.
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully deposited " + amount + " to your account.");
    }

    /**
     * withdraws money from account balance. if the withdrawn amount exceeds the balance,
     * you can still withdraw up to an overdraft limit.
     */
    public void withdraw(double amount) throws Exception {
        try {

            if (amount > balance + overdraftLimit) {
                throw new Exception("Error! The amount exceeds the overdraft limit.");
            }

            if (amount > balance) {
                overdraft = (amount <= balance) ? 0 : (amount - balance);
                System.out.println("Successully withdrew " + amount + " and updated you account overdraft to " + overdraft);

                balance -= amount;
                return;
            }
            balance -= amount;
            System.out.println("Successully withdrew " + amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
