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

    @Test
    public void indianRupeeToCanadianDollarTest(){
        IndianRupee indianRupee = new IndianRupee();

        double expected = 2225.25;
        double actual =  indianRupee.indianRupeeToCanadianDollar(43);

        Assert.assertEquals("This sould return 2225.25", expected, actual, .01);
    }

    @Test
    public void indianRupeeToSingaporeDollarsTest(){
        IndianRupee indianRupee = new IndianRupee();

        double expected = 1576.41;
        double actual = indianRupee.indianRupeeToSinaporeDollar(33);

        Assert.assertEquals("This should return 1576.41", expected, actual, .01);
    }

    @Test
    public void indianRupeeToSwissFrancTest(){
        IndianRupee indianRupee = new IndianRupee();

        double expected = 2504.90;
        double actual = indianRupee.indianRupeeToSwissFranc(37);

        Assert.assertEquals("This should return 2504.90",expected, actual, .01);
    }

    @Test
    public void indianRupeeToMalaysianRinggitTest(){
        IndianRupee indianRupee = new IndianRupee();

        double expected = 901.52;
        double actual = indianRupee.indianRupeeToMalaysianRinggit(59);

        Assert.assertEquals("This should return 901.52", expected, actual, .01);
    }

    @Test
    public void indianRupeeToJapaneseYenTest(){
        IndianRupee indianRupee = new IndianRupee();

        double expected = 8.45;
        double actual = indianRupee.indianRupeeToJapaneseYen(5);

        Assert.assertEquals("This should return 8.45", expected, actual, .01);
    }

    @Test
    public void indianRupeeToChineseYuanRenminbiTest(){
        IndianRupee indianRupee = new IndianRupee();

        double expected = 246.74;
        double actual = indianRupee.indianRupeeToChineseYuanRenminbi(25);

        Assert.assertEquals("This should return 246.74", expected, actual, .01);
    }
    

}
