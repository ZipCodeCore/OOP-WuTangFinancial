package currencyTests;

import currencies.Euro;
import org.junit.Assert;
import org.junit.Test;

public class EuroTest {
    @Test
    public void getValueTest() {
        Euro euro = new Euro();
        double expected = 0.0797872340425532;
        double actual = euro.inUSD(.075);
        Assert.assertEquals(expected, actual, 0000);
    }

    @Test
    public void convertToTest(){
        Euro euro = new Euro();
        double expected = 8.425531914893618;
        double actual = euro.convertToPounds(9.0);
        Assert.assertEquals(expected, actual, 0000);
    }
}
