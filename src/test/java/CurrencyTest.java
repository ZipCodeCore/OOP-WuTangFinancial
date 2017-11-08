import org.junit.Assert;
import org.junit.Test;


public class CurrencyTest {

    @Test
    public void getCurrencyRateTest(){
        Currency euro = Currency.Euro;
        double expected = 0.94;

        double actual = euro.getCurrencyRate();

        Assert.assertEquals(expected, actual, 0);
    }


}