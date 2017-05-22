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
        String actual = conversionToolFromUSDollar.convertDollarToEuro(dollars);

        //then
        Assert.assertEquals("Should convert dollars to Euros", "4.70", actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() throws IllegalArgumentException {
        conversionToolFromUSDollar.convertDollarToEuro(-1.0);
    }

    @Test

    public void testConvertPoundToUSDollar(){
        //given
        double dollar=5.00;

        //when
        String actual= conversionToolFromUSDollar.convertDollarToPound(dollar);
        //then
        Assert.assertEquals("should convert dollars to pounds", "4.10",  actual);



    }

    @Test
    public void testConvertIndianRupeeToUSDollar(){
        //given
        double rupee= 100;
        //when
        String actual= conversionToolFromUSDollar.convertDollartoIndianRupee(rupee);
        //then
        Assert.assertEquals("should convert dollars to rupees", "6832.00", actual);
    }



}
