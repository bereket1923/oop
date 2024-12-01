package oop.lab52;

    public class Triangle implements Polygon {
        private double base;
        private double height;

    public Triangle(double base, double height){
            this.base = base;
            this.height =height;
        }
        @Override
        public int getNumberOfSides(){
            return 3;
        }
        @Override
        public double computePerimeter(){
            return Math.sqrt((base*base)+(height*height))+ base + height;
        }

    }

