package fountain.Donald.WuTanFinancial;

import fountain.donald.WuTanFinancial.Currency;
import fountain.donald.WuTanFinancial.CurrencyConverter;
import org.junit.Assert;
import org.junit.Test;

public class TestCurrencyConverter {

    @Test
    public void convertMoneyTest(){
        double expected = 82;

        double actual = CurrencyConverter.convertMoney(Currency.USDollar.getCurrencyRate(), Currency.BritishPound.getCurrencyRate(), 100);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getCurrencyRatesTest(){
        double expected = 1.00;

        double actual =CurrencyConverter.getCurrencyRates(1);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getCurrencyRatesNameTest(){
        String expected = "USDollar";

        String actual = CurrencyConverter.getCurrencyRatesName(1);

        Assert.assertEquals(expected, actual);
    }
}
