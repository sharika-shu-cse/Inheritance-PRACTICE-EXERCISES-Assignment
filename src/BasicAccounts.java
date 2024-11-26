// BasicAccount class (Subclass of BankAccount)
public class BasicAccounts extends BankAccounts {

    // Constructor for BasicAccount
    public BasicAccounts(double initialBalance) {
        super(initialBalance);  // Call the superclass constructor to set the initial balance
    }

    // Override the withdraw method to charge a penalty for overdraft
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);  // Call the superclass withdraw method if sufficient funds are available
            System.out.println("Withdrawal of " + amount + " was successful.");
        } else {
            // If overdraft occurs, charge a penalty of $30 and prevent the withdrawal
            double overdraftAmount = amount - getBalance();
            System.out.println("Insufficient funds. An overdraft of " + overdraftAmount + " occurred.");
            super.withdraw(getBalance());  // Withdraw the entire balance to cover the overdraft
            System.out.println("Penalty of $30 has been charged for the overdraft.");
            super.withdraw(30);  // Deduct the penalty from the balance
            System.out.println("Balance after penalty: " + getBalance());
        }
    }
}
