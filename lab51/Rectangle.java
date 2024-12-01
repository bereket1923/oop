package oop.lab51;

public class Rectangle extends ClosedCurve {
        double width;
        double length;

  public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        @Override
        public double computeArea() {
            return width * length;

        }
    }