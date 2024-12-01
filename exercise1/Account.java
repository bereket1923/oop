package oop.exercise1;

public class Account {
    private String name;
    private String id;
    private double balance;

    public Account(String name, String id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        Account a = new Account("John Doe", "A123", 1000.0);

        // Display initial account information
        System.out.println("Name: " + a.getName());
        System.out.println("ID: " + a.getId());
        System.out.println("Balance: $" + a.getBalance());

        // Update account details using setters
        a.setName("Jane Doe");
        a.setId("A124");
        a.setBalance(1500.0);

        // Display updated account information
        System.out.println("Updated Name: " + a.getName());
        System.out.println("Updated ID: " + a.getId());
        System.out.println("Updated Balance: $" + a.getBalance());
    }
}