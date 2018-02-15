import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class CurrencyConverterTest {
    private static CurrencyConverter tester;

    @Before
    public void setUp()  {
        tester = new CurrencyConverter();
    }
    @Test
    public void testCurrencyConverter() {
        String expected = "609.76";
        String actual = tester.currencyConverter("GBP", "USD", 500.00F);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void dollarToEuro() {
        String expected = "470";
        String actual = tester.currencyConverter("USD", "EUR", 500.00F);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void euroToDollar() {
        String expected = "531.91";
        String actual = tester.currencyConverter("EUR", "USD", 500.00F);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void britishPoundToDollar() {
        String expected = "609.76";
        String actual = tester.currencyConverter("GBP", "USD", 500.00F);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void euroToBritishPound() {
        String expected = "436.17";
        String actual = tester.currencyConverter("EUR", "GBP", 500.00F);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void britishPoundToIndianRupee() {
        String expected = "41658.54";
        String actual = tester.currencyConverter("GBP", "INR", 500.00F);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void rupeeToCanadianDollar() {
        String expected = "9.66";
        String actual = tester.currencyConverter("INR", "CAD", 500.00F);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void canadianDollarToSingaporeDollar() {
        String expected = "541.67";
        String actual = tester.currencyConverter("CAD", "SGD", 500.00F);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SingaporeDollarToSwissFranc() {
        String expected = "353.15";
        String actual = tester.currencyConverter("SGD", "CHF", 500.00F);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SwissFrancToMalaysianRinggit() {
        String expected = "2212.87";
        String actual = tester.currencyConverter("CHF", "MYR", 500.00F);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MalaysianRinggitToJapaneseYen() {
        String expected = "12957.5";
        String actual = tester.currencyConverter("MYR", "JPY", 500.00F);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void JapaneseYenToChineseYuanRenminbi() {
        String expected = "29.87";
        String actual = tester.currencyConverter("JPY", "CNY", 500.00F);
        Assert.assertEquals(expected, actual);
    }


}