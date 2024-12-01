package oop.lab51;
//abstract class have either one or both of;
//Abstract method (no implementation), so no instance variable
// Concrete method (implementation), so has instance variable

public abstract class ClosedCurve {

public abstract double computeArea();

    public static void main(String[] args) {
        //for default super class Object//Violation of Polymorphism//Tight Coupling//Poor Maintainability
        // in this case default Object superclass has no computeArea methods(specific methods)
        //so we repeatedly test each object using instanceof operators
        //but, we can do unrelated object

        Object []objectShape = {new Triangle(4, 7),
                new Square(3),
                new Circle(3),
                new Rectangle(3, 7)};
        for(Object o:objectShape) {
            if (o instanceof Triangle) {
                Triangle t = (Triangle) o;
                System.out.println(t.computeArea());
            } else if (o instanceof Circle) {
                Circle c = (Circle) o;
                System.out.println(c.computeArea());
            } else if (o instanceof Rectangle) {
                Rectangle r = (Rectangle) o;
                System.out.println(r.computeArea());
            }
        }

        // for explicit superclass, there is specific implementation methods

        ClosedCurve[] objectSh = {new Triangle(4, 7),
                new Square(3),
                new Circle(3),
                new Rectangle(3, 7)};

        //closedCurve is a reference point to array object and c a reference point to each object
        for(ClosedCurve c: objectSh) {

            System.out.printf("the area is: %.2f\n", c.computeArea());
        }
    }
}