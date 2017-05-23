import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/22/17.
 */
public class AustralianDollarTest {

    @Test
    public void australianDollarToCanadianDollarTest(){
        AustralianDollar australianDollar = new AustralianDollar();

        double expected = 9.18;
        double actual = australianDollar.australianDollarToCanadianDollar(9);

        Assert.assertEquals("This should return 9.18", expected, actual, .01);
    }
}
