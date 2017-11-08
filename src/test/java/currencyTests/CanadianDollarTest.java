package currencyTests;

import currencies.CanadianDollar;
import org.junit.Assert;
import org.junit.Test;

public class CanadianDollarTest {
    @Test
    public void inUSDTest(){
        CanadianDollar dollar = new CanadianDollar();
        double expected = 0.7575757575757576;
        double actual = dollar.inUSD(1);
        Assert.assertEquals(expected, actual, 0000);
    }
    @Test
    public void convertToCanadianDollarTest(){
        CanadianDollar dollar = new CanadianDollar();;
        double expected = 108.33333333333331;
        double actual = dollar.convertToSingaporeanDollars(100);
        Assert.assertEquals(expected, actual, 0000);
    }
}
