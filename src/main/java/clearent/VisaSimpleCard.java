package main.java.clearent;

import java.math.BigDecimal;

public class VisaSimpleCard extends SimpleCard {

    public static final BigDecimal INTEREST_RATE = BigDecimal.valueOf(.1d);

    public VisaSimpleCard(final double balance) {
        super(balance);
    }

    @Override
    public BigDecimal interestRate() {
        return INTEREST_RATE;
    }

}
