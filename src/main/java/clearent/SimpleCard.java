package main.java.clearent;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class SimpleCard implements Card {

    private BigDecimal balance;

    abstract BigDecimal interestRate();

    public SimpleCard(final double balance) {
        super();
        this.balance = BigDecimal.valueOf(balance);
    }

    @Override
    public BigDecimal calculateInterest() {
        final BigDecimal interest = balance.multiply(interestRate()).setScale(2, RoundingMode.HALF_UP);

        System.out.println(String.format("Interest for %s card with %.2f%% interest rate and $%.2f balance was calculated as $%.2f",
                getClass().getSimpleName(), interestRate().multiply(BigDecimal.valueOf(100)), balance, interest));

        return interest;
    }

}
