import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/23/17.
 */
public class MalaysianRinggitTest {

    @Test
    public void malaysianRinggitToJapanesYenTest(){
        MalaysianRinggit malaysianRinggit = new MalaysianRinggit();

        double expected = 1476.87;
        double actual = malaysianRinggit.malaysianRinggitToJapanesYen(57);

        Assert.assertEquals("This should return 1476.87", expected, actual, .01);
    }
}
