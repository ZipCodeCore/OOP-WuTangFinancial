import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/23/17.
 */
public class JapaneseYenTest {

    @Test
    public void japaneseYenToChineseYuanRenminbiTest(){
        JapaneseYen japaneseYen = new JapaneseYen();

        double expected = 1243.68;
        double actual = japaneseYen.japaneseYenToChineseYuanRenminbi(48);

        Assert.assertEquals("This should return 1243.68", expected, actual, .01);
    }
}
