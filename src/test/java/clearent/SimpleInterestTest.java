package test.java.clearent;

import main.java.clearent.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.comparesEqualTo;
import static org.junit.Assert.*;

public class SimpleInterestTest {

    @Test
    public void testCase1() {
        Person person = new SimplePerson()
            .addWallet(new SimpleWallet()
                .addCard(new VisaSimpleCard(100d))
                .addCard(new DiscoverSimpleCard(100d))
                .addCard(new MastercardSimpleCard(100d)));

        assertThat(person.calculateInterest(), comparesEqualTo(BigDecimal.valueOf(16)));
    }

    @Test
    public void testCase2() {
        Person person = new SimplePerson()
            .addWallet(new SimpleWallet()
                .addCard(new VisaSimpleCard(100d))
                .addCard(new DiscoverSimpleCard(100d)))
            .addWallet(new SimpleWallet()
                .addCard(new MastercardSimpleCard(100d)));

        assertThat(person.calculateInterest(), comparesEqualTo(BigDecimal.valueOf(16)));
    }

    @Test
    public void testCase3() {
        Person person1 = new SimplePerson()
            .addWallet(new SimpleWallet()
                .addCard(new VisaSimpleCard(100d))
                .addCard(new DiscoverSimpleCard(100d))
                .addCard(new MastercardSimpleCard(100d)));
        Person person2 = new SimplePerson()
            .addWallet(new SimpleWallet()
                .addCard(new VisaSimpleCard(100d))
                .addCard(new MastercardSimpleCard(100d)));

        assertThat(person1.calculateInterest(), comparesEqualTo(BigDecimal.valueOf(16)));
        assertThat(person2.calculateInterest(), comparesEqualTo(BigDecimal.valueOf(15)));
    }

}
