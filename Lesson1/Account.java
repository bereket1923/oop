package oop.Lesson1;

public class Account {
    public String ownerName;
    private String accountNumber;
    private int balance;

    // Default constructor
    public Account() {
    }

    // Non-default constructor
    public Account(String ownerName, String accountNumber, int balance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Update balance based on interest percentage
    public void updateBalance(double interestPercentage) {
        double interest = balance * interestPercentage; // Calculate interest
        setBalance(balance + (int) interest); // Update balance by calling method in the same class
        //casting interest to int
    }

    public static void main(String[] args) {
        // Create account instances
        Account account1 = new Account("Bob", "A234", 300);
        Account account2 = new Account("Susan", "B45", 400);

        // Update balance for account1 with 20% interest
        account1.updateBalance(0.9);

        // Print the updated balance
        System.out.println("Updated Balance for " + account1.getOwnerName() + ": $" + account1.getBalance());
    }
}