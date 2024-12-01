package oop.lesson6;
import java.util.ArrayList;
import java.util.List;

//The Java Collections Framework: is a set of interfaces, classes, and algorithms
// that work together to manage and manipulate collections of objects.

//Feature//        List 	                       Map
//Access	       By index (list.get(index))	  By key (map.get(key))
//implementation   by ArrayList & linkedList      HashMap
//Order	           Maintains insertion order	  Unordered (unless using TreeMap)
//Duplicates	   Allows duplicate values	      Unique keys, duplicate values allowed
//Mutability	   Mutable	                      //Mutable(add,remove or modify elements after they are created)
//Usage	           Sequence of elements	          Key-value pairs

// map.get(key) e.g map.get("Alice")
// map.get(0); wrong because map is not indexed instead
//list.get("Alice"); wrong as list is indexed by integer
// list.get(0); right list is indexed

//map & list is interface tye, but instead of implement keyword they have their own implementation
//ArrayList, LinkedList → implementations of List.
//HashMap, TreeMap → implementations of Map.
//List<String> myList = new ArrayList<>(); // ArrayList implements List
//Map<String, Integer> myMap = new HashMap<>(); // HashMap implements Map
//examples//
// ArrayList<String> names = new ArrayList<>(); // Holds String elements
//HashMap<String, Integer> scores = new HashMap<>(); // Holds key-value pairs of String and Integer.

//Array//

//Fixed size.
//Stores elements of the same data type.
//Does not support built-in methods like add() or remove().
//is not part of the Java Collections Framework
//Directly access elements using index.
//e.g
//int[] numbers = {10, 20, 30};
//System.out.println(numbers[1]);

//List//
//Dynamic size (can grow or shrink).
//Can store elements of a specified generic type (e.g., List<String>).
//Provides built-in methods like add(), remove(), and contains().
//Part of Java Collections Framework.
//access elements using the get(index) method
//e.g
//List<String> names = new ArrayList<>();
//names.add("Alice");
//names.add("Bob");
//System.out.println(names.get(0)); // Outputs "Alice"

public class AddressBook {
    // declare instance variable
    private List<Person> people;

    public AddressBook() {
        // Initialize the list//making default constructor
        people = new ArrayList<>();
    }
    //List<Person> friends1 = new ArrayList<Person>( ); this is a polymorphism//
    // List is super type, friends1 (reference variable) & ArrayList subtype
    // but has no superclass & subclass b/c map and list is interface type
    // doing implementation, but has no extend key word

    // Method to add a Person to the address book
    public boolean add(Person p) {
        return people.add(p);
    }

    public String toString() {
        return people.toString();
    }
    //not boolean type b/c the method call another equals() and return name or null
    // Search for a single Person by name (returns the first match)
    public Person search(String name) {
        for (Person p : people) {
            if (p.getName().equals(name)) {//getName is current name(name of person p in the list)
                // & name is other (passed) name or name we are searching for
                return p; // Return the first match
            }
        }
        return null; // Return null if no match is found
    }

    // Search for all Persons with the same name (returns a list of matches)
    public List<Person> searchAll(String name) {

        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (p.getName().equals(name)) {
                result.add(p); // Add matching Person to the result list
            }
        }
        return result; // Return the list of matches
    }
    // Method to delete a Person from the address book
    public boolean delete(Person p) {
        return people.remove(p);
    }

    public int indexOf(Person p) {//p is reference for object
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).equals(p)) {
                return i;
            }
        }
        return -1;
    }

    public double computeAverageAge() {
        //.isEmpty() is a method provided by the Java Collection interface
        if (people.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Person p : people) {
            sum += p.getAge();
        }

        return sum / people.size();
    }
    // returns true if two lists have the same elements in the same order
    public  boolean equalList(List<Person> list1, List<Person> list2) {

        // Check if the sizes of the lists are the same
        if (list1.size() != list2.size()) {
            return false;
        }

        // Compare each element in the lists
        for (int i = 0; i < list1.size(); i++) {
            Person p1 = list1.get(i);
            Person p2 = list2.get(i);

            // Use the equals method of Person for comparison
            if (!p1.equals(p2)) {
                return false;
            }
        }

        // If all elements are equal, return true
        return true;
    }
    // Main method for testing
    public static void main(String[] args) {
        AddressBook ad = new AddressBook();

        // Creating some Person objects
        Person person1 = new Person("Alice", 55, 'f');
        Person person2 = new Person("Bob", 45, 'm');
        Person person3 = new Person("Jess", 65, 'm');

        // Adding Persons to the address book
        ad.add(person1);
        ad.add(person2);
        ad.add(person3);
        System.out.println(ad.add(person1));
        // Searching for a Person
        Person found = ad.search("Eve");
        System.out.println("eve is in the list: " + found);


        // Deleting a Person
        ad.delete(person1);
        System.out.println("Deleted Alice: " + ad.delete(person1));//true

        // Trying to delete Alice again
        ad.delete(person1);
        System.out.println("delete Alice:" +ad.delete(person1));// false b/c already deleted

        //index test
        int a =  ad.indexOf(person3);
        System.out.println(a);

        //test age
        ad.computeAverageAge();
        System.out.println(ad.computeAverageAge());

        //"1"    When calling addressBook.search("Eve"),
        //the string "Eve" is the argument passed to the parameter name.
        //"2" In the search() method, p.getName() retrieves the name of
        // the current Person object in the list (e.g., "Alice", "Bob", "jess").
        //"3" The condition p.getName().equals(name) checks current name and passed name

    }
}
