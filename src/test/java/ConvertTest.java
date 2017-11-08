import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {

    @Test
    public void convertCurrencyTest() throws Exception {
        double expected = 1.06382978723;
        double actual = Convert.convertCurency(Currency.Euro, Currency.USDollar, 1);
        Assert.assertEquals(actual, expected, 0.1);
    }

}
