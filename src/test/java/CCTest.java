import org.junit.Assert;
import org.junit.Test;


/**
 * created by Frankie!!!
 */

public class CCTest {
    private double delta = 0;
    private final String USD = "us dollar";
    private final String euro = "euro";
    private final String bP = "british pound";
    private final String iR = "indian rupee";
    private final String a$ = "australian dollar";
    private final String c$ = "canadian dollar";
    private final String s$ = "singapore dollar";
    private final String sF = "swiss franc";
    private final String mR = "malaysian ringgit";
    private final String jY = "japanese yen";
    private final String cYR = "chinese yuan renminbi";

    @Test
    public void testFromUSDtoEuro(){
        double inValue = 5.67;
        double expected = 5.33;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, USD, euro);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testFromEurotoUSD(){
        double inValue = 150.87;
        double expected = 160.50;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, euro, USD);
        Assert.assertEquals(expected, actual, delta); }

    @Test
    public void testFromEurotoPound(){
        double inValue = 1590.65;
        double expected = 1387.59;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, euro, bP);
        Assert.assertEquals(expected, actual, delta);    }

    @Test
    public void testFromPoundtoRupee(){
        double inValue = 1590.65;
        double expected =132528.30;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, bP, iR);
        Assert.assertEquals(expected, actual, delta);    }

    @Test
    public void testFromRupeetoCanada(){
        double inValue = 76.00;
        double expected = 1.47;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, iR, c$);
        Assert.assertEquals(expected, actual, delta);    }

    @Test
    public void testFromCanadatoSingapore(){
        double inValue = 150.65;
        double expected = 163.20;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, c$, s$);
        Assert.assertEquals(expected, actual, delta);    }

    @Test
    public void testFromSingaporetoSwiss(){
        double inValue = 1590.65;
        double expected = 1123.47;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, s$, sF);
        Assert.assertEquals(expected, actual, delta);    }

    @Test
    public void testFromSwisstoMalaysia(){
        double inValue = 1.99;
        double expected = 8.81;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, sF, mR);
        Assert.assertEquals(expected, actual, delta);    }

    @Test
    public void testFromMaltoJapan(){
        double inValue = 5648.00;
        double expected = 146367.86;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, mR, jY);
        Assert.assertEquals(expected, actual, delta);    }

    @Test
    public void testFromJapantoChina(){
        double inValue = 785738;
        double expected = 46938.08;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, jY, cYR);
        Assert.assertEquals(expected, actual, delta);
    }
}
