package oop.lab4;

import java.time.LocalDate;

public class Employee extends Person {
    private String empId;
    private double salary;

    // Constructor
    public Employee(String name, LocalDate dob, String empId, double salary) {
        super(name, dob); // Call to the superclass (Person) constructor
        this.empId = empId;
        this.salary = salary;
    }

    // Getters
    public String getEmpId() {
        return empId;
    }

    public double getSalary() {

        return salary;
    }
    //overriding comes from person class
    @Override
    public String toString() {
        return super.toString () +this.empId+this.salary;
    }
}