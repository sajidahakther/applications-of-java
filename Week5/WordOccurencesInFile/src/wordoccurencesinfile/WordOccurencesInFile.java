package wordoccurencesinfile;

import java.io.*;
import java.util.*;

public class WordOccurencesInFile {
    
    // Creating a counter and setting it to 0 by default
    static int count = 0; 

    public static void main(String[] args) throws FileNotFoundException {
        try {
            // Using scanner to scan users input - file path
            Scanner input = new Scanner(System.in); 
            System.out.print("Enter file path: ");
            String fileName = input.nextLine(); 
            File file = new File(fileName);
            Scanner sc = new Scanner(new FileInputStream(file));
            
            /* Input the word typed in by the user, while loop goes through the string of the file.
            Checks if any of the strings in the file match the word. Count increments when match is found. */
            System.out.print("Type in a word: ");
            String word = input.nextLine(); 
            while (sc.hasNext()) { 
                if (sc.next().equals(word)) { 
                    count++; 
                }
            }
            // Prints out the word occurence for the word entered by user
            System.out.println("Word Occurence for '" + word + "' is: " + count); 
            
        } catch (Exception e) {
            // If file does not exist or file path is incorrect, print file not found
            System.out.println("File not found"); 
        }
    }
}
