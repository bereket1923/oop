package oop.lesson6;
public class Person {

    //A generic class(regular class) is a blueprint for creating objects with different types.
    //in this case person is not a generic class to the AddressBook class ,
    // but we can call it generic type same as data type  because
    //A generic class would use a type parameter (<T>, <E>, or <K, V>)
    // which makes flexible for d/t data types //e.g public class Person<T, U> {//

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {

        this.name = name;

        this.age = age;

        this.gender = gender;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public char getGender() {

        return gender;

    }

    public void setGender(char gender) {

        this.gender = gender;

    }

    @Override

    public String toString() {

        return "Person [name=" + name + ", " + "age=" + age + ", gender=" + gender + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference
        }
        if (!(obj instanceof Person)) {
            return false; // Not the same type
        }
        Person other = (Person) obj; // converting obj into person and assign to other variable
        return this.name.equals(other.name)
                && this.age == other.age
                && this.gender == other.gender;
    }
}