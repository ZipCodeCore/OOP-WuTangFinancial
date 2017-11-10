package kozulak.elliott;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void euroToDollarTest() throws Exception {
        double expected = 0.94;

        double actual = Converter.convertCurrency("USD", "EUR",1.0);

        Assert.assertEquals(expected, actual, .0005);
    }
    @Test
    public void dollarToEuroTest() throws Exception {
        double expected = 1.00;

        double actual = Converter.convertCurrency(CurrencyNames.EURO.getAbbreviation(), CurrencyNames.US_DOLLAR.getAbbreviation(),0.94);

        Assert.assertEquals(expected, actual, .0005);
    }
    @Test
    public void euroToBritishPoundTest() throws Exception {
        double expected = 87.23;

        double actual = Converter.convertCurrency(CurrencyNames.EURO.getAbbreviation(), CurrencyNames.BRITISH_POUND.getAbbreviation(),100.);

        Assert.assertEquals(expected, actual, .005);
    }
    @Test
    public void britishPountToEuroTest() throws Exception {
        double expected = 100.0;

        double actual = Converter.convertCurrency(CurrencyNames.BRITISH_POUND.getAbbreviation(), CurrencyNames.EURO.getAbbreviation(),87.23);

        Assert.assertEquals(expected, actual, .006);
    }
    @Test
    public void rupeeToCanadianDollarTest() throws Exception {
        double expected = 10.0;

        double actual = Converter.convertCurrency(CurrencyNames.INDIAN_RUPEE.getAbbreviation(), CurrencyNames.CANADIAN_DOLLAR.getAbbreviation(),517.57);

        Assert.assertEquals(expected, actual, .005);
    }
    @Test
    public void canadianDollarToRupeeTest() throws Exception {
        double expected = 517.57;

        double actual = Converter.convertCurrency(CurrencyNames.CANADIAN_DOLLAR.getAbbreviation(), CurrencyNames.INDIAN_RUPEE.getAbbreviation(),10.0);

        Assert.assertEquals(expected, actual, .007);
    }
    @Test
    public void singaporeDollarToSwissFrancTest() throws Exception {
        double expected = 7.06;

        double actual = Converter.convertCurrency(CurrencyNames.SINGAPORE_DOLLAR.getAbbreviation(), CurrencyNames.SWISS_FRANC.getAbbreviation(),10.0);

        Assert.assertEquals(expected, actual, .005);
    }
    @Test
    public void swissFrancToMalaysianRinggit() throws Exception {
        double expected = 44.25;

        double actual = Converter.convertCurrency(CurrencyNames.SWISS_FRANC.getAbbreviation(), CurrencyNames.MALAYSIAN_RINGGIT.getAbbreviation(),10.0);

        Assert.assertEquals(expected, actual, .008);
    }
    @Test
    public void malaysianRinngitToJapaneseYenTest() throws Exception {
        double expected = 233.23;

        double actual = Converter.convertCurrency(CurrencyNames.MALAYSIAN_RINGGIT.getAbbreviation(), CurrencyNames.JAPANESE_YEN.getAbbreviation(),9.0);

        Assert.assertEquals(expected, actual, .008);
    }
    @Test
    public void japaneseYenToChineseYuanRenminbiTest() throws Exception {
        double expected = 0.59;

        double actual = Converter.convertCurrency(CurrencyNames.JAPANESE_YEN.getAbbreviation(), CurrencyNames.CHINESE_YUAN_RENMINBI.getAbbreviation(),10.0);

        Assert.assertEquals(expected, actual, .008);
    }

}