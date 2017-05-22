import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonyjones on 5/22/17.
 */
public class testCalculate {

    @Before
    public void init() {

    }

    @Test
    public void testConvertToUSDollar() {
        //Given
        Calculate calculate = new Calculate();
        double expectedSwissFranc = 1.01;
        //When
        double actual = calculate.convertToUSDollar(expectedSwissFranc);

        //Then
        Assert.assertEquals("Dollars to SwissFranc equate to 1.01 Swiss Francs", expectedSwissFranc, actual,.0000d);


    }

    @Test
    public void testConvertToUSSwissFranc(){
        //Given
        Calculate calculate = new Calculate();
        double usd = 410.97;
        double expectedSwissFranc = 400;
        //When
        double actual = calculate.convertToUSSwissFranc(usd);

        //Then
        Assert.assertEquals("Dollars to SwissFranc equate to 1.01 Swiss Francs", expectedSwissFranc, actual,.0000d);

    }

    @Test
    public void convertToEuros(){
        //Given
        Calculate calculate = new Calculate();
        double usd = 410.97;
        double expectedSwissFranc = 400;
        //When
        double actual = calculate.convertToUSSwissFranc(usd);

        //Then
        Assert.assertEquals("Dollars to SwissFranc equate to 1.01 Swiss Francs", expectedSwissFranc, actual,.0000d);

    }
}
