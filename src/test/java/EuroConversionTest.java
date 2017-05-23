import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/22/17.
 */
public class EuroConversionTest {

    @Test
    public void euroToBritishPoundTest(){
        EuroConversion euroConversion = new EuroConversion();

        double expected =  8.70;
        double actual = euroConversion.euroToBritishPound(10);

        Assert.assertEquals("This should return 8.70", expected ,actual, .01);
    }

    @Test
    public void euroToAmericanDollarsTest(){
        EuroConversion euroConversion = new EuroConversion();

        double expected = 14.10;
        double actual = euroConversion.euroToAmericanDollars(15);

        Assert.assertEquals("This should return 14.10", expected, actual, .01);
    }

    @Test
    public void euroToRupeeTest(){
        EuroConversion euroConversion = new EuroConversion();

        double expected = 3661.61;
        double actual = euroConversion.euroToRupee(50.38);

        Assert.assertEquals("This should return 3661.61", expected, actual, .01);
    }

    @Test
    public void euroToAustralianDollarTest(){
        EuroConversion euroConversion = new EuroConversion();

        double expected = 86.14;
        double actual = euroConversion.euroToAustralianDollar(60.24);

        Assert.assertEquals("This should return 86.14", expected, actual, .01);
    }

    @Test
    public void euroToCanadianDollarTest(){
        EuroConversion euroConversion = new EuroConversion();

        double expected = 25.67;
        double actual = euroConversion.euroToCanadianDollar(18.34);

        Assert.assertEquals("This should return 25.67", expected, actual, .01);
    }

    @Test
    public void euroToSingaporeDollar(){
        EuroConversion euroConversion = new EuroConversion();

        double expected = 68.78;
        double actual = euroConversion.euroToSingaporeDollar(45.25);

        Assert.assertEquals("This should return 68.78", expected , actual , .01);
    }

    @Test
    public void euroToSwissFrancTest(){
        EuroConversion euroConversion = new EuroConversion();

        double expected =105.93;
        double actual = euroConversion.euroToSwissFranc(99);

        Assert.assertEquals("This should return 105.93", expected, actual, .01);
    }

    @Test
    public void euroToMalaysianRinggitTest(){
        EuroConversion euroConversion = new EuroConversion();

        double expected = 23.75;
        double actual = euroConversion.euroToMalaysianRinggit(5);

        Assert.assertEquals("This should return 23.75", expected, actual, .01);
    }

    @Test
    public void euroToJapaneseYenTest(){
        EuroConversion euroConversion = new EuroConversion();

        double expected = 7640.26;
        double actual = euroConversion.euroToJapaneseYen(62);

        Assert.assertEquals("This should return 7640.26", expected,actual,.01);
    }

    @Test
    public void euroToYuanRenminbiTest(){
        EuroConversion euroConversion = new EuroConversion();

        double expected = 390.08;
        double actual = euroConversion.euroToYuanRenminbi(53);

        Assert.assertEquals("This should rueturn 390.08", expected, actual, .01);
    }

}
