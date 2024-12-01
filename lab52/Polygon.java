package oop.lab52;

public interface Polygon {

//if void, we are doing in subclass @Override print system out
public int getNumberOfSides();

////interface has no constructor, has no method body, has no variable
// Their purpose is to provide a contract set of methods for "implement"
public double computePerimeter();
}

class Test2 {

public static void main(String[] args) {
//this is polymorphism
   Polygon [] objects = {new Triangle(4,2),
           new Rectangle(4,8),
           new Square(4)};

    for (Polygon shape :objects) {

        System.out.println(" the number of side is:"+shape.getNumberOfSides());
        System.out.printf(" the perimeter is :%.2f\n", shape.computePerimeter());

    }


    }
}