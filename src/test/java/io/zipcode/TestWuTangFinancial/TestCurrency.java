package io.zipcode.TestWuTangFinancial;

import io.zipcode.WuTangFinancial.Currency;
import org.junit.Assert;
import org.junit.Test;

public class TestCurrency {

    @Test
    public void testTOExchangeMoney(){
        Currency currency = new Currency();
        double expected = 2.46;
        double actual = currency.toExchangeMoney(
                20.76,"CHINESE YUAN RENMINBI","BRITISH POUND");
        System.out.println(actual);
        Assert.assertEquals(expected,actual,1.00);
    }
}
