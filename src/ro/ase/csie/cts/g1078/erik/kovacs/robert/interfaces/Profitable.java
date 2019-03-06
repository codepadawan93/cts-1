package ro.ase.csie.cts.g1078.erik.kovacs.robert.interfaces;

import ro.ase.csie.cts.g1078.erik.kovacs.robert.exceptions.InvalidInterestRateException;

public interface Profitable {
    public void addInterest(Object o)throws InvalidInterestRateException;
}
