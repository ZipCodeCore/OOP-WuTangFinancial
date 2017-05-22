import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/22/17.
 */
public class TestCurrencyConverter {

    CurrencyConverter currencyConverter;

    @Before
    public void setup(){
        currencyConverter = new CurrencyConverter();
    }


    @Test
    public void testConvertToEuro(){
        //: Given
        double usDollarAmountToConvert = 14.82;
        double expectedConversion = 12.15;
        //: When
        double actualConversion = currencyConverter.convertToEuro(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Euro is: 12.15",expectedConversion,actualConversion,0);
    }

    @Test
    public void testConvertToBritishPound(){
        //: Given
        double usDollarAmountToConvert = 19.53;
        double expectedConversion = 16.02;
        //: When
        double actualConversion = currencyConverter.convertToBritishPound(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to British Pound is: 16.02",expectedConversion,actualConversion,0);

    }

    @Test
    public void testConvertToRupee(){
        //: Given
        double usDollarAmountToConvert = 20.00;
        double expectedConversion = 1366.40;
        //: When
        double actualConversion = currencyConverter.convertToIndianRupee(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Indian Rupee Pound is: 1366.40",expectedConversion,actualConversion,0);

    }

    @Test
    public void testConvertToAustralianDollar(){
        //: Given
        double usDollarAmountToConvert = 92.15;
        double expectedConversion = 124.41;
        //: When
        double actualConversion = currencyConverter.convertToAustralianDollar(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Australian Dollar is: 124.41",expectedConversion,actualConversion,0);

    }

    @Test
    public void testConvertToCanadianDollar(){
        //: Given
        double usDollarAmountToConvert = 192.60;
        double expectedConversion = 254.32;
        //: When
        double actualConversion = currencyConverter.convertToCanadianDollar(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Canadian Dollar is: 254.32",expectedConversion,actualConversion,0);
    }

    @Test
    public void testConvertToSingaporeDollar(){
        //: Given
        double usDollarAmountToConvert = 52.11;
        double expectedConversion = 74.52;
        //: When
        double actualConversion = currencyConverter.convertToSingaporeDollar(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Singapore Dollar is: 74.52",expectedConversion,actualConversion,0);
    }

    @Test
    public void testConvertToSwissFranc(){
        //: Given
        double usDollarAmountToConvert = 81.22;
        double expectedConversion = 82.03;
        //: When
        double actualConversion = currencyConverter.convertToSwissFranc(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Swiss Franc is: 82.03",expectedConversion,actualConversion,0);

    }

    @Test
    public void testConvertToMalaysianRinggit(){
        //: Given
        double usDollarAmountToConvert = 43.12;
        double expectedConversion = 192.75;
        //: When
        double actualConversion = currencyConverter.convertToMalaysianRinggit(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Malaysian Ringgit is: 192.75",expectedConversion,actualConversion,0);

    }

    @Test
    public void testConvertToJapaneseYen(){
        //: Given
        double usDollarAmountToConvert = 221.52;
        double expectedConversion = 25660.88;
        //: When
        double actualConversion = currencyConverter.convertToJapaneseYen(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Japanese Yen is: 25660.88",expectedConversion,actualConversion,0);

    }

    @Test
    public void testConvertToChineseYuanRenminbi(){
        //: Given
        double usDollarAmountToConvert = 68.47;
        double expectedConversion = 473.81;
        //: When
        double actualConversion = currencyConverter.convertToChineseYuanRenminbi(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Chinese Yuan Renminbi is: 473.81",expectedConversion,actualConversion,0);
    }

}
