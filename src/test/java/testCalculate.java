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
        double actual = calculate.convertEurosToUSD(expectedSwissFranc);
        //Then
        Assert.assertEquals("Dollars to SwissFranc equate to 1.01 Swiss Francs", expectedSwissFranc, actual, .0000d);
    }

    @Test
    public void testConvertToUSSwissFranc() {
        //Given
        Calculate calculate = new Calculate();
        double usd = 410.97;
        double expectedSum = 415.07970000000006;
        //When
        double actual = calculate.convertUSDtoSwissFranc(usd);
        //Then
        Assert.assertEquals("Dollars to SwissFranc equate to 1.01 Swiss Francs", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertUSDToEuros() {
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 470;
        //When
        double actual = calculate.convertUSDToEuros(usd);
        //Then
        Assert.assertEquals("Dollars to Euros", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertUSDToPound() {
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 410;
        //When
        double actual = calculate.convertUSDToPound(usd);
        //Then
        Assert.assertEquals("Dollars to Pound", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertUSDToRupee() {
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 34160;
        //When
        double actual = calculate.convertUSDToRupee(usd);
        //Then
        Assert.assertEquals("Dollars to Rupee", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertUSDToAustralianDollar() {
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 675;
        //When
        double actual = calculate.convertUSDToAustralianDollar(usd);
        //Then
        Assert.assertEquals("Dollars to Australian Dollar", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertUSDToCanadianDollar() {
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 660;
        //When
        double actual = calculate.convertUSDToCanadianDollar(usd);
        //Then
        Assert.assertEquals("Dollars to Canadian Dollar", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertUSDToSingaporeanDollar() {
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 715;
        //When
        double actual = calculate.convertUSDToSingaporeanDollar(usd);
        //Then
        Assert.assertEquals("Dollars to Singaporean Dollar", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertUSDToRinggit() {
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 2235;
        //When
        double actual = calculate.convertUSDToRinggit(usd);
        //Then
        Assert.assertEquals("Dollars to Ringgit ", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertUSDToYen() {
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 57920;
        //When
        double actual = calculate.convertUSDToYen(usd);
        //Then
        Assert.assertEquals("Dollars to Yen", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertUSDToYuan() {
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double expectedSum = 3460;
        //When
        double actual = calculate.convertUSDToYuan(usd);
        //Then
        Assert.assertEquals("Dollars to Ringgit ", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertEurosToUSD() {
        //Given
        Calculate calculate = new Calculate();
        double euros = 470;
        double expectedSum = 500;
        //When
        double actual = calculate.convertEurosToUSD(euros);
        //Then
        Assert.assertEquals("Euros to USD ", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertEuroToUSD() {
        //Given
        Calculate calculate = new Calculate();
        double euro = 500;
        double expectedSum = 531.91;
        //When
        double actual = calculate.convertEurosToUSD(euro);
        //Then
        Assert.assertEquals("Euros to USD", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertEuroToPound() {
        //Given
        Calculate calculate = new Calculate();
        double usd = 500;
        double euro = calculate.convertUSDToEuros(usd);
        double expectedSum = 505;
        //When
        double actual = calculate.conversionMethod(euro, Currency.SWISSFRANC);
        //Then
        Assert.assertEquals("Euros to Pound", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertPoundToRupee() {
        //Given
        Calculate calculate = new Calculate();
        double pound = 500;
        //convert to usd...take usd  convert to rupee
        double rupee = calculate.convertPoundsToUSD(pound);
        //System.out.println(rupee2);
        //double rupee = calculate.conversionMethod(pound);
        double expectedSum = 41658.53;
        //When
        double actual = calculate.conversionMethod(rupee, Currency.RUPEE);
        //Then
        Assert.assertEquals("Pound to Rupee", expectedSum, actual, .0000d);

    }


    @Test
    public void testConvertRupeeToCanadianDollar() {
        //Given
        Calculate calculate = new Calculate();
        double rupee = 500;
        double canadianDollar = calculate.convertRupeeToUSD(rupee);
        double expectedSum = 9.66;
        //When
        double actual = calculate.conversionMethod(canadianDollar, Currency.CANADIANDOLLAR);
        //Then
        Assert.assertEquals("Rupee to Canadian Dollar", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertCanadianDollarToSingaporeanDollar() {
        //Given
        Calculate calculate = new Calculate();
        double canadianDollar = 500;
        double singaporeanDollar = calculate.convertCanadianDollarToUSD(canadianDollar);
        double expectedSum = 541.66;
        //When
        double actual = calculate.conversionMethod(singaporeanDollar, Currency.SINGAPORIANDOLLAR);
        //Then
        Assert.assertEquals("Canadian Dollar to Singaporean Dollar", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertSingaporeanDollarToSwissFranc() {
        //Given
        Calculate calculate = new Calculate();
        double singaporeanDollar = 500;
        double swissFranc = calculate.convertSingaporeanDollarToUSD(singaporeanDollar);
        double expectedSum = 353.14;
        //When
        double actual = calculate.conversionMethod(swissFranc, Currency.SWISSFRANC);
        //Then
        Assert.assertEquals("Singaporean Dollar to Swiss Franc", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertSwissFrancToMalaysianRinggit() {
        //Given
        Calculate calculate = new Calculate();
        double swissFranc = 500;
        double ringgit = calculate.convertSwissFrancToUSD(swissFranc);
        double expectedSum = 2212.87;
        //When
        double actual = calculate.conversionMethod(ringgit, Currency.RINGGIT);
        //Then
        Assert.assertEquals("Swiss Franc to Ringgit ", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertMalaysianRinggitToYen() {
        //Given
        Calculate calculate = new Calculate();
        double ringgit = 500;
        double yen = calculate.convertRingittToUSD(ringgit);
        double expectedSum = 12957.49;
        //When
        double actual = calculate.conversionMethod(yen, Currency.YEN);
        //Then
        Assert.assertEquals("Ringgit to Yen", expectedSum, actual, .0000d);

    }

    @Test
    public void testConvertYenToYuan() {
        //Given
        Calculate calculate = new Calculate();
        double yen = 500;
        double yuan = calculate.convertYenToUSD(yen);
        double expectedSum = 29.86;
        //When
        double actual = calculate.conversionMethod(yuan, Currency.YUAN);
        //Then
        Assert.assertEquals("Yen to Yuan", expectedSum, actual, .0000d);

    }


}
