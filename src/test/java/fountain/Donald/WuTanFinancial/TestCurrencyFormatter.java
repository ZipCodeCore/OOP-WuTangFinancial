package fountain.Donald.WuTanFinancial;

import fountain.donald.WuTanFinancial.CurrencyFormatter;
import org.junit.Assert;
import org.junit.Test;

public class TestCurrencyFormatter {

    @Test
    public void formatCurrencyTest(){
        String expected = "$100.50";
        double money = 100.5;

        String actual = CurrencyFormatter.formatCurrency(money, 1);

        Assert.assertEquals(expected, actual);
    }
}
