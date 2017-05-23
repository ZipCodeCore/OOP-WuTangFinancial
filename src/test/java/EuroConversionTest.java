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
}
