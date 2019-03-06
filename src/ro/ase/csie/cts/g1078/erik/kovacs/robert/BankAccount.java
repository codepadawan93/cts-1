package ro.ase.csie.cts.g1078.erik.kovacs.robert;

public abstract class BankAccount extends Account{
    protected double balance;
    protected String id;

    @Override
    public double getBalance() {
        return this.balance;
    }

    public BankAccount(String iban) {
        this.id = iban;
    }
}
