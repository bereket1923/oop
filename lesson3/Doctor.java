package oop.lesson3;

public class Doctor {
    private String firstName;
    private String lastName;
    private double salary;

    public Doctor(){
        //this("default","default",0);
        //this.firstName = "Default";
        // this.lastName = "Default";
        // this.salary = 0;
    }
    public Doctor(String firstName, String lastName) {
        this(firstName, lastName, 0.0);//calling one constructor into another constructor
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Doctor(String firstName, String lastName, double salary) {
        this();//calling default constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary =salary;

    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public static void main(String[] args){
        //calling the same name constructor with three parameter
        Doctor s = new Doctor("bon","Buddy",5000);
        System.out.println(s.firstName+" " +s.lastName+ ":" +s.salary);
        //calling the same name constructor with two parameter
        Doctor s1 = new Doctor("jessica", "charla");
        System.out.println(s1.firstName+ " "+s1.lastName);
        //calling the default constructor
        Doctor s2 = new Doctor();
        System.out.println(s2.firstName+ " " +s2.firstName+ ":" +s2.salary);
        //if we want to add more name
        s.setFirstName("Me");
        s.setLastName("father");
        s.setSalary(4000);
        System.out.println(s.firstName+ " "+s.lastName+ ":" +s.salary);

    }
}