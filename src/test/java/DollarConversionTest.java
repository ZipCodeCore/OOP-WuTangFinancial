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

    @Test
    public void dollarToCanadianDollarsTest(){
        DollarConversion dollarConversion = new DollarConversion();

        double expected =13.20;
        double actual = dollarConversion.dollarToCanadianDollars(10);

        Assert.assertEquals("This should return 13.20", expected, actual,.01);
    }

    @Test
    public void dollarToSingaporeDollarsTest(){
        DollarConversion dollarConversion = new DollarConversion();

        double expected = 254.54;
        double actual = dollarConversion.dollarToSingaporeDollars(178);

        Assert.assertEquals("This should return 254.54", expected, actual, 01);
    }

    @Test
    public void dollarToSwissFranc(){
        DollarConversion dollarConversion = new DollarConversion();

        double expected = 26.26;
        double actual = dollarConversion.dollarToSwissFranc(26);

        Assert.assertEquals("This should return 26.26", expected, actual, .01);
    }

    @Test
    public void dollatToMalaysianRinggitTest(){
        DollarConversion dollarConversion = new DollarConversion();

        double expected =134.10;
        double actual = dollarConversion.dollarToMalaysianRinggit(30);

        Assert.assertEquals("This should return 134.10", expected, actual, .01);
    }
}
