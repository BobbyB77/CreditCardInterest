package main.java.clearent;

import java.math.BigDecimal;
import java.util.Collection;

public interface InterestObjectWithItems extends InterestObject {

    Collection<InterestObject> getInterestObjectItems();

    default BigDecimal calculateInterest() {
        BigDecimal interest = BigDecimal.ZERO;
        for (final InterestObject interestObject : getInterestObjectItems()) {
            interest = interest.add(interestObject.calculateInterest());
        }

        System.out.println(String.format("Interest for %s with %d items calculated at $%.2f",
                getClass().getSimpleName(), getInterestObjectItems().size(), interest));

        return interest;
    }

}
