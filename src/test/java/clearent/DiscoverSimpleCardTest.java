package test.java.clearent;

import main.java.clearent.DiscoverSimpleCard;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.comparesEqualTo;
import static org.junit.Assert.*;

public class DiscoverSimpleCardTest {

    @Test
    public void interest() {
        assertThat(new DiscoverSimpleCard(50d).calculateInterest(), comparesEqualTo(BigDecimal.valueOf(.5)));
        assertThat(new DiscoverSimpleCard(100d).calculateInterest(), comparesEqualTo(BigDecimal.valueOf(1)));
        assertThat(new DiscoverSimpleCard(200d).calculateInterest(), comparesEqualTo(BigDecimal.valueOf(2)));
    }

}