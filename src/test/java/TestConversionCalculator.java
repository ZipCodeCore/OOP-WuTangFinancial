import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mollyarant on 5/22/17.
 */
public class TestConversionCalculator {
    ConversionCalculator conversionCalculator;

    @Before
    public void setUp() {
        conversionCalculator = new ConversionCalculator();
    }

    @Test
    public void calculateConvertDollarToEuro() {
        //given
        double amountToConvert = 10.00;
        //when
        double actual = conversionCalculator.convertAnythingToAnything(1,2, amountToConvert);

        //then
        Assert.assertEquals("should return dollars converted to euros", 9.39, actual, 0.01);
    }

    @Test
    public void calculateConvertEuroToDollar() {
        //given
        double amountToConvert = 10.00;
        //when
        double actual = conversionCalculator.convertAnythingToAnything(2,1, amountToConvert);

        //then
        Assert.assertEquals("should return euros converted to dollars", 10.64, actual, 0.01);
    }

    @Test
    public void calculateConvertEuroToPound() {
        //given
        double amountToConvert = 10.00;
        //when
        double actual = conversionCalculator.convertAnythingToAnything(2,3, amountToConvert);

        //then
        Assert.assertEquals("should return euros converted to pounds", 8.72, actual, 0.01);
    }

    @Test
    public void calculateConvertPoundtoRupee() {
        //given
        double amountToConvert = 10.00;
        //when
        double actual = conversionCalculator.convertAnythingToAnything(3,4, amountToConvert);

        //then
        Assert.assertEquals("should return pounds converted to rupees", 833.17, actual, 0.01);
    }

    @Test
    public void calculateConvertRupeetoCanadianDollar() {
        //given
        double amountToConvert = 1000.00;
        //when
        double actual = conversionCalculator.convertAnythingToAnything(4,6, amountToConvert);

        //then
        Assert.assertEquals("should return rupees converted to canadian dollars", 19.32, actual, 0.01);
    }

    @Test
    public void calculateConvertCanadianDollartoSingaporeDollar() {
        //given
        double amountToConvert = 10.00;
        //when
        double actual = conversionCalculator.convertAnythingToAnything(6,7, amountToConvert);

        //then
        Assert.assertEquals("should return canadian dollars to singapore dollars", 10.83, actual, 0.01);
    }

    @Test
    public void calculateConvertSingaporeDollarToSwissFranc() {
        //given
        double amountToConvert = 10.00;
        //when
        double actual = conversionCalculator.convertAnythingToAnything(7,8, amountToConvert);

        //then
        Assert.assertEquals("should return singapore dollars to francs", 7.06, actual, 0.01);
    }

    @Test
    public void calculateConvertSwissFrancToRinggit() {
        //given
        double amountToConvert = 10.00;
        //when
        double actual = conversionCalculator.convertAnythingToAnything(8,9, amountToConvert);

        //then
        Assert.assertEquals("should return francs converted to ringgit", 44.25, actual, 0.01);
    }

    @Test
    public void calculateConvertRinggitToYen() {
        //given
        double amountToConvert = 10.00;
        //when
        double actual = conversionCalculator.convertAnythingToAnything(9,10, amountToConvert);

        //then
        Assert.assertEquals("should return ringgit converted to yen", 259.15, actual, 0.01);
    }

    @Test
    public void calculateConvertYentoYuan() {
        //given
        double amountToConvert = 100.00;
        //when
        double actual = conversionCalculator.convertAnythingToAnything(10,11, amountToConvert);

        //then
        Assert.assertEquals("should return yen converted to yuan", 5.97, actual, 0.01);
    }





}