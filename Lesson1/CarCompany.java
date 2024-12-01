package oop.Lesson1;

public class CarCompany {
    public static void main(String[] args) {
        // Create a Car instance
        Car car = new Car("Toyota", "Camry", 2022);

    // Attempting to access the private fields directly (This will cause a compile-time error)
    // System.out.println("Car Make: " + car.make);

        // Correct way to access the fields using getters if instance variable private
        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());
    }
}