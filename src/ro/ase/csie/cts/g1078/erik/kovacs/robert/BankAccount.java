package ro.ase.csie.cts.g1078.erik.kovacs.robert;

import java.io.Serializable;

public abstract class BankAccount extends Account implements Serializable {
    protected double balance;
    protected String id;

    @Override
    public double getBalance() {
        return this.balance;
    }

    public String getId() {
        return id;
    }

    public BankAccount(String iban) {
        this.id = iban;
    }

    @Override
    public String toString() {
        return String.format("{ balance: %f, id: %s}", balance, id);
    }
}
