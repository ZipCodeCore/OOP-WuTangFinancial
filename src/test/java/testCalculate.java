import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonyjones on 5/22/17.
 */
public class testCalculate {
   // Currency currency;
    @Before
    public void init() {

    }

    @Test
    public void testConvertToUSDollar() {
        //Given
        Calculate calculate = new Calculate();
        double expectedSwissFranc = 1.01;
        //When
      //  double actual = calculate.convertToUSDollar(expectedSwissFranc);

        //Then
       // Assert.assertEquals("Dollars to SwissFranc equate to 1.01 Swiss Francs", expectedSwissFranc, actual,.0000d);


    }

    @Test
    public void testConvertToUSSwissFranc(){
        //Given
        Calculate calculate = new Calculate();
        double usd = 410.97;
        double expectedSum = 415.07;
        //When
        double actual = calculate.convertUSDtoSwissFranc(usd);

        //Then
        Assert.assertEquals("Dollars to SwissFranc equate to 1.01 Swiss Francs", expectedSum, actual,.0000d);

    }

    @Test
    public void convertUSDToEuros(){
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 470;
        //When
        double actual = calculate.convertUSDToEuros(usd);
        //Then
        Assert.assertEquals("Dollars to Euros", expectedSum, actual,.0000d);

    }


    @Test
    public void testConvertSwissFrancToEuros(){
        //Given
        Calculate calculate = new Calculate();
        double swissFranc = 500;
        double expectedSum = 474.7;

        //When
        double actual = calculate.convertToUSDollar(swissFranc,Currency.EURO);

        //Then
        Assert.assertEquals("SwissFranc to Euros", expectedSum, actual,.0000d);

    }

    @Test
    public void testConvertUSDToPound(){
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 410;
        //When
        double actual = calculate.convertUSDToPound(usd);
        //Then
        Assert.assertEquals("Dollars to Pound", expectedSum, actual,.0000d);

    }

    @Test
    public void testConvertUSDToRupee(){
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 34160;
        //When
        double actual = calculate.convertUSDToRupee(usd);
        //Then
        Assert.assertEquals("Dollars to Rupee", expectedSum, actual,.0000d);

    }

    @Test
    public void testConvertUSDToAustralianDollar(){
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 675;
        //When
        double actual = calculate.convertUSDToAustralianDollar(usd);
        //Then
        Assert.assertEquals("Dollars to Australian Dollar", expectedSum, actual,.0000d);

    }

    @Test
    public void testConvertUSDToCanadianDollar(){
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 660;
        //When
        double actual = calculate.convertUSDToCanadianDollar(usd);
        //Then
        Assert.assertEquals("Dollars to Canadian Dollar", expectedSum, actual,.0000d);

    }

    @Test
    public void testConvertUSDToSingaporeanDollar(){
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 715;
        //When
        double actual = calculate.convertUSDToSingaporeanDollar(usd);
        //Then
        Assert.assertEquals("Dollars to Singaporean Dollar", expectedSum, actual,.0000d);

    }

    @Test
    public void testConvertUSDToRinggit(){
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 2235;
        //When
        double actual = calculate.convertUSDToRinggit(usd);
        //Then
        Assert.assertEquals("Dollars to Ringgit ", expectedSum, actual,.0000d);

    }

    @Test
    public void testConvertUSDToYen(){
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 57920;
        //When
        double actual = calculate.convertUSDToYen(usd);
        //Then
        Assert.assertEquals("Dollars to Yen", expectedSum, actual,.0000d);

    }

    @Test
    public void testConvertUSDToYuan(){
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 3460;
        //When
        double actual = calculate.convertUSDToYuan(usd);
        //Then
        Assert.assertEquals("Dollars to Ringgit ", expectedSum, actual,.0000d);

    }
}
