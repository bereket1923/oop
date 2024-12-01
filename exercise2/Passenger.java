package oop.exercise2;

public abstract class Passenger {
    private double ticketPrice;
    private String memberId;

    public Passenger(double ticketPrice, String memberId) {
        this.ticketPrice = ticketPrice;
        this.memberId = memberId;
    }
    public double computePrice() {
        return ticketPrice;
    }
}
 class Driver {

    public static void main(String[] args) {

        Passenger[] obj = {new First(10000, "001"),
                new Economy(10000, "002", 0.9),
                new Business(10000, "003", 2000)};
        double sum = 0;
        for (Passenger mm : obj) {
            System.out.println(mm.computePrice());
            sum += mm.computePrice();
        }
        System.out.println(sum);
    }

}

