import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.TreeMap;

public class CurrencyConverterTest {
    CurrencyConverter converter;

    @Before
    public void setUp(){
        converter = new CurrencyConverter();
    }



    @Test
    public void testUsdToInternational() {
        double expected = 37.60;
        double actual = converter.usdToInternational("EUR", 40);
        Assert.assertEquals(expected, actual,.01);

    }

    @Test
    public void testInternationalToUSD() {
        double expected = 42.55;
        double actual = converter.internationaltoUSD("EUR", 40);
        Assert.assertEquals(expected, actual,.01);
    }

    @Test
    public void DollarToEuro() {
        double expected = 37.60;
        double actual = converter.convertCurrency("USD", "EUR", 40 );
        Assert.assertEquals(expected, actual,.01);
    }

    @Test
    public void EuroToDollar() {
        double expected = 42.55;
        double actual = converter.convertCurrency("EUR", "USD", 40 );
        Assert.assertEquals(expected, actual,.01);
    }

    @Test
    public void EuroToBritishPound() {
        double expected = 436.17;
        double actual = converter.convertCurrency("EUR", "GBP", 500 );
        Assert.assertEquals(expected, actual,.01);

    }

    @Test
    public void BritishPoundToIndianRupee() {
        double expected = 41658.53;
        double actual = converter.convertCurrency("GBP", "Re", 500 );
        Assert.assertEquals(expected, actual,.01);
    }

    @Test
    public void RupeeToCanadianDollar() {
        double expected = 9.66;
        double actual = converter.convertCurrency("Re", "CAD", 500 );
        Assert.assertEquals(expected, actual,.01);
    }

    @Test
    public void CanadianDollarToSingaporeDollar() {
        double expected = 541.66;
        double actual = converter.convertCurrency("CAD", "SGD", 500 );
        Assert.assertEquals(expected, actual,.01);
    }

    @Test
    public void SingaporeDollarToSwissFranc() {
        double expected = 353.14;
        double actual = converter.convertCurrency("SGD", "CHF", 500 );
        Assert.assertEquals(expected, actual,.01);
    }

    @Test
    public void SwissFrancToMalaysianRinggit() {
        double expected = 2212.87;
        double actual = converter.convertCurrency("CHF", "RM", 500 );
        Assert.assertEquals(expected, actual,.01);
    }

    @Test
    public void  MalaysianRinggitToJapaneseYen() {
        double expected = 12957.49;
        double actual = converter.convertCurrency("RM", "JPY", 500 );
        Assert.assertEquals(expected, actual,.01);
    }

    @Test
    public void JapaneseYenToChineseYuanRenminbi() {
        double expected = 29.86;
        double actual = converter.convertCurrency("JPY", "CNH", 500 );
        Assert.assertEquals(expected, actual,.01);
    }



}
