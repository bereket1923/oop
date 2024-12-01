package oop.lesson2;

public class Honey {

    String name;

    // Constructor
    Honey(String name) {
        this.name = name;
    }
    // Method to modify the Honey's name
    public static void changeName(Honey obj) {
        obj.name = "Bob";  // Modify the name attribute
    }
    public static void main(String[] args) {
        // Declare and initialize st as Honey instead of Student
        Honey st = new Honey("Alice");  // Create a Honey with name "Alice"
        System.out.println("Before: " + st.name); // Output: Alice

        // Pass st to the changeName method
        changeName(st);

        System.out.println("After: " + st.name);  // Output: Bob
    }

}