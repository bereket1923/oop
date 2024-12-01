package oop.lab4;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String name;
    private LocalDate dob;

    // Constructor
    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    // Getters
    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    // Override equals() to compare Person objects based on name and dob
    @Override
    public boolean equals(Object obj) {
        if (obj == this)  // Check if both references are the same
            return true;
        if (obj == null || !(obj instanceof Person)) // Check for null and type
            return false;

        Person another = (Person) obj;//casting
        return this.name.equals(another.name) && this.dob.equals(another.dob);
        // Compare name and dob
    }
    //method overloading two method with same name and different method signature
    // method override involves superclass and subclass
    //
    // overriding in Person class indicates toString method and
     // equals method comes from java object class
    @Override
    public String toString() {
        return  this.name +  this.dob;//this.name.toString but if not put explicitly, java put auto
    }
}