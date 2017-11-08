import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyConverterTest {

    CurrencyConverter converterTest;
    @Before
    public void setUp() {
         converterTest = new CurrencyConverter();
    }

    @Test
    public void dollarToEuroTest() {
        double expected = 9.40;

        double actual = converterTest.convertCurrency(10, ExchangeRates.USD, ExchangeRates.EURO);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void euroToDollarTest() {
        double expected = 10.64;

        double actual = converterTest.convertCurrency(10, ExchangeRates.EURO, ExchangeRates.USD);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void euroToPoundTest() {
        double expected = 8.83;

        double actual = converterTest.convertCurrency(10, ExchangeRates.EURO, ExchangeRates.POUND);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void poundToRupeeTest() {
        double expected = 823.13;

        double actual = converterTest.convertCurrency(10, ExchangeRates.POUND, ExchangeRates.RUPEE);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void rupeeToCDollar() {
        double expected = 0.19;

        double actual = converterTest.convertCurrency(10, ExchangeRates.RUPEE, ExchangeRates.CANADIANDOLLAR);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void cdollarToSDollar() {
        double expected = 10.83;

        double actual = converterTest.convertCurrency(10, ExchangeRates.CANADIANDOLLAR, ExchangeRates.SINGAPOREDOLLAR);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void sdollarToFranc() {
        double expected = 7.06;

        double actual = converterTest.convertCurrency(10, ExchangeRates.SINGAPOREDOLLAR, ExchangeRates.FRANC);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void francToRinggit() {
        double expected = 44.26;

        double actual = converterTest.convertCurrency(10, ExchangeRates.FRANC, ExchangeRates.RINGGIT);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void ringgittToYen() {
        double expected = 259.15;

        double actual = converterTest.convertCurrency(10, ExchangeRates.RINGGIT, ExchangeRates.YEN);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void yenToYuanReminbi() {
        double expected = 0.60;

        double actual = converterTest.convertCurrency(10, ExchangeRates.YEN, ExchangeRates.YUANREMINBI);

        Assert.assertEquals(expected, actual, 0);
    }
}