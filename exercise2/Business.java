package oop.exercise2;

public class Business extends Passenger{

    private int companySize;

    public Business(double ticketPrice, String memberId, int companySize) {
       super(ticketPrice,memberId);
        this.companySize = companySize;
    }
    @Override
    public double computePrice() {
        return super.computePrice() / this.companySize * 1000;
    }
}
