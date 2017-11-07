import org.junit.Assert;
import org.junit.Test;

public class CurrencyTest {
    Currency testCurrency = new Currency("US Dollar",1.00);

    @Test
    public void getCurrencyTypeTest(){
        String expected = "US Dollar";

        String actual = testCurrency.getCurrencyType();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getRateTest(){
        double expected = 1.00;

        double actual = testCurrency.getRate();

        Assert.assertEquals(expected,actual,0);
    }


}
