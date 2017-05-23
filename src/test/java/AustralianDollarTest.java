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

    @Test
    public void australianDollarToSingaporeDollarTest(){
        AustralianDollar australianDollar = new AustralianDollar();

        double expected = 79.80;
        double actual = australianDollar.australianDollarToSingaporeDollar(76);

        Assert.assertEquals("This should return 79.80", expected, actual, .01);
    }

    @Test
    public void australianDollarToSwissFrancTest(){
        AustralianDollar australianDollar = new AustralianDollar();

        double expected = 90.44;
        double actual = australianDollar.australianDollarToSwissFranc(68);

        Assert.assertEquals("This should return 90.44", expected, actual, .01);
    }

    @Test
    public void australianDollarToMalaysianRinggitTest(){
        AustralianDollar australianDollar = new AustralianDollar();

        double expected = 165.50;
        double actual = australianDollar.australianDollarToMalaysianRinggit(50);

        Assert.assertEquals("This should return 165.50", expected, actual, .01);
    }

    @Test
    public void australianDollarToJapaneseYenTest(){
        AustralianDollar australianDollar = new AustralianDollar();

        double expected = 2821.50;
        double actual = australianDollar.australianDollarToJapaneseYen(33);

        Assert.assertEquals("This should return 2821.50", expected, actual, .01);
    }

    @Test
    public void australianDollarToChineseYuanRenminbiTest(){
        AustralianDollar australianDollar = new AustralianDollar();

        double expected = 10.24;
        double actual = australianDollar.australianDollarToChineseYuanRenminbi(2);

        Assert.assertEquals("This should return 10.24", expected, actual, .01);
    }

    @Test
    public void australianDollarToAmericanDollarTest(){
        AustralianDollar australianDollar = new AustralianDollar();

        double expected = 39.15;
        double actual = australianDollar.australianDollarToAmericanDollar(29);

        Assert.assertEquals("This should return 39.15", expected, actual, .01);
    }

    @Test
    public void australianDollarToEuroTest(){
        AustralianDollar australianDollar = new AustralianDollar();

        double expected = 128.48;
        double actual = australianDollar.australianDollarToEuro(88);

        Assert.assertEquals("This should return 128.48", expected, actual, .01);
    }

}
