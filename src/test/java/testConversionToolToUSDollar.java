import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mollyarant on 5/22/17.
 */
public class testConversionToolToUSDollar {
    ConversionToolToUSDollar conversionToolToUSDollar;
    @Before
    public void setUp(){
        conversionToolToUSDollar = new ConversionToolToUSDollar();
    }
    @Test

    public void testConvertEuroToUSDollar(){

        //given
        double euro=5.00;

        //when
        double actual= conversionToolToUSDollar.convertEuroToUSDollar(euro);

        //then
        Assert.assertEquals("Should convert euros to dollars", 5.32, actual, 0.01);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() throws IllegalArgumentException {
        conversionToolToUSDollar.convertPoundToUSDollar(-1.0);
    }

    @Test

    public void testConvertPoundToUSDollar(){
        //given
        double pound=5.00;

        //when
        double actual= conversionToolToUSDollar.convertPoundToUSDollar(pound);
        //then
        Assert.assertEquals("should convert pounds to dollars and return a string", 6.10, actual, 0.01);


    }
    @Test
    public void testConvertIndianRupeeToUSDollar(){
        //given
        double rupee= 100;
        //when
        double actual= conversionToolToUSDollar.convertIndianRupeeToUSDollar(rupee);
        //then
        Assert.assertEquals("should convert rupees into dollars and return a string", 1.46, actual, 0.01);
    }

    @Test
    public void testConvertAustralianDollarToUSDollar(){
        //given
        double australianDollar=5.00;
        //when
        double actual= conversionToolToUSDollar.convertAustralianDollarToUSDollar(australianDollar);
        //then
        Assert.assertEquals("should convert Australian dollars to US dollars", 3.70, actual, 0.01);
    }

    @Test
    public void testConvertCanadianDollarToUSDollar(){
        //given
        double canadianDollar=5.00;
        //when
        double actual= conversionToolToUSDollar.convertCanadianDollarToUSDollar(canadianDollar);
        //then
        Assert.assertEquals("should convert Canadian dollars to US dollars", 3.79, actual, 0.01);
    }

    @Test
    public void testConvertSingaporeDollarToUSDollar(){
        //given
        double singaporeDollar=5.00;
        //when
        double actual= conversionToolToUSDollar.convertSingaporeDollarToUSDollar(singaporeDollar);
        //then
        Assert.assertEquals("should convert the Singapore dollar to US dollars", 3.50, actual, 0.01);
    }

    @Test
    public void testConvertSwissFrancToUSDollar(){
        //given
        double swissFranc=5.00;
        //when
        double actual= conversionToolToUSDollar.convertSwissFrancToUSDollar(swissFranc);
        //then
        Assert.assertEquals("should convert the franc to US dollars", 4.95, actual, 0.01);
    }

    @Test
    public void testConvertMalaysianRinggitToUSDollar(){
        //given
        double ringgit=5.00;
        //when
        double actual= conversionToolToUSDollar.convertMalaysianRinggitToUSDollar(ringgit);
        //then
        Assert.assertEquals("should convert the Malaysian ringgit to US dollars", 1.12, actual, 0.01);
    }

    @Test
    public void testConvertJapaneseYenToUSDollar(){
        //given
        double yen=100.00;
        //when
        double actual= conversionToolToUSDollar.convertJapaneseYenToUSDollar(yen);
        //then
        Assert.assertEquals("should convert the yen to US dollars", 0.86, actual, 0.01);
    }

    @Test
    public void testConvertChineseYuanToUSDollar(){
        //given
        double yuan= 5.00;
        //when
        double actual= conversionToolToUSDollar.convertChineseYuanToUSDollar(yuan);
        //then
        Assert.assertEquals("should convert yuan to US dollars", 0.72, actual, 0.01);
    }















}
