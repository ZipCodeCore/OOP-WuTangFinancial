import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/23/17.
 */
public class TestRupee {
    Rupee rupee;

    @Before
    public void setup(){
        rupee = new Rupee();
    }

    @Test
    public void testConvertToRupee(){
        //: Given
        double usDollarAmountToConvert = 20.00;
        double expectedConversion = 1366.40;
        //: When
        double actualConversion = rupee.convertToIndianRupee(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Indian Rupee Pound is: 1366.40",expectedConversion,actualConversion,0.001);

    }

    @Test
    public void testConvertToUSDollar(){
        double amountToConvert = 1349.44;
        double expectedUSDollarAmount = 19.75;

        double actualConversion = rupee.convertToUSDollar(amountToConvert);

        Assert.assertEquals("The expected conversion from Rupees to US Dollars is: 19.75", expectedUSDollarAmount,actualConversion,0.001);
    }
}
