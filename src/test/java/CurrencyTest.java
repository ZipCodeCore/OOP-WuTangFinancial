import org.junit.Assert;
import org.junit.Test;

public class CurrencyTest {
    Currency testCurrency = Currency.USD;

    @Test
    public void getCurrencyTypeTest(){
        String expected = "USD";

        String actual = testCurrency.name();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getRateTest(){
        double expected = 1.00;

        double actual = testCurrency.getRate();

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void getCurrencyNameTest(){
        String expected = "US Dollar";

        String actual = testCurrency.getFullName();

        Assert.assertEquals(expected,actual);
    }

}
