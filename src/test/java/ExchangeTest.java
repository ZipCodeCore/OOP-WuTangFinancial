import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ExchangeTest {

    public double initialAmount;

    @Before
    public void amountInitializer() {
        initialAmount = 1.00; //USD
    }

    @Test
    public void dollarToEuro() {
        double expected = 0.94;
        double actual = ExchangeRate.convert(initialAmount, ExchangeRate.USD, ExchangeRate.EUR);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void euroToDollar() {
        double expected = 1.06;
        double actual = ExchangeRate.convert(initialAmount, ExchangeRate.EUR, ExchangeRate.USD);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void euroToPound() {
        double expected = 0.87;
        double actual = ExchangeRate.convert(initialAmount, ExchangeRate.EUR, ExchangeRate.GBP);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void poundToRupee() {
        double expected = 83.32;
        double actual = ExchangeRate.convert(initialAmount, ExchangeRate.GBP, ExchangeRate.INR);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void rupeeToCanadianDollar() {
        double expected = 0.02;
        double actual = ExchangeRate.convert(initialAmount, ExchangeRate.INR, ExchangeRate.CAD);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void canadianDollarToSingaporeDollar() {
        double expected = 1.08;
        double actual = ExchangeRate.convert(initialAmount, ExchangeRate.CAD, ExchangeRate.SGD);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void singaporeDollarToFranc() {
        double expected = 0.71;
        double actual = ExchangeRate.convert(initialAmount, ExchangeRate.SGD, ExchangeRate.CHF);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void francToRinggit() {
        double expected = 4.43;
        double actual = ExchangeRate.convert(initialAmount, ExchangeRate.CHF, ExchangeRate.MYR);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void ringgitToYen() {
        double expected = 1.55;
        double actual = ExchangeRate.convert(initialAmount, ExchangeRate.MYR, ExchangeRate.CNY);
        Assert.assertEquals(expected, actual, 0.001);

    }

    @Test
    public void yenToRenminbi() {
        double expected = 0.06;
        double actual = ExchangeRate.convert(initialAmount, ExchangeRate.JPY, ExchangeRate.CNY);
        Assert.assertEquals(expected, actual, 0.001);
    }
}