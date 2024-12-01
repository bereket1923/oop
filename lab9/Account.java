package oop.lab9;

class Account {

    private String ownerName;
    private double balance;

    public Account() {
    }

    // amt cannot be 0 or negative
    public void add(double amt) {
        if (amt <= 0) {
            throw new IllegalArgumentException("Amount must be above zero.");
        }
        balance += amt;  // Add amount to balance
    }

    public void deduct(double amt) {
        if (amt <= 0) {
            throw new IllegalArgumentException("You cannot withdraw a negative or zero amount.");
        } else if (amt > balance) {
            throw new Overdraft("Overdraft error: Amount is greater than the available balance.");
        }
        balance -= amt;  // Withdraw the amount if everything is okay
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    // bal cannot be negative
    public void setBalance(double bal) {
        if (bal < 0) {
            throw new IllegalArgumentException("Balance should be positive.");
        }
        balance = bal;
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.setOwnerName("John Doe");
        a.setBalance(100);
        System.out.println("Owner: " + a.getOwnerName());
        System.out.println("Balance: " + a.getBalance());

        try {//under try, put exceptional methods
            //add test
            a.add(50);//output: 100 + 50 = 150
            System.out.println("Updated Balance: " + a.getBalance());

            // deduct test
            //a.deduct(200);  //  trigger/display an overdraft error
            a.deduct(30);// output: 150-30 = 120
            System.out.println("Balance after withdrawal: " + a.getBalance());// for void method use getter

            //setBalance test
            a.setBalance(-50); // Should trigger an IllegalArgumentException
            a.setBalance(20);//output = 20;
            System.out.println("Updated Balance: " + a.getBalance());

        } catch (Overdraft e) {  // Handle overdraft exception first (specific)
            System.out.println("Overdraft error: " + e.getMessage());
        } catch (IllegalArgumentException e) {  // Then handle general invalid argument exception
            System.out.println("Error: " + e.getMessage());
        } finally {//This block will always execute, regardless of whether an exception was caught or not.
            System.out.println("Thank you for using our banking system.");
        }
    }
}

