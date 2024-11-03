import java.util.Scanner;

public class Atm {
    private static double balance = 1000.0;
    private static final int PIN = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********Welcome to the Atm!!!*********");
        System.out.print("Please enter your PIN: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin != PIN) {
            System.out.println("Incorrect PIN. Exiting...");
            return;
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nEnter the option please:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Withdraw Cash");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you ");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful your New balance : $" + balance);
        } else {
            System.out.println("Invalid amount Please enter a correct value.");
        }
    }

    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful your balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount  Please enter a correct value.");
        }
    }
}
