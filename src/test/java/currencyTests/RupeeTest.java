package currencyTests;

import currencies.Rupee;
import org.junit.Assert;
import org.junit.Test;

public class RupeeTest {
    @Test
    public void inUSDTest(){
        Rupee roop = new Rupee();
        double expected = 0.014637002341920375;
        double actual = roop.inUSD(1);
        Assert.assertEquals(expected, actual, 0000);
    }
    @Test
    public void convertToCanadianDollarTest(){
        Rupee roop = new Rupee();;
        double expected = 1.9320843091334896;
        double actual = roop.convertToCandadianDollars(100);
        Assert.assertEquals(expected, actual, 0000);
    }
}
