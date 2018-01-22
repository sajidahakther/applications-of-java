package monthlysales;

public class Monthlysales {

    public static void main(String[] args) {

        // Storing the monthly sales values in an array.
        double[] monthlySales = {50000.0, 40000.1, 55000.0, 30000.0,
            250000.2, 600000.2, 450000.0, 36000.0, 28000.0, 15000.1, 700000.2,
            15000.0};

        // Initialising the total sale to 0.
        double TotalSale = 0;

        // For loop iterates through the monthly sales array and adds each
        // index of the array together to calculate the total sale of the year.
        for (int i = 0; i < monthlySales.length; i++) {
            TotalSale = TotalSale + monthlySales[i];
        }

        // Setting the maximum and minimum value to the first index of the array - 50,000.
        double max = monthlySales[0];
        double min = monthlySales[0];

        /* For loop iterates through the monthly sales array length and checks
        the if statements: if the current index is greater than the max value, 
        it becomes the maximum monthly sale. If the current index is smaller 
        than the min value it becomes the minimum monthly sale. */
        for (int j = 0; j < monthlySales.length; j++) {
            if (max < monthlySales[j]) {
                max = monthlySales[j];
            }
            if (min > monthlySales[j]) {
                min = monthlySales[j];
            }
        }

        // Pinting out the results of each, the average has been calcuated by the total sale amount being divided
        // by the length of the array (11 indicies, 12 values).
        System.out.println("Total sale for the year 2016: £" + (TotalSale));
        System.out.println("The average month sales for the year 2016: £" + (TotalSale / monthlySales.length));
        System.out.println("The largest monthly sale: £" + (max));
        System.out.println("The smallest monthly sale: £" + (min));
    }
}
