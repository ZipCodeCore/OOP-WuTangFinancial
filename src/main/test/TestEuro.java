import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/23/17.
 */
public class TestEuro {
    Euro euro;

    @Before
    public void setup(){
        euro = new Euro();
    }

    @Test
    public void testConvertToEuro(){
        //: Given
        double usDollarAmountToConvert = 14.82;
        double expectedConversion = 13.93;
        //: When
        double actualConversion = euro.convertToEuro(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Euro is: 13.93",expectedConversion,actualConversion,0.001);
    }

    @Test
    public void testConvertToUSDollar(){
        double amountToConvert = 227.38;
        double expectedUSDollarAmount = 213.74 ;

        double actualConversion = euro.convertToUSDollar(amountToConvert);

        Assert.assertEquals("The expected conversion from the Euro to US Dollars is: 213.74", expectedUSDollarAmount,actualConversion,0.001);
    }



}