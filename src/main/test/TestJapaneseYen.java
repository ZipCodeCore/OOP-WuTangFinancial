import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/23/17.
 */
public class TestJapaneseYen {
    JapaneseYen japaneseYen;

    @Before
    public void setup(){
        japaneseYen = new JapaneseYen();
    }
    @Test
    public void testConvertToJapaneseYen(){
        //: Given
        double usDollarAmountToConvert = 221.52;
        double expectedConversion = 25660.88;
        //: When
        double actualConversion = japaneseYen.convertToJapaneseYen(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Japanese Yen is: 25660.88",expectedConversion,actualConversion,0.001);

    }

    @Test
    public void testConvertToUSDollar(){
        double amountToConvert = 78.25;
        double expectedUSDollarAmount = 67.55;

        double actualConversion = japaneseYen.convertToUSDollar(amountToConvert);

        Assert.assertEquals("The expected conversion from Yen to US Dollars is: 67.55", expectedUSDollarAmount,actualConversion,0.001);
    }

}
