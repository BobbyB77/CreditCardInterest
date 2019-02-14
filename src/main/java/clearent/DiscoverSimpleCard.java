package main.java.clearent;

import java.math.BigDecimal;

public class DiscoverSimpleCard extends SimpleCard {

    public static final BigDecimal INTEREST_RATE = BigDecimal.valueOf(.01d);

    public DiscoverSimpleCard(final double balance) {
        super(balance);
    }

    @Override
    public BigDecimal interestRate() {
        return INTEREST_RATE;
    }

}
