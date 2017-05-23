import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/23/17.
 */
public class TestAustralianDollar {
    AustralianDollar australianDollar;

    @Before
    public void setup(){
        australianDollar = new AustralianDollar();
    }

    @Test
    public void testConvertToAustralianDollar(){
        //: Given
        double usDollarAmountToConvert = 92.15;
        double expectedConversion = 124.40;
        //: When
        double actualConversion =   australianDollar.convertToAustralianDollar(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Australian Dollar is: 124.40",expectedConversion,actualConversion,0.001);

    }

    @Test
    public void testConvertToUSDollar(){
        double amountToConvert = 1340.00;
        double expectedUSDollarAmount = 992.59;

        double actualConversion = australianDollar.convertToUSDollar(amountToConvert);

        Assert.assertEquals("The expected conversion from Kangaroo bucks to US Dollars is: 992.59", expectedUSDollarAmount,actualConversion,0.001);
    }
}
