import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/22/17.
 */
public class IndianRupeeTest {

    @Test
    public void indianRupeeToAustralianDollarsTest(){
        IndianRupee indianRupee = new IndianRupee();

        double expected = 4260.52;
        double actual = indianRupee.indianRupeeToAustralianDollars(84.20);

        Assert.assertEquals("This should return 4260.52", expected, actual,.01);
    }
}
