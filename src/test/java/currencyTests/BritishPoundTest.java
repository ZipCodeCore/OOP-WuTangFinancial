package currencyTests;

import currencies.BritishPound;
import currencies.Euro;
import org.junit.Assert;
import org.junit.Test;

public class BritishPoundTest {
    @Test
    public void inUSDTest(){
        BritishPound pound = new BritishPound();
        double expected = 1.2195121951219512;
        double actual = pound.inUSD(1);
        Assert.assertEquals(expected, actual, 0000);
    }
    @Test
    public void convertToRupeeTest(){
        BritishPound pound = new BritishPound();
        double expected = 749.8536585365854;
        double actual = pound.convertToRupees(9.0);
        Assert.assertEquals(expected, actual, 0000);
    }
}
