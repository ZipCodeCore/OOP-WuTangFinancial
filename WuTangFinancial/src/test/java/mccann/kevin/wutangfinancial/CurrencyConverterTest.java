package mccann.kevin.wutangfinancial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kevinmccann on 1/11/17.
 */
public class CurrencyConverterTest {

//    @Before
//    public void setUp() {
//
//    }

    @Test
    public void getRateTest() {
        Currency currency = new Currency("USD", 1.0);
        double expected = 1.0;
        double actual = currency.getRate();
        assertEquals("I expect an rate of 1.0",expected,actual);
    }

    @Test
    public void getCurrencyCodeTest() {
        Currency currency = new Currency("USD", 1.0);
        String expected = "USD";
        String actual = currency.getCurrencyCode();
        assertEquals("I expect a Currency Code of USD",expected,actual);
    }

//    @Test
//    public void
}
