package currencyTests;

import currencies.SwissFranc;
import org.junit.Assert;
import org.junit.Test;

public class SwissFrancTest {
    @Test
    public void inUSDTest(){
        SwissFranc franc = new SwissFranc();
        double expected = 0.9900990099009901;
        double actual = franc.inUSD(1);
        Assert.assertEquals(expected, actual, 0000);
    }
    @Test
    public void convertToRinggitTest(){
        SwissFranc franc = new SwissFranc();;
        double expected = 442.5742574257426;
        double actual = franc.convertToRinggit(100);
        Assert.assertEquals(expected, actual, 0000);
    }
}
