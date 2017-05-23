import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/23/17.
 */
public class TestBritishPound {

    BritishPound britishPound;

    @Before
    public void setup(){
        britishPound = new BritishPound();
    }

    @Test
    public void testConvertToBritishPound(){
        //: Given
        double usDollarAmountToConvert = 19.53;
        double expectedConversion = 16.02;
        //: When
        double actualConversion = britishPound.convertToBritishPound(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to British Pound is: 16.02",expectedConversion,actualConversion,0.001);

    }

}
