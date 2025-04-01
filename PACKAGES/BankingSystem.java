
package com.bankingsystem.account;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}


package com.bankingsystem.transaction;

import com.bankingsystem.account.Account;

public class TransactionProcessor {
    public void processTransaction(Account sourceAccount, Account targetAccount, double amount) {
        sourceAccount.withdraw(amount);
        targetAccount.deposit(amount);
    }
}


package com.bankingsystem.reporting;

import com.bankingsystem.account.Account;
import java.util.List;

public class AccountReport {
    public void generateReport(List<Account> accounts) {
        System.out.println("Account Report:");
        for (Account account : accounts) {
            System.out.println("Account: " + account.getAccountNumber() + ", Balance: $" + account.getBalance());
        }
    }
}


package com.bankingsystem.main;

import com.bankingsystem.account.Account;
import com.bankingsystem.transaction.TransactionProcessor;
import com.bankingsystem.reporting.AccountReport;
import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        Account account1 = new Account("A001", 1000);
        Account account2 = new Account("A002", 500);

        TransactionProcessor processor = new TransactionProcessor();
        processor.processTransaction(account1, account2, 200);

        List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);

        AccountReport report = new AccountReport();
        report.generateReport(accounts);
    }
}
