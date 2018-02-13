import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

/**
 * created by Frankie!!!
 */

public class CCTest {

    @Test
    public void testFromUSDtoEuro(){
        String start = "Us Dollar";
        String end = "Euro";
        double inValue = 5.67;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        currencyConverter.convertingInterface(inValue, start, end);
    }

    @Test
    public void testFromEurotoUSD(){
        String end = "Us Dollar";
        String start = "Euro";
        double inValue = 150.87;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        currencyConverter.convertingInterface(inValue, start, end);
    }

    @Test
    public void testFromEurotoPound(){
        String start = "EURO";
        String end = "British Pound";
        double inValue = 1590.65;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        currencyConverter.convertingInterface(inValue, start, end);
    }

    @Test
    public void testFromPoundtoRupee(){
        String end = "indian rupee";
        String start = "British Pound";
        double inValue = 1590.65;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        currencyConverter.convertingInterface(inValue, start, end);
    }

    @Test
    public void testFromRupeetoCanada(){
        String start = "indian rupee";
        String end = "canadian Dollar";
        double inValue = 76;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        currencyConverter.convertingInterface(inValue, start, end);
    }

    @Test
    public void testFromCanadatoSingapore(){
        String start = "Canadian Dollar";
        String end = "singapore dollar";
        double inValue = 150.65;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        currencyConverter.convertingInterface(inValue, start, end);
    }

    @Test
    public void testFromSingaporetoSwiss(){
        String start = "Singapore Dollar";
        String end = "Swiss Franc";
        double inValue = 1590.65;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        currencyConverter.convertingInterface(inValue, start, end);
    }

    @Test
    public void testFromEurotoPound(){
        String start = "EURO";
        String end = "British Pound";
        double inValue = 1590.65;
        CurrencyConverter currencyConverter = new CurrencyConverter(inValue);
        currencyConverter.convertingInterface(inValue, start, end);
    }

}
