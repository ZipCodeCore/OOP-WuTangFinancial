import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/23/17.
 */
public class SwissFrancTest {

    @Test
    public void swissFrancToMalaysianRinggitTest(){
        SwissFranc swissFranc = new SwissFranc();
        
        double expected = 163.54;
        double actual = swissFranc.swissFrancToMalaysianRinggit(37);

        Assert.assertEquals("This should return 163.54", expected, actual, .01);
    }
}
