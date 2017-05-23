import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/22/17.
 */
public class BritishPoundTest {

    @Test
    public void britishPoundToEuroTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 39.90;
        double actual = britishPound.britishPoundToEuro(35);

        Assert.assertEquals("This should return 39.90", expected, actual, .01);
    }

    @Test
    public void britishPoundToRupeeTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 840.49;
        double actual = britishPound.britishPoundToRupee(5.95);

        Assert.assertEquals("This should return 840.49", expected, actual, .01);
    }

    @Test
    public void britishPoundToAmericanDollarTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 59.86;
        double actual = britishPound.britishPoundToAmericanDollar(73);

        Assert.assertEquals("This should return 59.86", expected, actual, .01);
    }

    @Test
    public void britishPoundToAustralianDollarTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 80.36;
        double actual = britishPound.britishPoundToAustralianDollar(49);

        Assert.assertEquals("This should return 80.36",expected,actual, .01);
    }

    @Test
    public void britishPoundToCanadianDollarTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 99.20;
        double actual = britishPound.britishPoundToCanadianDollar(62);

        Assert.assertEquals("This should return 99.20", expected, actual, .01);
    }
}
