import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;

public class WuTangFinancialTest {

    public WuTangFinancial test = new WuTangFinancial();

    @Before
    public void setUp() {

    }

@Test
  public void testCurrencyConverter() {
    String expected = "470";
    String actual = test.currencyConverter("USD","Euro",500.00);

    Assert.assertEquals(expected,actual);
}
    public void dollarToEuro() {
        String expected = "470";
        String actual = test.currencyConverter("USD", "Euro", 500.00);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void britishPoundToDollar() {
        String expected = "609.76";
        String actual = test.currencyConverter("Pound", "USD", 500.00);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void euroToBritishPound() {
        String expected = "436.17";
        String actual = test.currencyConverter("Euro", "Pound", 500.00);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void britishPoundToIndianRupee() {
        String expected = "41658.54";
        String actual = test.currencyConverter("Pound", "Rupee", 500.00);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void rupeeToCanadianDollar() {
        String expected = "9.66";
        String actual = test.currencyConverter("Rupee", "Canadian Dollar", 500.00);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void canadianDollarToSingaporeDollar() {
        String expected = "541.67";
        String actual = test.currencyConverter("Canadian Dollar", "Singapore Dollar", 500.00);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SingaporeDollarToSwissFranc() {
        String expected = "353.15";
        String actual = test.currencyConverter("Singapore Dollar", "Swiss Franc", 500.00);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SwissFrancToMalaysianRinggit() {
        String expected = "2212.87";
        String actual = test.currencyConverter("Swiss Franc", "Malaysian Ringgit", 500.00);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MalaysianRinggitToJapaneseYen() {
        String expected = "12957.49";
        String actual = test.currencyConverter("Malaysian Ringgit", "Japanese Yen", 500.00);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void JapaneseYenToChineseYuanRenminbi() {
        String expected = "29.87";
        String actual = test.currencyConverter("Japanese Yen", "Chinese Yuan Renminbi", 500.00);
        Assert.assertEquals(expected, actual);
    }



}