import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/22/17.
 */
public class USADollarConversionTest {

    @Test
    public void americanDollarsToEurosTest(){
        USADollarConversion usaDollarConversion = new USADollarConversion();

        double expected = 94.47;

        double actual = usaDollarConversion.americanDollarToEuros(100.50);

        Assert.assertEquals("This should return 94.00", expected, actual,.01);
    }

    @Test
    public void americanDollarsToPoundTest(){
        USADollarConversion usaDollarConversion = new USADollarConversion();

        double expected = 82.61;

        double actual = usaDollarConversion.americanDollarToPounds(100.75);

        Assert.assertEquals("This should return 82.62", expected ,actual, .01);
    }

    @Test
    public void americanDollarsToRupeeTest(){
        USADollarConversion usaDollarConversion = new USADollarConversion();

        double expected = 7173.60;
        double actual = usaDollarConversion.americanDollarToRupee(105);

        Assert.assertEquals("This will return 7173.60", expected ,actual,.01);
    }

    @Test
    public void americanDollarsToAustralianDollarTest(){
        USADollarConversion usaDollarConversion = new USADollarConversion();

        double expected = 98.55;
        double actual = usaDollarConversion.americanDollarsToAustralianDollar(73);

        Assert.assertEquals("This should return 98.55", expected, actual,.01);
    }

    @Test
    public void americanDollarToCanadianDollarsTest(){
        USADollarConversion usaDollarConversion = new USADollarConversion();

        double expected =13.20;
        double actual = usaDollarConversion.americanDollarToCanadianDollars(10);

        Assert.assertEquals("This should return 13.20", expected, actual,.01);
    }

    @Test
    public void americanDollarToSingaporeDollarsTest(){
        USADollarConversion usaDollarConversion = new USADollarConversion();

        double expected = 254.54;
        double actual = usaDollarConversion.americanDollarToSingaporeDollars(178);

        Assert.assertEquals("This should return 254.54", expected, actual, 01);
    }

    @Test
    public void americanDollarToSwissFranc(){
        USADollarConversion usaDollarConversion = new USADollarConversion();

        double expected = 26.26;
        double actual = usaDollarConversion.americanDollarToSwissFranc(26);

        Assert.assertEquals("This should return 26.26", expected, actual, .01);
    }

    @Test
    public void americanDollarToMalaysianRinggitTest(){
        USADollarConversion usaDollarConversion = new USADollarConversion();

        double expected =134.10;
        double actual = usaDollarConversion.americanDollarToMalaysianRinggit(30);

        Assert.assertEquals("This should return 134.10", expected, actual, .01);
    }

    @Test
    public void americanDollarToJapaneseYenTest(){
        USADollarConversion usaDollarConversion = new USADollarConversion();

        double expected = 9267.20;
        double actual = usaDollarConversion.americanDollarToJapaneseYen(80);

        Assert.assertEquals("This should return 9267.20", expected, actual, .01);
    }
}
