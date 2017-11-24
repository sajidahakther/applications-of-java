package exercise5;

import java.util.*;

public class Exercise5 {

    public static void main(String[] args) {
        // The input to find the word occurences for
        String input = "Studying at Goldsmiths College University of London Students need to work harder to achieve a first class degree at Goldsmiths";
        wordOccurrences(input);
    }

    private static void wordOccurrences(String input) {
        // Lists the words in string
        List<String> Words = Arrays.asList(input.split(" "));
        
        // Compares and determines whether the word is already in the set or not
        Set<String> st = new HashSet<String>(Words);
        System.out.println("Word Occurences:");
        
        // For each loop checks for duplicates of the string by comparing each word
        for (String eachWord : st) {
            
            // Prints out the word and it's total number of occurence
            System.out.println(eachWord + " " + Collections.frequency(Words, eachWord));
        }
    }
}
