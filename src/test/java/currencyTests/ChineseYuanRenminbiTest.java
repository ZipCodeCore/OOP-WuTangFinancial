package currencyTests;

import currencies.ChineseYuanRenminbi;
import org.junit.Assert;
import org.junit.Test;

public class ChineseYuanRenminbiTest {
    @Test
    public void inUSDTest(){
        ChineseYuanRenminbi yuanRenminbi = new ChineseYuanRenminbi();
        double expected = 0.2237136465324385;
        double actual = yuanRenminbi.inUSD(1);
        Assert.assertEquals(expected, actual, 0000);
    }
}
