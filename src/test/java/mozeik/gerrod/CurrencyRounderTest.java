package mozeik.gerrod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class CurrencyRounderTest {
    @Test

    public void rounderTest()  {
        CurrencyRounder currencyRounder = new CurrencyRounder();
        double expected = 10000.56;
        double actual = CurrencyRounder.round(10000.55556, 2);
        assertEquals("I expect this to round to 10000.56", expected, actual, 0.0);
    }

}