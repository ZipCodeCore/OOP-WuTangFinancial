import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/23/17.
 */
public class TestCanadianDollar {
    CanadianDollar canadianDollar;

    @Before
    public void setup(){
        canadianDollar = new CanadianDollar();
    }

    @Test
    public void testConvertToCanadianDollar(){
        //: Given
        double usDollarAmountToConvert = 192.60;
        double expectedConversion = 254.32;
        //: When
        double actualConversion = canadianDollar.convertToCanadianDollar(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Canadian Dollar is: 254.32",expectedConversion,actualConversion,0.001);
    }
}
