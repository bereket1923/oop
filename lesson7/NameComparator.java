package oop.lesson7;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

    @Override

    public int compare(Employee e1, Employee e2) {

        int result1 = e1.getName().compareTo(e2.getName()); //first compare by name

        if (result1 != 0) {

            return result1;

        } else { //same name

            int result2 = Double.compare(e1.getSalary(), e2.getSalary());

            if (result2 != 0) {

                return result2;

            } else { //same name and salary

                int result3 = e1.getHireDate().compareTo(e2.getHireDate());

                return result3;

            }

        }
    }
}