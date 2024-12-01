package oop.exercise1;

/*A global variable is a variable that is accessible throughout
 an entire program, across all functions
No Redeclaration in Methods: Each method directly accesses and modifies this global variable
 */
public class Counter {
    // Static variable acting as a global counter
    private static int counter = 0;//Single Declaration//no need of redeclared in another class

    // Method to increment and print the counter
    public void incrementCounter() {//global variable "counter" on each method is a calling
        counter++;  // Accessing and modifying the static variable directly
        System.out.println("Counter after increment: " + counter);
    }

    // Method to reset the counter to zero
    public void resetCounter() {
        counter = 0;  // Accessing and modifying the static variable directly
        System.out.println("Counter has been reset to: " + counter);
    }

    // Method to display the current counter value
    public void displayCounter() {
        System.out.println("current" +counter);  // Accessing the static variable directly
    }
    public static void main(String[]args){
        Counter c = new Counter();
        c.incrementCounter();


    }
}
