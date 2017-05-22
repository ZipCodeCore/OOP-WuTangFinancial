package mattern.william;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/13/17.
 */
public class CurrencyRounderTest {

    @Test
    public void rounderTest1(){
        CurrencyRounder currencyRounder = new CurrencyRounder();
        double expected = 10000.56;
        double actual = currencyRounder.round(10000.5555555555,2);
        assertEquals(expected,actual,0.0);
    }

    @Test
    public void rounderTest2(){
        CurrencyRounder currencyRounder = new CurrencyRounder();
        double expected = -10000.56;
        double actual = currencyRounder.round(-10000.5555555555,2);
        assertEquals(expected,actual,0.0);
    }

}