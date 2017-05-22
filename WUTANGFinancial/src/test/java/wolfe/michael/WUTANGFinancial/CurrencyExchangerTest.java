package wolfe.michael.WUTANGFinancial;

import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

/**
 * Created by michaelwolfe on 1/12/17.
 */
public class CurrencyExchangerTest {
    DecimalFormat df = new DecimalFormat("0.00");
    double amount = 100;

    @Test
    public void exchangeUSDEUR(){
        CalculateExchange calc = new CalculateExchange();
        String expected = df.format(94.00);
        String actual = calc.exchange(calc.USD, calc.EUR, amount);
        Assert.assertEquals("I expect that the currency exchange rate will be 94.00.", expected, actual);
    }

    @Test
    public void exchangeEURUSD(){
        CalculateExchange calc = new CalculateExchange();
        String expected = df.format(106.38);
        String actual = calc.exchange(calc.EUR, calc.USD, amount);
        Assert.assertEquals("I expect that the currency exchange rate will be 1.06.", expected, actual);
    }

    @Test
    public void exchangeEURGBP(){
        CalculateExchange calc = new CalculateExchange();
        String expected = df.format(87.23);
        String actual = calc.exchange(calc.EUR, calc.GBP, amount);
        Assert.assertEquals("I expect that the currency exchange rate will be 0.87.", expected, actual);
    }

    @Test
    public void exchangeGBPINR(){
        CalculateExchange calc = new CalculateExchange();
        String expected = df.format(8331.71);
        String actual = calc.exchange(calc.GBP, calc.INR, amount);
        Assert.assertEquals("I expect that the currency exchange rate will be 83.31.", expected, actual);

    }

    @Test
    public void exchangeINRCAD(){
        CalculateExchange calc = new CalculateExchange();
        String expected = df.format(1.93);
        String actual = calc.exchange(calc.INR, calc.CAD, amount);
        Assert.assertEquals("I expect that the currency exchange rate will be 51.75.", expected, actual);
    }

    @Test
    public void exchangeCADSGD(){
        CalculateExchange calc = new CalculateExchange();
        String expected = df.format(108.33);
        String actual = calc.exchange(calc.CAD, calc.SGD, amount);
        Assert.assertEquals("I expect that the currency exchange rate will be 1.08.", expected, actual);
    }

    @Test
    public void exchangeSGDCHF(){
        CalculateExchange calc = new CalculateExchange();
        String expected = df.format(70.63);
        String actual = calc.exchange(calc.SGD, calc.CHF, amount);
        Assert.assertEquals("I expect that the currency exchange rate will be 0.70.", expected, actual);
    }

    @Test
    public void exchangeCHFMYR(){
        CalculateExchange calc = new CalculateExchange();
        String expected = df.format(442.57);
        String actual = calc.exchange(calc.CHF, calc.MYR, amount);
        Assert.assertEquals("I expect that the currency exchange rate will be 4.42.", expected, actual);
    }

    @Test
    public void exchangeMYRJPY(){
        CalculateExchange calc = new CalculateExchange();
        String expected = df.format(2591.5);
        String actual = calc.exchange(calc.MYR, calc.JPY, amount);
        Assert.assertEquals("I expect that the currency exchange rate will be 25.91.", expected, actual);
    }

    @Test
    public void exchangeJPYCNY(){
        CalculateExchange calc = new CalculateExchange();
        String expected = df.format(5.97);
        String actual = calc.exchange(calc.JPY, calc.CNY, amount);
        Assert.assertEquals("I expect that the currency exchange rate will be 0.05.", expected, actual);
    }
}
