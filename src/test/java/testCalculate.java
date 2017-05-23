import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anthonyjones on 5/22/17.
 */
public class testCalculate {

    @Test
    public void testConvertToUSDollar() {
        //Given
        Calculate calculate = new Calculate();
        double australianDollar = 500;
        double expected = 370.37;
        //When
        double actual = calculate.convertAustralianDollarToUSD(australianDollar);
        //Then
        Assert.assertEquals("300 pounds to dollars is $365.85", expected, actual, .000000005);
    }

    @Test
    public void testConvertToUSSwissFranc() {
        //Given
        Calculate calculate = new Calculate();
        double usd = 410.97;
        double expectedSum = 415.08;
        //When
        double actual = calculate.convertUSDtoSwissFranc(usd);
        //Then
        Assert.assertEquals("Dollars to SwissFranc equate to 415.08 Swiss Francs", expectedSum, actual, .0000008);

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
        Assert.assertEquals("Dollars to Euros", expectedSum, actual, .0000008);

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
        Assert.assertEquals("Dollars to Pounds", expectedSum, actual, .0000008);

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
        Assert.assertEquals("Dollars to Rupees", expectedSum, actual, .0000008);

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
        Assert.assertEquals("Dollars to Australian Dollar", expectedSum, actual, .0000008);

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
        Assert.assertEquals("Dollars to Canadian Dollar", expectedSum, actual, .0000008);

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
        Assert.assertEquals("Dollars to Singaporean Dollar", expectedSum, actual, .0000008);

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
        Assert.assertEquals("Dollars to Ringgit ", expectedSum, actual, .0000008);

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
        Assert.assertEquals("Dollars to Yen", expectedSum, actual, .0000008);

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
        Assert.assertEquals("Dollars to Ringgit ", expectedSum, actual, .00008d);

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
        Assert.assertEquals("Euros to USD ", expectedSum, actual, .00008d);

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
        Assert.assertEquals("Euros to USD", expectedSum, actual, .0000008);

    }

    @Test
    public void testConvertEuroToPound() {
        //Given
        Calculate calculate = new Calculate();
        Converter converter = new Converter();
        double euro = 500;
        double pound = calculate.convertEurosToUSD(euro);
        double expectedSum = 436.17;
        //When
        double actual = converter.conversionMethod(pound, Currency.BRITISHPOUND);
        //Then
        Assert.assertEquals("Euros to Pound", expectedSum, actual, .0000008);

    }

    @Test
    public void testConvertPoundToRupee() {
        //Given
        Calculate calculate = new Calculate();
        Converter converter = new Converter();
        double pound = 500;
        double rupee = calculate.convertPoundsToUSD(pound);
        double expectedSum = 41658.53;
        //When
        double actual = converter.conversionMethod(rupee, Currency.RUPEE);
        //Then
        Assert.assertEquals("Pound to Rupee", expectedSum, actual, .000000006);

    }

    @Test
    public void testConvertRupeeToCanadianDollar() {
        //Given
        Calculate calculate = new Calculate();
        Converter converter = new Converter();
        double rupee = 500;
        double canadianDollar = calculate.convertRupeeToUSD(rupee);
        double expectedSum = 9.66;
        //When
        double actual = converter.conversionMethod(canadianDollar, Currency.CANADIANDOLLAR);
        //Then
        Assert.assertEquals("Rupee to Canadian Dollar", expectedSum, actual, .0000008);

    }

    @Test
    public void testConvertCanadianDollarToSingaporeanDollar() {
        //Given
        Calculate calculate = new Calculate();
        Converter converter = new Converter();
        double canadianDollar = 500;
        double singaporeanDollar = calculate.convertCanadianDollarToUSD(canadianDollar);
        double expectedSum = 541.67;
        //When
        double actual = converter.conversionMethod(singaporeanDollar, Currency.SINGAPORIANDOLLAR);
        //Then
        Assert.assertEquals("Canadian Dollar to Singaporean Dollar", expectedSum, actual, .0000008);

    }

    @Test
    public void testConvertSingaporeanDollarToSwissFranc() {
        //Given
        Calculate calculate = new Calculate();
        Converter converter = new Converter();
        double singaporeanDollar = 500;
        double swissFranc = calculate.convertSingaporeanDollarToUSD(singaporeanDollar);
        double expectedSum = 353.15;
        //When
        double actual = converter.conversionMethod(swissFranc, Currency.SWISSFRANC);
        //Then
        Assert.assertEquals("Singaporean Dollar to Swiss Franc", expectedSum, actual, .000000000000005d);

    }

    @Test
    public void testConvertSwissFrancToMalaysianRinggit() {
        //Given
        Calculate calculate = new Calculate();
        Converter converter = new Converter();
        double swissFranc = 500;
        double ringgit = calculate.convertSwissFrancToUSD(swissFranc);
        double expectedSum = 2212.87;
        //When
        double actual = converter.conversionMethod(ringgit, Currency.RINGGIT);
        //Then
        Assert.assertEquals("Swiss Franc to Ringgit ", expectedSum, actual, .0000008);

    }

    @Test
    public void testConvertMalaysianRinggitToYen() {
        //Given
        Calculate calculate = new Calculate();
        Converter converter = new Converter();
        double ringgit = 500;
        double yen = calculate.convertRinggitToUSD(ringgit);
        double expectedSum = 12957.86;
        //When
        double actual = converter.conversionMethod(yen, Currency.YEN);
        //Then
        Assert.assertEquals("Ringgit to Yen", expectedSum, actual, .0000008);

    }

    @Test
    public void testConvertYenToYuan() {
        //Given
        Calculate calculate = new Calculate();
        Converter converter = new Converter();
        double yen = 500;
        double yuan = calculate.convertYenToUSD(yen);
        double expectedSum = 29.89;
        //When
        double actual = converter.conversionMethod(yuan, Currency.YUAN);
        //Then
        Assert.assertEquals("Yen to Yuan", expectedSum, actual, .0000008);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertYenToYuanIfZero() {
        //Given
        Calculate calculate = new Calculate();
        double yen = 0;
        double yuan = calculate.convertYenToUSD(yen);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertRinggitToUSDIfZero() {
        //Given
        Calculate calculate = new Calculate();
        Converter converter = new Converter();
        double ringgit = 0;
        double usd = calculate.convertRinggitToUSD(ringgit);
        double expectedSum = 0;
        //When
        double actual = converter.conversionMethod(usd, Currency.USD);
        //Then
        Assert.assertEquals("Throws an IllegalArgumentException exception, because amount is less than 0"
                , expectedSum, actual, .0000008);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertYuanToUSD() {
        //Given
        Calculate calculate = new Calculate();
        Converter converter = new Converter();
        double yuan = 0;
        double usd = calculate.convertYuanToUSD(yuan);
        //When
        double actual = converter.conversionMethod(usd, Currency.USD);
    }
}