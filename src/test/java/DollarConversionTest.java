import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/22/17.
 */
public class DollarConversionTest {

    @Test
    public void dollarsToEurosTest(){
        DollarConversion dollarConversion = new DollarConversion();

        double expected = 94.00;

        double actual = dollarConversion.dollarToEuros(100);

        Assert.assertEquals("This should return 94.00", expected, actual,.05);
    }
}
