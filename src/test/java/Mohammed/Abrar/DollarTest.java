package Mohammed.Abrar;

import org.junit.Assert;

import org.junit.Test;

public class DollarTest {

    Dollar dollar = new Dollar();

    @Test
    public void dollarCovertorTest(){

        double expected = 0;
        double actual = dollar.getDollar();

        Assert.assertEquals(expected,actual,0);

    }
    @Test
    public void euroCovertorTest(){

        double expected = 23/0.94;
        double actual = dollar.euroConvertor(23);

        Assert.assertEquals(expected,actual,0);

    }

    @Test
    public void britishPoundCovertorTest(){

        double expected = 23/0.82;
        double actual = dollar.britishPoundConvertor(23);

        Assert.assertEquals(expected,actual,0);

    }
    @Test
    public void indianRupeeCovertorTest(){

        double expected = 23/68.32;
        double actual = dollar.indianRupeeConvertor(23);

        Assert.assertEquals(expected,actual,0);

    }
    @Test
    public void australianDollarCovertorTest(){

        double expected = 23/1.35;
        double actual = dollar.australianDollarConvertor(23);

        Assert.assertEquals(expected,actual,0);

    }
    @Test
    public void canadianDollarCovertorTest(){

        double expected = 23/1.32;
        double actual = dollar.canadianDollarConvertor(23);

        Assert.assertEquals(expected,actual,0);

    }
    @Test
    public void singaporeCovertorTest(){

        double expected = 23/1.43;
        double actual = dollar.singaporeDollarConvertor(23);

        Assert.assertEquals(expected,actual,0);

    }

    @Test
    public void swissFrancCovertorTest(){

        double expected = 23/1.01;
        double actual = dollar.swissFrancConvertor(23);

        Assert.assertEquals(expected,actual,0);

    }
    @Test
    public void malaysianRinggitCovertorTest(){

        double expected = 23/4.47;
        double actual = dollar.malaysianRinggitConvertor(23);

        Assert.assertEquals(expected,actual,0);

    }
    @Test
    public void japaneseYenCovertorTest(){

        double expected = 23/115.84;
        double actual = dollar.japaneseYenConvertor(23);

        Assert.assertEquals(expected,actual,0);

    }
    @Test
    public void chineseYaunRenminibiCovertorTest(){

        double expected = 23/6.92;
        double actual = dollar.chineseYuanRenminbi(23);
        Assert.assertEquals(expected,actual,0);

    }



}