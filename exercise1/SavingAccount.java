package oop.exercise1;

class SavingAccount extends Account {
    private double interestRate;

    // Constructor for SavingAccount, calling the superclass constructor
    public SavingAccount(String name, String id, double balance, double interestRate) {
        super(name, id, balance);
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }

    // Override the getBalance method to include interest rate
    @Override
    public double getBalance() {
        return super.getBalance() * (1 + interestRate);
    }

    public static void main(String[] args) {
        //Can access both Account and SavingAccount methods,
        // including subclass-specific methods like getInterestRate()
        SavingAccount b = new SavingAccount("John", "S12", 1000.0, 0.5);
        Account a = new Account("John Doe", "A123", 1000.0);

        // a superclass reference is used to hold an instance of a subclass// polymorphism
        //Can only access methods defined in Account.
        // SavingAccount-specific methods (e.g., getInterestRate()) are not accessible directly
        Account  m = new SavingAccount("jessica","32A",32,0.3);
        // Display initial balance including interest
        System.out.println("Name: " + b.getName());
        System.out.println("ID: " + b.getId());
        System.out.printf("Balance with Interest: $%.2f\n", b.getBalance());
        //another methods
        System.out.printf("Other methods: %.2f\n", a.getBalance() * (1 + b.getInterestRate()));
        // change ln by f and + by ,

        // Update interest rate and show updated balance
        b.setInterestRate(0.07);
        System.out.printf("Updated Balance with New Interest Rate: $ %.2f\n", b.getBalance());
        m.getBalance();
        System.out.printf(" update balance: %.2f\n", m.getBalance());
    }
}