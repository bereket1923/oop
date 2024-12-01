package oop.lab10;

import java.util.*;

public class Sentence{
        private List<String> words;
    public Sentence(){
            this.words = new ArrayList<String>();
        }

    public boolean add(String word) {//adds word to the current sentence
       return words.add(word);
    }
    public String toString() {//sentence with each word separated by space and ends with a period
        if (words.isEmpty()) {
            return "";
        }
        return String.join(" ", words) + ".";
    }
    // Counts the number of words in the sentence
    public int count() {
        return words.size(); // Use List's size() method
    }
       //Method to create a map of word lengths
   public Map<String, Integer> wordLengthMap(){
      Map<String, Integer> wordLength = new HashMap<>();
      for(String word: words){
          wordLength.put(word, word.length());//key is word and value is word length
      }
       return wordLength;
     }
     // Method to count character occurrences
    public Map<Character, Integer> characterCountMap() {
        Map<Character, Integer> CountChar = new HashMap<>();
        String word = this.toString();//change word to sentence
        for (char c : word.toCharArray()) {
            if (c == ' ' || c == '.') {
                continue;
            }
            if (CountChar.containsKey(c)) {
                CountChar.put(c, CountChar.get(c) + 1);
            }
            else CountChar.put(c, 1);
        }
        return CountChar;
    }
    public String findMin() {
        String min = words.get(0);
        for (String word : words) {
            if (word.compareTo(min) < 0) {
                min = word;
            }
        }
        return min;
    }
    //sort() sorts the words in alphabetic order (a – z)
    public void sort() {
        Collections.sort(words);
    }
    //sortByLength() sorts the words by their length.
    public void sortByLength() {
        Collections.sort(words, new WordLengthComparator());
    }
    public static void main(String[] args) {
        Sentence s = new Sentence();

        // Test adding words
        System.out.println(s.add("best")); // true
        System.out.println(s.add("coat")); // true
        System.out.println(s.add("apple")); // true
        System.out.println(s.add("zebra")); // true

        // Test count
        System.out.println("Word count: " + s.count()); // 4

        // Test toString
        System.out.println("Sentence: " + s.toString()); // best coat apple zebra.

        // Test word length map
        System.out.println("Word Length Map: " + s.wordLengthMap());

        // Test character count map
        System.out.println("Character Count Map: " + s.characterCountMap());

        // Test findMin
        System.out.println("Smallest word: " + s.findMin()); // apple

        // Test sort
        s.sort();
        System.out.println("Sorted sentence: " + s.toString()); // apple best coat zebra.

        // Test sortByLength
        s.sortByLength();
        System.out.println("Sorted by length: " + s.toString()); // best coat apple zebra.
    }
}
