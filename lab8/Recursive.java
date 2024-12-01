package oop.lab8;

public class Recursive {
    public int length(String s) {
        // Base Case: If the string is empty, its length is 0
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Recursive Call: We reduce the string by removing the first character
        return 1 + length(s.substring(1));
        // 1 for the first character + length of the rest of the string
    }

    public int sumEven(int n) {
        // Base Case: n is 2 as smallest even number
        if (n == 2) {
            return 2;
        }
        // Recursive Call: Add n  to the sum of even numbers up to n-2.
        return n + sumEven(n - 2);
    }

    public boolean isPalindrome(String s) {
        // Base Case: If the string has 0 or 1 character, it is a palindrome.
        if (s == null || s.length() <= 1) {
            return true;
        }
        // If the first and last characters are the same, check the substring in between.
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1)); // Check the middle part of the string
        }
        // If the first and last characters don't match, it's not a palindrome.
        return false;
    }

    public static void main(String[] args) {
        Recursive r = new Recursive();

        // Test 1: length method
        System.out.println("Length of 'hello': " + r.length("hello"));

        // Test 2: sumEven method
        System.out.println("Sum of even numbers up to 8: " + r.sumEven(8));

        // Test 3: isPalindrome method
        System.out.println("'radar' is a palindrome: " + r.isPalindrome("radar"));
        System.out.println("'hello' is a palindrome: " + r.isPalindrome("hello"));
    }
}

