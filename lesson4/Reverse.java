package oop.lesson4;

import java.util.Arrays;

public class Reverse {
    int[] intArray = {1, 2, 3, 4, 5};
    String[] strArray = {"apple", "banana", "cherry", "date"};
    char[] charArray = {'H', 'e', 'l', 'l', 'o'};
    boolean[] boolArray = {true, false, true, false};
    Book[] bookArray = {
            new Book("To Kill a Mockingbird", 40),
            new Book("Flora", 50),
            new Book("The Great Gatsby", 80),
            new Book("Pride and Prejudice", 100)
    };

    public void numberReverse() {
    for (int i = 0; i < intArray.length / 2; i++) {
        int temp = intArray[i];
        intArray[i] = intArray[intArray.length - 1 - i];//swap
        intArray[i] = temp;//reassign
    }
    System.out.println(Arrays.toString(intArray));
}
public void stringReverse() {
        for (int x = 0; x < strArray.length / 2; x++) {
            String temp = strArray[x];
            strArray[x] =strArray[strArray.length - 1 - x];
            strArray[x] = temp;
        }
        System.out.println(Arrays.toString(strArray));
}
public void charReverse() {
    for (int z = 0; z < charArray.length / 2; z++) {
        char temp = charArray[z];
        charArray[z] =charArray[charArray.length - 1 - z];
        charArray[z] = temp;
    }
    System.out.println(Arrays.toString(charArray));
}
public void booleanReverse() {
    for (int y = 0; y < boolArray.length / 2; y++) {
        boolean temp = boolArray[y];
        boolArray[y] =boolArray[boolArray.length - 1 - y];
        boolArray[y] = temp;
    }
    System.out.println(Arrays.toString(boolArray));
}
public void objectReverse (){
        for (int w = 0; w < bookArray.length / 2; w++){
        Book temp = bookArray[w];
        bookArray[w] = bookArray[bookArray.length - 1 - w];
        bookArray[bookArray.length - 1 - w] = temp;
    }
 System.out.println(Arrays.toString(bookArray));
}
public void main(String[]args) {
    Reverse rev = new Reverse();
    // Call each reverse method and print the result
    rev.numberReverse();
    rev.stringReverse();
    rev.charReverse();
    rev.booleanReverse();
    rev.objectReverse();
}
}
class Book {
    String title;
    int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
     public String toString() {//toString is a super class method and \" represent ""
         return  ("\"" +title+ "\""+ "," +"\"" +pages+"\"");
        }
    }