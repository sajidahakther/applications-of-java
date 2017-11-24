package exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        // An array of strings
        String[] stringArray = {"computing", "at ", "Goldsmiths", "College",
            "University", "of", "London", "New Cross", "London", "SE14 6NW"};
        
        // Prints the string within the stringArray that has the most characters.
        System.out.println(longestStringInArray(stringArray));
    }

    public static String longestStringInArray(String[] stringArray) {
        
        // Setting the default values for maxLength and longestString 
        int maxLength = 0;
        String longestString = null;

        /* Loops through the stringArray indices, and checks if index 'a' is greater than 0 (maxLength), 
        maxLength takes up 'a's value. This loop continues until it reaches the greatest character length. 
        Then longestString is assigned the final 'a' value. */
        for (String a : stringArray) {
            if (a.length() >= maxLength) {
                maxLength = a.length();
                longestString = a;
            }
        }

        return longestString;
    }
}
