package oop.midExam;

// Subclass for Cylinder
class Cylinder extends Shape {

    public Cylinder(double radius, double height) {
        super(radius, height);
    }

    @Override
    double volume() {
        return Math.PI * Math.pow(super.radius, 2) * super.height;
    }
}
