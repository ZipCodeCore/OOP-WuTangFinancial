import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/22/17.
 */
public class CurrencyConverterTest {

    CurrencyConverter cc;

    @Before
    public void setUp(){
        cc = new CurrencyConverter();
    }

    @Test
    public void convertDollarToEuroTest(){
        //Given
        double amountToBeConverted = 100.00;

        //When
        double actual = cc.convert("USD", "EUR", amountToBeConverted );

        //Then
        Assert.assertEquals("Foreign amount should be 94.00", 94.00, actual, .01);
    }

    @Test
    public void convertEuroToDollarTest(){
        //Given
        double amountToBeConverted = 100.00;

        //When
        double actual = cc.convert("EUR", "USD", amountToBeConverted );

        //Then
        Assert.assertEquals("Foreign amount should be 106.38", 106.38, actual, .01);
    }

    @Test
    public void convertEuroToPoundTest(){
        //Given
        double amountToBeConverted = 100.00;

        //When
        double actual = cc.convert("EUR", "GBP", amountToBeConverted );

        //Then
        Assert.assertEquals("Foreign amount should be 87.23", 87.23, actual, .01);
    }

    @Test
    public void convertPoundToRupeeTest(){
        //Given
        double amountToBeConverted = 100.00;

        //When
        double actual = cc.convert("GBP", "INR", amountToBeConverted );

        //Then
        Assert.assertEquals("Foreign amount should be 8331.70", 8331.70, actual, .01);
    }

    @Test
    public void convertRupeeToCanadianTest(){
        //Given
        double amountToBeConverted = 100.00;

        //When
        double actual = cc.convert("INR", "CAD", amountToBeConverted );

        //Then
        Assert.assertEquals("Foreign amount should be 1.93", 1.93, actual, .01);
    }

    @Test
    public void convertCanadianToSingaporeDollarTest(){
        //Given
        double amountToBeConverted = 100.00;

        //When
        double actual = cc.convert("CAD", "SGD", amountToBeConverted );

        //Then
        Assert.assertEquals("Foreign amount should be 108.33", 108.33, actual, .01);
    }

    @Test
    public void convertSingaporeDollarToFrancTest(){
        //Given
        double amountToBeConverted = 100.00;

        //When
        double actual = cc.convert("SGD", "CHF", amountToBeConverted );

        //Then
        Assert.assertEquals("Foreign amount should be 70.62", 70.62, actual, .01);
    }

    @Test
    public void convertFrancToRinggit(){
        //Given
        double amountToBeConverted = 100.00;

        //When
        double actual = cc.convert("CHF", "MYR", amountToBeConverted );

        //Then
        Assert.assertEquals("Foreign amount should be 442.57", 442.57, actual, .01);
    }

    @Test
    public void convertRinggitToYen(){
        //Given
        double amountToBeConverted = 100.00;

        //When
        double actual = cc.convert("MYR", "JPY", amountToBeConverted );

        //Then
        Assert.assertEquals("Foreign amount should be 2591.49", 2591.49, actual, .01);
    }

    @Test
    public void convertYenToYuanTest(){
        //Given
        double amountToBeConverted = 100.00;

        //When
        double actual = cc.convert("JPY", "CNY", amountToBeConverted );

        //Then
        Assert.assertEquals("Foreign amount should be 5.97", 5.97, actual, 0.1);
    }

    @Test
    public void getFXRateTest(){
        //Given
        String currency = "EUR";

        //When
        double actual = cc.getFXRate(currency);

        //Then
        Assert.assertEquals("FX rate should be 0.94", 0.94, actual, 0);
    }

}
