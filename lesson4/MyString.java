package oop.lesson4;

public class MyString {
    private char[] arry;

    public MyString() {//default constructor
        arry = new char[15]; // Initialize the array with a size of 10
    }

    // Constructor to initialize with a given char array
    public MyString(char[] arry) {
        this.arry = arry;
    }

    // Adds one or more characters to the end of the array
    public void add(char ch) {
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == 0) { // Find an empty slot
                arry[i] = ch;
                break;
            }
        }
    }


    // Returns the character at the specified index
    public char charAt(int i) {
        if (i >= 0 && i < arry.length) {
            return arry[i];
        } else {
            return '\u0000'; // Return the default char value if index is out of range
        }
    }

    // Returns the minimum character in the string
    public char min() {
        char min = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (arry[i] < min) {
                min = arry[i];
            }
        }
        return min;
    }

    // Prints the characters one by one
    public void print() {
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] != 0) // Skip empty elements
                System.out.print(arry[i]);
        }
    }

    // Returns a new MyString object that is a substring starting from index i

    public MyString subString(int i) {
        String result = "";
        for (int x = i; x < arry.length; x++) {
            result += arry[x];
        }
        MyString a = new MyString();
        return a;
    }

    // Reverses the array
    public void reverse() {
        for (int i = 0; i < arry.length / 2; i++) {
            char temp = arry[i];
            arry[i] = arry[arry.length - i - 1];
            arry[arry.length - i - 1] = temp;
        }
    }

    // Compares the current MyString object with another object
    @Override
    public boolean equals(Object ob2) {
        if (this == ob2) return true; // Same object reference
        if (ob2 == null || !(ob2 instanceof MyString)) return false; // Check for null or wrong class

        MyString another = (MyString) ob2; // Cast to MyString
        char[] arry1 = this.arry;
        char[] arry2 = another.arry;

        // Compare the two char arrays directly
        if (arry1.length != arry2.length) {//Array Length check
            return false; //
        }

        for (int i = 0; i < arry1.length; i++) {
            if (arry1[i] != arry2[i]) {//Character-by-Character Comparison:
                return false;
            }
        }

        return true;
    }

    // Main method to test the MyString class
    public static void main(String[] args) {
        char[] arry1 = {'l', 'o', 'v', 'e', 'r', 's'};
        char[] arry2 = new char[]{'1', '8', '5'};

        MyString s1 = new MyString(arry1); // Initialize with arry1

        System.out.println("Arrays equal: " + s1.equals(new MyString(arry2)));

        s1.add('m');
        System.out.print(" after adding:");
        s1.print();
        System.out.println(); // Line break

        System.out.println("Char at index 1: " + s1.charAt(1));

        System.out.println("Minimum char: " + s1.min()); // Should print the smallest character

        s1.reverse(); // Reverse the array
        System.out.print("Reversed string: ");
        s1.print();
        System.out.println(); // Line break

        MyString subString = s1.subString(1); // Get substring from index 2
        System.out.print("Substring from index 2: ");
        subString.print();
        System.out.println(); // Line break
    }
}