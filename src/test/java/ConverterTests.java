import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by andrewwong on 5/22/17.
 */
public class ConverterTests {
    ExchangeRates rate;
    BigDecimal amountIn;
    Converter converter;

    @Before
    public void init() {
        amountIn = new BigDecimal(500.00);
        converter = new Converter();
    }

    @Test
    public void testUSDToEuro() {
        //Given
        //When
        //Then
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
