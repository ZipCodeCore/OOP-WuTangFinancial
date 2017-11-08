package currencyTests;

import currencies.MalaysianRinggit;
import org.junit.Assert;
import org.junit.Test;

public class MalaysianRinggitTest {
    @Test
    public void inUSDTest(){
        MalaysianRinggit ringgit = new MalaysianRinggit();
        double expected = 1.1185682326621924;
        double actual = ringgit.inUSD(5);
        Assert.assertEquals(expected, actual, 0000);
    }
    @Test
    public void convertToRinggitTest(){
        MalaysianRinggit ringgit = new MalaysianRinggit();;
        double expected = 2591.4988814317676;
        double actual = ringgit.convertToYen(100);
        Assert.assertEquals(expected, actual, 0000);
    }
}
