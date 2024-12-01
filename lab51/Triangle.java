package oop.lab51;

public class Triangle extends ClosedCurve {
   private double base;
   private double height;

   public Triangle(double base, double height){
       this.base = base;
       this.height = height;

    }
    @Override
    public double computeArea() {
        return 0.5 * base * height;
    }
}
