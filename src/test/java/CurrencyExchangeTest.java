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
        double expected = ce.convertFromTo(fromAmount, ce.US_DOLLAR, ce.EURO);
        double actual = 0.94;
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertEuroToDollar() {
        double fromAmount = 0.94;
        double expected = ce.convertFromTo(fromAmount, ce.EURO, ce.US_DOLLAR);
        double actual = 1.00;
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertEuroToBritishPound() {
        double fromAmount = 0.94;
        double expected = ce.convertFromTo(fromAmount, ce.EURO, ce.BRITISH_POUND);
        double actual = 0.82;
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertBritishPoundToIndianRupee() {
        double fromAmount = 0.82;
        double expected = ce.convertFromTo(fromAmount, ce.BRITISH_POUND, ce.INDIAN_RUPEE);
        double actual = 68.32;
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertRupeeToCanadianDollar() {
        double fromAmount = 68.32;
        double expected = ce.convertFromTo(fromAmount, ce.INDIAN_RUPEE, ce.CANADIAN_DOLLAR);
        double actual = 1.32;
        Assert.assertEquals(expected, actual, 0.001);
    }

    // Added Australian Dollar to Canadian Dollar, to include Australian Dollar in tests
    @Test
    public void testConvertAustralianDollarToCanadianDollar() {
        double fromAmount = 1.35;
        double expected = ce.convertFromTo(fromAmount, ce.AUSTRALIAN_DOLLAR, ce.CANADIAN_DOLLAR);
        double actual = 1.32;
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertCanadianDollarToSingaporeDollar() {
        double fromAmount = 1.32;
        double expected = ce.convertFromTo(fromAmount, ce.CANADIAN_DOLLAR, ce.SINGAPORE_DOLLAR);
        double actual = 1.43;
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertSingaporeDollarToSwissFranc() {
        double fromAmount = 1.43;
        double expected = ce.convertFromTo(fromAmount, ce.SINGAPORE_DOLLAR, ce.SWISS_FRANC);
        double actual = 1.01;
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertSwissFrancToMalaysianRinggit() {
        double fromAmount = 1.01;
        double expected = ce.convertFromTo(fromAmount, ce.SWISS_FRANC, ce.MALAYSIAN_RINGGIT);
        double actual = 4.47;
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertMalaysianRinggitToJapaneseYen() {
        double fromAmount = 4.47;
        double expected = ce.convertFromTo(fromAmount, ce.MALAYSIAN_RINGGIT, ce.JAPANESE_YEN);
        double actual = 115.84;
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertJapaneseYenToChineseYuanRenminbi() {
        double fromAmount = 115.84;
        double expected = ce.convertFromTo(fromAmount, ce.JAPANESE_YEN, ce.CHINESE_YUAN_RENMINBI);
        double actual = 6.92;
        Assert.assertEquals(expected, actual, 0.001);
    }

}
