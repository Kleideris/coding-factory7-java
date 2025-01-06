package gr.aueb.cf.challenges.Tasks13.bankapp.model;

/**
 * An account class that allows the creation of a joint account that is owned by 2 customers.
 */
public class JointAccount {
    String holder1;
    String holder2;
    double balance;

    //Overloaded Constructor.
    public JointAccount(String holder1, String holder2, double balance) {
        this.holder1 = holder1;
        this.holder2 = holder2;
        this.balance = balance;
    }

    //Getters and Setters
    public String getHolder1() {
        return holder1;
    }

    public void setHolder1(String holder1) {
        this.holder1 = holder1;
    }

    public String getHolder2() {
        return holder2;
    }

    public void setHolder2(String holder2) {
        this.holder2 = holder2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * deposits an amount to the account's balance.
     * @param amount the deposited amount.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws an amount from the account's balance.
     * @param amount the withdrawing amount.
     * @throws Exception when amount is greater than the balance.
     */
    public void withdraw(double amount) throws Exception {
        try {
            if (amount > balance) {
                throw new Exception("Error! Insufficient balance.");
            }
            balance -= amount;
        } catch (Exception e) {

            //logging the event

            System.out.println(e.getMessage());
            throw  e;
        }
    }
}
