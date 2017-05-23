package zygmundfelt.dan.wutangfinancial;

import org.junit.*;

public class TestCurrencyConverter {

    @Test
    public void USDollarToEuroTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.US_DOLLAR, CurrencyConverter.ConversionRate.EURO);
        long expected = 94;

        long actual = converter.convert(100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void EuroToUSDollarTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.EURO, CurrencyConverter.ConversionRate.US_DOLLAR);
        long expected = 106;

        long actual = converter.convert(100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void EuroToBritishPoundTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.EURO, CurrencyConverter.ConversionRate.BRITISH_POUND);
        long expected = 87;

        long actual = converter.convert(100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void BritishPoundToIndianRupeeTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.BRITISH_POUND, CurrencyConverter.ConversionRate.INDIAN_RUPEE);
        long expected = 8332;

        long actual = converter.convert(100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IndianRupeeToCanadianDollarTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.INDIAN_RUPEE, CurrencyConverter.ConversionRate.CANADIAN_DOLLAR);
        long expected = 2;

        long actual = converter.convert(100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CanadianDollarToSingaporeDollarTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.CANADIAN_DOLLAR, CurrencyConverter.ConversionRate.SINGAPORE_DOLLAR);
        long expected = 108;

        long actual = converter.convert(100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SingaporeDollarToSwissFrancTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.SINGAPORE_DOLLAR, CurrencyConverter.ConversionRate.SWISS_FRANC);
        long expected = 71;

        long actual = converter.convert(100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SwissFrancToMalaysianRinggitTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.SWISS_FRANC, CurrencyConverter.ConversionRate.MALAYSIAN_RINGGIT);
        long expected = 443;

        long actual = converter.convert(100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MalaysianRinggitToJapaneseYenTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.MALAYSIAN_RINGGIT, CurrencyConverter.ConversionRate.JAPANESE_YEN);
        long expected = 2591;

        long actual = converter.convert(100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void JapaneseYenToChineseYuanRenminbiTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.JAPANESE_YEN, CurrencyConverter.ConversionRate.CHINESE_YUAN_RENMINBI);
        long expected = 6;

        long actual = converter.convert(100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void USDollarToAustralianDollarTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.US_DOLLAR, CurrencyConverter.ConversionRate.AUSTRALIAN_DOLLAR);
        long expected = 135;

        long actual = converter.convert(100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AustralianDollarToCanadianDollarTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.AUSTRALIAN_DOLLAR, CurrencyConverter.ConversionRate.US_DOLLAR);
        long expected = 74;

        long actual = converter.convert(100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ChineseYuanRenminbiToUSDollarTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.CHINESE_YUAN_RENMINBI, CurrencyConverter.ConversionRate.US_DOLLAR);
        long expected = 14;

        long actual = converter.convert(100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void JapaneseYenToAustralianDollarZeroTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.JAPANESE_YEN, CurrencyConverter.ConversionRate.AUSTRALIAN_DOLLAR);
        long expected = 0;

        long actual = converter.convert(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void BritishPoundToIndianRupeeZeroTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.BRITISH_POUND, CurrencyConverter.ConversionRate.INDIAN_RUPEE);
        long expected = 0;

        long actual = converter.convert(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AustralianDollarToChineseYuanRenminbiNegativeTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.AUSTRALIAN_DOLLAR, CurrencyConverter.ConversionRate.CHINESE_YUAN_RENMINBI);
        long expected = -513;

        long actual = converter.convert(-100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ChineseYuanRenminbiToJapaneseYenTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.CHINESE_YUAN_RENMINBI, CurrencyConverter.ConversionRate.JAPANESE_YEN);
        long expected = -1674;

        long actual = converter.convert(-100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void USDollarToAustralianDollarNegativeTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.US_DOLLAR, CurrencyConverter.ConversionRate.AUSTRALIAN_DOLLAR);
        long expected = -135;

        long actual = converter.convert(-100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IndianRupeeToMalaysianRinggitNegativeTest() {
        CurrencyConverter converter = new CurrencyConverter(CurrencyConverter.ConversionRate.INDIAN_RUPEE, CurrencyConverter.ConversionRate.MALAYSIAN_RINGGIT);
        long expected = -7;

        long actual = converter.convert(-100);

        Assert.assertEquals(expected, actual);
    }

}
