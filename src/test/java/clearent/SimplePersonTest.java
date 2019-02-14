package test.java.clearent;

import main.java.clearent.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.comparesEqualTo;
import static org.junit.Assert.*;

public class SimplePersonTest {

    @Test
    public void interestSingleWallet() {
        Person person = new SimplePerson()
                .addWallet(new SimpleWallet()
                        .addCard(new VisaSimpleCard(200d))
                        .addCard(new DiscoverSimpleCard(50d))
                        .addCard(new MastercardSimpleCard(125d)));

        assertThat(person.calculateInterest(), comparesEqualTo(BigDecimal.valueOf(26.75)));
    }

    @Test
    public void interestMultipleWallets() {
        Person person = new SimplePerson()
            .addWallet(new SimpleWallet()
                .addCard(new VisaSimpleCard(200d))
                .addCard(new DiscoverSimpleCard(50d))
                .addCard(new MastercardSimpleCard(125d)))
            .addWallet(new SimpleWallet()
                .addCard(new VisaSimpleCard(150d))
                .addCard(new DiscoverSimpleCard(150d))
                .addCard(new MastercardSimpleCard(50d)));

        assertThat(person.calculateInterest(), comparesEqualTo(BigDecimal.valueOf(45.75)));
    }

}