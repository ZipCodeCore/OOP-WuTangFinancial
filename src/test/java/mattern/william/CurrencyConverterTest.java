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
        Double expected = 124.18;
        Double actual = c2.convertInputValueToOutputValue(100.591111111,1.234500000000);
        assertEquals("I expect 124.18",actual,expected);
    }
}