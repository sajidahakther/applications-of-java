package com.company;
import java.io.*;
import java.util.*;

public class Main {
        static public void main(String[] args) {
            // using hashset to remove duplicates
            Set<String> words = new HashSet<String>();

            // removes punctuation, spacing
            String delim = " \t\n.,:;?!-/()[]\"\'";
            String line;

            // counter used to count the amount of words/string
            int count = 0;

            try{
                // insert file path/name, scan the file and read it line by line
                FileReader fin = new FileReader("/Users/sajidahakther/Desktop/untitled/src/com/company/text.txt");
                Scanner in = new Scanner(fin);
                while (in.hasNextLine()) {
                    line = in.nextLine();
                    StringTokenizer st = new StringTokenizer(line, delim);

                    // count the number of words and make them lowercase
                    while (st.hasMoreTokens()) {
                        count++;
                        words.add(st.nextToken().toLowerCase());
                    }
                }
            } catch (Exception e) {
                // if file is not found, throw exception
                System.out.println(e.toString());
            }

            // prints the number of words in the file to begin with
            System.out.println(count);

            // prints the number of words left after removing duplicates, punctuation etc.
            System.out.println(words.size());
        }

}

