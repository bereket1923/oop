package oop.exercise3;
import oop.lab7.Account;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//to make a Comparator consistent with equals
// Ensure the comparison logic in the compare() method matches the equality logic in the equals() method.
//e1.equals(e2): true is consistent with compare(e1, e2): 0
//e1.equals(e3): false is consistent with compare(e1, e2): negative/positive result

//see the same logic below means only make comparison between name
//@Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj instanceOf Employee())
//        return false;
//        Employee other = (Employee) obj;
//        return this.name.equals(other.name);
//    }
//}
//class NameComparator implements Comparator<Employee> {
//    @Override
//    public int compare(Employee e1, Employee e2) {
//        return e1.getName().compareTo(e2.getName());
//    }
//}
public class Sort {
    public static void main(String[] args) {
        //comparable interface is one of type of interface like map and list,
        // and implementation using one method(comparableTo())

        List<String> names = new ArrayList<>();
        names.add("anne");
        names.add("mike");
        names.add("emily");
        names.add("bob");

        // Sorting the list
        Collections.sort(names);

        // Printing the sorted list
        System.out.println(names);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(22);
        numbers.add(13);
        //sort
        Collections.sort(numbers);
        //printed sorted List
        System.out.println(numbers);

        //arrays are pre-filled at creation, while lists starts empty

        // object creation using List interface and populated using add() methods before sorting
        List<Account> accounts = new ArrayList<>();
        Account account1 = new Account("Bob", 5000, LocalDate.of(2022, 1, 1));
        Account account2 = new Account("Alice", 5000, LocalDate.of(2020, 7, 20));
        accounts.add(account1);
        accounts.add(account2);

        // object creation using Array data structure

        Account[] accountlist = {
                new Account("Alice", 5000, LocalDate.of (2020, 1, 1)),
                new Account("Bob", 3000, LocalDate.of(2021, 5, 15)),
        };

// aspect//         // comparable interface//             //comparator interface//
//Implemented 	    The class whose objects are compared   A separate comparator class compared
//Sorting Call	     Collections.sort(list)	               Collections.sort(list, comparator)
//methods            has compareTo() method                compare() and equals(object obj)
//implemented         inside the class being compared    outside the class(separate class)being compared
//for each comparison  use one class                     use d/t class(like name class, age class...)

// Aspect//	    //compareTo()//	                             //compare()//
//Interface	    Part of the Comparable interface.	         Part of the Comparator interface.
//Comparison	Compares this object to the argument(other)  Compares two objects passed as arguments
//Use       	defining natural ordering of objects	     need custom comparisons
//Return Value  -, 0, or +  based on this vs other	         -, 0, or + based on a1 vs a2.

//Default (Natural Ordering): String objects ordered alphabetically &Integer objects by numeric value.
//custom comparison; compared objects explicit logic
    }
}