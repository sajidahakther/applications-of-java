package exercise2;

public class Exercise2 {

    public static void main(String[] args) {
        // An array of numbers
        int[] numbers = {1, 100, 200, 300, 250, 216, 500, 1000, 400};
        
        // Prints out true if the numbers in the array are sorted in an ascending order, or false if they are not.
        System.out.println(isSorted(numbers));
    }

    public static boolean isSorted(int[] a) {
        /* For loop goes through the length of the array, and checks if the index before the current index 
        is greater than the current index. Returns false if the array is not in an ascending order. */
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                return false;
            }
        }
        // Returns true if the previous index is not greater than the current index.
        return true;
    }

}
