import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by cameronsima on 5/22/17.
 */
public class CurrencyTests {

    @Test
    public void testCurrency() {

        double amount = 500.0;
        double rupeesInDollars = amount * Currency.INDIAN_RUPEE.getToUSRate();
        double rupeesInPounds = rupeesInDollars * Currency.BRITISH_POUND.getFromUSRate();
        System.out.printf("%s dollars is worth %s rupees \n", amount, rupeesInDollars);

        System.out.printf("%s rupees is worth %s in pounds", rupeesInDollars, rupeesInPounds);

        double expectedValue = 41658.53658536585;

        Assert.assertEquals(expectedValue, rupeesInPounds, 0.001);

    }
}
