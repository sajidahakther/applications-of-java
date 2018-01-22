package bank;

public class SavingsAccount extends Account { //SavingsAccount is a subclass of Account class  

    public SavingsAccount(String id, double initialDeposit) {  //initialising the attributes for savings account, the id and initial deposit
        //if the initial deposit is £1000 or above, the bank credits the account with an extra £10.00
        super(id, initialDeposit);
        if (initialDeposit >= 1000) {
            balance = balance + 10;
        }
    }

    public boolean withdraw(double amount) { //method to withdraw from the savings account balance
        if (balance - amount - 3 >= 10) { //minimum balance is £10.00, transaction fee is £3.00
            balance = balance - amount - 3;
            return true;
        } else {
            return false;
        }
    }

    public void deposit(double amount) { //method use to deposit/add money into savings account balance
        balance = balance + amount;
    }

    public double addInterest(double rate) { //method to compute interest rate
        double interest = balance * rate / 100; //adds the interest to account balance and returns the interest
        balance = balance + interest;
        return interest;
    }

    public static void main(String[] args) {
        SavingsAccount Sajidah = new SavingsAccount("12", 20000);
        System.out.println("Sajidah Akther:");
        System.out.println(Sajidah);
        System.out.println(Sajidah.addInterest(20));
    }
}