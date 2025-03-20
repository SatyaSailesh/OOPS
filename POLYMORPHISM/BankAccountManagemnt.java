 class BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    private double balance;

    SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    double getBalance() {
        return balance;
    }
}

class CheckingAccount extends BankAccount {
    private double balance;

    CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    double getBalance() {
        return balance;
    }
}

public class BankManagement {
    public static void main(String[] args) {
        BankAccount[] accounts = { new SavingsAccount(1000), new CheckingAccount(500) };
        for (BankAccount account : accounts) {
            account.deposit(200);
            account.withdraw(100);
            System.out.println("Balance: " + ((SavingsAccount) account).getBalance());
        }
    }
}
