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

    @Test
    public void getCurrencyFromCodeTest() {
        Currency C = new Currency();
        CurrencyConverter CC = new CurrencyConverter();
        double expected = 1.0;
        double actual = CC.getRateFromCode("USD");
        assertEquals("USD Rate of 1.0 expected", expected, actual);

    }

    @Test
    public void CurrencyConverterTestUSDtoEUR() {
        CurrencyConverter CC = new CurrencyConverter();
        double amount = 100;
//        String inputCountry = "USD";
//        String outputCountry = "EUR";
        double fromCountry = CC.getRateFromCode("USA");
        double toCountry = CC.getRateFromCode("EUR");
        double expected = 94;
        double actual = CC.convert(100, fromCountry, toCountry);
        assertEquals("Expected 94 EUR",expected,actual);
    }

}
