package exercise4;

public class Exercise4 {

    public static void main(String[] args) {

        // For loop decrements from 100 to 0 and checks if there are any prime numbers.
       for (int number = 100; number > 0; number--) {
        int flag = 0; 
        
        // Creating a variable which takes the value of an integer besides the 'number' itself.
        int besidesItsSelf = number - 1;
        
        // For loop increments from 2 upto the 'number'-1.
        for (int i = 2; i <= besidesItsSelf; i++) {
            
            /* Checks if the number modulo any of the incrementing number(s) equal to 0, if any does 
            then the number is not prime, since a prime number can only be divisible by itself and 1 */
            if (number % i == 0) {
                System.out.println(number + " Number is not prime");
                flag = 1;
                break;
            }
        }
        // If else, the number is prime.
        if (flag == 0) {
            System.out.println(number + " Number is prime");
        }
       }
    }
}
