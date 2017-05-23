import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/23/17.
 */
public class TestAustralianDollar {
    AustralianDollar astralianDollar;

    @Before
    public void setup(){
        astralianDollar = new AustralianDollar();
    }

    @Test
    public void testConvertToAustralianDollar(){
        //: Given
        double usDollarAmountToConvert = 92.15;
        double expectedConversion = 124.41;
        //: When
        double actualConversion =   astralianDollar.convertToAustralianDollar(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Australian Dollar is: 124.41",expectedConversion,actualConversion,0.001);

    }
}
