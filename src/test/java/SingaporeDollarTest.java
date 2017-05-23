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

    @Test
    public void singaporeDollarToChineseYuanRenminbiTest(){
        SingaporeDollar singaporeDollar = new SingaporeDollar();

        double expected = 72.45;
        double actual = singaporeDollar.singaporeDollarToChineseYuanRenminbi(15);

        Assert.assertEquals("This should return 72.45", expected, actual, .01);
    }

    @Test
    public void singaporeDollarToAmericanDollarTest(){
        SingaporeDollar singaporeDollar = new SingaporeDollar();

        double expected = 7.15;
        double actual = singaporeDollar.singaporeDollarToAmericanDollar(5);

        Assert.assertEquals("This should return 7.15", expected, actual, .01);
    }

    @Test
    public void singaporeDollarToEuroTest(){
        SingaporeDollar singaporeDollar = new SingaporeDollar();

        double expected = 56.24;
        double actual = singaporeDollar.singaporeDollarToEuro(37);

        Assert.assertEquals("This should return 56.24", expected, actual, .01);
    }

    @Test
    public void singaporeDollarToBritishPoundTest(){
        SingaporeDollar singaporeDollar = new SingaporeDollar();

        double expected = 66.12;
        double actual = singaporeDollar.singaporeDollarToBritishPound(38);

        Assert.assertEquals("This should return 66.12", expected, actual, .01);
    }

    @Test
    public void singaporeDollarToRupeeTest(){
        SingaporeDollar singaporeDollar = new SingaporeDollar();

        double expected = 2281.97;
        double actual = singaporeDollar.singaporeDollarToRupee(47.77);

        Assert.assertEquals("This should return 2281.97", expected,actual, .01);
    }

    @Test
    public void singaporeDollarToAustralianDollarTest(){
        SingaporeDollar singaporeDollar = new SingaporeDollar();

        double expected = 79.05;
        double actual = singaporeDollar.singaporeDollarToAustralianDollar(85);

        Assert.assertEquals("This should return 79.05", expected, actual, .01);
    }

    @Test
    public void singaporeDollarToCanadianDollarTest(){
        SingaporeDollar singaporeDollar = new SingaporeDollar();

        double expected = 27.60;
        double actual = singaporeDollar.singaporeDollarToCanadianDollar(30);

        Assert.assertEquals("This should return 27.60", expected, actual, .01);
    }
}
