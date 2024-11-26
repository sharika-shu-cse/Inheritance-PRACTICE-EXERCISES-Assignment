// BasicAccount class (Subclass of BankAccount)
public class BasicAccount extends BankAccount {

    // Constructor for BasicAccount
    public BasicAccount(double initialBalance) {
        super(initialBalance);  // Call the superclass constructor to set the initial balance
    }

    // Override the withdraw method
    @Override
    public void withdraw(double amount) {
        // Check if withdrawal amount is less than or equal to the balance
        if (amount <= getBalance()) {
            super.withdraw(amount);  // Call the superclass withdraw method to reduce the balance
            System.out.println("Withdrawal of " + amount + " was successful.");
        } else {
            System.out.println("Insufficient funds. Withdrawal denied.");
        }
    }
}
