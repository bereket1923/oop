package oop.lab1;

public class LibraryMember {
    private Book[] checkoutBooks;
    private int count;
    private String id;
    private String name;

    // Default constructor
    public LibraryMember() {
        this.checkoutBooks = new Book[4]; //size depends on
        this.count = 0;
    }

    // Constructor with all parameters
    public LibraryMember(String id, String name) {
        this.id = id;
        this.name = name;
        this.checkoutBooks = new Book[4];//If we don't want to fix the size of the checkoutBooks array,
        // we can pass it as a parameter in the constructor. now is limited as a constant
        this.count = 0;
    }

    // Getters and Setters
    public Book[] getCheckoutBooks() {//add book to the borrow list

        return checkoutBooks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    public void setCheckoutBooks (Book[] ab){
        this.checkoutBooks =ab;
    }
    // Method for checkout a book
    public void checkout(Book book) {//Book is data type and book is variable name
        for (int i = 0; i < checkoutBooks.length; i++) {
            if (checkoutBooks[i] == null) {//Book default value(first no thing found)
                checkoutBooks[i] = book; // Assign the book to the first available spot
                count++;
                return;// no return type just Exits the method after assigning the book
            }
        }
    }
    public static void main(String[] args) {
        Book book1 = new Book("786546", "best");
        Book book2 = new Book("67589","honey");

        LibraryMember member = new LibraryMember("A21", "John Doe");
        // Checkout the two books
        member.checkout(book1);
        member.checkout(book2);
        Book[] books = member.getCheckoutBooks();
        System.out.println(books [0]);
        System.out.println(books [1]);
        System.out.println(member.getCheckoutBooks()[3]);



    }
}
