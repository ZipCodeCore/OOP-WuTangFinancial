import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

/**
 * created by Frankie!!!
 */

public class CCTest {
    private double delta = 0;

    @Test
    public void testFromUSDtoEuro(){
        String start = "Us Dollar";
        String end = "Euro";
        double inValue = 5.67;
        double expected = 5.33;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, start, end);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testFromEurotoUSD(){
        String end = "Us Dollar";
        String start = "Euro";
        double inValue = 150.87;
        double expected = 160.50;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, start, end);
        Assert.assertEquals(expected, actual, delta); }

    @Test
    public void testFromEurotoPound(){
        String start = "EURO";
        String end = "British Pound";
        double inValue = 1590.65;
        double expected = 1387.59;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, start, end);
        Assert.assertEquals(expected, actual, delta);    }

    @Test
    public void testFromPoundtoRupee(){
        String end = "indian rupee";
        String start = "British Pound";
        double inValue = 1590.65;
        double expected =132528.30;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, start, end);
        Assert.assertEquals(expected, actual, delta);    }

    @Test
    public void testFromRupeetoCanada(){
        String start = "indian rupee";
        String end = "canadian Dollar";
        double inValue = 76.00;
        double expected = 1.47;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, start, end);
        Assert.assertEquals(expected, actual, delta);    }

    @Test
    public void testFromCanadatoSingapore(){
        String start = "Canadian Dollar";
        String end = "singapore dollar";
        double inValue = 150.65;
        double expected = 163.20;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, start, end);
        Assert.assertEquals(expected, actual, delta);    }

    @Test
    public void testFromSingaporetoSwiss(){
        String start = "Singapore Dollar";
        String end = "Swiss Franc";
        double inValue = 1590.65;
        double expected = 1123.47;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, start, end);
        Assert.assertEquals(expected, actual, delta);    }

    @Test
    public void testFromSwisstoMalaysia(){
        String start = "Swiss franc";
        String end = "Malaysian Ringgit";
        double inValue = 1.99;
        double expected = 8.81;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, start, end);
        Assert.assertEquals(expected, actual, delta);    }

    @Test
    public void testFromMaltoJapan(){
        String start = "Malaysian Ringgit";
        String end = "Japanese Yen";
        double inValue = 5648.00;
        double expected = 146367.86;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, start, end);
        Assert.assertEquals(expected, actual, delta);    }

    @Test
    public void testFromJapantoChina(){
        String end = "Chinese Yuan Renminbi";
        String start = "Japanese Yen";
        double inValue = 785738;
        double expected = 46938.08;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        double actual = currencyConverter.convertingInterface(inValue, start, end);
        Assert.assertEquals(expected, actual, delta);
    }
}
