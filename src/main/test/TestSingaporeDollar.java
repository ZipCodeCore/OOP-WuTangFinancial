import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/23/17.
 */
public class TestSingaporeDollar {
    SingaporeDollar singaporeDollar;

    @Before
    public void setup(){
        singaporeDollar = new SingaporeDollar();
    }

    @Test
    public void testConvertToSingaporeDollar(){
        //: Given
        double usDollarAmountToConvert = 52.11;
        double expectedConversion = 74.52;
        //: When
        double actualConversion =  singaporeDollar.convertToSingaporeDollar(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Singapore Dollar is: 74.52",expectedConversion,actualConversion,0.001);
    }

    @Test
    public void testConvertToUSDollar(){
        double amountToConvert = 99.99;
        double expectedUSDollarAmount = 69.92;

        double actualConversion = singaporeDollar.convertToUSDollar(amountToConvert);

        Assert.assertEquals("The expected conversion from Singapore Dollars to US Dollars is: 69.92", expectedUSDollarAmount,actualConversion,0.001);
    }

}
