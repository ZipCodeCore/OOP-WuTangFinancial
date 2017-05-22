import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by andrewwong on 5/22/17.
 */
public class ConverterTests {
    double rateIn;
    double rateOut;
    BigDecimal amountIn;
    Converter converter;

    @Before
    public void init() {
        amountIn = new BigDecimal(100.00);
        converter = new Converter();
    }

    @Test
    public void testUSDToEuro() {

        //Given
        rateIn = ExchangeRates.getUSD();
        rateOut = ExchangeRates.getEUR();
        BigDecimal actualAmountOut;
        BigDecimal expectedAmountOut = new BigDecimal(00.94);

        //When
        actualAmountOut = converter.convert(amountIn,rateIn,rateOut);

        //Then
        assertEquals(expectedAmountOut, actualAmountOut);
    }

    @Test
    public void testEuroToUSD() {
        //Given
        //When
        //Then
    }

    @Test
    public void testEuroToPound() {
        //Given
        //When
        //Then
    }

    @Test
    public void testPoundToRupee() {
        //Given
        //When
        //Then
    }

    @Test
    public void testRupeeToCAD() {
        //Given
        //When
        //Then
    }

    @Test
    public void testCADToSGD() {
        //Given
        //When
        //Then
    }

    @Test
    public void testSGDToFranc() {
        //Given
        //When
        //Then
    }

    @Test
    public void testFrancToRinggit() {
        //Given
        //When
        //Then
    }

    @Test
    public void testRinggitToJPY() {
        //Given
        //When
        //Then
    }

    @Test
    public void testJPYToCYR() {
        //Given
        //When
        //Then
    }


}
