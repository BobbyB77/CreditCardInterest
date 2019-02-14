package main.java.clearent;

import java.util.Collection;
import java.util.HashSet;

public class SimplePerson implements Person {

    private Collection<InterestObject> wallets = new HashSet<>();

    @Override
    public Collection<InterestObject> getInterestObjectItems() {
        return wallets;
    }

    @Override
    public Person addWallet(final Wallet wallet) {
        this.wallets.add(wallet);

        return this;
    }

}
