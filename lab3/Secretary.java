package oop.lab3;

import java.time.LocalDate;

class Secretary extends DeptEmployee {
    private double overtimeHours;

    public Secretary (String name, double salary, LocalDate hireDate, double overtimeHours) {
        super(name, salary, hireDate);
        this.overtimeHours = overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + 12 * overtimeHours;
    }
}
