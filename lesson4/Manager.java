package oop.lesson4;

 public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super (name, salary);
        this.bonus = bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

     @Override
     //Covariant return; the return type overridden method is subtype of return type superclass.
     // covariant return types work only for non-primitive types, such as classes and interfaces
     //Manager covariant to Employee

    public Manager getEmployee(){
        return new Manager("anne",300,400);
    }
    @Override
    // purpose: Clarity for Other Developers (or Yourself in the Future)
    //Provides a compiler check that your method really is overriding a superclass method

    public double monthlyPay () {
        return super.getSalary() + this.bonus;//or super.monthlyPay + this.bonus
    }
    public boolean equals(Object a) {// a is a variable
        if (a == null)
            return false;
        if (!(a instanceof Manager))
            return false;
        Manager another = (Manager) a;
       return this.getName().equals(another.getName())
                && this.getSalary()==(another.getSalary())
                && this.bonus==(another.bonus);

        //String s1 = new String("hello");
        //String s2 = new String("hello");
        //
        //System.out.println(s1 == s2); // Output: false (different references)
        //System.out.println(s1.equals(s2)); // Output: true (same content)
        //
        //String s3 = "hello";
        //String s4 = "hello";
        //string literals are stored in a special memory area called the string pool.
        //System.out.println(s3 == s4); // Output: true (same reference, string pool)
        //System.out.println(s3.equals(s4)); // Output: true (same content)
        //
        // for primitive type we can not use equals instead use == and for string we can use both
        //but == indicates check the content and equals checks if they refer to the same object
      //  System.out.println(emp1.equals(p));//out put is illegalException b/c employee is can not
        //  be cast to person
    }
    public static void main(String[] args) {
        Manager m = new Manager("Boss Guy", 80000, 5000);
        Employee ef = new Manager("abee",400,300);
        m.equals(ef);
        System.out.println( m.equals(ef));
       // f.setBonus();// error because the static type of e is Employee,
        // so the compiler treats e as if it’s just an Employee
        // and doesn’t know about any additional methods that Manager might have.


        Employee[] staff = new Employee[3];
        staff[0] = m;//here is polymorphism/subclass first executed
        staff[1] = new Employee("Jimbo", 50000);
        staff[2] = new Employee("Tommy", 40000);
        Person p = new Person();
        // print names and salaries//which one is first executed?
        for (Employee e : staff) {
            System.out.println("name: " + e.getName() + " salary: " + e.monthlyPay());
          // overridden equals() compares the values of their fields
            Employee emp1 = new Employee("Joe", 700);
            Employee emp2 = new Employee("Joe", 5000);
            Employee emp3 = emp1; // emp3 is assigned the reference of emp1

            System.out.println(emp1 == emp2);       // false (different memory locations)
            System.out.println(emp1.equals(emp2));   // true (same content)
           ////equals() without override b/c default equals compares references
            System.out.println(emp1 == emp2);        // false b/c different objects in memory
            System.out.println(emp1.equals(emp2));   // false
            System.out.println(emp1 == emp3); // true, same reference


        }
    }
}
//protected access to subclasses (in any package) as well as to any classes within the same package.
//package-private (default) limits access strictly to classes within the same package.

//special note//

//Key Components of the Java Standard Library://
//java.lang
//
//Contains fundamental classes that are automatically imported.
//Examples: String, Math, Object, Thread, Character, System.
//java.util
//
//Provides collections framework (lists, sets, maps, etc.), utility classes, and date/time functionality.
//Examples: ArrayList, HashMap, Date, Calendar, Collections, Iterator.
//java.io
//
//Deals with file and data stream I/O.
//Examples: File, FileReader, BufferedReader, PrintWriter, ObjectInputStream.
//java.nio
//
//Provides a new I/O API for handling file I/O, buffers, and channels.
//Examples: Path, Files, ByteBuffer, FileChannel.
//java.net
//
//For networking and URL handling.
//Examples: Socket, ServerSocket, URL, URLConnection, HttpURLConnection.
//java.awt
//
//Provides classes for creating graphical user interfaces (GUI) and window-based applications.
//Examples: Frame, Button, Graphics, Color.
//javax.swing
//
//Extends java.awt and provides more modern GUI components like buttons, tables, and text fields.
//Examples: JFrame, JButton, JPanel, JTextField.
//java.sql
//
//Provides classes for database connectivity and handling SQL operations.
//Examples: Connection, Statement, ResultSet, PreparedStatement.
//java.time
//
//Introduced in Java 8 for handling modern date and time functionality.
//Examples: LocalDate, LocalTime, Instant, Duration.
//java.util.concurrent
//
//Contains utility classes for multi-threading and concurrency.
//Examples: ExecutorService, Future, CountDownLatch, ConcurrentHashMap.


//Java Collections Framework://

//Collection
//
//The root interface in the collection hierarchy. It represents a group of objects.
//List
//
//An ordered collection that allows duplicates and maintains the order of elements
// (e.g., ArrayList, LinkedList).
//Set
//
//A collection that does not allow duplicate elements (e.g., HashSet, TreeSet).
//Queue
//
//A collection designed for holding elements prior to processing (e.g., LinkedList, PriorityQueue).
//Deque (Double Ended Queue)
//
//A queue that allows elements to be added or removed from both ends (e.g., ArrayDeque).
//Map
//
//A collection that maps keys to values, where each key is associated with exactly one value
// (e.g., HashMap, TreeMap).


//Java Virtual Machine (JVM)//
//Parts of the JVM (In Short):
//Class Loader Subsystem:
//
//Loads and initializes Java classes into memory.
//Runtime Data Area (Memory):
//
//Method Area: Stores class metadata and static variables.
//Heap: Allocates memory for objects (managed by Garbage Collector).
//Stack: Stores method calls, local variables, and execution state for each thread.
//Program Counter (PC) Register: Tracks the current instruction for each thread.
//Native Method Stack: Handles non-Java (native) method calls.
//Execution Engine:
//
//Interpreter: Executes bytecode line by line.
//JIT Compiler: Converts frequently used bytecode into native machine code.
//Garbage Collector: Reclaims unused memory.
//Native Interface:
//
//Connects Java code with native libraries (e.g., C/C++).