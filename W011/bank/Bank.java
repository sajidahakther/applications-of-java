package bank;

import java.util.ArrayList;

public class Bank {

private final ArrayList<Account> accounts; //keeps records of accounts

    private double savingsInterestRate; //stores rate of interest for savings account in percentage

    public Bank() { //initialises account arraylist with a new one
        accounts = new ArrayList<Account>();
    }

    public void setSavingsInterest(double rate) { //method sets the interest rate of the savings accounts in percentage
        this.savingsInterestRate = rate;
    }

    public int numberOfAccounts() { //methods returns the number of accounts active in the bank
        return accounts.size();
    }

    public void addAccount(Account a) { //method to add an account to the accounts arraylist
        accounts.add(a);
    }

    public Account getAccount(String accountID) { //method gets the account by the ID
        for (Account account : accounts) {
            if (account.getID().equals(accountID)) { //checks if the account matches the ID, then returns the account
                return account;
            }
        }
        return null;
    }

    public boolean deposit(String accountID, double amount) { //method to deposit the provided amount into the account specified by accountID. 
        Account account = getAccount(accountID);
        if (accountID != null) { //if the account ID exists and is found, deposit the amount
            account.deposit(amount);
            return true;
        } else { //else if the account is not found, return false and don't make the deposit
            return false;
        }
    }

    public boolean withdraw(String accountID, double amount) { //method to withdraw the provided amount from the account specified by accountID
        Account account = getAccount(accountID);
        if (accountID != null) { //if the account ID exits and is found, withdraw the amount
            return account.withdraw(amount); //returns true - the withdrawal has been successful
        } else { 
            return false;
        }
    }

    public boolean transfer(String fromAccountID, String toAccountID, double amount) { //method to transfer an amount
        Account fromAccount = getAccount(fromAccountID); //withdrawing from 'fromAccountID' and deposit to 'toAccountID'
        Account toAccount = getAccount(toAccountID);
        if (fromAccount != null && toAccount != null) { //if both accounts exist, proceed with the transfer
            if (fromAccount.withdraw(amount)) {
                toAccount.deposit(amount);
                return true; //transaction is successful
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void addInterest() { //adding interest to savings accounts
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                SavingsAccount savingAccount = (SavingsAccount) account;
                savingAccount.addInterest(savingsInterestRate);
            }
        }
    }

    public void reset() { //resetting number of checks used
        for (Account account : accounts) {
            if (account instanceof CheckingAccount) {
                CheckingAccount checkingAccount = (CheckingAccount) account;
                checkingAccount.resetChecksUsed();
            }
        }
    }
    
    public static void main(String[] args) {
		CheckingAccount sam = new CheckingAccount("12",3000);
		Bank acc = new Bank();
		acc.addAccount(sam);
		
		System.out.println(acc.numberOfAccounts());
}
}

