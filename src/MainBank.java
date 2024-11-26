public class MainBank {
        public static void main(String[] args) {
            // Create an instance of BasicAccount with an initial balance
            BasicAccounts account = new BasicAccounts(100);

            // Display the initial balance
            System.out.println("Initial Balance: " + account.getBalance());

            // Try to withdraw an amount less than the balance
            account.withdraw(50);
            System.out.println("Balance after withdrawal: " + account.getBalance());

            // Try to withdraw an amount greater than the balance (resulting in overdraft)
            account.withdraw(200);
            System.out.println("Balance after overdraft attempt: " + account.getBalance());
        }
    }
