package oop.lesson3;

public class Fraction {

    private int numerator;
    private int denominator;

    // Constructor to initialize Fraction with numerator and denominator
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Addition method
    public Fraction add(Fraction frac) {
        int a = this.numerator;
        int b = this.denominator;
        int c = frac.numerator;
        int d = frac.denominator;
        return new Fraction((a * d) + (b * c), b * d);//return object
    }


    private Fraction simplify(int gcd) {
        return new Fraction(numerator /  gcd, denominator / gcd);
        // to calculate simplify, find gcd through gcd methods
    }
    private int gcd(int numerator, int denominator) {
        // Ensure denominator is not zero to avoid division by zero error
        if (denominator == 0) {
            return Math.abs(numerator); // GCD is the absolute value of numerator
        }
        // Recursive call with modulus operation
        return gcd(denominator, numerator % denominator);
    }
    //concatenation
    public String toString(){
        return String.valueOf(this.numerator)+String.valueOf(this.denominator);

    }
    // Multiplication method
    public Fraction multiplication(Fraction f) {
        int a = this.numerator;
        int b = this.denominator;
        int c = f.numerator;
        int d = f.denominator;
        return new Fraction(a * c, b * d);
    }
    public boolean equals(Object frac) {//frac variable name like name, age, salary
        if (frac == null)
            return false;
        if (!(frac instanceof Fraction))
            return false;
        Fraction other = (Fraction) frac;//casting is converting one data type into another data type

        double a = (double) this.numerator / this.denominator;
        double b = (double) other.numerator / other.denominator;
        return a == b;

    }
    // Main method to test the class
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);//f1 assign to this
        Fraction f2 = new Fraction(3, 6);//f2 assign to frac

//      When we call f1.add(f2);, we’re performing an operation on f1 with f2 as an input(argument)
//       so that f1 is current object and the reverse is true
//        Fraction sum = f1.add(f2);//Fraction f3 =f1.add(f2) or Fraction f3 = f2.add(f1)
//        //the only difference is this(first one) and frac argument(second one)
        Fraction product = f1.multiplication(f2);
        Fraction sum = f1.add(f2);

        System.out.println(sum.numerator);
        System.out.println(sum.denominator);

        System.out.println(product.numerator);
        System.out.println(product.denominator);
        System.out.println(f1);//12

    }
}