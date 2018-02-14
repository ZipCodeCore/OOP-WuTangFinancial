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
        double results = rate.rateConverter(initialValue, startingCurrency, endingCurrency);
        Assert.assertEquals(expectedValue, results, .000000001);
    }

    @Test
    public void convertEuroToDollar() {
    /*So just like the other test we created, we want the one value to test against another and then we specify which
        country those values are from. */
        //GIVEN
        double initialValue = .94;
        double expectedValue = 1;
        String startingCurrency = "EUR";
        String endingCurrency = "USD";

        //WHEN
        Rate rate = new Rate();

        //THEN
        double results = rate.rateConverter(initialValue, startingCurrency, endingCurrency);
        Assert.assertEquals(expectedValue, results, .000000001);
    }

    @Test
    public void convertEuroToGreatBritishPd() {
    /*So just like the other test we created, we want the one value to test against another and then we specify which
        country those values are from. */
        //GIVEN
        double initialValue = .94;
        double expectedValue = .82;
        String startingCurrency = "EUR";
        String endingCurrency = "GBP";

        //WHEN
        Rate rate = new Rate();

        //THEN
        double results = rate.rateConverter(initialValue, startingCurrency, endingCurrency);
        Assert.assertEquals(expectedValue, results, .000000001);
    }

    @Test
    public void convertIndianRToCanadianDollar() {
    /*So just like the other test we created, we want the one value to test against another and then we specify which
        country those values are from. */
        //GIVEN
        double initialValue = 68.32;
        double expectedValue = 1.32;
        String startingCurrency = "INR";
        String endingCurrency = "CAD";

        //WHEN
        Rate rate = new Rate();

        //THEN
        double results = rate.rateConverter(initialValue, startingCurrency, endingCurrency);
        Assert.assertEquals(expectedValue, results, .000000001);
    }

    @Test
    public void convertCanadianDollarToSwissFranc() {
    /*So just like the other test we created, we want the one value to test against another and then we specify which
        country those values are from. */
        //GIVEN
        double initialValue = 1.32;
        double expectedValue = 1.01;
        String startingCurrency = "CAD";
        String endingCurrency = "CHF";

        //WHEN
        Rate rate = new Rate();

        //THEN
        double results = rate.rateConverter(initialValue, startingCurrency, endingCurrency);
        Assert.assertEquals(expectedValue, results, .000000001);
    }

    @Test
    public void convertSwissFrancToMalayR() {
    /*So just like the other test we created, we want the one value to test against another and then we specify which
        country those values are from. */
        //GIVEN
        double initialValue = 1.01;
        double expectedValue = 4.47;
        String startingCurrency = "CHF";
        String endingCurrency = "MYR";

        //WHEN
        Rate rate = new Rate();

        //THEN
        double results = rate.rateConverter(initialValue, startingCurrency, endingCurrency);
        Assert.assertEquals(expectedValue, results, .000000001);
    }

    @Test
    public void convertMalayRToJYen() {
    /*So just like the other test we created, we want the one value to test against another and then we specify which
        country those values are from. */
        //GIVEN
        double initialValue = 4.47;
        double expectedValue = 115.84;
        String startingCurrency = "MYR";
        String endingCurrency = "JPY";

        //WHEN
        Rate rate = new Rate();

        //THEN
        double results = rate.rateConverter(initialValue, startingCurrency, endingCurrency);
        Assert.assertEquals(expectedValue, results, .000000001);
    }

    @Test
    public void convertJYenToChineseYR() {
    /*So just like the other test we created, we want the one value to test against another and then we specify which
        country those values are from. */
        //GIVEN
        double initialValue = 115.84;
        double expectedValue = 6.92;
        String startingCurrency = "JPY";
        String endingCurrency = "CNY";

        //WHEN
        Rate rate = new Rate();

        //THEN
        double results = rate.rateConverter(initialValue, startingCurrency, endingCurrency);
        Assert.assertEquals(expectedValue, results, .000000001);
    }
}
