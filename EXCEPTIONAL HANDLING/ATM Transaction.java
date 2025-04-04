import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient funds! Available balance: $" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: $" + balance);
    }
}

public class main {
    public static void main(String[] args) {
        ATM atm = new ATM(1000);
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            atm.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid amount.");
        } finally {
            scanner.close();
            System.out.println("Transaction completed.");
        }
    }
}
