package oop.lab3;

import java.time.LocalDate;

class Professor extends DeptEmployee {
    private int numberOfPublications;

    public Professor(String name, double salary, LocalDate hireDate, int numberOfPublications) {
        super(name, salary, hireDate);
        this.numberOfPublications = numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    public double getNumberOfPublications() {
        return numberOfPublications;
    }

}