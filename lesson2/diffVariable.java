package oop.lesson2;
//Local, Parameter & Data Member

public class diffVariable {

    // Data member (instance variable)
    private int value = 10;

    // Method that has a local variable and a parameter
    public void calculate(int value) {
        // 'value' here refers to the parameter, not the instance variable.
        int localValue = 5; // Local variable
        System.out.println("Parameter value: " + value); // Refers to the parameter
        System.out.println("Local variable value: " + localValue); // Refers to the local variable
        System.out.println("Data member value: " + this.value); // Refers to the instance variable
    }

    public static void main(String[] args) {
        diffVariable e = new diffVariable();
        e.calculate(20);

    }
}

