// CheckingAccount class (Subclass of BankAccount)
public class CheckingAccount extends BankingAccount {
    private int overdraftCount;  // Counter to track overdrafts in the current month
    private static final double FIRST_OVERDRAFT_PENALTY = 20.0;
    private static final double SUBSEQUENT_OVERDRAFT_PENALTY = 30.0;

    // Constructor for CheckingAccount
    public CheckingAccount(double initialBalance) {
        super(initialBalance);  // Call the superclass constructor to set the initial balance
        this.overdraftCount = 0; // Start the month with no overdrafts
    }

    // Override the withdraw method to apply penalties for overdrafts
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);  // Call the superclass withdraw method if sufficient funds are available
            System.out.println("Withdrawal of " + amount + " was successful.");
        } else {
            // If overdraft occurs, apply the appropriate penalty
            if (overdraftCount == 0) {
                System.out.println("First overdraft of the month. Penalty of $20 applied.");
                super.withdraw(amount);  // Withdraw the requested amount (exceeding the balance)
                super.withdraw(FIRST_OVERDRAFT_PENALTY);  // Apply the $20 penalty
            } else {
                System.out.println("Subsequent overdraft. Penalty of $30 applied.");
                super.withdraw(amount);  // Withdraw the requested amount (exceeding the balance)
                super.withdraw(SUBSEQUENT_OVERDRAFT_PENALTY);  // Apply the $30 penalty
            }
            overdraftCount++;  // Increment the overdraft count for this month
            System.out.println("Balance after overdraft penalty: " + getBalance());
        }
    }

    // Reset the overdraft count at the end of the month (this would typically happen in real-world systems)
    public void endOfMonth() {
        overdraftCount = 0;  // Reset overdraft count for the new month
    }
}
