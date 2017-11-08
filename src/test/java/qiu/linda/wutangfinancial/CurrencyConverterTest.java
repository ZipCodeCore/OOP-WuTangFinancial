package qiu.linda.wutangfinancial;

import org.junit.Assert;
import org.junit.Test;


public class CurrencyConverterTest {

    @Test
    public void dollarToEuroTest() {
        double expected = 1.00;

        double actual = CurrencyConverter.convertCurrency(Currency.EU_EURO, Currency.USA_DOLLAR,0.94);

        Assert.assertEquals(expected, actual, .0005);
    }


    @Test
    public void euroToDollarTest()
    {
        double expected = 0.94;
        double actual = CurrencyConverter.convertCurrency(Currency.USA_DOLLAR, Currency.EU_EURO,1.0);
        Assert.assertEquals(expected, actual, .0005);
    }

    @Test
    public void euroToBritishPoundTest()  {
        double expected = 87.23;

        double actual = CurrencyConverter.convertCurrency(Currency.EU_EURO, Currency.BRITISH_POUND,100.);

        Assert.assertEquals(expected, actual, .005);
    }
    @Test
    public void britishPoundToIndianRupeeTest()  {
        double expected = 100.0;

        double actual = CurrencyConverter.convertCurrency(Currency.BRITISH_POUND, Currency.EU_EURO,87.23);

        Assert.assertEquals(expected, actual, .006);
    }
    @Test
    public void rupeeToCanadianDollarTest()  {
        double expected = 10.0;

        double actual = CurrencyConverter.convertCurrency(Currency.INDIAN_RUPEE, Currency.CANADIAN_DOLLAR,517.57);

        Assert.assertEquals(expected, actual, .005);
    }
    @Test
    public void canadianDollarToRupeeTest() {
        double expected = 517.57;

        double actual = CurrencyConverter.convertCurrency(Currency.CANADIAN_DOLLAR, Currency.INDIAN_RUPEE,10.0);

        Assert.assertEquals(expected, actual, .007);
    }
    @Test
    public void singaporeDollarToSwissFrancTest() {
        double expected = 7.06;

        double actual = CurrencyConverter.convertCurrency(Currency.SINGAPORE_DOLLAR, Currency.SWISS_FRANC,10.0);

        Assert.assertEquals(expected, actual, .005);
    }
    @Test
    public void swissFrancToMalaysianRinggit() {
        double expected = 44.25;

        double actual = CurrencyConverter.convertCurrency(Currency.SWISS_FRANC, Currency.MALAYSIAN_RINGGIT,10.0);

        Assert.assertEquals(expected, actual, .008);
    }
    @Test
    public void malaysianRinggitToJapaneseYenTest() {
        double expected = 233.23;

        double actual = CurrencyConverter.convertCurrency(Currency.MALAYSIAN_RINGGIT, Currency.JAPANESE_YEN,9.0);

        Assert.assertEquals(expected, actual, .008);
    }
    @Test
    public void japaneseYenToChineseYuanRenminbiTest()  {
        double expected = 0.59;

        double actual = CurrencyConverter.convertCurrency(Currency.JAPANESE_YEN, Currency.CHINESE_YUAN_RENMINBI,10.0);

        Assert.assertEquals(expected, actual, .008);
    }


}