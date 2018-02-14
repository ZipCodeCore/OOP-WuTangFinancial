import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.TreeMap;



public class CurrencyConverterTest {

    CurrencyConverter converter;

    @Before
    public void Setup() {
        converter = new CurrencyConverter();
    }


    @Test
    public void testDollarToEuro() {
        double expected = 1128.00;
        double actual = converter.convertCurrentToDestinationCurrency(
                "Us Dollar", "Euro", 1200);
        Assert.assertEquals(expected, actual,.01 );
    }

    @Test
    public void testEuroToDollar() {
        double expected = 2180.85;
        double actual = converter.convertCurrentToDestinationCurrency(
                "Euro", "Us Dollar", 2050);
        Assert.assertEquals(expected, actual,.01 );
    }


    @Test
    public void testEuroToBritishPound() {
        double expected = 283.51;
        double actual = converter.convertCurrentToDestinationCurrency(
                "Euro", "British Pound", 325);
        Assert.assertEquals(expected, actual,.01 );
    }


    @Test
    public void testBritishPoundToIndianRupee() {
        double expected = 185797.07;
        double actual = converter.convertCurrentToDestinationCurrency(
                "British Pound", "Indian Rupee", 2230);
        Assert.assertEquals(expected, actual,.01 );
    }


    @Test
    public void testRupeeToCanadianDollar() {
        double expected = 96.60;
        double actual = converter.convertCurrentToDestinationCurrency(
                "Indian Rupee", "Canadian Dollar", 5000);
        Assert.assertEquals(expected, actual,.01 );
    }


    @Test
    public void testCanadianDollarToSingaporeDollar() {
        double expected = 59.58;
        double actual = converter.convertCurrentToDestinationCurrency(
                "Canadian Dollar", "Singapore Dollar", 55);
        Assert.assertEquals(expected, actual,.01 );
    }


    @Test
    public void testSingaporeDollarToSwissFranc() {
        double expected = 234.49;
        double actual = converter.convertCurrentToDestinationCurrency(
                "Singapore Dollar", "Swiss Franc", 332);
        Assert.assertEquals(expected, actual,.01 );
    }


    @Test
    public void testSwissFrancToMalaysianRinggit() {
        double expected = 5421.53;
        double actual = converter.convertCurrentToDestinationCurrency(
                "Swiss Franc", "Malaysian Ringgit", 1225);
        Assert.assertEquals(expected, actual, .01);
    }


    @Test
    public void testMalaysianRinggitToJapaneseYen() {
        double expected = 8292.79;
        double actual = converter.convertCurrentToDestinationCurrency(
                "Malaysian Ringgit", "Japanese Yen", 320);
       Assert.assertEquals(expected, actual,.01 );
    }

    @Test
    public void testJapaneseYenToChineseYuanRenminbi() {
        double expected = 7320.84;
        double actual = converter.convertCurrentToDestinationCurrency(
            "Japanese Yen", "Chinese Yuan Renminbi", 122550);
        Assert.assertEquals(expected, actual,.01 );
    }
}