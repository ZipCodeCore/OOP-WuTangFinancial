package susnick_andrea_exchangeRateLab;

import org.junit.Assert;
import org.junit.Test;

import static susnick_andrea_exchangeRateLab.Currency.*;

public class CurrencyConverterTest {

    CurrencyConverter cc = new CurrencyConverter();

    @Test
    public void DollarToEuroTest(){
        double expected = 531.91;
        double actual = cc.currencyConversionCalculator(500, USD, EURO);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void EuroToDollarTest(){
        double expected = 470.00;
        double actual = cc.currencyConversionCalculator(500, EURO, USD);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void EuroToBritishPoundTest(){
        double expected = 573.17;
        double actual = cc.currencyConversionCalculator(500, EURO, GBP);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void BritishPoundToEuroTest(){
        double expected = 436.17;
        double actual = cc.currencyConversionCalculator(500, GBP, EURO);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void BritishPoundToRupeeTest(){
        double expected = 6.00;
        double actual = cc.currencyConversionCalculator(500, GBP, INR);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void RupeeToCanadianDollarTest(){
        double expected = 25878.79;
        double actual = cc.currencyConversionCalculator(500, INR, CAD);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void CanadianDollarToSingaporeDollarTest(){
        double expected = 461.54;
        double actual = cc.currencyConversionCalculator(500, CAD, SGD);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void SingaporeDollarToSwissFrancTest(){
        double expected = 707.92;
        double actual = cc.currencyConversionCalculator(500, SGD, CHF);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void SwissFrancToMalaysianRinggitTest(){
        double expected = 112.98;
        double actual = cc.currencyConversionCalculator(500, CHF, MYR);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void MalaysianRinggitToJapaneseYenTest(){
        double expected = 19.29;
        double actual = cc.currencyConversionCalculator(500, MYR, JPY);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void JapaneseYenToChineseYuanRenminbiTest(){
        double expected = 8369.94;
        double actual = cc.currencyConversionCalculator(500, JPY, CNY);
    }
}

