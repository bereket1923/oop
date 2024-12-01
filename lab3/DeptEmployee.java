package oop.lab3;

import java.time.LocalDate;

public class  DeptEmployee {
    private String name;
   protected double salary;
   private LocalDate hireDate;

public DeptEmployee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }


    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    public double computeSalary(){
    return salary;
    }
}

class Test {
    public static void main(String[] args) {
        DeptEmployee d = new Professor("bu", 20, LocalDate.of(1992,5,23),80);
        Secretary s = new Secretary("jes", 400,LocalDate.now(),7.0);

        d.getHireDate();
        System.out.println(d.getHireDate());

        d.computeSalary();
        System.out.println("Professor salary is:" +d.computeSalary());

        s.computeSalary();
        System.out.println("Secretary Salary is:" +s.computeSalary());

    }
}
