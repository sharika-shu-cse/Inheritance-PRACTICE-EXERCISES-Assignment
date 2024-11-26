public class MainBankAccount {
        public static void main(String[] args) {
            // Create an instance of BasicAccount with an initial balance
            BasicAccount account = new BasicAccount(500);

            // Display the initial balance
            System.out.println("Initial Balance: " + account.getBalance());

            // Try to withdraw an amount less than the balance
            account.withdraw(200);
            System.out.println("Balance after withdrawal: " + account.getBalance());

            // Try to withdraw an amount greater than the balance
            account.withdraw(400);
            System.out.println("Balance after withdrawal attempt: " + account.getBalance());
        }
    }


