package oop.lab51;

public class Square extends ClosedCurve {
    private double side;


public Square(double side) {
    this.side = side;

        }
  @Override
 public double computeArea() {
    return Math.pow(side,2);
}
}
