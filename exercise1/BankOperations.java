package oop.exercise1;
//Polymorphism: Polymorphism allows objects of different classes
// to be treated as objects of a common superclass
//Inheritance:the creation of a new class (called a subclass/ derived class)
// based on an existing class (called a superclass or base class).
public class BankOperations {
    public static void main(String[] args) {
        // Polymorphic reference
        Account saving = new SavingAccount("brown","234F", 400, 5);
        // Direct instance of Account
        Account genericAccount = new Account("god","W32",50);
        Account nullAccount = null;  // Null reference
        // It checks the runtime type of the object and returns a boolean value (true or false).
        //object: The reference to the object you want to check.
        //ClassName: The class or interface you want to check against.
        // 1. Check if 'saving' and 'checking' are instances of Account
        System.out.println(saving instanceof Account); // true//means savingAccount instanceof Account
        System.out.println(saving instanceof SavingAccount); // true
        System.out.println(saving instanceof Account); // true
        System.out.println(genericAccount instanceof Account); // true
        System.out.println(genericAccount instanceof SavingAccount); // false
        //System.out.println(Account instanceof saving ); // false
        // always false for null references
        System.out.println(nullAccount instanceof Account); // false
    }
}