package prahl.daniel;

import org.junit.*;

/**
 * Created by danielprahl on 5/22/17.
 */
public class CurrencyConverterTest {
    /* Minimum Testing Instructions:
    *Convert Dollar to Euro
    *Convert Euro to Dollar
    *Convert Euro to British Pound
    *Convert British Pound to Indian Rupee
    *Convert Rupee to Canadian Dollar
    *Convert Canadian Dollar to Singapore Dollar
    *Convert Singapore Dollar to Swiss Franc
    *Convert Swiss Franc to Malaysian Ringgit
    *Convert Malaysian Ringgit to Japanese Yen
    *Convert Japanese Yen to Chinese Yuan Renminbi
    */

    public static CurrencyConverter converter;
    public static double delta;

    @BeforeClass
    public static void initForTesting(){
        converter = new CurrencyConverter();
        delta = 0.0001;
    }

    @Test
    public void getConversionRateTest(){
        //given;
        String currency = "Canadian Dollar";
        double expected =  1.32; // the conversion rate relative to Us Dollar from lookup table

        //when;
        double actual = CurrencyConverter.getConversionRate(currency);
        //System.out.println(actual);

        //then;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void convertSourceToDollarsTest(){
        //given;
        String currency = "Australian Dollar"; // rate 1.35 times Us Dollar
        double sourceAmount = 216.00;
        double expected =  160; // 216 australian dollars divided by 1.35 Us Dollars

        //when;
        double actual = CurrencyConverter.convertSourceToDollars(currency, sourceAmount);
        //System.out.println(actual);

        //then;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void convertDollarsToTargetTest(){
        //given;
        String targetCurrency = "Japanese Yen"; // rate 115.84 times Us Dollar
        double sourceAmount = 216.00;
        double expected =  25021.44; // 216 japanese yen times 115.84 Us Dollars

        //when;
        double actual = CurrencyConverter.convertDollarsToTarget(targetCurrency, sourceAmount);
        //System.out.println(actual);

        //then;
        Assert.assertEquals(expected, actual, delta);
    }

  /*
  *  full conversion tests from source to target
  */
    @Test
    public void convertDollarToEuroTest() {
        //given;
        double sourceAmount = 216.00;
        double expected = 203.04; // (216/1.0)*0.94

        //when;
        double actual = CurrencyConverter.convert("Us Dollar", sourceAmount, "Euro");
        //System.out.println(actual);

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void convertEuroToDollarTest() {
        //given;
        double sourceAmount = 216.00;
        double expected = 229.7872; // (216/0.94)*1.0

        //when;
        double actual = CurrencyConverter.convert("Euro", sourceAmount, "Us Dollar");
        //System.out.println(actual);

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void convertEuroToBritishPoundTest() {
        //given;
        double sourceAmount = 216.00;
        double expected = 188.4255; // (216/0.94)*0.82

        //when;
        double actual = CurrencyConverter.convert("Euro", sourceAmount, "British Pound");
        //System.out.println(actual);

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void convertBritishPoundToIndianRupeeTest() {
        //given;
        double sourceAmount = 216.00;
        double expected = 17996.4878; // (216/0.82)*68.32

        //when;
        double actual = CurrencyConverter.convert("British Pound", sourceAmount, "Indian Rupee");
        //System.out.println(actual);

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void convertRupeeToCanadianDollarTest() {
        //given;
        double sourceAmount = 216.00;
        double expected = 4.1733; // (216/68.32)*1.32

        //when;
        double actual = CurrencyConverter.convert("Indian Rupee", sourceAmount, "Canadian Dollar");
        //System.out.println(actual);

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void convertCanadianDollarToSingaporeDollarTest() {
        //given;
        double sourceAmount = 216.00;
        double expected = 233.9999; // (216/1.32)*1.43

        //when;
        double actual = CurrencyConverter.convert("Canadian Dollar", sourceAmount, "Singapore Dollar");
        //System.out.println(actual);

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void convertSingaporeDollarToSwissFrancTest() {
        //given;
        double sourceAmount = 216.00;
        double expected = 152.5594; // (216/1.43)*1.01

        //when;
        double actual = CurrencyConverter.convert("Singapore Dollar", sourceAmount, "Swiss Franc");
        //System.out.println(actual);

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void convertSwissFrancToMalaysianRinggitTest() {
        //given;
        double sourceAmount = 216.00;
        double expected = 955.9603; // (216/1.01)*4.47

        //when;
        double actual = CurrencyConverter.convert("Swiss Franc", sourceAmount, "Malaysian Ringgit");
        //System.out.println(actual);

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void convertMalaysianRinggitToJapaneseYenTest() {
        //given;
        double sourceAmount = 216.00;
        double expected = 5597.6376; // (216/4.47)*115.84

        //when;
        double actual = CurrencyConverter.convert("Malaysian Ringgit", sourceAmount, "Japanese Yen");
        //System.out.println(actual);

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void convertJapaneseYenToChineseYuanRenminbiTest() {
        //given;
        double sourceAmount = 216.00;
        double expected = 12.9033; // (216/115.84)*6.92

        //when;
        double actual = CurrencyConverter.convert("Japanese Yen", sourceAmount, "Chinese Yuan Renminbi");
        //System.out.println(actual);

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

// End of Class
}
