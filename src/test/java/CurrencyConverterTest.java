import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class CurrencyConverterTest {
    private static CurrencyConverter tester;

    @Before
    public void setUp()  {
        HashMap<String,Float>originalRecord = new HashMap<String, Float>(){{put("USD", 1.00F);put("EUR", 0.94F);put("GBP", 0.82F);put("INR", 68.32F);
            put("AUD", 1.35F);put("CAD", 1.32F);put("SGD", 1.43F);put("CHF", 1.01F);put("MYR", 4.47F);put("JPY", 115.84F);put("CNY", 6.92F);}};
        tester = new CurrencyConverter();
    }
    @Test
    public void testCurrencyConverter() {
        String expected = "$609.76";
        String actual = tester.currencyConverter("GBP", "USD", 500.00F);

        Assert.assertEquals(expected, actual);
    }
}