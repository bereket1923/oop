package oop.lab9;

public class Fraction {

    private int num;
    private int denom;

    // Constructor: Denominator cannot be 0
    public Fraction(int num, int denom) {
       this.num =num;
       this.denom = denom;
    }
    //IllegalArgumentException: used for invalid input before operation as explicitly agreed.
    //ArithmeticException: appropriate for errors occur during arithmetic operations at runtime.

    // Method to set the denominator with exception handling
    public void setDenominator(int denom) {
        if (denom == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denom = denom;
    }

    // Method to set the numerator
    public void setNumerator(int num) {
        this.num = num;
    }

    // Static method to add two fractions
    public static Fraction add(Fraction f1, Fraction f2) {//int data type has a fixed size (32 bits)
        //so add methods can not handle more than this and ArithmeticException should be handled
        if (f1 == null || f2 == null) {
            throw new NullPointerException("Cannot add null fractions.");
        }

        int a = f1.getNumerator();
        int b = f1.getDenominator();
        int c = f2.getNumerator();
        int d = f2.getDenominator();

        try {
            // Perform the arithmetic directly with overflow checks
            int denominatorProduct = Math.multiplyExact(b, d);
            int numeratorSum = Math.addExact(Math.multiplyExact(a, d), Math.multiplyExact(b, c));

            // Create and return the resulting fraction
            return new Fraction(numeratorSum, denominatorProduct);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Overflow occurred during fraction addition.");
        }
    }
    public int getDenominator() {
        return denom;
    }

    public int getNumerator() {
        return num;
    }

    public static void main(String[] args) {
        try {
            // Create fractions
            Fraction f1 = new Fraction(4, 1);  // Valid fraction
            Fraction f2 = new Fraction(3, 4);  // Valid fraction

            // Attempt to add fractions
            Fraction f3 = Fraction.add(f1, f2);

            // Display result
            System.out.println("Sum: " + f3.getNumerator() + "/" + f3.getDenominator());
            //if either of them is null, calling getNumerator() or
            // getDenominator()  will result in a NullPointerException

        } catch (IllegalArgumentException e) {
            // Handle invalid input such as zero denominator
            System.out.println("Error: " + e.getMessage());

        } catch (NullPointerException e) {
            // Handle null fractions
            System.out.println(("Error:" +e.getMessage()));
        } catch (ArithmeticException e) {
            // Handle overflow during arithmetic operations
            System.out.println("Error:" +e.getMessage());
        }
        // getMessage() provides precise and helpful information helps to take action
    }
}
