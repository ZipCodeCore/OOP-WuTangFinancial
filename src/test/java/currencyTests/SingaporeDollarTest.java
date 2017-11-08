package currencyTests;

import currencies.SingaporeDollar;
import org.junit.Assert;
import org.junit.Test;

public class SingaporeDollarTest {
    @Test
    public void inUSDTest(){
        SingaporeDollar dollar = new SingaporeDollar();
        double expected = 0.6993006993006994;
        double actual = dollar.inUSD(1);
        Assert.assertEquals(expected, actual, 0000);
    }
    @Test
    public void convertToSwissFrancTest(){
        SingaporeDollar dollar = new SingaporeDollar();;
        double expected = 70.62937062937063;
        double actual = dollar.convertToSwissFranc(100);
        Assert.assertEquals(expected, actual, 0000);
    }
}
