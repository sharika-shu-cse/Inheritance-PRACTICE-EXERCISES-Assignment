// BankAccount class (Superclass)
public class BankAccounts {
    private double balance;

    // Constructor to initialize the balance
    public BankAccounts(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money (this will be overridden by BasicAccount)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}
