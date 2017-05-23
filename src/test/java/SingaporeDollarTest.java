import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/23/17.
 */
public class SingaporeDollarTest {
    @Test
    public void singaporeDollarToSwissFrancTest(){
        SingaporeDollar singaporeDollar = new SingaporeDollar();

        double expected = 39.48;
        double acutal = singaporeDollar.singaporeDollarToSwissFranc(28);

        Assert.assertEquals("This should return 39.48", expected, acutal, .01);
    }
}
