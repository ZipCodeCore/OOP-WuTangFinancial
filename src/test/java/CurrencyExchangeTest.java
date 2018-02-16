import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 * Created by Luis J. Romero on 2/13/2018.
 */

public class CurrencyExchangeTest {

    CurrencyExchange ce = new CurrencyExchange();

    @Test
    public void testConvertDollarToEuro() {
        double fromAmount = 1.00;
        double expected = 0.94;
        double actual = ce.convertFromTo(fromAmount, ce.US_DOLLAR, ce.EURO);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertEuroToDollar() {
        double fromAmount = 0.94;
        double expected = 1.00;
        double actual = ce.convertFromTo(fromAmount, ce.EURO, ce.US_DOLLAR);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertEuroToBritishPound() {
        double fromAmount = 0.94;
        double expected = 0.82;
        double actual = ce.convertFromTo(fromAmount, ce.EURO, ce.BRITISH_POUND);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertBritishPoundToIndianRupee() {
        double fromAmount = 0.82;
        double expected = 68.32;
        double actual = ce.convertFromTo(fromAmount, ce.BRITISH_POUND, ce.INDIAN_RUPEE);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertRupeeToCanadianDollar() {
        double fromAmount = 68.32;
        double expected = 1.32;
        double actual = ce.convertFromTo(fromAmount, ce.INDIAN_RUPEE, ce.CANADIAN_DOLLAR);
        Assert.assertEquals(expected, actual, 0.001);
    }

    // Added Australian Dollar to Canadian Dollar, to include Australian Dollar in tests
    @Test
    public void testConvertAustralianDollarToCanadianDollar() {
        double fromAmount = 1.35;
        double expected = 1.32;
        double actual = ce.convertFromTo(fromAmount, ce.AUSTRALIAN_DOLLAR, ce.CANADIAN_DOLLAR);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertCanadianDollarToSingaporeDollar() {
        double fromAmount = 1.32;
        double expected = 1.43;
        double actual = ce.convertFromTo(fromAmount, ce.CANADIAN_DOLLAR, ce.SINGAPORE_DOLLAR);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertSingaporeDollarToSwissFranc() {
        double fromAmount = 1.43;
        double expected = 1.01;
        double actual = ce.convertFromTo(fromAmount, ce.SINGAPORE_DOLLAR, ce.SWISS_FRANC);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertSwissFrancToMalaysianRinggit() {
        double fromAmount = 1.01;
        double expected = 4.47;
        double actual = ce.convertFromTo(fromAmount, ce.SWISS_FRANC, ce.MALAYSIAN_RINGGIT);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertMalaysianRinggitToJapaneseYen() {
        double fromAmount = 4.47;
        double expected = 115.84;
        double actual = ce.convertFromTo(fromAmount, ce.MALAYSIAN_RINGGIT, ce.JAPANESE_YEN);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertJapaneseYenToChineseYuanRenminbi() {
        double fromAmount = 115.84;
        double expected = 6.92;
        double actual = ce.convertFromTo(fromAmount, ce.JAPANESE_YEN, ce.CHINESE_YUAN_RENMINBI);
        Assert.assertEquals(expected, actual, 0.001);
    }

}
