package oop.midExam;

// Subclass for Rectangular Prism
class RectangularPrism extends Shape {
    private double length;
    private double width;

    public RectangularPrism(double length, double width, double height) {
        super(0, height); // Pass 0 for radius as it's not used in the rectangular prism
        this.length = length;
        this.width = width;
    }

    @Override
    double volume() {
        return length * width * super.height;
    }
}