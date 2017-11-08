package io.zipcode.wutangfinancial;

import org.junit.Assert;
import org.junit.Test;

public class CurrencyTest {
    @Test
    public void testGetTargetAmount(){
        Currency currency = new Currency();
        double expected = 13.41;
        double actual = currency.getTargetAmount("JAPANESE YEN",345.52,"MALAYSIAN RINGGIT");
        Assert.assertEquals(expected,actual,.01);
    }
}
