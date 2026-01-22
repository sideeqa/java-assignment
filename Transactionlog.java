import java.util.Scanner;

public class TransactionLog {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 0;
        String log = "";
        int choice;

         {
            System.out.println("\n=== TRANSACTION MENU ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Transaction Log");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = input.nextDouble();
                balance += amount;
                log += "Deposited: ₦" + amount + "\n";
                System.out.println("Deposit successful.");

            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double amount = input.nextDouble();

                if (amount <= balance) {
                    balance -= amount;
                    log += "Withdrew: ₦" + amount + "\n";
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Insufficient balance!");
                }

            } else if (choice == 3) {
                System.out.println("\n--- TRANSACTION LOG ---");
                if (log.isEmpty()) {
                    System.out.println("No transactions yet.");
                } else {
                    System.out.print(log);
                }
                System.out.println("Current Balance: ₦" + balance);
            }

        } while (choice != 0);

        System.out.println("\nThank you!");
        System.out.println("Final Balance: ₦" + balance);
        input.close();
    }
}

