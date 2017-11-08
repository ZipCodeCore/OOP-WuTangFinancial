import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExchangeRatesTest {

    @Test
    public void getRate() {
        //Given
        double expected = 1.00;

        //When
        double actual = ExchangeRates.USD.getRate();

        //Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getName() {
        //Given
        String expected = "Swiss Franc";

        //When
        String actual = ExchangeRates.FRANC.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

}