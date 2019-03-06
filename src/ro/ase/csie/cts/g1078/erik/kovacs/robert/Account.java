package ro.ase.csie.cts.g1078.erik.kovacs.robert;

import ro.ase.csie.cts.g1078.erik.kovacs.robert.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1078.erik.kovacs.robert.exceptions.InsufficientFundsException;

public abstract class Account {
    public abstract void deposit(Object value) throws UnsupportedOperationException, IllegalTransferException;
    public abstract void withdraw(Object value) throws InsufficientFundsException;
    public abstract void transfer(Object value, Account destination) throws IllegalTransferException, InsufficientFundsException;
    public abstract double getBalance();

}