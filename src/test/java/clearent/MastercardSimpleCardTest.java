package test.java.clearent;

import main.java.clearent.MastercardSimpleCard;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.comparesEqualTo;
import static org.junit.Assert.*;

public class MastercardSimpleCardTest {

    @Test
    public void interest() {
        assertThat(new MastercardSimpleCard(50d).calculateInterest(), comparesEqualTo(BigDecimal.valueOf(2.5)));
        assertThat(new MastercardSimpleCard(100d).calculateInterest(), comparesEqualTo(BigDecimal.valueOf(5)));
        assertThat(new MastercardSimpleCard(200d).calculateInterest(), comparesEqualTo(BigDecimal.valueOf(10)));
    }

}