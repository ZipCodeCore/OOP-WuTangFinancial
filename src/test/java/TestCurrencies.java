import org.junit.Assert;
//import org.junit.Before;
import org.junit.Before;
import org.junit.Test;

public class TestCurrencies {

    Dollar dollar;
    AustralianDollar australianDollar;
    BritishPound britishPound;
    CanadianDollar canadianDollar;
    ChineseYuan chineseYuan;
    Euro euro;
    IndianRupee indianRupee;
    JapaneseYen japaneseYen;
    MalaysianRinggit malaysianRinggit;
    SingaporeDollar singaporeDollar;
    SwissFranc swissFranc;

    @Before
    public void setUp() {
        dollar = new Dollar(1.00);
        australianDollar = new AustralianDollar(1.35);
        britishPound = new BritishPound(0.82);
        canadianDollar = new CanadianDollar(1.32);
        chineseYuan = new ChineseYuan(6.92);
        euro = new Euro(0.94);
        indianRupee = new IndianRupee(68.32);
        japaneseYen = new JapaneseYen(115.84);
        malaysianRinggit = new MalaysianRinggit(4.47);
        singaporeDollar = new SingaporeDollar(1.43);
        swissFranc = new SwissFranc(1.01);
    }

    @Test
    public void testChangeRate(){
        //Given
        indianRupee.changeRate(1000);

        //When
        double actual = indianRupee.getRate();

        //Then
        double expectedValue = 1000;
        Assert.assertTrue(actual == expectedValue);


    }

    @Test
    public void testMultiplyBy100(){
        //Given
        double initialValue = this.indianRupee.getRate();

        //When
        double actual = indianRupee.multiplyBy100(initialValue);

        //Then
        double expectedValue = 6832;
        Assert.assertTrue(actual == expectedValue);


    }

    @Test
    public void testDivideBy100(){
        //Given
        double initialValue = indianRupee.multiplyBy100(indianRupee.getRate());

        //When
        double actual = indianRupee.divideBy100(initialValue);

        //Then
        double expectedValue = 68.32;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testConvertFromDollars(){
        //Given
        double initialValue = 1;

        //When
        double actual = indianRupee.convertFromDollars(initialValue);

        //Then
        double expectedValue = 68.32;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testConvertFromDollarsWithDecimal(){
        //Given
        double initialValue = 1.5;

        //When
        double actual = indianRupee.convertFromDollars(initialValue);

        //Then
        double expectedValue = 102.48;
        Assert.assertTrue(actual == expectedValue);
    }


    @Test
    public void testConvertFromDollarsWithDecimal2(){
        //Given
        double initialValue = 100.96;

        //When
        double actual = australianDollar.convertFromDollars(initialValue);

        //Then
        double expectedValue =136.3;
        Assert.assertTrue(actual == expectedValue);

    }

    @Test
    public void testConvertToDollars(){
        //Given
        double initialValue = 68.32;

        //When
        double actual = indianRupee.convertToDollars(initialValue);

        //Then
        double expectedValue = 1;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testConvertToDollarsWithDecimal(){
        //Given
        double initialValue = 100.76;

        //When
        double actual = chineseYuan.convertToDollars(initialValue);

        //Then
        double expectedValue = 14.56;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testConvertToDollarsWithDecimal2(){
        //Given
        double initialValue = 12582.03;

        //When
        double actual = canadianDollar.convertToDollars(initialValue);

        //Then
        double expectedValue = 9531.84;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testDollarToEuro(){
        //Given
        double initialValue = 100;

        //When
        double actual = euro.convertFromDollars(initialValue);

        //Then
        double expectedValue =94;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testEuroToDollar(){
        //Given
        double initialValue = 100;

        //When
        double actual = euro.convertToDollars(initialValue);

        //Then
        double expectedValue = 106.38;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testEuroToBritishPound(){
        //Given
        double initialValue = 100;

        //When
        double actual = euro.convertToNewCurrency(initialValue, britishPound);

        //Then
        double expectedValue = 87.23;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testBritishPoundToIndianRupee(){
        //Given
        double initialValue = 100;

        //When
        double actual = britishPound.convertToNewCurrency(initialValue, indianRupee);

        //Then
        double expectedValue = 8331.62;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testIndianRupeeToCanadianDollar(){
        //Given
        double initialValue = 100;

        //When
        double actual = indianRupee.convertToNewCurrency(initialValue, canadianDollar);

        //Then
        double expectedValue = 1.93;
        Assert.assertTrue(actual == expectedValue);;
    }

    @Test
    public void testCanadianDollarToSingaporeDollar(){
        //Given
        double initialValue = 100;

        //When
        double actual = canadianDollar.convertToNewCurrency(initialValue, singaporeDollar);

        //Then
        double expectedValue = 108.34;
        Assert.assertTrue(actual == expectedValue);;
    }

    @Test
    public void testSingaporeDollarToSwissFranc(){
        //Given
        double initialValue = 100;

        //When
        double actual = singaporeDollar.convertToNewCurrency(initialValue, swissFranc);

        //Then
        double expectedValue = 70.63;
        Assert.assertTrue(actual == expectedValue);;
    }

    @Test
    public void testSwissFrancToMalaysianRinggit(){
        //Given
        double initialValue = 100;

        //When
        double actual = swissFranc.convertToNewCurrency(initialValue, malaysianRinggit);

        //Then
        double expectedValue = 442.57;
        Assert.assertTrue(actual == expectedValue);;
    }

    @Test
    public void testMalaysianRinggitToJapaneseYen(){
        //Given
        double initialValue = 100;

        //When
        double actual = malaysianRinggit.convertToNewCurrency(initialValue, japaneseYen);

        //Then
        double expectedValue = 2591.34;
        Assert.assertTrue(actual == expectedValue);;
    }

    @Test
    public void testJapaneseYenToChineseYuan(){
        //Given
        double initialValue = 100;

        //When
        double actual = japaneseYen.convertToNewCurrency(initialValue, chineseYuan);

        //Then
        double expectedValue = 5.95;
        Assert.assertTrue(actual == expectedValue);;
    }


}
