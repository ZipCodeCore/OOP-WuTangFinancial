package currencyTests;

import currencies.UsDollar;
import org.junit.Assert;
import org.junit.Test;

public class UsDollarTest {
    @Test
    public void getValueTest() {
        UsDollar dollar = new UsDollar();
        double expected = 5.00;
        double actual = dollar.inUSD(5.00);
        Assert.assertEquals(expected, actual, 0000);
    }

    @Test
    public void convertToTest(){
       UsDollar dollar = new UsDollar();
        double expected = 8.93;
        double actual = dollar.convertToEuro(9.50);
        Assert.assertEquals(expected, actual, 0000);
    }
}