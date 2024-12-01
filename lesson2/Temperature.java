package oop.lesson2;
// Its automatic invocation, lack of return value, and
// exclusive purpose make it distinct from regular methods
import java.util.Scanner;

public class Temperature {
    private double fahrenheit;
    private double celsius;

    // Constructor
    public Temperature() {
        // Initialize temperatures to 0
        this.fahrenheit = 0;
        this.celsius = 0;
    }

    // Mutator method to set Fahrenheit and calculate Celsius
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    // Mutator method to set Celsius and calculate Fahrenheit
    public void setCelsius(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = (celsius * 9 / 5) + 32;
    }

    // Accessor method to get Fahrenheit
    public double getFahrenheit() {
        return this.fahrenheit;
    }
//parameters are part of method declaration and the value we pass (arguments)
    // Accessor method to get Celsius
    public double getCelsius() {
        return this.celsius;
    }
    public static void main(String[] args) {
        // Create an instance of the Temperature class
        Temperature temp = new Temperature();

        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the Fahrenheit temperature
        System.out.print("Enter the temperature in degrees Fahrenheit: ");
        double fInput = sc.nextDouble();//reader

        // Set the temperature in Fahrenheit
        temp.setFahrenheit(fInput);

        // Output the equivalent temperature in Celsius
        System.out.printf("The equivalent temperature in Celsius is: " +temp.getCelsius());

    }
}
