package oop.lab52;

public class Rectangle implements Polygon {//rectangle is subtype and polygon super type
    //that means interfaces do not have a traditional subclass-superclass hierarchy

    private double length;
    private double width;

public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
   @Override
public int getNumberOfSides(){
       return 4;
    }
    @Override
public double computePerimeter(){
       return 2* (length + width);
    }

}
