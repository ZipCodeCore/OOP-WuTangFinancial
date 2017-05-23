import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cameronsima on 5/22/17.
 */
public class CurrencyExchangerTests {

    @Test
    public void DollarToEuroTest() {
        double expectedValue = 470.0;
        double actualValue = CurrencyConverter.convert(Currency.US_DOLLAR, Currency.EURO, 500);

        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void EuroToDollarTest() {
        double actualValue = CurrencyConverter.convert(Currency.EURO, Currency.US_DOLLAR, 500);
        double expectedValue = 531.91;

        Assert.assertEquals(expectedValue, actualValue, 0.001);

    }

    @Test
    public void EuroToBritishPoundTest() {
        double actualValue = CurrencyConverter.convert(Currency.EURO, Currency.BRITISH_POUND, 500);
        double expectedValue = 436.17;

        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void BritishPoundToRupeeTest() {
        double actualValue = CurrencyConverter.convert(Currency.BRITISH_POUND, Currency.INDIAN_RUPEE, 500);
        double expectedValue = 41658.54;

        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void RupeeToCanadianTest() {
        double actualValue = CurrencyConverter.convert(Currency.INDIAN_RUPEE, Currency.CANADIAN_DOLLAR, 500);
        double expectedValue = 9.66;

        Assert.assertEquals(expectedValue, actualValue, 0.001);

    }

    @Test
    public void CanadianDollarToSingaporeDollar() {
        double actualValue = CurrencyConverter.convert(Currency.CANADIAN_DOLLAR, Currency.SINGAPORE_DOLLAR, 500);
        double expectedValue = 541.67;

        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void SingaporeDollarToSwissFranc() {
        double actualValue = CurrencyConverter.convert(Currency.SINGAPORE_DOLLAR, Currency.SWISS_FRANC, 500);
        double expectedValue = 353.15;

        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void SwissFrancToMalaysianRinggit() {
        double actualValue = CurrencyConverter.convert(Currency.SWISS_FRANC, Currency.MALAYSIAN_RINGGIT, 500);
        double expectedValue = 2212.87;

        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void MalaysianRinggitToJapaneseYen() {
        double actualValue = CurrencyConverter.convert(Currency.MALAYSIAN_RINGGIT, Currency.JAPANESE_YEN, 500);
        double expectedValue = 12957.49;

        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void JapaneseYenToChineseYuan() {
        double actualValue = CurrencyConverter.convert(Currency.JAPANESE_YEN, Currency.CHINESE_YUAN_RENMINBI, 500);
        double expectedValue = 29.87;

        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void AustralianDollarToSwissFranc() {
        double actualValue = CurrencyConverter.convert(Currency.AUSTRALIAN_DOLLAR, Currency.SWISS_FRANC, 500);
        double expectedValue = 374.07;

        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void JapaneseYenToAustralianDollar() {
        double actualValue = CurrencyConverter.convert(Currency.JAPANESE_YEN, Currency.AUSTRALIAN_DOLLAR, 500);
        double expectedValue = 5.83;

        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }
}
