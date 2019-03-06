package ro.ase.csie.cts.g1078.erik.kovacs.robert;

import ro.ase.csie.cts.g1078.erik.kovacs.robert.enums.BankAccountType;

public class Main {
    public static void main(String[] args){
        Banker banker = Banker.getBanker();
        BankAccount bankAccount = banker.openAccount(BankAccountType.CurrentAccount);
        BankAccount bankAccount2 = banker.openAccount(BankAccountType.SavingsAccount);
    }
}
