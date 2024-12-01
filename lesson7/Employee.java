package oop.lesson7;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Employee implements Comparable<Employee>{

    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, int salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public int compareTo(Employee other) {
        // Compare by name first
        int result1 = this.name.compareTo(other.name);
        if (result1 != 0) {
            return result1; // If names differ, return the comparison result
        } else {
            // Compare by salary if names are equal
            int result2 = Double.compare(this.salary, other.salary);
            if (result2 != 0) {
                return result2; // If salaries differ, return the comparison result
            } else {
                // Compare by hire date if names and salaries are equal
                return this.hireDate.compareTo(other.hireDate);
            }
        }
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + salary + ", hireDate = " + hireDate + "]";
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("bob", 300, LocalDate.of(2010, 6, 3));
        Employee e2 = new Employee("bob", 300, LocalDate.of(2010, 6, 3));

        //before sorting add object to ArrayList first
        List<Employee> arr = new ArrayList<>();// comparable use List for sorting elements
        arr.add(e1);//while comparator use both map and list
        arr.add(e2);

        //for compareTo method
        System.out.println(e1.compareTo(e2));// only compare date b/c methods set for date
        System.out.println(e1.equals(e2));

        Comparator<Employee> n = new NameComparator();
        Comparator<Employee> h = new HireDate();
        Comparator<Employee> s = new SalaryComparator();

        //print for compare methods
        System.out.println(n.compare(e1, e2));//negative
        System.out.println(h.compare(e1, e2));//negative
        System.out.println(s.compare(e1, e2));//negative
        //three of them same result b/c makes consistence on compare methods

        // Sort by name
        Collections.sort(arr, new NameComparator());//call method or class use()
        System.out.println("Sorted by Name: " + arr);

        // Sort by hire date
        Collections.sort(arr, new HireDate());//instead of collection, we can use Arrays
        System.out.println("Sorted by Hire Date: " + arr);

        // Sort by salary
        Collections.sort(arr, new SalaryComparator());
        System.out.println("Sorted by Salary: " + arr);


    }

}
