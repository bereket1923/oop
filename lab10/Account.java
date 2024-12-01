package oop.lab10;

public class Account {
    private static final double MIN_START_BAL = 20;
    private double balance;

    public void setStartBalance(double b) {
        if (b < MIN_START_BAL) {
            throw new IllegalArgumentException("amount must be above 20");
        } else {
            balance = b;
        }
    }


    public static void main(String[] args) {
            Account t = new Account();
            try {
                t.setStartBalance(10);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
