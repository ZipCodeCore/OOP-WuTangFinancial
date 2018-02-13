import org.junit.Assert;
import org.junit.Test;
/**
 * filename:
 * project: wu-tang-financial
 * author: https://github.com/vvmk
 * date: 2/13/18
 */
public class CurrencyConverterTest {
    public static final double delta = 0.01;
    @Test
    public void testUSDtoEURAndBack() {
        float expected = 3247.23f;
        float tmp = CurrencyConverter.convertFromUSD(expected, CurrencyConverter.Currency.EUR);
        float actual = CurrencyConverter.convertToUSD(tmp, CurrencyConverter.Currency.EUR);

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testEURtoGBP() {
        float initial = 3052.40f;
        float expected = 2662.73f;
        float actual = CurrencyConverter.convertForeign(initial, CurrencyConverter.Currency.EUR, CurrencyConverter.Currency.GBP);

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testGBPtoINR() {
        float initial = 32.69f;
        float expected = 2723.92f;
        float actual = CurrencyConverter.convertForeign(initial, CurrencyConverter.Currency.GBP, CurrencyConverter.Currency.INR);

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testINRtoCAD() {
        float initial = 27549.23f;
        float expected = 532.28f;
        float actual = CurrencyConverter.convertForeign(initial, CurrencyConverter.Currency.INR, CurrencyConverter.Currency.CAD);

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testCADtoSGD() {
        float initial = 4286.34f;
        float expected = 4643.54f;
        float actual = CurrencyConverter.convertForeign(initial, CurrencyConverter.Currency.CAD, CurrencyConverter.Currency.SGD);

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testSGDtoCHF() {
        float initial = 643.53f;
        float expected = 454.52f;
        float actual = CurrencyConverter.convertForeign(initial, CurrencyConverter.Currency.SGD, CurrencyConverter.Currency.CHF);

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testCHFtoMYR() {
        float initial = 3279.70f;
        float expected = 14515.12f;
        float actual = CurrencyConverter.convertForeign(initial, CurrencyConverter.Currency.CHF, CurrencyConverter.Currency.MYR);

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testMYRtoJPY() {
        float initial = 4515.12f;
        float expected = 117008.83f;
        float actual = CurrencyConverter.convertForeign(initial, CurrencyConverter.Currency.MYR, CurrencyConverter.Currency.JPY);

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testJPYtoCNH() {
        float initial = 36159.12f;
        float expected = 2160.08f;
        float actual = CurrencyConverter.convertForeign(initial, CurrencyConverter.Currency.JPY, CurrencyConverter.Currency.CNH);

        Assert.assertEquals(expected, actual, delta);
    }
}
