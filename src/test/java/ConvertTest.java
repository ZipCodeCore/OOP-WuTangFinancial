import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {
    Convert testConvert = new Convert();

    @Test
    public void getCurrencyByTypeTest(){
        double expected = 115.84;

        Currency testCurrencyHold = testConvert.getCurrencyByType("JPY");
        double actual = testCurrencyHold.getRate();

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void formatDoubleTest(){
        String expected = "12345.67";

        String actual = testConvert.formatDouble(12345.67);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void convertCurrencyUSDollarToEuroTest() {
        double expected = 8.46;

        double actual = testConvert.convertCurrency(Currency.USD, Currency.EUR, 9.00);

        Assert.assertEquals(expected, actual,0);
    }

    @Test
    public void convertCurrencyEuroToUSDollarTest(){
        double expected = 9.57;

        double actual = testConvert.convertCurrency(Currency.EUR, Currency.USD,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyEuroToPoundTest(){
        double expected = 7.85;

        double actual = testConvert.convertCurrency(Currency.EUR,Currency.GBP,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyPoundToRupeeTest(){
        double expected = 749.85;

        double actual = testConvert.convertCurrency(Currency.GBP,Currency.INR,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyRupeeToAustralianDollarTest(){
        double expected = 0.18;

        double actual = testConvert.convertCurrency(Currency.INR, Currency.AUD,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyAustralianDollarToCanadianDollarTest(){
        double expected = 8.80;

        double actual = testConvert.convertCurrency(Currency.AUD,Currency.CAD,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyCanadianDollarToSingaporeDollarTest(){
        double expected = 9.75;

        double actual = testConvert.convertCurrency(Currency.CAD, Currency.SGD,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencySingaporeDollarToFrancTest(){
        double expected = 6.36;

        double actual = testConvert.convertCurrency(Currency.SGD, Currency.CHF,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyFrancToRinggitTest(){
        double expected = 39.83;

        double actual = testConvert.convertCurrency(Currency.CHF, Currency.MYR,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyRinggitToYenTest(){
        double expected = 233.23;

        double actual = testConvert.convertCurrency(Currency.MYR, Currency.JPY,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyYenToYuanRenminbiTest(){
        double expected = 0.54;

        double actual = testConvert.convertCurrency(Currency.JPY, Currency.CNY,9.00);

        Assert.assertEquals(expected,actual,0);
    }

}
