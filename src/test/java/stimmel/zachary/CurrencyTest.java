package stimmel.zachary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyTest {
    @Test
    public void getValueUSD() throws Exception {

        double expected = 1.0;
        double actual = Currency.USD.getValue();

        Assert.assertEquals(expected,actual,0);

    }
    @Test
    public void getValueEUR() throws Exception {

        double expected = 0.94;
        double actual = Currency.EUR.getValue();

        Assert.assertEquals(expected,actual,0);

    }

}