package longestinfile;

import java.util.*;
import java.io.*;

public class LongestInFile {

    public static void main(String[] args) throws FileNotFoundException {
        
        // Using scanner to scan in user input - filepath
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter file path: ");
        String fileName = input.nextLine(); 
        File file = new File(fileName);
        Scanner sc = new Scanner(file); 
        
        // Scans through file and excludes numbers and punctuation
        String[] fileContent = sc.nextLine().replaceAll("[^a-zA-Z ]", "").split("\\s+"); 
        
        // Prints out the longest string in the file
        System.out.println("Longest string is: " + longestString(fileContent)); 
    }

    /* The current length is equivalent to the length of the first string in the file, used to compare. 
    Loops through the strings in the file, if each time the string length is greater than the current 
    length, it replaces current. Longest string becomes the last string greater than the current. */
    public static String longestString(String[] strings) {
        int longString = 0;
        int currentLength = strings[0].length(); 
        for (int i = 1; i < strings.length; i++) { 
            if (strings[i].length() > currentLength) { 
                longString = i; 
                currentLength = strings[i].length();
            }
        }
        // Returns the longest string out of the strings
        return strings[longString]; 
    }
}
