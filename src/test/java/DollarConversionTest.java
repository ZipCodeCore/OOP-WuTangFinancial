import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/22/17.
 */
public class DollarConversionTest {

    @Test
    public void dollarsToEurosTest(){
        DollarConversion dollarConversion = new DollarConversion();

        double expected = 94.47;

        double actual = dollarConversion.dollarToEuros(100.50);

        Assert.assertEquals("This should return 94.00", expected, actual,.01);
    }

    @Test
    public void dollarsToPoundTest(){
        DollarConversion dollarConversion = new DollarConversion();

        double expected = 82.61;

        double actual = dollarConversion.dollarToPounds(100.75);

        Assert.assertEquals("This should return 82.62", expected ,actual, .01);
    }

    @Test
    public void dollarsToRupeeTest(){
        DollarConversion dollarConversion = new DollarConversion();

        double expected = 7173.60;
        double actual = dollarConversion.dollarToRupee(105);

        Assert.assertEquals("This will return 7173.60", expected ,actual,.01);
    }

    @Test
    public void dollarsToAustralianDollarTest(){
        DollarConversion dollarConversion = new DollarConversion();

        double expected = 98.55;
        double actual = dollarConversion.dollarsToAustralianDollar(73);

        Assert.assertEquals("This should return 98.55", expected, actual,.01);
    }

}
