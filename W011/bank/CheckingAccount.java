package bank;

public class CheckingAccount extends Account { //CheckingAccount extends Account - no interest is given by the bank to this type of account


    private int numberOfChecksUsed; //stores the number of checks used every month and starts at zero
    private double balance;

    public CheckingAccount(String id, double initialBalance) { //initialising the attributes for checking account, id and the initial balance
        super(id, initialBalance);
        numberOfChecksUsed = 0;
        this.balance = initialBalance;
    }

    public boolean withdraw(double amount) { //method used to withdraw moey from the checking account
        if (balance - amount - 2 >= 0) { //incorporating the transaction fee for ATM/electronic withdrawals, withdrawals lower than £0 no allowed, the method returns true if the withdrawal has been successful. transaction fee is 2.
            balance = balance - amount - 2;
            return true;
        } else {
            return false;
        }
    }

    public void deposit(double amount) { //method to deposit money to checking account as a result of an ATM transaction.
        balance = balance + amount - 2;  //transaction fee is 2 and it is deducted from the balance
    }

    public void resetChecksUsed() { //method used to reset the numberOfChecksUsed to 0
        numberOfChecksUsed = 0;
    }

    public int getChecksUsed() { //getting the value of the numberOfChecksUsed and returning it
        return numberOfChecksUsed;
    }

    public boolean withdrawUsingCheck(double amount) { //method allowing checks to be used to withdraw cash
        /* If the balance falls below £10 because of the amount or fees, the method returns false and doesn't change the balance or increment the number of checks used. 
        A successful withdrawal results in updating the balance and number of checks used, and the method returns true.
        Free transaction fee for first 4 checks, the minimum balance is then -10. */
        if (numberOfChecksUsed < 4) { 
            if (balance - amount >= -10) {
                balance = balance - amount;
                return true;
            } else {
                return false;
            }
        } else { //otherwise the minimum balance should be -10, transaction fee is 2
            if (balance - amount - 2 >= -10) {
                balance = balance - amount - 2;
                return true;
            } else {
                return false;
            }
        }
    }
    
    public static void main(String[] args) {
    		CheckingAccount sam = new CheckingAccount("12",3000);
    		System.out.println(sam.withdrawUsingCheck(20));
    		
    }
}


