package oop.lesson3;

/** Find the greatest common divisor (GCD) between two numbers, 12 and 15 */
public class Common {
    int m = 12;
    int n = 15;

    public int gcd(int m, int n) {
        int min = Math.min(m, n); // Find the smaller number
        int gcd = 1;

        for (int i = min; i >= 1; i--) { // Start from the minimum number, count downwards
            if (m % i == 0 && n % i == 0) {
                gcd = i; // Assign i as gcd as soon as it's found
                break; // No need to continue as we found the largest gcd
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Common num = new Common();
        System.out.println(num.gcd(12, 15)); // Output should be 3
    }
}