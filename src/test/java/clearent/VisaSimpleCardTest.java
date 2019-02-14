package test.java.clearent;

import main.java.clearent.VisaSimpleCard;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.comparesEqualTo;
import static org.junit.Assert.assertThat;

public class VisaSimpleCardTest {

    @Test
    public void interest() {
        assertThat(new VisaSimpleCard(50d).calculateInterest(), comparesEqualTo(BigDecimal.valueOf(5)));
        assertThat(new VisaSimpleCard(100d).calculateInterest(), comparesEqualTo(BigDecimal.valueOf(10)));
        assertThat(new VisaSimpleCard(200d).calculateInterest(), comparesEqualTo(BigDecimal.valueOf(20)));
    }

}