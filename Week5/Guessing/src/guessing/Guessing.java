package guessing;

import java.util.*;

public class Guessing {

    // Creating string constants
    private static final String TOO_HIGH_MARKER = "l";
    private static final String TOO_LOW_MARKER = "h";
    private static final String CORRECT_MARKER = "c";

    public static void main(String[] args) {

        // Using scanner for user input and creating variables
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int randNum;
        int upperLimit = 1000;
        int lowerLimit = 1;
        String myAnswer;

        // Using binary search log2(1000) to guess, system prints out random number to begin guess.
        do {
            randNum = (upperLimit + lowerLimit + 1) / 2;
            System.out.println("I think it's " + randNum);
            myAnswer = in.nextLine(); //Users input determines next guess 

            // If answer guessed is too low, number guess increases
            if (myAnswer.equals(TOO_LOW_MARKER)) {
                lowerLimit = randNum + 1;
                System.out.println("(Guessing higher)");
            }
            // If answer guessed is too high, number guess decreases
            else if (myAnswer.equals(TOO_HIGH_MARKER)) {
                upperLimit = randNum - 1;
                System.out.println("(Guessing lower)");
            }
        } 
        // While the number guessed is correct, close user input and print guess is correct.
        while (!myAnswer.equals(CORRECT_MARKER)); 
        in.close();
        System.out.println("Guess is correct!");
    }
}
