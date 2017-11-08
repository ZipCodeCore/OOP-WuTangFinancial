package fountain.Donald.WuTanFinancial;

import fountain.donald.WuTanFinancial.Currency;
import org.junit.Assert;
import org.junit.Test;

public class TestCurrency {

    @Test
    public void constructorTest(){
        double expected = 1.00;

        double actual = Currency.USDollar.getCurrencyRate();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test

    public void getCurrencyRateTest(){
        double expected = 6.92;

        double actual = Currency.ChineseYuanRenminbi.getCurrencyRate();

        Assert.assertEquals(expected, actual, 0);
    }
}
