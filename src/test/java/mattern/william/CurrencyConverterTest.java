package mattern.william;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/12/17.
 */
public class CurrencyConverterTest {
    @Test
    public void currencyConverterValueTest(){
        CurrencyConverter c = new CurrencyConverter();
        Double expected = 1.21;
        Double actual = c.convertInputValueToOutputValue(1.1,1.1);
        assertEquals("I expect the output double to be 1.21",actual,expected);
    }

    @Test
    public void deepCurrencyConverterValueTest(){
        CurrencyConverter c2 = new CurrencyConverter();
        Double expected = 1000000.59;
        Double actual = c2.convertInputValueToOutputValue(1000000.591111111,1.000000000);
        assertEquals("I expect 1000000.59",actual,expected);
    }

    @Test
    public void currencyRounderTest(){
        CurrencyConverter c = new CurrencyConverter();
        Double expected = 12.34;
        Double actual = c.round(12.341236765,2);
        assertEquals("I expect this 1 to get rounded to 1.00",expected,actual);
        System.out.println(actual);
    }

}