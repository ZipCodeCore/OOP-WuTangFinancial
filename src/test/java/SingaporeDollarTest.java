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

    @Test
    public void singaporeDollarToMalaysianRinggitTest(){
        SingaporeDollar singaporeDollar = new SingaporeDollar();

        double expected = 227.76;
        double actual = singaporeDollar.singaporeDollarToMalaysianRinggit(73);

        Assert.assertEquals("This should return 227.76", expected, actual, .01);
    }

    @Test
    public void singaporeDollarToJapaneseYenTest(){
        SingaporeDollar singaporeDollar = new SingaporeDollar();

        double expected = 2187;
        double actual = singaporeDollar.singaporeDollarToJapaneseYen(27);

        Assert.assertEquals("This should return 2187", expected, actual, .01);
    }
}
