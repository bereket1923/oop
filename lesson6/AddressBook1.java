package oop.lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressBook1 {
   private Map<String, Person> people;

    public AddressBook1() {//default constructor
        people = new HashMap<>();
    }

    public AddressBook1(Map<String, Person> p) {// parametrized constructor
        people = p;
    }

    public void add(Person p) {
        people.put(p.getName(), p);//p.getName is key and p value of instance variable value like age, sex...
        //even if map has no p.getName methods, but we can call from person class
        // e.g; Person person1 = new Person("Alice", 30);
        //so p.getName gives Alice and p gives value of age
    }
    public Person delete(Person P) {
        if (P != null) {
            return people.remove(P.getName());
        }
        return null;
    }
    public Person search (String name) {
            return people.get(name);// Direct access by key, but don't do in list

        }

    public String toString() {
        return people.toString();
    }
    public int countTeenager() {
        int count = 0;
        for(Person p : people.values()) {// Use values() to get Person objects directly
            if (p.getAge() >= 13 && p.getAge() <= 19) {
                count++;
            }
        }
        return count;
    }
    public double computeAverageAge(){

        double sum=0;
        for(Person p : people.values()) {
            sum += p.getAge();
        }
        return sum/people.size();
        }

    //search from Map and add same gender to the List
    public List<Person> search(char gender) {// Map as a parameter b/c the constructor is Map

        List<Person> personList = new ArrayList<>();//new List

        // Iterate over the entries of the Map
        for (Person p : people.values()) {
            if (p.getGender() == gender) { // Check if the gender matches
                personList.add(p); // Add the matching Person to the list
            }
        }
        return personList; // Return the list of matching Person objects
    }
    // Method to search from List and add matching gender to Map
    public Map<String, Person> search(List<Person> personList, char gender) {

        Map<String, Person> people = new HashMap<>();

        // Iterate over the List of Person objects
        for (Person p : personList) {
            // Check if the gender matches
            if (p.getGender() == gender) {
                people .put(p.getName(), p); // Add to Map with name as key & p as value char gender
            }
        }

        return people ;
    }

    //values() method represent the following method in for loop
    //        for (String key : people.keySet()) { // check each element one by one
    //            Person p = people.get(key); // Retrieve the Person object by key


    //  how many times the names occur in the list
    public Map<String, Integer> countName(List<String> names) {//list as a parameter

        Map<String, Integer> result = new HashMap<>();


        for (String name : names) {// find name(alice) over names list(set of name alice, buddy, troy...)

            if (result.containsKey(name)) {// If the name is already in the map, increment its count
                result.put(name, result.get(name) + 1);
            } else {
                result.put(name, 1);
            }
        }

        return result;// return map
    }

    public static void main(String[]args){
          AddressBook1 ad = new AddressBook1();

          // Create Person objects
          Person p1 = new Person("Buddy", 35, 'M');
          Person p2 = new Person("Jessica", 28, 'F');

          // Add persons to the address book
          ad.add(p1);
          ad.add(p2);

          // Display the address book
          System.out.println("Address Book: " + ad);

          // Search for a person
          ad.search("Buddy");
          System.out.println("Search Result for 'Buddy': " +ad.search("Buddy"));

          //
          Map<Integer,String>people = new HashMap<Integer,String>();
          people.put(203,"oo program");
          System.out.println(people.containsKey(203));

          // Delete a person
           ad.delete(p1);
          System.out.println("Deleted: " + ad.delete(p1));

          // Display the address book after deletion
          System.out.println("Address Book after deletion: " + ad);
          //
        System.out.println (ad.search('F'));

        //from the above method get() only used to access directly
        // Searching for a Person by name.
       //Counting occurrences of names in a List.

        //for List//

        // get(index): Retrieves the element at the specified index ( not getter).
        // set(index, element): Sets the element at the specified index to a new value ( not setter).

        //for Map//

        // Map.get(key): To retrieve a value associated with a given key.
        // Map.put(key, value): To insert or update key-value pairs.
        // setKey () is same function as Map.put(), the difference is setKey is custom method
        // that means not part of Map interface method(not standardize), explicitly created

        //if you want to store instances of a custom class (like a Person class) in a Map and list,
        // still use getName() and setName() to access or modify the properties of those objects,
        // but the Map and List  itself doesn't have getName() and setName() methods

        //Double and Integer is corresponding to class value,
        // but int and double is primitive data value

        // about search methods//

        // if name Map<String, Person> people is not provided in parentheses,
        // it is class-level Map (search from another map class)
        // while provided in parentheses, the Map passed as a parameter.

        //  If a Map is passed, the method would iterate over the keys
        //  if a List is passed, the method would iterate over the elements
        //keySet method returns a collection of all the keys in the map
        // get(key) retrieve the value corresponding to a given key.

      }
}