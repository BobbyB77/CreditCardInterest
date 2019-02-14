package main.java.clearent;

import java.math.BigDecimal;

public class MastercardSimpleCard extends SimpleCard {

    public static final BigDecimal INTEREST_RATE = BigDecimal.valueOf(.05d);

    public MastercardSimpleCard(final double balance) {
        super(balance);
    }

    @Override
    public BigDecimal interestRate() {
        return INTEREST_RATE;
    }

}
