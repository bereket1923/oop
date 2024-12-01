package oop.exercise3;

import java.util.Arrays;
//data type//                                  //base return type//
//count                                      return 0;
// int                                       return 0;
//double/float                               return 0.0;
//long                                       return 0l;
//string                                     return "" or null
//char                                       return '\0';
//character/ is class/                       return null;
//object/class                               return null;
//list,array,map                             return [] or null;
//boolean                                    return false;

public class ArrayRecursive {

    public int sum(int[] arr) {//if the parameters are string, sum changes into concatenate method
        if (arr.length == 0) {
            return 0;
        }//1 is starting index and arr.length is ending index
        int[] subArr = Arrays.copyOfRange(arr, 1, arr.length);//the rest integer excluding index 0
        int a = sum(subArr);//sum the rest array of integer excluding index 0
        return a + arr[0];
    }

    // the number of elements in the array.
    public int count(int[]arr){

        if(arr.length == 0){
            return 0;
        }
        int[]subArr=Arrays.copyOfRange(arr,1,arr.length);//create a new array contains a subset of elements
        int b =count(subArr);//count is user method
        return 1 + b;
    }

    //the number of digits (‘0’-‘9’) in the string digits
    public int count(String digits) {
        // Base case
        if (digits == null || digits.isEmpty()) {
            return 0;
        }
        // Check if the first character is a digit
        char firstChar = digits.charAt(0);
        int countForCurrentChar = Character.isDigit(firstChar) ? 1 : 0;
        //we can not use any variable name instead of character
        // b/c isDigit a static method for character class

        // Recursive call for the rest of the string
        return countForCurrentChar + count(digits.substring(1));
    }

    //returns true if ch is in str, false otherwise;
    boolean find(String str, char ch) {

        if (str.isEmpty()) {
            return false;
        }
        if (str.charAt(0) == ch) {
            return true;
        }
        return find(str.substring(1), ch);//find is user-defined method
    }

    //the product of all integers between m and n (n >=m)
    public int product(int m, int n) {
        // Base case: If m is equal to n, return m (or n)
        if (n == m) {
            return m;
        }
        // Recursive case: Multiply m by the product of integers from (m + 1) to n
        return m * product(m + 1, n);
    }

    //change the lower case letters to upper case and upper case letters to lower case
    String flip(String str) {
        // Base case
        if (str.isEmpty())
            return "";

        // Process the first character: Flip its case
        char first = str.charAt(0);
        char flippedChar = Character.isLowerCase(first) ? Character.toUpperCase(first) : Character.toLowerCase(first);
            // ternary conditional operator
        // Recursive call: Process the rest of the string
        return flippedChar + flip(str.substring(1));
    }
    //number of char in the string
    public static int count(String str, char ch) {
        // Base case: if the string is empty, return 0
        if (str.isEmpty()) {
            return 0;
        }
        // Check if the first character matches the target character
        int countForThisCharacter = (str.charAt(0) == ch) ? 1 : 0;

        // Recursive call on the rest of the string
        return countForThisCharacter + count(str.substring(1), ch);
    }

//optional
    public int findMax(int[] arr, int n) {// n is size of array
        // Base Case: If there's only one element, return it as the maximum.
        if (n == 1) {
            return arr[0];
        }

        // Recursive Call: Find the maximum in the first (n-1) elements.
        int max = findMax(arr, n - 1);//like substring in string example

        // Compare the last element (arr[n-1]) with the maximum of the rest.
        return Math.max(arr[n - 1], max);
    }

    public int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int min = findMin(arr, n - 1);
        return Math.min(min, arr[n - 1]);
    }
    public static void main(String[] args) {
        ArrayRecursive r = new ArrayRecursive();


        int[] arr = {2, 8, 3, 5};

        //test count
        System.out.println(r.count(arr));
        //count
        System.out.println(r.count("1ab45"));
        // sum test
        System.out.println(r.sum(arr));
        //flip
        System.out.println(r.flip("hello"));
        //product
        System.out.println(r.product(4,8));
        //find
        System.out.println(r.find("wild",'e'));

        //Test findMax
        System.out.println("Maximum element: " + r.findMax(arr, arr.length));
        System.out.println("Maximum element: " + r.findMin(arr, arr.length));
    }
}

//condition ? value_if_true : value_if_false;
//char flipped = Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch);