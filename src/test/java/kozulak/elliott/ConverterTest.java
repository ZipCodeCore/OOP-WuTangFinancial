package kozulak.elliott;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {
    @Test
    public void euroToDollarTest() throws Exception {
        double expected = 0.94;

        double actual = Converter.convertCurency(Currency.USD, Currency.EURO,1.0);

        Assert.assertEquals(expected, actual, .0005);
    }
    @Test
    public void dollarToEuroTest() throws Exception {
        double expected = 1.00;

        double actual = Converter.convertCurency(Currency.EURO, Currency.USD,0.94);

        Assert.assertEquals(expected, actual, .0005);
    }
    @Test
    public void euroToBritishPoundTest() throws Exception {
        double expected = 87.23;

        double actual = Converter.convertCurency(Currency.EURO, Currency.BRITISH_POUND,100.);

        Assert.assertEquals(expected, actual, .005);
    }
    @Test
    public void britishPountToEuroTest() throws Exception {
        double expected = 100.0;

        double actual = Converter.convertCurency(Currency.BRITISH_POUND, Currency.EURO,87.23);

        Assert.assertEquals(expected, actual, .006);
    }
    @Test
    public void rupeeToCanadianDollarTest() throws Exception {
        double expected = 10.0;

        double actual = Converter.convertCurency(Currency.INDIAN_RUPEE, Currency.CANADIAN_DOLLAR,517.57);

        Assert.assertEquals(expected, actual, .005);
    }
    @Test
    public void canadianDollarToRupeeTest() throws Exception {
        double expected = 517.57;

        double actual = Converter.convertCurency(Currency.CANADIAN_DOLLAR, Currency.INDIAN_RUPEE,10.0);

        Assert.assertEquals(expected, actual, .007);
    }
    @Test
    public void singaporeDollarToSwissFrancTest() throws Exception {
        double expected = 7.06;

        double actual = Converter.convertCurency(Currency.SINGAPORE_DOLLAR, Currency.SWISS_FRANC,10.0);

        Assert.assertEquals(expected, actual, .005);
    }
    @Test
    public void swissFrancToMalaysianRinggit() throws Exception {
        double expected = 44.25;

        double actual = Converter.convertCurency(Currency.SWISS_FRANC, Currency.MALAYSIAN_RINGGIT,10.0);

        Assert.assertEquals(expected, actual, .008);
    }
    @Test
    public void malaysianRinngitToJapaneseYenTest() throws Exception {
        double expected = 233.23;

        double actual = Converter.convertCurency(Currency.MALAYSIAN_RINGGIT, Currency.JAPANESE_YEN,9.0);

        Assert.assertEquals(expected, actual, .008);
    }
    @Test
    public void japaneseYenToChineseYuanRenminbiTest() throws Exception {
        double expected = 0.59;

        double actual = Converter.convertCurency(Currency.JAPANESE_YEN, Currency.CHINESE_YUAN_RENMINBI,10.0);

        Assert.assertEquals(expected, actual, .008);
    }

}