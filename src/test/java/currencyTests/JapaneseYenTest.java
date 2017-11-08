package currencyTests;

import currencies.JapaneseYen;
import org.junit.Assert;
import org.junit.Test;

public class JapaneseYenTest {
    @Test
    public void inUSDTest(){
        JapaneseYen yen = new JapaneseYen();
        double expected = 0.008632596685082873;
        double actual = yen.inUSD(1);
        Assert.assertEquals(expected, actual, 0000);
    }
    @Test
    public void convertToYuanRenmibiTest(){
        JapaneseYen yen = new JapaneseYen();
        double expected = 0.5973756906077348;
        double actual = yen.convertToYuanRenminbi(10);
        Assert.assertEquals(expected, actual, 0000);
    }
}
