package weisser.sarah.wtfinancial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sarahweisser on 5/22/17.
 */
public class CurrencyConverterTest {
    public static CurrencyConverter converterSwissToUS;
    public static CurrencyConverter converterSwissToYen;
    public static CurrencyConverter converterYenToUS;
    public static CurrencyConverter converterUSToSwiss;
    public static CurrencyConverter converterUSToYen;
    public static CurrencyConverter converterUSToEuro;
    public static CurrencyConverter converterUSToUS;
    public static CurrencyConverter converterEuroToUS;
    public static CurrencyConverter converterEuroToPound;
    public static CurrencyConverter converterPoundToRupee;
    public static CurrencyConverter converterRupeeToCanadian;
    public static CurrencyConverter converterCanadianToSingapore;
    public static CurrencyConverter converterSingaporeToSwiss;
    public static CurrencyConverter converterSwissToMalay;
    public static CurrencyConverter converterMalayToYen;
    public static CurrencyConverter converterYenToYuan;
    public static CurrencyCreator creator;
    public static double amount;


    @Before
    public void makeStuffForTests() {
        creator = new CurrencyCreator();
        converterSwissToUS = new CurrencyConverter(creator.setCurrency(7), creator.setCurrency(0), 1.01);
        converterYenToUS = new CurrencyConverter(creator.setCurrency(9), creator.setCurrency(0), 115.84);
        converterUSToUS = new CurrencyConverter(creator.setCurrency(0), creator.setCurrency(0), 4.5);
        converterUSToSwiss = new CurrencyConverter(creator.setCurrency(0), creator.setCurrency(7), 4);
        converterUSToYen = new CurrencyConverter(creator.setCurrency(0), creator.setCurrency(9), 3);
        converterSwissToYen = new CurrencyConverter(creator.setCurrency(7), creator.setCurrency(9), 500);
        converterUSToEuro = new CurrencyConverter(creator.setCurrency(0), creator.setCurrency(1), 50);
        converterEuroToUS = new CurrencyConverter(creator.setCurrency(1), creator.setCurrency(0), 47);
        converterEuroToPound = new CurrencyConverter(creator.setCurrency(1), creator.setCurrency(2), 47);
        converterPoundToRupee = new CurrencyConverter(creator.setCurrency(2), creator.setCurrency(3), 47);
        converterRupeeToCanadian = new CurrencyConverter(creator.setCurrency(3), creator.setCurrency(5), 50);
        converterCanadianToSingapore = new CurrencyConverter(creator.setCurrency(5), creator.setCurrency(6), 50);
        converterSingaporeToSwiss = new CurrencyConverter(creator.setCurrency(6), creator.setCurrency(7), 404);
        converterSwissToMalay = new CurrencyConverter(creator.setCurrency(7), creator.setCurrency(8), 404);
        converterMalayToYen = new CurrencyConverter(creator.setCurrency(8), creator.setCurrency(9), 404);
        converterYenToYuan = new CurrencyConverter(creator.setCurrency(9), creator.setCurrency(10), 11854);
    }
    @Test
    public void convertToUSDollarsSwissFrancs101Test() {
        //given
        String expected = "1.00";

        //when
        String actual = converterSwissToUS.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToUSDollarsYen11584Test() {
        //given
        String expected = "1.00";

        //when
        String actual = converterYenToUS.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToUSDollarsUS450Test() {
        //given
        String expected = "4.50";

        //when
        String actual = converterUSToUS.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertUS400ToSwiss() {
        //given
        String expected = "4.04";

        //when
        String actual = converterUSToSwiss.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertUS300ToYen() {
        //given
        String expected = "347.52";

        //when
        String actual = converterUSToYen.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertSwiss500ToYen() {
        //given
        String expected = "57346.53";

        //when
        String actual = converterSwissToYen.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertUS50ToEuro() {
        //given
        String expected = "47.00";

        //when
        String actual = converterUSToEuro.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertEuro47ToUS() {
        //given
        String expected = "50.00";

        //when
        String actual = converterEuroToUS.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertEuro47ToPound() {
        //given
        String expected = "41.00";

        //when
        String actual = converterEuroToPound.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertPound47ToRupee() {
        //given
        String expected = "3915.90";

        //when
        String actual = converterPoundToRupee.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertRupee50ToCanadian() {
        //given
        String expected = "0.97";

        //when
        String actual = converterRupeeToCanadian.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertCanadian50ToSingapore() {
        //given
        String expected = "54.17";

        //when
        String actual = converterCanadianToSingapore.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertSingapore404ToSwiss() {
        //given
        String expected = "285.34";

        //when
        String actual = converterSingaporeToSwiss.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertSwiss404ToMalay() {
        //given
        String expected = "1788.00";

        //when
        String actual = converterSwissToMalay.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertMalay404ToYen() {
        //given
        String expected = "10469.66";

        //when
        String actual = converterMalayToYen.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertYen11854ToYuan() {
        //given
        String expected = "708.13";

        //when
        String actual = converterYenToYuan.convertCurrency();

        //then
        Assert.assertEquals(expected, actual);
    }
}
