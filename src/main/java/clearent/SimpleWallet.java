package main.java.clearent;

import java.util.Collection;
import java.util.HashSet;

public class SimpleWallet implements Wallet {

    private Collection<InterestObject> cards = new HashSet<>();

    @Override
    public Collection<InterestObject> getInterestObjectItems() {
        return cards;
    }

    @Override
    public Wallet addCard(final Card card) {
        this.cards.add(card);

        return this;
    }

}
