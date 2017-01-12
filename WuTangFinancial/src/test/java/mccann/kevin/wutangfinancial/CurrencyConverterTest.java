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
        double fromCountry = CC.getRateFromCode("USD");
        double toCountry = CC.getRateFromCode("EUR");
        double expected = 94;
        double actual = CC.convert(100, fromCountry, toCountry);
        assertEquals("Expected 94 EUR",expected,actual);
    }

    @Test
    public void CCTestEURtoUSD() {
        CurrencyConverter CC = new CurrencyConverter();
        double fromCountry = CC.getRateFromCode("EUR");
        double toCountry = CC.getRateFromCode("USD");
        double expected = 106.38;
        double actual = CC.convert(100, fromCountry, toCountry);
        assertEquals("Expected 106.38 USD", expected, actual);
    }

    @Test
    public void CCTestEURtoGBP() {
        CurrencyConverter CC = new CurrencyConverter();
        double fromCountry = CC.getRateFromCode("EUR");
        double toCountry = CC.getRateFromCode("GBP");
        double expected = 87.23;
        double actual = CC.convert(100, fromCountry, toCountry);
        assertEquals("Expected 87.23 GBP", expected, actual);
    }

    @Test
    public void CCTestGBPtoINR() {
        CurrencyConverter CC = new CurrencyConverter();
        double fromCountry = CC.getRateFromCode("GBP");
        double toCountry = CC.getRateFromCode("INR");
        double expected = 8331.71;
        double actual = CC.convert(100, fromCountry, toCountry);
        assertEquals("Expected 8331.71 INR", expected, actual);
    }

    @Test
    public void CCTestINRtoCAD() {
        CurrencyConverter CC = new CurrencyConverter();
        double fromCountry = CC.getRateFromCode("INR");
        double toCountry = CC.getRateFromCode("CAD");
        double expected = 19.32;
        double actual = CC.convert(1000, fromCountry, toCountry);
        assertEquals("Expected 19.32 CAD", expected, actual);
    }

    @Test
    public void CCTestCADtoSGD() {
        CurrencyConverter CC = new CurrencyConverter();
        double fromCountry = CC.getRateFromCode("CAD");
        double toCountry = CC.getRateFromCode("SGD");
        double expected = 108.33;
        double actual = CC.convert(100, fromCountry, toCountry);
        assertEquals("Expected 108.33 SGD", expected, actual);
    }

    @Test
    public void CCTestSGDtoCHF() {
        CurrencyConverter CC = new CurrencyConverter();
        double fromCountry = CC.getRateFromCode("SGD");
        double toCountry = CC.getRateFromCode("CHF");
        double expected = 70.63;
        double actual = CC.convert(100, fromCountry, toCountry);
        assertEquals("Expected 70.63 CHF", expected, actual);
    }

    @Test
    public void CCTestCHFtoMYR() {
        CurrencyConverter CC = new CurrencyConverter();
        double fromCountry = CC.getRateFromCode("CHF");
        double toCountry = CC.getRateFromCode("MYR");
        double expected = 442.57;
        double actual = CC.convert(100, fromCountry, toCountry);
        assertEquals("Expected 442.57 MYR", expected, actual);
    }

    @Test
    public void CCTestMYRtoJPY() {
        CurrencyConverter CC = new CurrencyConverter();
        double fromCountry = CC.getRateFromCode("MYR");
        double toCountry = CC.getRateFromCode("JPY");
        double expected = 2591.50;
        double actual = CC.convert(100, fromCountry, toCountry);
        assertEquals("Expected 2591.50 JPY", expected, actual);
    }

    @Test
    public void CCTestJPYtoCNY() {
        CurrencyConverter CC = new CurrencyConverter();
        double fromCountry = CC.getRateFromCode("JPY");
        double toCountry = CC.getRateFromCode("CNY");
        double expected = 5.97;
        double actual = CC.convert(100, fromCountry, toCountry);
        assertEquals("Expected 5.97 CNY", expected, actual);
    }
}
