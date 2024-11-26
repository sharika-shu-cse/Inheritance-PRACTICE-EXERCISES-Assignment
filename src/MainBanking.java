public class MainBanking {
        public static void main(String[] args) {
            // Create an instance of CheckingAccount with an initial balance
            CheckingAccount account = new CheckingAccount(100);

            // Display the initial balance
            System.out.println("Initial Balance: " + account.getBalance());

            // Try to withdraw an amount less than the balance
            account.withdraw(50);  // Successful withdrawal
            System.out.println("Balance after withdrawal: " + account.getBalance());

            // Try to withdraw an amount greater than the balance (first overdraft, $20 penalty)
            account.withdraw(200);  // First overdraft
            System.out.println("Balance after first overdraft: " + account.getBalance());

            // Try to withdraw an amount again, this time incurring a subsequent overdraft ($30 penalty)
            account.withdraw(150);  // Second overdraft
            System.out.println("Balance after second overdraft: " + account.getBalance());

            // Reset the overdraft count at the end of the month
            account.endOfMonth();
            System.out.println("\n--- End of Month ---");
            System.out.println("Balance at the end of the month: " + account.getBalance());

            // Try to withdraw after the month reset (first overdraft of the new month)
            account.withdraw(50);  // First overdraft of the new month
            System.out.println("Balance after new month's first overdraft: " + account.getBalance());
        }
    }

