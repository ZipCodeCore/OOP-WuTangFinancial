import org.junit.Assert;
import org.junit.Test;


public class RateTest {

    @Test
    public void convertDollarToEuro() {
    /*So just like the other test we created, we want the one value to test against another and then we specify which
        country those values are from. */
        //GIVEN
        double initialValue = 1;
        double expectedValue = .94;
        String startingCurrency = "USD";
        String endingCurrency = "EUR";

        //WHEN
        Rate rate = new Rate();

        //THEN
        double results = rate.rateOfExchange(initialValue, startingCurrency, endingCurrency);
        Assert.assertEquals(expectedValue, results, .000000001);
        }
}
