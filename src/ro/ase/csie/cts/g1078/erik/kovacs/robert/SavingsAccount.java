package ro.ase.csie.cts.g1078.erik.kovacs.robert;

import ro.ase.csie.cts.g1078.erik.kovacs.robert.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1078.erik.kovacs.robert.exceptions.InsufficientFundsException;
import ro.ase.csie.cts.g1078.erik.kovacs.robert.interfaces.Profitable;

public class SavingsAccount extends BankAccount implements Profitable {
    public final static double MIN_BALANCE = 100;

    public SavingsAccount(String iban) {
        super(iban);
        this.balance = MIN_BALANCE;
    }

    @Override
    public void deposit(Object value) throws UnsupportedOperationException, IllegalTransferException {

    }

    @Override
    public void withdraw(Object value) throws InsufficientFundsException {

    }

    @Override
    public void transfer(Object value, Account destination) throws IllegalTransferException, InsufficientFundsException {

    }

    @Override
    public void addInterest() {

    }
}
