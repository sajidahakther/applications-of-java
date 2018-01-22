package bank;

public abstract class Account {

	protected String id; //stores the account ID
    protected double balance; //stores the account balance

    public Account(String id, double balance) { //initialising the accounts attributes id and balance
        this.id = id;
        this.balance = balance;
    }

    public String getID() {
        return id; //function returns the account ID
    }

    public double getBalance() {
        return balance; //returns the account balance
    }

    @Override
    public String toString() {
        return "Account {" + "ID: " + id + ", Balance: " + balance + '}'; //returns a string containing the ID and account balance
    }

    //abstract methods to be implemented by sub-classes
    public abstract boolean withdraw(double amount);

    public abstract void deposit(double amount);

    public static void main(String[] args) {
    }
}
