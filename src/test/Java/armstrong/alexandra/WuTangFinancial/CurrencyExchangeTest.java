package armstrong.alexandra.WuTangFinancial;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexandraarmstrong on 1/11/17.
 */
public class CurrencyExchangeTest {

    CurrencyExchange currencyExchange;

    @Before
    public void setUp() {
        currencyExchange = new CurrencyExchange();
    }

    @Test
    public void setSourceCountryTest(){
        currencyExchange.setSourceCountry("British Pound");
        double expected = 0.82d;
        double actual = currencyExchange.getSourceCountry();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void setDestinationCountryTest(){
        currencyExchange.setDestinationCountry("Japanese Yen");
        double expected = 115.84d;
        double actual = currencyExchange.getDestinationCountry();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void setAmountTest(){
        currencyExchange.setAmount(42.3);
        double expected = 42.3;
        double actual = currencyExchange.getAmount();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeCurrencyTest(){
        currencyExchange.setSourceCountry("British Pound");
        currencyExchange.setDestinationCountry("Japanese Yen");
        currencyExchange.setAmount(42.3);
        double expected = 5975.64d;
        double actual = currencyExchange.exchangeCurrency();
        assertEquals(expected, actual, 0.1d);
    }

    @Test
    public void dollarToEuroTest(){
        currencyExchange.setSourceCountry("USA");
        currencyExchange.setDestinationCountry("Euro");
        currencyExchange.setAmount(2000d);
        double expected = 2000d/1d*0.94d;
        double actual = currencyExchange.exchangeCurrency();
        assertEquals(expected, actual, 0.1d);
    }

    @Test
    public void euroToDollar(){
        currencyExchange.setSourceCountry("Euro");
        currencyExchange.setDestinationCountry("USA");
        currencyExchange.setAmount(20000d);
        double expected = 20000d/0.94d*1d;
        double actual = currencyExchange.exchangeCurrency();
        assertEquals(expected, actual, 0.1d);
    }

    @Test
    public void euroToBritishPound(){
        currencyExchange.setSourceCountry("Euro");
        currencyExchange.setDestinationCountry("British Pound");
        currencyExchange.setAmount(2000d);
        double expected = 2000d/0.94d*0.82d;
        double actual = currencyExchange.exchangeCurrency();
        assertEquals(expected, actual, 0.1d);
    }

    @Test
    public void britishPoundToIndianRupee(){
        currencyExchange.setSourceCountry("British Pound");
        currencyExchange.setDestinationCountry("Indian Rupee");
        currencyExchange.setAmount(2000d);
        double expected = 2000d/0.82d*68.32d;
        double actual = currencyExchange.exchangeCurrency();
        assertEquals(expected, actual, 0.1d);
    }

    @Test
    public void rupeeToCanadianDollar(){
        currencyExchange.setSourceCountry("Indian Rupee");
        currencyExchange.setDestinationCountry("Canadian Dollar");
        currencyExchange.setAmount(2000d);
        double expected = 2000d/68.32d*1.32d;
        double actual = currencyExchange.exchangeCurrency();
        assertEquals(expected, actual, 0.1d);
    }

    @Test
    public void canadianDollartoSingaporeDolllar(){
        currencyExchange.setSourceCountry("Canadian Dollar");
        currencyExchange.setDestinationCountry("Singapore Dollar");
        currencyExchange.setAmount(2000d);
        double expected = 2000d/1.32d*1.43d;
        double actual = currencyExchange.exchangeCurrency();
        assertEquals(expected, actual, 0.1d);
    }

    @Test
    public void singaporeDollarToSwissFranc(){
        currencyExchange.setSourceCountry("Singapore Dollar");
        currencyExchange.setDestinationCountry("Swiss Franc");
        currencyExchange.setAmount(2000d);
        double expected = 2000d/1.43d*1.01d;
        double actual = currencyExchange.exchangeCurrency();
        assertEquals(expected, actual, 0.1d);
    }

    @Test
    public void swissFrancToMalaysianRinggit(){
        currencyExchange.setSourceCountry("Swiss Franc");
        currencyExchange.setDestinationCountry("Malaysian Ringgit");
        currencyExchange.setAmount(2000d);
        double expected = 2000d/1.01d*4.47d;
        double actual = currencyExchange.exchangeCurrency();
        assertEquals(expected, actual, 0.1d);
    }

    @Test
    public void malaysianRinggitToJapaneseYen(){
        currencyExchange.setSourceCountry("Malaysian Ringgit");
        currencyExchange.setDestinationCountry("Japanese Yen");
        currencyExchange.setAmount(2000d);
        double expected = 2000d/4.47d*115.84d;
        double actual = currencyExchange.exchangeCurrency();
        assertEquals(expected, actual, 0.1d);
    }

    @Test
    public void japaneseYenToChineseYuanRenminbi(){
        currencyExchange.setSourceCountry("Japanese Yen");
        currencyExchange.setDestinationCountry("Chinese Yuan Renminbi");
        currencyExchange.setAmount(2000d);
        double expected = 2000d/115.84d*6.92d;
        double actual = currencyExchange.exchangeCurrency();
        assertEquals(expected, actual, 0.1d);
    }
}
