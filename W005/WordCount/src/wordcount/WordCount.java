package wordcount;

import java.io.*;
import java.util.*;

public class WordCount {

    public static void main(String[] args) // Throws IO Exception
    {
        try {
            // Using scanner to scan users input - file path
            Scanner input = new Scanner(System.in);
            System.out.print("Enter file path: ");
            String fileName = input.nextLine();
            File file = new File(fileName);
            Scanner sc = new Scanner(new FileInputStream(file));

            // Creating a counter and setting it to 0 by default.
            int count = 0;

            /* While loop goes through each string of the file, count is incremented till it 
            reaches the last string. Then it prints out the total number of words. */
            while (sc.hasNext()) {
                sc.next();
                count++;
            }
            System.out.println("File word count: " + count);
        } catch (Exception e) {
            // If file is not found, it prints out file not found.
            System.out.println("File not found");
        }
    }

}
