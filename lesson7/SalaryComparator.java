package oop.lesson7;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override

    public int compare(Employee e1, Employee e2) {

        int result1 = Double.compare(e1.getSalary(), e2.getSalary());//first compare by salary
        if (result1 !=0) {
            return result1;
        }else{
            int result2 = e1.getName().compareTo(e2.getName());
            if(result2 !=0) {
                return result2;
            }else{
                int result3= e1.getHireDate().compareTo(e2.getHireDate());
                    return result3;
                }
            }

        }

    }