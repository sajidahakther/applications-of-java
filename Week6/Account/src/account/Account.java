package account;

public class Account {

    // Setting the variables as a String, integer, double. Setting the counter to 0 by default.
    String name;
    int accountNumber;
    Double Balance;
    static int counter = 0;

    /* First constructor with only the name as the arguement, the counter is being incremented,
    the name is set to the name of the arguement, the account number is set to 1 by default and  
    the balance is £0.0 by default since there is no arguement to set these class variables. */
    Account(String _name) {
        counter++;
        this.name = _name;
        this.accountNumber = 1;
        this.Balance = 0.0;
    }

    /* Second constructor includes the name and account number as arguements, the counter is incremented, the name and 
    account number are set as the arguements, and the balance is set to £0.0 by default since there is no arguement for it. */
    Account(String _name, int _accountNumber) {
        counter++;
        this.name = _name;
        this.accountNumber = _accountNumber;
        this.Balance = 0.0;
    }

    /* Third constructor includes the name and balance as arguements, the counter is incremented, the name and 
    balance are set as the arguements, and the account number is set to 3 since there is no arguement for it. */
    Account(String _name, double _balance) {
        counter++;
        this.name = _name;
        this.Balance = _balance;
        this.accountNumber = 3;

    }

    /* Fourth constructor includes the name, account number and balance as arguements, the counter 
    is incremented. The name, balance, account number are set as the arguement. */
    Account(String _name, int _accountNumber, double _balance) {
        counter++;
        this.name = _name;
        this.accountNumber = _accountNumber;
        this.Balance = _balance;
    }

    //SETTERS - used 'this' to SET the class variables to the arguements of the constructor
    void setName(String name) {
        this.name = name;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setBalance(double Balance) {
        this.Balance = Balance;
    }

    //GETTERS - GETS the string name, integer account number and double balance and returns the name, account number and balance.
    String getName() {
        return name;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return Balance;
    }

    /* Created a method to deposit money into the account, takes the balance and adds the deposit money and returns the updated balance */
    public double deposit(double _deposit) {
        this.Balance = this.Balance + _deposit;
        return this.Balance;
    }

    /* Created a method to withdraw money from the account, it checks the balance, if the balance is greater than the amount to withdraw
    then the amount to withdraw gets deducted from the balance amount, and the system prints amount successfully being withdrawn.
    However, if the balance is less than the amount to withdraw, then the withdraw process is unable to be carried out and therefore,
    the system prints "insufficient funds..." */
    public double withdrawl(double _withdrawal) {
        if (this.Balance >= _withdrawal) {
            this.Balance -= _withdrawal;
            System.out.println("Successfully withdrawn from Account Number: " + this.getAccountNumber());
        } else {
            System.out.println("Insufficient funds, unable to withdraw from Account Number: " + this.getAccountNumber());
        }
        return this.Balance;
    }

    // To string the format in which the accounts are printed, the name, account and balance
    public String toString() {
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: £" + Balance;
    }

    void printAccount() {
        System.out.println(toString());
    }

}
