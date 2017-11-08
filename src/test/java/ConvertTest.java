import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

public class ConvertTest {

    @Test
    public void convertCurrencyTest() throws Exception{
        double  expected = 1.06382978723;
        double actual = Convert.convertCurency(Currency.Euro,Currency.USDollar, 1);
        assert Assert.ASSERTS_ENABLED;


    }



}
