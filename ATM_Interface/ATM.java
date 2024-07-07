import java.util.Scanner;

public class ATM 
{
    public Account acc;
    public Scanner sc;

    ATM(Account acc)
    {
        this.acc = acc;
        this.sc = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for Using the ATM.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    private int getUserChoice() {
        System.out.print("Enter your choice: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter your choice (1-4): ");
            sc.next();
        }
        return sc.nextInt();
    }

    private void checkBalance() {
        System.out.println("Current Balance: ₹"+ acc.showBalance());
    }

    private void deposit() {
        System.out.print("Enter deposit amount: ₹");
        double amount = sc.nextDouble();
        acc.deposit(amount);
    }

    private void withdraw() {
        System.out.print("Enter withdrawal amount: ₹");
        double amount = sc.nextDouble();
        boolean success = acc.withdraw(amount);
        if (success) {
            System.out.println("Please take your cash.");
        }
    }

    public static void main(String[] args) {
        Account userAccount = new Account(1000.0); // Example initial balance
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
