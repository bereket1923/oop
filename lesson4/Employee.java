package oop.lesson4;
//
    public class Employee {
        private String name;
        private double salary;
       // private double room;
       // public Employee(double room){
         //   this("abebe",400);//calling constructor always first line(can not change into line 9)
         //   this.room =room;//but for instance methods anywhere
        //}//calling in constructor only by value but methods for instance methods

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
        // Default constructor
        public Employee() {
            this.name = "Default Name";
            this.salary = 0.0;
            }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }
        public double getSalary() {
            return salary;
        }
        public double monthlyPay() {
            return salary;
        }
        public Employee getEmployee(){
            return new Employee();
        }
    }

