import io.zipcoder.herion.Conversion_Logic;
import org.junit.Assert;
import org.junit.Test;

public class Conversion_Logic_Test {


    Conversion_Logic conversion = new Conversion_Logic();

    @Test
    public void DollarToEuroTest()

    {
        conversion.exchange(0, 1);

        double expected = 0.94;
        double actual = conversion.exchange(0, 1);

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void EuroToDollarTest()

    {
        conversion.exchange(1, 0);

        double expected = 0.94;
        double actual = conversion.exchange(1, 0);

        Assert.assertEquals(expected, actual, 0);


    }

    @Test
    public void EuroToBritishPoundTest()

    {
        conversion.exchange(1, 2);

        double expected = 0.7707999999999999;
        double actual = conversion.exchange(1, 2);

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void BritishPoundToIndianRupeeTest()

    {
        conversion.exchange(2, 3);

        double expected = 56.02239999999999;
        double actual = conversion.exchange(2, 3);

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void IndianRupeeToCanadianDollarTest()

    {
        conversion.exchange(3, 4);

        double expected = 92.232;
        double actual = conversion.exchange(3, 4);

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void CanadianDollarToSingaporeDollarTest()

    {
        conversion.exchange(4, 5);

        double expected = 1.7820000000000003;
        double actual = conversion.exchange(4, 5);

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void SingaporeDollarToSwissFrankTest()

    {
        conversion.exchange(6, 7);

        double expected = 1.4443;
        double actual = conversion.exchange(6, 7);

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void SwissFrankToMalaysianRinggitTest()

    {
        conversion.exchange(7, 8);

        double expected = 4.5146999999999995;
        double actual = conversion.exchange(7, 8);

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void MalaysianRinggitToJapaneseYenTest()

    {
        conversion.exchange(8, 9);

        double expected = 517.8048;
        double actual = conversion.exchange(8, 9);

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void JapaneseYenToChineseYuanRenminbi()

    {
        conversion.exchange(9, 10);

        double expected = 801.6128;
        double actual = conversion.exchange(9, 10);

        Assert.assertEquals(expected, actual, 0);

    }

}