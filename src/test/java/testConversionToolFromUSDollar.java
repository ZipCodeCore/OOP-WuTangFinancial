import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mollyarant on 5/22/17.
 */
public class testConversionToolFromUSDollar {


    ConversionToolFromUSDollar conversionToolFromUSDollar;

    @Before
    public void setUp() {
        conversionToolFromUSDollar = new ConversionToolFromUSDollar();
    }

    @Test

    public void testConvertUSDollarToEuro() {

        //given
        double dollars = 5.00;

        //when
        double actual = conversionToolFromUSDollar.convertDollarToEuro(dollars);

        //then
        Assert.assertEquals("Should convert dollars to Euros", 4.70, actual, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() throws IllegalArgumentException {
        conversionToolFromUSDollar.convertDollarToEuro(-1.0);
    }

    @Test

    public void testConvertDollarToPound(){
        //given
        double dollar=5.00;

        //when
        double actual= conversionToolFromUSDollar.convertDollarToPound(dollar);
        //then
        Assert.assertEquals("should convert dollars to pounds", 4.10,  actual, 0.01);



    }

    @Test
    public void testConvertDollarToIndianRupee(){
        //given
        double dollar= 100;
        //when
        double actual= conversionToolFromUSDollar.convertDollarToIndianRupee(dollar);
        //then
        Assert.assertEquals("should convert dollars to rupees", 6832.00, actual, 0.01);
    }

    @Test
    public void testConvertDollarToAustralianDollar(){
        //given
        double uSDollar=5.00;
        //when
        double actual= conversionToolFromUSDollar.convertDollarToAustralianDollar(uSDollar);
        //then
        Assert.assertEquals("should convert from american dollar to australian dollar", 6.75, actual, 0.01);
    }

    @Test
    public void testConvertDollarToCanadianDollar(){
        //given
        double uSDollar=5.00;
        //when
        double actual= conversionToolFromUSDollar.convertDollarToCanadianDollar(uSDollar);
        //then
        Assert.assertEquals("should convert from american dollar to canadian dollar", 6.60, actual, 0.01);
    }

    @Test
    public void testConvertDollarToSingaporeDollar(){
        //given
        double uSDollar=5.00;
        //when
        double actual= conversionToolFromUSDollar.convertDollarToSingaporeDollar(uSDollar);
        //then
        Assert.assertEquals("should convert from american dollar to Singapore dollar", 7.15, actual, 0.01);
    }

    @Test
    public void testConvertDollarToSwissFranc(){
        //given
        double dollar=5.00;
        //when
        double actual= conversionToolFromUSDollar.convertDollarToSwissFranc(dollar);
        //then
        Assert.assertEquals("should convert from american dollar to Swiss Franc", 5.05, actual, 0.01);
    }

    @Test
    public void testConvertDollarToMalaysianRinggit(){
        //given
        double dollar=5.00;
        //when
        double actual= conversionToolFromUSDollar.convertDollarToMalaysianRinggit(dollar);
        //then
        Assert.assertEquals("should convert from american dollar to Malaysian Ringgit", 22.35, actual, 0.01);
    }

    @Test
    public void testConvertDollarToJapaneseYen(){
        //given
        double dollar=5.00;
        //when
        double actual= conversionToolFromUSDollar.convertDollarToJapaneseYen(dollar);
        //then
        Assert.assertEquals("should convert from american dollar to Japanese Yen", 579.20, actual, 0.01);
    }

    @Test
    public void testConvertDollarToChineseYuan(){
        //given
        double dollar=5.00;
        //when
        double actual= conversionToolFromUSDollar.convertDollarToChineseYuan(dollar);
        //then
        Assert.assertEquals("should convert from american dollar to Chinese Yuan", 34.60, actual, 0.01);
    }






}
