package oop.lesson3;

public class Overload {
    public void aMethod(int x) {

    }

    public void aMethod(double x) {

    }

    public void aMethod(int x, int y) {

    }

    public static void main(String[] args) {

        Overload ob = new Overload();
        int x = 9;
        int y = 8;
        ob.aMethod(9.0);
        System.out.println((double)x);
        ob.aMethod(9);
        System.out.println(x);
       ob.aMethod(9,8);
        System.out.println((int)x+ " and " +y);
    }
}
