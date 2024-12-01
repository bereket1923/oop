package oop.lab1;

public class Book {
    public String ISBN;
    public String title;

    // Default constructor
    public Book() {

    }

    // Constructor with all parameters
    public Book(String ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    // Getters and Setters
    public String getISBN() {

        return ISBN;
    }

    public void setISBN(String ISBN) {

        this.ISBN = ISBN;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }
    // Override toString method for meaningful output
    @Override
    public String toString() {
        return ISBN  + title;
    }
}
