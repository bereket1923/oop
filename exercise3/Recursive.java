package oop.exercise3;
//recursion//
//solving a problem by reducing it to simpler forms of the same problem
//until the simplest form (base case) is reached.

public class Recursive {
    public int sum(int N) {

        if (N == 1) {//without base method stack over-flow error happen
            return 1;

        } else {
            return N + sum(N - 1);//recursive way
        }
    }
//        int total = 0;
//        for (int i =1;i<=N;i++){//iterative way
//          total =total + i;
//          return total;
public int count(int N) {
    // Base case: when N reaches 0 or less, stop the recursion
    if (N == 1) {
        return 1;
    }
    // Recursive call with N - 1
   return 1+ count(N - 1);
}
    public String reverse(String s) {
        // 1. Base Case
        if (s == null || s.isEmpty()) {// s.isEmpty() same as s.length == 0;
            return "";//Empty string (""): means it is initialized but has no content, has empty output
        }//null has not been initialized with any value has Throws NullPointerException
        // 2. Recursive Call
        String sub = s.substring(1);

        // 3. Trust the Recursive Call
        // reverse(sub) is expected to return the reverse of the substring without the first character.

        // 4. Construct the Solution
        // We add the first character (s.charAt(0)) to the end of the reversed substring.
        return reverse(sub) + s.charAt(0);
    }
    //In the findMin method, the comparison happens between:
    // The first character of the current string (str.charAt(0)).
    // The minimum character of the rest of the string (findMin(str.substring(1))).

    public char findMin(String str) {
        // Base Case: If the string has only one character, return it.
        if (str.length() == 1) {//s.length() is not a method; it is a built-in property of the String class
            // that returns the number of characters in the string
            return str.charAt(0);
        } else {

            return  (str.charAt(0) < findMin(str.substring(1)))? str.charAt(0):findMin(str.substring(1));

            //findMin is a user method finding the minimum character in a string.
            }
    }
    public char findMax(String str) {
        if(str.length()== 1){
            return str.charAt(0);
        }
        else{
            return str.charAt(0)>findMax(str.substring(1))? str.charAt(0):findMax(str.substring(1));
        }
    }
    public int length(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        return 1 + length(s.substring(1));
    }
    public int sumEven(int n) {
        // Base Case: n is 2 as smallest even number
        if (n == 2) {
            return 2;
        }
        // Recursive Call: Add n  to the sum of even numbers up to n-2.
        return n + sumEven(n - 2);//call the method itself (see sumEven)
    }
    public int sumOdd(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOdd(n - 2);
    }
    public static int gcd(int a, int b) {
        // Base case: If second number becomes 0, return the first number
        if (b == 0) {
            return a;
        }
        // Recursive call: GCD of b and remainder of a divided by b
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Recursive r = new Recursive();

        int[] arr = {2, 8, 3, 5};

        // Testing the sum method
        int result = r.sum(5);
        System.out.println("Sum of numbers from 1 to 5: " + result); // Output: 15

        // Testing the reverse method
        System.out.println("Reversed 'hello': " + r.reverse("hello"));

        // Testing the findMin method
        System.out.println("Minimum character in 'zebra': " + r.findMin("zebra"));

        // Testing the length method
        System.out.println("Length of 'hello': " + r.length("hello"));

        // Testing the sumEven method
        System.out.println("Sum of even numbers up to 8: " + r.sumEven(8));

        // Testing the sumOdd method
        System.out.println("Sum of odd numbers up to 7: " + r.sumOdd(7));

        //testing findMax
        System.out.println("the maximum character in best is : " + r.findMax("best"));

        //test some notes
        String str = null;
        String am = "";
        System.out.println(str.length()); // Output: 0
        System.out.println(am.length());// output:NullPointerException


    }
}
//for reverse   call               substring     return
//First Call: reverse("hello")    → "ello"       → "ello" + 'h'
//Second Call: reverse("ello")     → "llo"        → "llo" + 'e'
//Third Call: reverse("llo")       → "lo"         →  "lo" + 'l'
//Fourth Call: reverse("lo")       → "o"          → "o" + 'l'
//Fifth Call: reverse("o")          N/A            → returns "o" (base case)
//reverse result = o+l+l+e+h = olleh
//substring(0) would return the entire string
//Recursive calls: repeat the same process on a smaller or simpler version of the problem.
//Return: control this process by stopping the recursion once base case is reached
// and by returning values as the recursion unwinds(finish).


//For strings (s): The base case could be when the string is empty ("")//length ==0 or has length 1.
// e.g1 String s = "";
//System.out.println(s.length()); // Output: 0
//this is a base case because an empty string cannot be reduced further.
//e.g2 String s = "a";
//System.out.println(s.length()); // Output: 1
//this is a base case because  single string cannot be reduced further.
//Integers: We reduce by N-1 because it’s natural to count down and reach the base case (0 or 1).
//Strings: We usually remove the first character (s.substring(1))
// because it’s easier to access and manipulate the first character (s.charAt(0)) than the last

//recursive thinking//
//1.Determine the Base Case:simplest instance problem and solved without recursive call
//Why is it important? It prevents infinite recursion by giving the function a stopping point.
//for integer base =0 or 1 & for string and array, length =0 or 1

//2.make recursive call: calling the same function but with a reduced input
//for integer = n-1, for string substring(1), for array subarray[1]

//3.Trust the Recursive Call:Focus on how can use recursive call result to solve the current problem.

//4.make construction: combining the current input with the result of the recursive call.
//current element for integer =N, for string s,charAt(0), for array arr[0]