import java.io.*;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("Error: Deposit amount must be positive!");
            return;
        }
        balance += amount;
        logTransaction("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.err.println("Error: Insufficient funds!");
            return;
        }
        balance -= amount;
        logTransaction("Withdrawn: " + amount);
        System.out.println("New Balance: " + balance);
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    private void logTransaction(String transaction) {
        try (FileWriter writer = new FileWriter("document.txt", true)) {
            writer.write(transaction + "\n");
        } catch (IOException e) {
            System.err.println("Error logging transaction.");
        }
    }
}

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(500); 

        System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
        while (true) {
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            if (choice == 4) break;
            
            if (choice == 1) {
                System.out.print("Deposit amount: ");
                account.deposit(scanner.nextDouble());
            } else if (choice == 2) {
                System.out.print("Withdraw amount: ");
                account.withdraw(scanner.nextDouble());
            } else if (choice == 3) {
                account.checkBalance();
            } else {
                System.err.println("Invalid choice! Try again.");
            }
        }
        scanner.close();
        System.out.println("Thank you for using the banking system.");
    }
}
