package oop.lesson4;

class Person {
    String name;

    public void changeName(String newName) {
        name = newName;
    }
    //Passing an object to a method shares a reference,not object
    // Modifying the object inside the method affects the original object outside the method
    static void modifyPerson(Person person) {
        person.changeName("Bob");
    }
//in primitive data types, method receives a copy of the actual data
//Changes to this copy inside the method do not affect the original value outside the method.

    static void modifyNumber(int num) {
        num = 10;  // This only changes the copy within the method
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alice";

        modifyPerson(person);

        System.out.println(person.name);  // Output: "Bob" since the original object is modified
        //.........
        int number = 5;

        modifyNumber(number);

        System.out.println(number);  // Output: 5, original value remains unchanged
    }
}
