package oop.lesson4;

public class Point {
    int x;
    int y;
    public Point(){
       this(0,0);
    }
    public Point(int x, int y){
        this.x =x;
        this.y =y;
    }
    public void setX( int x){
        this.x =x ;
    }
    public int getX(){
        return x;
    }
    public void setY (int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
    public void Print(){
       System.out.println("("+x+"," +y+")");
    }
    //this(0,0)//return distance between current object and origin
    public int computeDistance(){
        return Math.abs(0-this.x) + Math.abs(0-this.y);
    }
    //p1 and this//return the distance between p1  and current object
    public int computeDistance(Point p1){
        int x = this.x;
        int y = this.y;
        int x1 = p1.x;
        int y1 = p1.y;
        return Math.abs(p1.x-this.x) + Math.abs(p1.y-this.y);
    }
    public static int computeDistance(Point p1, Point p2) {//distance between p1 and p2
   return p1.computeDistance(p2);
  //or  return p2.computeDistance(p1);
    }
    //this and p//return the closer point to origin b/n current object and p
    public Point closerPoint(Point p){
        int a =this.computeDistance();
        int b =p.computeDistance();
        if(a<b)
            return this ;
        else
            return p;
    }
    //return the closer point  to the origin b/n p1 and p2
    public static Point closerPoint(Point p1, Point p2){
        return p1.closerPoint(p2);
    }
    public static void main(String[]args){
        Point p1 = new Point(5,7);
        Point p2 = new Point(6,7);
        p1.computeDistance();
        p2.computeDistance();
       System.out.println("point one");
        p1.Print();
        System.out.println("point two");
        p2.Print();
    }
}
