import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/22/17.
 */
public class CanadianDollarTest {
    @Test
    public void canadianDollarToSingaporeDollarTest(){
        CanadianDollar canadianDollar = new CanadianDollar();

        double expected = 82.08;
        double actual = canadianDollar.canadianDollarToSingaporeDollar(76);

        Assert.assertEquals("This should return 82.08", expected, actual, .01);
    }
}
