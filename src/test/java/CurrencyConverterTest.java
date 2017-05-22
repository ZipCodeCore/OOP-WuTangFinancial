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
    public void getFXRateTest(){
        //Given
        String currency = "EUR";

        //When
        double actual = cc.getFXRate(currency);

        //Then
        Assert.assertEquals("FX rate should be 0.94", 0.94, actual, 0);
    }

}
