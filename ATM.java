package CodSoft_Task3;
import java.util.*;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                account.checkBalance();
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                account.deposit(scanner.nextDouble());
            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                account.withdraw(scanner.nextDouble());
            } else if (choice == 4) {
                System.out.println("Thank you for using our ATM.");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
}
}