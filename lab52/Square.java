package oop.lab52;

public class Square implements Polygon{
    private double sides;

public Square(double sides){
        this.sides = sides;
    }
    @Override
public int getNumberOfSides(){
        return 4;
    }
    @Override
public double computePerimeter(){
        return 4*sides;
    }

}

