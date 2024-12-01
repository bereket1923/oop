package oop.lab7;//generic means flexible code
import java.time.LocalDate;
import java.util.*;

// comparable and comparators are type of interface
// in comparator interface, each variable name has the same class name

//Why Use compareTo() in Comparator Implementation?//
//if the instance variable has a natural order, it is comparable interface.

// comparable interface has:
// 1.lexicographical order (dictionary order),
// 2.name (lexicographical order)
// 3.number(ascending order) and
// 4.date (chronological order)

//comparable interface://
//has single natural order; compare the first variable if different comparison stop and return result,
//if same continue to second, if the second same, continue third.

// comparator interface//
// Can have multiple custom orders means order based on first variable and displayed all object
// proceed  ordering depending on the second variable and displayed all object
//ordering continue upto the instance variable completed

//Comparable<T>: The data type T is the type of the object itself (e.g., Product)//with in class
//Comparator<T>: The data type T is the type of objects being compared (e.g., Product1)//outside class

//angle brackets <> in Java are used to define and store generics in classes, methods, and interfaces.
//only used for reference type (objects)

public class Account implements Comparable<Account> {
    // if we try to Array.sort(array name) without comparable/comparator interface in the main method,
    // the result becomes exception thrown
    private String name;
    private double balance;
    private LocalDate openDate;

    // Constructor

    public Account(String name, double balance, LocalDate openDate) {
        this.name = name;
        this.balance = balance;
        this.openDate = openDate;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    // Overriding the compareTo method
    @Override
    public int compareTo(Account other) {
        // 1. Compare by name (lexicographical order)
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        }

        // 2. Compare by balance (ascending order)
        int balanceComparison = Double.compare(this.balance, other.balance);
        if (balanceComparison != 0) {
            return balanceComparison;
        }

        // 3. Compare by openDate (chronological order)
        return this.openDate.compareTo(other.openDate);
    }

    // Overriding toString for better output
    @Override
    public String toString() {
        return "Account{name='" + name + "', balance=" + balance + ", openDate=" + openDate + "}";
    }
}
class Test{
    public static void main(String[] args) {

        Account[] accounts = {
                new Account("Alice", 5000, LocalDate.of (2020, 1, 1)),
                new Account("Bob", 3000, LocalDate.of(2021, 5, 15)),
                new Account("Alice", 5000, LocalDate.of(2019, 12, 25)),
                new Account("Charlie", 7000, LocalDate.of(2022, 3, 10))
        };
        // Sort using Comparable (Problem 1)
        Arrays.sort(accounts);
        System.out.println("Sorted by Comparable:");
        for (Account account : accounts) {
            System.out.println(account);
        }

        // Sort using Comparator (Problem 2)
        AccountComparator comparator = new AccountComparator();
        Arrays.sort(accounts, comparator);
        System.out.println("Sorted by Comparator:");
        for (Account ac : accounts) {
            System.out.println(ac);
        }
    }
}