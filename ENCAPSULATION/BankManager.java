class Account {
    private String holder;
    private double balance;

    public Account(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }
}

public class BankManager {
    public static void main(String[] args) {
        Account[] accounts = new Account[2];
        accounts[0] = new Account("Satya", 1000.0);
        accounts[1] = new Account("Sai", 500.0);

        for (int i = 0; i < accounts.length; i++) {
            accounts[i].deposit(200.0);
            System.out.println(accounts[i].getHolder() + " balance: $" + accounts[i].getBalance());
            accounts[i].withdraw(100.0);
            System.out.println("After withdrawal " + accounts[i].getHolder() + ": $" + accounts[i].getBalance());
        }
    }
}
