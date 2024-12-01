package oop.midExam;

// Abstract Class
abstract class Shape {
    protected double radius; // Common attribute for radius
    protected double height; // Common attribute for height

    // Constructor for the common attributes
    public Shape(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Abstract method for volume calculation
    abstract double volume();
}

// Main Class to Test
 class Main {
    public static void main(String[] args) {
       Shape[] arry1 = {new Cone(3, 5),
        new RectangularPrism (6,7,8),
        new Cylinder(5,4) };

       Shape []arry2 = {new Cone(3, 5),
               new RectangularPrism (6,7,8),
               new Cylinder(5,4) };


       for(Shape ob1: arry1){

           ob1.volume();
           System.out.println(ob1.volume());
}
        for(Shape ob2: arry2){

            ob2.volume();
        }

        // Comparing Cone objects using equals() method
        System.out.println("cone1 equals cone2: " + arry1.equals(arry2));

    }
}
