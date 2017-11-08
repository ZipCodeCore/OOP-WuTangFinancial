package susnick_andrea_exchangeRateLab;

import org.junit.Assert;
import org.junit.Test;

import static susnick_andrea_exchangeRateLab.Currency.*;

//        Convert Dollar to Euro
//        Convert Euro to Dollar
//        Convert Euro to British Pound
//        Convert British Pound to Indian Rupee
//        Convert Rupee to Canadian Dollar
//        Convert Canadian Dollar to Singapore Dollar
//        Convert Singapore Dollar to Swiss Franc
//        Convert Swiss Franc to Malaysian Ringgit
//        Convert Malaysian Ringgit to Japanese Yen
//        Convert Japanese Yen to Chinese Yuan Renminbi

public class CurrencyConverterTest {

    CurrencyConverter currencyConverter = new CurrencyConverter();

    @Test
    public void DollarToEuroTest(){
        double expected = 531.91;
        double actual = currencyConverter.currencyConversionCalculator(500, USA_DOLLAR, EURO);
        Assert.assertEquals(expected, actual, 0);
    }

//    @Test
//    public void EuroToDollarTest(){
//        double expected = 470.00;
//        double actual = currencyConverter.currencyConversionCalculator(500, "euro", "usa dollar");
//        Assert.assertEquals(expected, actual, 0);
//    }
//
//    @Test
//    public void EuroToBritishPoundTest(){
//        double expected = 573.17;
//        double actual = currencyConverter.currencyConversionCalculator(500, "euro", "british pound");
//        Assert.assertEquals(expected, actual, 0);
//    }
//
//    @Test
//    public void BritishPoundToEuroTest(){
//        double expected = 436.17;
//        double actual = currencyConverter.currencyConversionCalculator(500, "british pound", "euro");
//        Assert.assertEquals(expected, actual, 0);
//    }
//
//    @Test
//    public void BritishPoundToRupeeTest(){
//        double expected = 6.00;
//        double actual = currencyConverter.currencyConversionCalculator(500, "", Currency.indRupee);
//        Assert.assertEquals(expected, actual, 0);
//    }
//
//    @Test
//    public void RupeeToCanadianDollarTest(){
//        double expected = 25878.79;
//        double actual = currencyConverter.currencyConversionCalculator(500, Currency.indRupee, Currency.canDollar);
//        Assert.assertEquals(expected, actual, 0);
//    }
//
//    @Test
//    public void CanadianDollarToSingaporeDollarTest(){
//        double expected = 461.54;
//        double actual = currencyConverter.currencyConversionCalculator(500, Currency.canDollar, Currency.singDollar);
//        Assert.assertEquals(expected, actual, 0);
//    }
//
//    @Test
//    public void SingaporeDollarToSwissFrancTest(){
//        double expected = 707.92;
//        double actual = currencyConverter.currencyConversionCalculator(500, Currency.singDollar, Currency.swissFranc);
//        Assert.assertEquals(expected, actual, 0);
//    }
//
//    @Test
//    public void SwissFrancToMalaysianRinggitTest(){
//        double expected = 112.98;
//        double actual = currencyConverter.currencyConversionCalculator(500, Currency.swissFranc, Currency.malaRinggit);
//        Assert.assertEquals(expected, actual, 0);
//    }
//
//    @Test
//    public void MalaysianRinggitToJapaneseYenTest(){
//        double expected = 19.29;
//        double actual = currencyConverter.currencyConversionCalculator(500, Currency.malaRinggit, Currency.japanYen);
//        Assert.assertEquals(expected, actual, 0);
//    }
//
//    @Test
//    public void JapaneseYenToChineseYuanRenminbiTest(){
//        double expected = 8369.94;
//        double actual = currencyConverter.currencyConversionCalculator(500, Currency.japanYen, Currency.chineYuanRen);
//        Assert.assertEquals(expected, actual, 0);
//    }
}
