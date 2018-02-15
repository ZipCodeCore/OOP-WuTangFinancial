import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExchangerTest {

    Exchanger testExchanger;

    @Before
    public void setup () {
        testExchanger = new Exchanger();
        Table.createMap();

    }


    @Test
    public void setStartingCurrencyRateTest () {
        testExchanger.setStartingCurrencyRate("GBP");
        double expected = 0.82;
        double actual = testExchanger.convertToDollarsRate;
        Assert.assertEquals(expected, actual, 0.005);
    }


    @Test
    public void setSecondExchangeRateTest () {
        testExchanger.setSecondExchangeRate("JPY");
        double expected = 115.84;
        double actual = testExchanger.convertFromDollarsRate;
        Assert.assertEquals(expected, actual, 0.005);
    }


    @Test
    public void setInitialValueToBeConvertedTest () {
        testExchanger.setInitialValueToBeConverted(10000);
        double expected = 10000;
        double actual = testExchanger.initialValue;
        Assert.assertEquals(expected, actual, 0.005);
    }

    @Test
    public void convertCurrencyTest1 () {
        testExchanger.setStartingCurrencyRate("USD");
        testExchanger.setSecondExchangeRate("EUR");
        testExchanger.setInitialValueToBeConverted(100000);
        double expected = 94000;
        double actual = testExchanger.convertCurrency();
        Assert.assertEquals(expected, actual, 0.005);
    }

    @Test
    public void convertCurrencyTest2 () {
        testExchanger.setStartingCurrencyRate("EUR");
        testExchanger.setSecondExchangeRate("USD");
        testExchanger.setInitialValueToBeConverted(100000);
        double expected = 106382.978;
        double actual = testExchanger.convertCurrency();
        Assert.assertEquals(expected, actual, 0.005);
    }

    @Test
    public void convertCurrencyTest3 () {
        testExchanger.setStartingCurrencyRate("EUR");
        testExchanger.setSecondExchangeRate("GBP");
        testExchanger.setInitialValueToBeConverted(100000);
        double expected = 87234.0426;
        double actual = testExchanger.convertCurrency();
        Assert.assertEquals(expected, actual, 0.005);
    }

    @Test
    public void convertCurrencyTest4 () {
        testExchanger.setStartingCurrencyRate("GBP");
        testExchanger.setSecondExchangeRate("INR");
        testExchanger.setInitialValueToBeConverted(100000);
        double expected = 8331707.32;
        double actual = testExchanger.convertCurrency();
        Assert.assertEquals(expected, actual, 0.005);
    }

    @Test
    public void convertCurrencyTest5 () {
        testExchanger.setStartingCurrencyRate("INR");
        testExchanger.setSecondExchangeRate("CAD");
        testExchanger.setInitialValueToBeConverted(100000);
        double expected = 1932.08431;
        double actual = testExchanger.convertCurrency();
        Assert.assertEquals(expected, actual, 0.005);
    }

    @Test
    public void convertCurrencyTest6 () {
        testExchanger.setStartingCurrencyRate("CAD");
        testExchanger.setSecondExchangeRate("SGD");
        testExchanger.setInitialValueToBeConverted(100000);
        double expected = 108333.333;
        double actual = testExchanger.convertCurrency();
        Assert.assertEquals(expected, actual, 0.005);
    }

    @Test
    public void convertCurrencyTest7 () {
        testExchanger.setStartingCurrencyRate("SGD");
        testExchanger.setSecondExchangeRate("CHF");
        testExchanger.setInitialValueToBeConverted(100000);
        double expected = 70629.3706;
        double actual = testExchanger.convertCurrency();
        Assert.assertEquals(expected, actual, 0.005);
    }

    @Test
    public void convertCurrencyTest8 () {
        testExchanger.setStartingCurrencyRate("CHF");
        testExchanger.setSecondExchangeRate("MYR");
        testExchanger.setInitialValueToBeConverted(100000);
        double expected = 442574.257;
        double actual = testExchanger.convertCurrency();
        Assert.assertEquals(expected, actual, 0.005);
    }

    @Test
    public void convertCurrencyTest9 () {
        testExchanger.setStartingCurrencyRate("MYR");
        testExchanger.setSecondExchangeRate("JPY");
        testExchanger.setInitialValueToBeConverted(100000);
        double expected = 2591498.88;
        double actual = testExchanger.convertCurrency();
        Assert.assertEquals(expected, actual, 0.005);
    }

    @Test
    public void convertCurrencyTest10 () {
        testExchanger.setStartingCurrencyRate("JPY");
        testExchanger.setSecondExchangeRate("CNY");
        testExchanger.setInitialValueToBeConverted(100000);
        double expected = 5973.75691;
        double actual = testExchanger.convertCurrency();
        Assert.assertEquals(expected, actual, 0.005);
    }

}
