package test.java.clearent;

import main.java.clearent.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.comparesEqualTo;
import static org.junit.Assert.*;

public class SimpleWalletTest {

    @Test
    public void interestSingleVisaCard() {
        Wallet wallet = new SimpleWallet()
            .addCard(new VisaSimpleCard(200d));

        assertThat(wallet.calculateInterest(), comparesEqualTo(BigDecimal.valueOf(20)));
    }

    @Test
    public void interestAllCardTypes() {
        Wallet wallet = new SimpleWallet()
            .addCard(new VisaSimpleCard(200d))
            .addCard(new DiscoverSimpleCard(50d))
            .addCard(new MastercardSimpleCard(125d));

        assertThat(wallet.calculateInterest(), comparesEqualTo(BigDecimal.valueOf(26.75)));
    }

}