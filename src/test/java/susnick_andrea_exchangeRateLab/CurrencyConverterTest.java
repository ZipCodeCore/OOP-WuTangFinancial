package susnick_andrea_exchangeRateLab;

import org.junit.Assert;
import org.junit.Test;

import static susnick_andrea_exchangeRateLab.Currency.*;

public class CurrencyConverterTest {

    CurrencyConverter currencyConverter = new CurrencyConverter();

    @Test
    public void DollarToEuroTest(){
        double expected = 531.91;
        double actual = currencyConverter.currencyConversionCalculator(500, USA_DOLLAR, EURO);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void EuroToDollarTest(){
        double expected = 470.00;
        double actual = currencyConverter.currencyConversionCalculator(500, EURO, USA_DOLLAR);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void EuroToBritishPoundTest(){
        double expected = 573.17;
        double actual = currencyConverter.currencyConversionCalculator(500, EURO, BRITISH_POUND);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void BritishPoundToEuroTest(){
        double expected = 436.17;
        double actual = currencyConverter.currencyConversionCalculator(500, BRITISH_POUND, EURO);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void BritishPoundToRupeeTest(){
        double expected = 6.00;
        double actual = currencyConverter.currencyConversionCalculator(500, BRITISH_POUND, INDIAN_RUPEE);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void RupeeToCanadianDollarTest(){
        double expected = 25878.79;
        double actual = currencyConverter.currencyConversionCalculator(500, INDIAN_RUPEE, CANADIAN_DOLLAR);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void CanadianDollarToSingaporeDollarTest(){
        double expected = 461.54;
        double actual = currencyConverter.currencyConversionCalculator(500, CANADIAN_DOLLAR, SINGAPORE_DOLLAR);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void SingaporeDollarToSwissFrancTest(){
        double expected = 707.92;
        double actual = currencyConverter.currencyConversionCalculator(500, SINGAPORE_DOLLAR, SWISS_FRANC);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void SwissFrancToMalaysianRinggitTest(){
        double expected = 112.98;
        double actual = currencyConverter.currencyConversionCalculator(500, SWISS_FRANC, MALAYSIAN_RINGGIT);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void MalaysianRinggitToJapaneseYenTest(){
        double expected = 19.29;
        double actual = currencyConverter.currencyConversionCalculator(500, MALAYSIAN_RINGGIT, JAPAN_YEN);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void JapaneseYenToChineseYuanRenminbiTest(){
        double expected = 8369.94;
        double actual = currencyConverter.currencyConversionCalculator(500, JAPAN_YEN, CHINESE_YUAN_RENMINBI);
    }
}

