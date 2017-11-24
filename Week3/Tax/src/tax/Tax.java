package tax;

public class Tax {

    public static void main(String args[]) {

        // Declaring the double variables, setting values and percentage of tax
        double salary = 80000;
        double salaryAfterTax = 0;
        double fivePercentTax, tenPercentTax, twentyPercentTax;
        double taxRate1, taxRate2, taxRate3, taxRate4;
        
        fivePercentTax = 0.95;
        tenPercentTax = 0.9;
        twentyPercentTax = 0.8;
        
        // If tatement checks if the salary is less than or equal to 15000, [0%] tax is paid.
        if (salary <= 15000) {  
            taxRate1 = salary;
            salaryAfterTax = taxRate1;
            
        // Else if the salary is greater than 15000 but less than or equal to 30000, [5%] tax is paid.
        } else if (salary > 15000 && salary <= 30000) { 
            taxRate1 = 15000;
            taxRate2 = (fivePercentTax * (salary - taxRate1));
            salaryAfterTax = taxRate1 + taxRate2;
            
        // If the salary is greater than 3000 but less than or equal to 50000, [10%] tax is paid.
        } else if (salary > 30000 && salary <= 50000) { 
            taxRate1 = 15000;
            taxRate2 = (fivePercentTax * 15000);
            taxRate3 = (tenPercentTax * (salary - 30000));
            salaryAfterTax = taxRate1 + taxRate2 + taxRate3;
            
        // If the salary is beyond 50000, [20%] tax is paid. Calculating 20% tax and subtracting 
        // this off the salary. Storing this amount inside salaryAfterTax - the amount recieved.
        } else {    
            taxRate1 = 15000;
            taxRate2 = (fivePercentTax * 15000);
            taxRate3 = (tenPercentTax * 20000);
            taxRate4 = (twentyPercentTax * (salary - 50000));
            salaryAfterTax = taxRate1 + taxRate2 + taxRate3 + taxRate4;
        }

        System.out.println("Salary: £" + salary);
        System.out.println("Salary after tax: £" + salaryAfterTax);
        System.out.println("Total tax paid: £" + (salary - salaryAfterTax));
    }

}
