package fileinfo;

import java.io.*;
import java.util.*;

public class FileInfo {

    // Declaring variables for the word and occurence, used for the top 20 words in file, and setting their defauly value to null.
    private static String[] w = null;
    private static int[] o = null;

    public static void main(String[] args) {
        /* Using hashmap to find the word and their occurences as it finds the strings and integers, and using hashset to find the number
        of different words as it creates an object that is a hashset instance then assigns a reference to the object to a variable string. */
        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        Set<String> differentWords = new HashSet<>();

        // Creating a counter and setting it to 0
        int count = 0;

        /* Entered filepath for filereader to scan through and read each line, whist it's being read it breaks the string into tokens 
        (i've done this by creating a string tokenizer) and it changes the next token into a lower case. the counter then increments 
        as the word has been added. */
        String delimiter = " ,:?!/[].;\t\n";
        try {
            FileReader file = new FileReader("input.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                StringTokenizer st = new StringTokenizer(line, delimiter);
                while (st.hasMoreTokens()) {
                    String word = st.nextToken().toLowerCase();
                    count++;

                    /* Checks if there are any different words, and how many times the words are being 
                    repeated within the file (duplicates), when it has found a different word, it gets the
                    word and add the word to the wordmap which later prints out the number of different words. */
                    differentWords.add(word);
                    if (wordMap.containsKey(word)) {
                        wordMap.put(word, wordMap.get(word) + 1);
                    } else {
                        wordMap.put(word, 1);
                    }
                }
            }
            // Closing scanner
            in.close();
        } catch (Exception e) {
            e.toString();
        }

        // Printing out the output for the tests, word count, different words, word occurences and the top 20 most used words in the file.
        System.out.println("Total number of words in file: " + count);
        System.out.println();
        System.out.println("Total number of different words in file: " + differentWords.size());
        System.out.println();
        System.out.println("Word occurences in file: " + wordMap);
        System.out.println();
        System.out.println("Top 20 most used words in the file: ");

        try {
            // Scans in 20, to find 20 words in the file with the highest word occurence and prints this out in order.
            Scanner in = new Scanner("20");
            int num = in.nextInt();
            w = new String[num];
            o = new int[num];

            // Reads through the file input by line, whilst the next line is not null, merge text with st
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);
            String text = "";
            String st = null;
            while ((st = br.readLine()) != null) {
                text = text.concat(st);
            }

            // Creating string variables, word stores text split function
            String[] words = text.split(" ");
            String[] uniqueLabels;

            // Resetting counter to 0 to count the top 20 words. Each time the the occurence is less than the number, the number of occurence is set to 0.
            int counter = 0;
            uniqueLabels = getUniqueLabels(words);
            for (int j = 0; j < num; j++) {
                o[j] = 0;
            }

            // If the string is non-existent or equal to null, break.
            for (String l : uniqueLabels) {
                if ("".equals(l) || null == l) {
                    break;
                }
                
                // Goes through each string in the file, when it finds a match the counter is incremented.
                for (String s : words) {
                    if (l.equals(s)) {
                        counter++;
                    }
                }
                
                // If the counter is greater than the number of occurence for that word, set the occurence number to the counter.
                for (int i = 0; i < num; i++) {
                    if (counter > o[i]) {
                        o[i] = counter;
                        w[i] = l;
                        break;
                    }
                }
                // Resetting counter
                counter = 0;
            }
            display(num);
        } catch (Exception e) {
            System.err.println("Error " + e.getMessage());
        }
    }
    
    // Displaying the top 20 words in order, by printing the amount of times a word has occured, followed by the word itself.
    public static void display(int num) {
        for (int k = 0; k < num; k++) {
            System.out.println("Occurence: " + o[k] + ", Word: " + w[k]);
        }
    }
    
    /* Get a unique label for the keys, goes through first index of the key and sets it already ecisting to false
    Then goes through the key's array length and if the inde of the key matches the unique key, it changes the boolean
    to true - as it's show the key now aleady exists. If the key exits, the number of the uniqekeyindex increments and it's
    total number of matches is returned - this counts the occurence for each word. */
    private static String[] getUniqueLabels(String[] keys) {
        String[] uniqueKeys = new String[keys.length];
        
        
        uniqueKeys[0] = keys[0];
        int uniqueKeyIndex = 1;
        boolean keyAlreadyExists = false;

        for (int i = 1; i < keys.length; i++) {
            for (int j = 0; j <= uniqueKeyIndex; j++) {
                if (keys[i].equals(uniqueKeys[j])) {
                    keyAlreadyExists = true;
                }
            }

            if (!keyAlreadyExists) {
                uniqueKeys[uniqueKeyIndex] = keys[i];
                uniqueKeyIndex++;
            }
            keyAlreadyExists = false;
        }
        return uniqueKeys;

    }
}
