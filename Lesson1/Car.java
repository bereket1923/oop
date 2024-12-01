package oop.Lesson1;

public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor to initialize the car's attributes
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter for make//Getter (Read-Only Access)
    public String getMake() {
        return make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    public void setYear() {//Setter (Write Access)
        this.year = year;
    }
//    Feature	Instance Data Member	                 Class Data Member
//    Keyword	None 	                                 static
//    Memory   Separate copy for each instance	         Single copy shared across all instances
//    Access	via an instance	                          Accessed via the class
//    Lifetime	As long as the instance exists	         As long as the class is loaded
//    Use Case	Attributes unique to each object	     Attributes common to all instances(e.g count)
//     (has its own copy)
}
