package ro.ase.csie.cts.g1078.erik.kovacs.robert;

import ro.ase.csie.cts.g1078.erik.kovacs.robert.enums.BankAccountType;
import ro.ase.csie.cts.g1078.erik.kovacs.robert.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1078.erik.kovacs.robert.exceptions.InsufficientFundsException;
import ro.ase.csie.cts.g1078.erik.kovacs.robert.exceptions.InvalidInterestRateException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Banker banker = Banker.getBanker();
        CurrentAccount currentAccount = (CurrentAccount) banker.openAccount(BankAccountType.CurrentAccount);
        SavingsAccount savingsAccount = (SavingsAccount) banker.openAccount(BankAccountType.SavingsAccount);

        // test toString()
        System.out.println(currentAccount + " and " + savingsAccount);

        // test polymorphism
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(currentAccount);
        accounts.add(savingsAccount);

        for(Account account : accounts){
            BankAccount bankAccount = (BankAccount) account;
            System.out.println("Bank Account: " + bankAccount);
        }

        // Make a deposit into the savings account, then
        // transfer it to the current account
        try {
            System.out.println(currentAccount.getBalance());
            savingsAccount.deposit(1000.0);
            savingsAccount.addInterest(0.1);
            savingsAccount.transfer(1000.0, currentAccount);
            System.out.println(currentAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // Could we have a negative interest rate? Surely not...
            savingsAccount.addInterest(-0.1);
        } catch (InvalidInterestRateException iire){
            iire.printStackTrace();
        }

        try{
            // Let's try to bump up that retirement account with next month's
            // salary. Oops...
            currentAccount.transfer(7000.0, savingsAccount);
        }catch (InsufficientFundsException ife){
            ife.printStackTrace();
        }catch (IllegalTransferException ite){
            ite.printStackTrace();
        }

        try{
            // Could we "create" money from thin air? Let's try
            currentAccount.transfer(-500, currentAccount);
        }catch (InsufficientFundsException ife){
            ife.printStackTrace();
        }catch (IllegalTransferException ite){
            ite.printStackTrace();
        }
    }
}