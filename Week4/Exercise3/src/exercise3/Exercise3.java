package exercise3;

public class Exercise3 {

    public static void main(String[] args) {
        // An array of numbers
        int[] numbers = {1, 100, 200, 300, 250, 216, 500, 1000, 400};
        System.out.println(duplicates(numbers));
    }

    static boolean duplicates(int[] num) {

        // Setting the default of found to false, it will only change and return true if duplicates are found.
        boolean found = false;

        // Nested for loop searches through the array indices and checks if any index of the array match/equal to each other.  
        for (int i = 0; i < num.length - 1 && !found; i++) {
            for (int j = i + 1; j < num.length && !found; j++) {

                // If the indices of i and j do match, this means duplicates have been found and therefore it returns true.
                if (num[i] == num[j]) {
                    found = true;
                }
            }
        }
        return found;

    }

}
