package oop.exercise1;

public class Fraction {
    int numerator;
    int denominator;
    double operation;

    //creates 0/1
    public Fraction(){
    this(0,1);
    }
    //creates number/1
    public Fraction(int number){
    this(number, 1);
    }
    public Fraction(int num, int denom) {
    }
    public int getNumerator() {
        return numerator; // returns the numerator as a primitive double

    }
    public Fraction creatNumber(int numerator, int denominator) {
            Fraction newNumber= new Fraction(numerator, denominator);
            return newNumber;  // Returns the reference (address) of the newNumber object
    }
    //purpose of this keyword
    public Fraction(double operation) {
        this.operation = operation;  // `this.operation` refers to the instance variable,
        // while `operation` on the right is the parameter.
    }
    //purpose of this keyword
    public Fraction getCurrentNumber() {
        return this;  // Returns the current Number object
    }
    //purpose of this keyword
    public Fraction(int numerator, double operation) {
        this(0.0);  // Calls another constructor in the same class with `this`
    }
}
