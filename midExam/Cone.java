package oop.midExam;

// Subclass for Cone
class Cone extends Shape {

    public Cone(double radius, double height) {
        super(radius, height);
    }

    @Override
    double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(super.radius, 2) * super.height;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return String.valueOf(super.radius + super.height + this.volume());
    }

    // Overriding equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Check if the objects are the same
        }
        if ((obj == null) || !(obj instanceof Cone)){
            return false;
        }
        Cone other = (Cone) obj;
        // Explicitly use super to access inherited radius and height
        return super.radius == other.radius && super.height == other.height;
    }
}
