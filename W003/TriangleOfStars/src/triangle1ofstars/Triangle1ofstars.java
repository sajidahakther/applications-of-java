package triangle1ofstars;

public class Triangle1ofstars {

    public static void main(String[] args) {

        // Nested for loop iterates through the range, increments each time by 1 and prints an extra star until it reaches the end of its range (6)
        int i;
        int j;
        for (i = 1; i <= 6; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Nested loop iterates through the range backwards 'x--', number starts off with 6 then decrements to 1.
        int x;
        int y;
        for (x = 6; x >= 1; x--) {
            for (y = 1; y <= x; y++) {
                System.out.print(y);
            }
            System.out.println();
        }

    }

}
