package oop.lesson7;

import java.util.Comparator;

public class HireDate implements Comparator<Employee> {

    // we use compareTo under compare method, why?
    //to reusing the logic already provided by the Comparable interface
    //that is why we are using getter methods

        @Override

        public int compare(Employee e1, Employee e2) {

            int result1 = e1.getHireDate().compareTo(e2.getHireDate());
            if (result1 != 0)

                return result1;

            else {
                int result2 = e1.getName().compareTo(e2.getName());

                if (result2 != 0)

                    return result2;

                else {

                    int result3 = Double.compare(e1.getSalary(), e2.getSalary());

                    return result3;

                }

            }

        }
}
