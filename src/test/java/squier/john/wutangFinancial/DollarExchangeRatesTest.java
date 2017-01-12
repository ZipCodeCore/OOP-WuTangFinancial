package squier.john.wutangFinancial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by johnsquier on 1/12/17.
 */
public class DollarExchangeRatesTest {

    DollarExchangeRates rates;

    @Before
    public void setup() {
        rates = new DollarExchangeRates();
    }

    @Test
    public void getDollarExchangeRateTest() {
        Double expected = 0.94;
        Double actual = rates.getDollarExchangeRate("euro");
        Assert.assertEquals("I expect actual to be 0.94", expected, actual);
    }

}
