import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cameronsima on 5/22/17.
 */
public class CurrencyExchangerTests {

    @Test
    public void DollarToEuroTest() {

        double expectedValue = 470.0;
        double actualValue = CurrencyConverter.convert(Currency.US_DOLLAR, Currency.EURO, 500);

        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }
}
