package ro.ase.csie.cts.g1078.erik.kovacs.robert;

import jdk.jshell.execution.Util;
import ro.ase.csie.cts.g1078.erik.kovacs.robert.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1078.erik.kovacs.robert.exceptions.InsufficientFundsException;
import ro.ase.csie.cts.g1078.erik.kovacs.robert.exceptions.InvalidInterestRateException;
import ro.ase.csie.cts.g1078.erik.kovacs.robert.interfaces.Profitable;

public class SavingsAccount extends BankAccount implements Profitable {
    public final static double MIN_BALANCE = 100;

    public SavingsAccount(String iban) {
        super(iban);
        this.balance = MIN_BALANCE;
    }

    @Override
    public void deposit(Object value) throws UnsupportedOperationException, IllegalTransferException {
        double input = Utility.getValueFromObject(value);
        if(input <= 0)
            throw new IllegalTransferException();

        this.balance += input;
    }

    @Override
    public void withdraw(Object value) throws InsufficientFundsException {
        double input = Utility.getValueFromObject(value);
        if(this.balance - input < SavingsAccount.MIN_BALANCE)
            throw new InsufficientFundsException();
        this.balance-=input;
    }

    @Override
    public void transfer(Object value, Account destination) throws IllegalTransferException, InsufficientFundsException {
        withdraw(value);
        destination.deposit(value);
    }

    @Override
    public void addInterest(Object value) throws InvalidInterestRateException {
        double input = Utility.getValueFromObject(value);
        if(input < 0){
            throw new InvalidInterestRateException();
        }
        this.balance += this.balance * input;
    }
}
