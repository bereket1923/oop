package oop.exercise2;

public class Economy extends Passenger {

    private double discount;

    public Economy(double ticketPrice, String memberId, double d) {
        super(ticketPrice, memberId);
        this.discount = d;
    }
@Override
    public double computePrice() {
        return super.computePrice() * (1- this.discount);
    }
}