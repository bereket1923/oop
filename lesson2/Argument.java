package oop.lesson2;

/**when a method parameter has the same name as a variable in the calling method (or scope),
 * the parameter name shadows the variable name/arguments.
 *
 */
public class Argument{

public static void modifyValue(int value) { // Parameter with the same name as the argument
    value = value + 5; // Modifies the parameter 'value', not the original argument
    System.out.println("Inside method: " + value); // This will print 15
}

    public static void main(String[] args) {
        int value = 10; // Variable in main method
        System.out.println("Before method call: " + value);

        modifyValue(value); // value is the argument
        System.out.println("After method call: " + value); // value remains 10
    }

}
