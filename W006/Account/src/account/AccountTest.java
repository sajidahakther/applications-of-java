package account;

public class AccountTest {

    public static void main(String[] args) {

        Account AC001 = new Account("Sajidah Akther");
        Account AC002 = new Account("Alexander Wang", 2);
        Account AC003 = new Account("Elle Bonheur", 96563.00);
        Account AC004 = new Account("Steve Harrington", 4, 4.00);

        // Prints out the current state of the accounts 1-4.
        System.out.println("Current accounts: " + (Account.counter));
        AC001.printAccount();
        AC002.printAccount();
        AC003.printAccount();
        AC004.printAccount();

        // Using Account 2 to test all of the methods in the Account class
        System.out.println();
        System.out.println("Alexander Wang - Account Statement:");
        AC002.printAccount();

        /* Sets the name of Account 2 to Alexander Wang, the account number to 2, 
        the balance to £20.00. Then prints out Account 2 with the updated data. */
        AC002.setName("Alexander Wang");
        AC002.setAccountNumber(2);
        AC002.setBalance(20.0);
        AC002.printAccount();

        // Deposits £100.00 into acount 2 and prints the account with the updated data
        AC002.deposit(100.00);
        AC002.printAccount();

        // Command to withdraw £300.00 from the account. Account 2 does not contain 300.00 so it throws the error
        AC002.withdrawl(300.00);

        // Command to withdraw 50.00 from the account, account successfully withdraws money as it contains 50.00
        AC002.withdrawl(50.00);

        // Prints the account with the updated data
        AC002.printAccount();
    }
}
