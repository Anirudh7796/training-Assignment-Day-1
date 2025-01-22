package com.wiprotraining;

public class bankaccount {
    // Instance variables
    private int balance;

    // Constructor to initialize the balance
    public bankaccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount; // Assignment with side effect: updating balance
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Assignment with side effect: updating balance
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to check the current balance
    public void checkBalance() {
        // Assignment with side effect: performing a calculation
        int balanceCheck = balance;
        System.out.println("Current balance: " + balanceCheck);
    }

    // Main method to test the bankaccount class
    public static void main(String[] args) {
        // Create a new bankaccount object with initial balance of 1000
        bankaccount account = new bankaccount(1000);

        // Check balance
        account.checkBalance();

        // Deposit money with a side effect of changing the balance
        account.deposit(500);

        // Withdraw money with a side effect of changing the balance
        account.withdraw(300);

        // Check balance again after transactions
        account.checkBalance();
        
        // Attempt an invalid withdrawal
        account.withdraw(1500);
    }
}
