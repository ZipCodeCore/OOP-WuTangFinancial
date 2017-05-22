import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by cameronsima on 5/22/17.
 */
public class CurrencyTests {

    @Test
    public void testCurrency() {

        double inUSD = Currency.BRITISH_POUND.getToUSRate(500);
        double inRupees = Currency.INDIAN_RUPEE.getToUSD(inUSD);
        System.out.printf("500 pounds is worth %s US dollars \n", inUSD);

        System.out.printf("%s dollars is worth %s rupees", inUSD, inRupees);


        double expectedValue = 410.0;

        Assert.assertEquals(expectedValue, Currency.BRITISH_POUND.getToUSD(500), 0.001);

    }
}
