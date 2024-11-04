import java.util.*;

public class Atm {
    private static double balance = 1000.0;
    private static final int PIN = 1234;
    private static ArrayList<String> transactions = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****Welcome to the ATM!*****");
        
        System.out.print("Please enter your Pin: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin != PIN) {
            System.out.println("Incorrect Pin Exiting...");
            return;
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nEnter the option please:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Withdraw Cash");
            System.out.println("4. Transaction History");
            System.out.println("5. Transfer Funds");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositcash(scanner);
                    break;
                case 3:
                    withdrawcash(scanner);
                    break;
                case 4:
                    transactionHistory();
                    break;
                case 5:
                    transferFunds(scanner);
                    break;
                case 6:
                    exit = true;
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid option please try again");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    private static void depositcash(Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful your new balance is: $" + balance);
            transactions.add("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount please enter a correct value.");
        }
    }

    private static void withdrawcash(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful your new balance is: $" + balance);
            transactions.add("Withdraw: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private static void transferFunds(Scanner scanner) {
        System.out.print("Enter account number to transfer to: ");
        String accountNumber = scanner.next();

        System.out.print("Enter the amount to transfer: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Transfer successful your new balance is: $" + balance);
            transactions.add("Transferred: $" + amount + " to account " + accountNumber);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount please enter a positive value.");
        }
    }

    private static void transactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            System.out.println("Transaction history:");
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}
