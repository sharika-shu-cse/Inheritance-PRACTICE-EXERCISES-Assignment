public class CheckAccountAgain {
    private double balance;            // Account balance
    private int transactionCount;      // Number of transactions in the current month
    private static final int FREE_TRANSACTIONS = 3; // Number of free transactions allowed per month
    private static final double FEE = 1.00; // Transaction fee after free limit is exceeded

    // Constructor to initialize balance and transaction count
    public CheckAccountAgain(double initialBalance) {
        balance = initialBalance;
        transactionCount = 0; // Initially, no transactions
    }

    // Deposit method to add funds to the account
    public void deposit(double amount) {
        balance += amount; // Add the deposit to the balance
        transactionCount++; // Increment transaction count
        applyTransactionFee(); // Check if the fee applies
    }

    // Withdraw method to withdraw funds from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount; // Subtract the withdrawal from the balance
            transactionCount++; // Increment transaction count
            applyTransactionFee(); // Check if the fee applies
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    // Method to apply the transaction fee if more than 3 transactions have occurred
    private void applyTransactionFee() {
        // Apply a $1 fee if the number of transactions exceeds the free limit
        if (transactionCount > FREE_TRANSACTIONS) {
            balance -= FEE; // Deduct the $1 fee from the balance
            System.out.println("Fee of $" + FEE + " applied.");
        }
    }

    // Method to get the account balance
    public double getBalance() {
        return balance;
    }

    // Method to get the number of transactions made (this should be public)
    public int getTransactionCount() {
        return transactionCount;
    }

    // Main method to test the CheckAccountAgain class
    public static void main(String[] args) {
        CheckAccountAgain account = new CheckAccountAgain(100.00); // Create account with an initial balance of $100

        // Perform a few transactions
        account.deposit(50); // Deposit $50
        account.withdraw(20); // Withdraw $20
        account.deposit(30); // Deposit $30
        account.withdraw(10); // Withdraw $10
        account.deposit(25); // Deposit $25 (4th transaction, should incur a fee)

        // Print the balance after the transactions
        System.out.println("Final Balance: $" + account.getBalance()); // Should reflect the fee after 3 transactions
        System.out.println("Total Transactions: " + account.getTransactionCount()); // Should be 5
    }
}
