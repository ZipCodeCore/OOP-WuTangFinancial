import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/22/17.
 */
public class DollarConversionTest {

    @Test
    public void dollarsToEurosTest(){
        DollarConversion dollarConversion = new DollarConversion();

        double expected = 94.50;

        double actual = dollarConversion.dollarToEuros(100.50);

        Assert.assertEquals("This should return 94.00", expected, actual,.05);
    }

    @Test
    public void dollarsToPoundTest(){
        DollarConversion dollarConversion = new DollarConversion();

        double expected = 82.61;

        double actual = dollarConversion.dollarToPounds(100.75);

        Assert.assertEquals("This should return 82.62", expected ,actual, .01);
    }

    


}
