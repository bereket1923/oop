package oop.lab2;

public class Main {
    public static void main(String[] args) {
        // Creating instances of each shape
        Triangle triangle = new Triangle(5, 13.9);
        Rectangle rectangle = new Rectangle(6, 6);
        Circle circle = new Circle(4.3);

        // Printing area of each shape
        System.out.println("Area of Triangle is " + triangle.computeArea());
        System.out.println("Area of Rectangle is " + rectangle.computeArea());
        System.out.println("Area of Triangle is " + circle.computeArea());

        // Testing the expand method and set same length for compatibility
        Rectangle anotherRectangle = new Rectangle(3, 6);
        Rectangle expandedRectangle = rectangle.expand(anotherRectangle);
        System.out.println("Area of Expanded Rectangle is " + expandedRectangle.computeArea());
    }
}

class Triangle {
    private double base;
    private double height;


    public Triangle() {
        this(1, 1);
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double computeArea() {
        return 0.5 * base * height;
    }
}

class Rectangle {
    private double width;
    private double length;

    public Rectangle() {
        this(1,1);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double computeArea() {
        return width * length;
    }

    // Method to expand the width by the width of another rectangle r
    public Rectangle expand(Rectangle r) {
        //current width = this.width + additional width(r.width)
        return new Rectangle(this.width + r.width, this.length);
    }
}

class Circle {
    private double radius;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {

        this.radius = radius;
    }

    public double computeArea() {

        return Math.PI * radius * radius;
    }
}