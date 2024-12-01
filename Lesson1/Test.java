package oop.Lesson1;

public class Test {
    public static final double PI =3.14;

    public static int min (int a, int b) {
        if (a < b) {
            return a;
        } else{
            return b;
        }

      //  public String LastName(String lastName){

        }
    public static void main(String[] args) {
        //instance method needs object creation, while for static (utility) method,
        // no need of object creation, b/c we can access class name dot methods

        Test.min(8,2);
        System.out.println(Test.min(8,2));
    }
}
