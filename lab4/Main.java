package oop.lab4;

import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
            // Create instances of Person
            Person p1 = new Person("Alice:", LocalDate.of(1998, 5, 15));
            Person p2 = new Person("Alice:", LocalDate.of(1998, 5, 15));
            System.out.println(p1 == p2);//only true when they point same object in memory
            System.out.println(p1.equals(p2));
            int x =5;
            int y =5;
            System.out.println(x==y);
            //System.out.println(x.equals(y));// error b/c primitive type, cannot use .equals() method.
            String a = "hello";
            String b = "hello";
            System.out.println(a==b);//check whether a and b points to same string pool
            System.out.println(a.equals(b));//check the content of two string

            // Test equals() method
            System.out.println(p1.equals(p2));
            // Test toString() method//the method is accessed from java object class
            System.out.println(p1);
            System.out.println(p1.toString());

            // Create instances of Employee
            Employee e = new Employee("Ch:", LocalDate.of(1985, 3, 25), "E123", 75000.00);

            // Test toString() method for Employee
            System.out.println(e.toString());
            System.out.println(p1.equals(e));

        }
    }
