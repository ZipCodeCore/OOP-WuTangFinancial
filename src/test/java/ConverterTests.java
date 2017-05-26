import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by andrewwong on 5/22/17.
 */
public class ConverterTests {
    BigDecimal rateIn;
    BigDecimal rateOut;
    BigDecimal amountIn;
    Converter converter;

    @Before
    public void init() {
        amountIn = new BigDecimal(100);
        converter = new Converter();
    }

    @Test
    public void testUSDToEuro() {

        //Given
        rateIn = ExchangeRates.getUSD();
        rateOut = ExchangeRates.getEUR();
        BigDecimal actualAmountOut;
        BigDecimal expectedAmountOut = new BigDecimal(94);

        //When
        actualAmountOut = converter.convert(amountIn,rateIn,rateOut);


        //Then
        assertEquals(expectedAmountOut.doubleValue(), actualAmountOut.doubleValue(), 0.001);
    }

    @Test
    public void testEuroToUSD() {
        //Given
        rateIn = ExchangeRates.getEUR();
        rateOut = ExchangeRates.getUSD();
        BigDecimal actualAmountOut;
        BigDecimal expectedAmountOut = new BigDecimal(106.383);

        //When
        actualAmountOut = converter.convert(amountIn,rateIn,rateOut);


        //Then
        assertEquals(expectedAmountOut.doubleValue(), actualAmountOut.doubleValue(), 0.001);
    }

    @Test
    public void testEuroToPound() {
        //Given
        rateIn = ExchangeRates.getEUR();
        rateOut = ExchangeRates.getGBP();
        BigDecimal actualAmountOut;
        BigDecimal expectedAmountOut = new BigDecimal(87.234);

        //When
        actualAmountOut = converter.convert(amountIn,rateIn,rateOut);

        //Then
        assertEquals(expectedAmountOut.doubleValue(), actualAmountOut.doubleValue(), 0.001);
    }

    @Test
    public void testPoundToRupee() {
        //Given
        rateIn = ExchangeRates.getGBP();
        rateOut = ExchangeRates.getINR();
        BigDecimal actualAmountOut;
        BigDecimal expectedAmountOut = new BigDecimal(8331.707);

        //When
        actualAmountOut = converter.convert(amountIn,rateIn,rateOut);

        //Then
        assertEquals(expectedAmountOut.doubleValue(), actualAmountOut.doubleValue(), 0.001);
    }

    @Test
    public void testRupeeToCAD() {
        //Given
        rateIn = ExchangeRates.getINR();
        rateOut = ExchangeRates.getCAD();
        BigDecimal actualAmountOut;
        BigDecimal expectedAmountOut = new BigDecimal(1.932);

        //When
        actualAmountOut = converter.convert(amountIn,rateIn,rateOut);

        //Then
        assertEquals(expectedAmountOut.doubleValue(), actualAmountOut.doubleValue(), 0.001);
    }

    @Test
    public void testCADToSGD() {
        //Given
        rateIn = ExchangeRates.getCAD();
        rateOut = ExchangeRates.getSGD();
        BigDecimal actualAmountOut;
        BigDecimal expectedAmountOut = new BigDecimal(108.333);

        //When
        actualAmountOut = converter.convert(amountIn,rateIn,rateOut);

        //Then
        assertEquals(expectedAmountOut.doubleValue(), actualAmountOut.doubleValue(), 0.001);
    }

    @Test
    public void testSGDToFranc() {
        //Given
        rateIn = ExchangeRates.getSGD();
        rateOut = ExchangeRates.getCHF();
        BigDecimal actualAmountOut;
        BigDecimal expectedAmountOut = new BigDecimal(70.629);

        //When
        actualAmountOut = converter.convert(amountIn,rateIn,rateOut);

        //Then
        assertEquals(expectedAmountOut.doubleValue(), actualAmountOut.doubleValue(), 0.001);
    }

    @Test
    public void testFrancToRinggit() {
        //Given
        rateIn = ExchangeRates.getCHF();
        rateOut = ExchangeRates.getMYR();
        BigDecimal actualAmountOut;
        BigDecimal expectedAmountOut = new BigDecimal(442.574);

        //When
        actualAmountOut = converter.convert(amountIn,rateIn,rateOut);

        //Then
        assertEquals(expectedAmountOut.doubleValue(), actualAmountOut.doubleValue(), 0.001);
    }

    @Test
    public void testRinggitToJPY() {
        //Given
        rateIn = ExchangeRates.getMYR();
        rateOut = ExchangeRates.getJPY();
        BigDecimal actualAmountOut;
        BigDecimal expectedAmountOut = new BigDecimal(2591.499);

        //When
        actualAmountOut = converter.convert(amountIn,rateIn,rateOut);

        //Then
        assertEquals(expectedAmountOut.doubleValue(), actualAmountOut.doubleValue(), 0.001);
    }

    @Test
    public void testJPYToCNY() {
        //Given
        rateIn = ExchangeRates.getJPY();
        rateOut = ExchangeRates.getCNY();
        BigDecimal actualAmountOut;
        BigDecimal expectedAmountOut = new BigDecimal(5.974);

        //When
        actualAmountOut = converter.convert(amountIn,rateIn,rateOut);

        //Then
        assertEquals(expectedAmountOut.doubleValue(), actualAmountOut.doubleValue(), 0.001);
    }


}
