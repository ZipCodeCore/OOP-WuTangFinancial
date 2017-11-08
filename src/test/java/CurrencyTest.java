import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class CurrencyTest {



    @Test
    public void convertToTest(){

        double source = 500;
        double expected = 500*115.84;
        double actual = Currency.US_DOLLAR.convertTo(Currency.JAPANESE_YEN, source);

        CurrencyHandler currencyHandler = new CurrencyHandler();
        BigDecimal actualBigDecimal = currencyHandler.formatDecimal(actual);
        BigDecimal expectedBigDecimal = currencyHandler.formatDecimal(expected);

        Assert.assertEquals(expectedBigDecimal, actualBigDecimal);

    }

//    Convert Dollar to Euro

    @Test
    public void convertDollarToEuro() {

        double source = 500;
        double expected = 500 * 0.94;
        double actual = Currency.US_DOLLAR.convertTo(Currency.EURO, source);

        CurrencyHandler currencyHandler = new CurrencyHandler();
        BigDecimal actualBigDecimal = currencyHandler.formatDecimal(actual);
        BigDecimal expectedBigDecimal = currencyHandler.formatDecimal(expected);

        Assert.assertEquals(expectedBigDecimal,actualBigDecimal);
    }

//    Convert Euro to Dollar

    @Test
    public void convertEuroToDollar() {

        double source = 500;
        double expected = 500 * 1/0.94;
        double actual = Currency.EURO.convertTo(Currency.US_DOLLAR, source);

        CurrencyHandler currencyHandler = new CurrencyHandler();
        BigDecimal actualBigDecimal = currencyHandler.formatDecimal(actual);
        BigDecimal expectedBigDecimal = currencyHandler.formatDecimal(expected);

        Assert.assertEquals(expectedBigDecimal,actualBigDecimal);
    }

//    Convert Euro to British Pound

    @Test
    public void convertEuroToBritishPound() {

        double source = 500;
        double expected = 500 * 0.82/0.94;
        double actual = Currency.EURO.convertTo(Currency.BRITISH_POUND, source);

        CurrencyHandler currencyHandler = new CurrencyHandler();
        BigDecimal actualBigDecimal = currencyHandler.formatDecimal(actual);
        BigDecimal expectedBigDecimal = currencyHandler.formatDecimal(expected);

        Assert.assertEquals(expectedBigDecimal,actualBigDecimal);
    }


//    Convert British Pound to Indian Rupee
    @Test
    public void convertBritishPoundtoIndianRupee() {

        double source = 500;
        double expected = 500 * 68.32/0.82;
        double actual = Currency.BRITISH_POUND.convertTo(Currency.INDIAN_RUPEE, source);

        CurrencyHandler currencyHandler = new CurrencyHandler();
        BigDecimal actualBigDecimal = currencyHandler.formatDecimal(actual);
        BigDecimal expectedBigDecimal = currencyHandler.formatDecimal(expected);

        Assert.assertEquals(expectedBigDecimal,actualBigDecimal);
    }

//    Convert Rupee to Canadian Dollar
    @Test
    public void convertRupeeToCanadianDollar() {

        double source = 500;
        double expected = 500 * 1.32/68.32;
        double actual = Currency.INDIAN_RUPEE.convertTo(Currency.CANADIAN_DOLLAR, source);

        CurrencyHandler currencyHandler = new CurrencyHandler();
        BigDecimal actualBigDecimal = currencyHandler.formatDecimal(actual);
        BigDecimal expectedBigDecimal = currencyHandler.formatDecimal(expected);

        Assert.assertEquals(expectedBigDecimal,actualBigDecimal);
    }

//    Convert Canadian Dollar to Singapore Dollar

    @Test
    public void convertCanadianDollarToSingaporeDollar() {

        double source = 503;
        double expected = 503 * (1.43 / 1.32);
        double actual = Currency.CANADIAN_DOLLAR.convertTo(Currency.SINGAPORE_DOLLAR, source);

        CurrencyHandler currencyHandler = new CurrencyHandler();
        BigDecimal actualBigDecimal = currencyHandler.formatDecimal(actual);
        BigDecimal expectedBigDecimal = currencyHandler.formatDecimal(expected);

        Assert.assertEquals(expectedBigDecimal,actualBigDecimal);
    }


//    Convert Singapore Dollar to Swiss Franc

    @Test
    public void convertSingaporeDollarToSwissFranc() {

        double source = 503;
        double expected = 503 * (1.01 / 1.43);
        double actual = Currency.SINGAPORE_DOLLAR.convertTo(Currency.SWISS_FRANC, source);

        CurrencyHandler currencyHandler = new CurrencyHandler();
        BigDecimal actualBigDecimal = currencyHandler.formatDecimal(actual);
        BigDecimal expectedBigDecimal = currencyHandler.formatDecimal(expected);

        Assert.assertEquals(expectedBigDecimal,actualBigDecimal);
    }




//    Convert Swiss Franc to Malaysian Ringgit

    @Test
    public void convertSwissFrancToMalaysianRinggit() {

        double source = 503;
        double expected = 503 * (4.47 / 1.01);
        double actual = Currency.SWISS_FRANC.convertTo(Currency.MALAYSIAN_RINGGIT, source);

        CurrencyHandler currencyHandler = new CurrencyHandler();
        BigDecimal actualBigDecimal = currencyHandler.formatDecimal(actual);
        BigDecimal expectedBigDecimal = currencyHandler.formatDecimal(expected);

        Assert.assertEquals(expectedBigDecimal,actualBigDecimal);
    }



//    Convert Malaysian Ringgit to Japanese Yen

    @Test
    public void convertMalaysianRingittToJapaneseYen() {

        double source = 503;
        double expected = 503 * (115.84 / 4.47);
        double actual = Currency.MALAYSIAN_RINGGIT.convertTo(Currency.JAPANESE_YEN, source);

        CurrencyHandler currencyHandler = new CurrencyHandler();
        BigDecimal actualBigDecimal = currencyHandler.formatDecimal(actual);
        BigDecimal expectedBigDecimal = currencyHandler.formatDecimal(expected);

        Assert.assertEquals(expectedBigDecimal,actualBigDecimal);
    }



//    Convert Japanese Yen to Chinese Yuan Renminbi

    @Test
    public void convertJapaneseToChineseYuanRenminbi() {

        double source = 503;
        double expected = 503 * (6.92 / 115.84);
        double actual = Currency.JAPANESE_YEN.convertTo(Currency.CHINESE_YUAN_RENMINBI, source);

        CurrencyHandler currencyHandler = new CurrencyHandler();
        BigDecimal actualBigDecimal = currencyHandler.formatDecimal(actual);
        BigDecimal expectedBigDecimal = currencyHandler.formatDecimal(expected);

        Assert.assertEquals(expectedBigDecimal, actualBigDecimal);
    }



}