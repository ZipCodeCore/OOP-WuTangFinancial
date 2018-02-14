package com.zipcodewilmington.ExchangeRate;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExchangeRateTest {

    //    private ExchangeRate testExchangeRate;
    double currentCurrency = 1;
    public static final double delta = 0.01;
    ExchangeRate USD = ExchangeRate.USD;
    ExchangeRate GBP = ExchangeRate.GBP;
    ExchangeRate EUR = ExchangeRate.EUR;
    ExchangeRate INR = ExchangeRate.INR;
    ExchangeRate AUD = ExchangeRate.AUD;
    ExchangeRate CAD = ExchangeRate.CAD;
    ExchangeRate SGD = ExchangeRate.SGD;
    ExchangeRate CHF = ExchangeRate.CHF;
    ExchangeRate MYR = ExchangeRate.MYR;
    ExchangeRate JPY = ExchangeRate.JPY;
    ExchangeRate CNY = ExchangeRate.CNY;


    @Test
    public void testUSDToEuro() {

        double expected = .94;
        double actual = ExchangeRate.conversion(currentCurrency, USD, EUR);
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testEuroToUSD() {

        double expected = 1.06;
        double actual = ExchangeRate.conversion(currentCurrency, EUR, USD);
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testEuroToGBP() {

        double expected = .87;
        double actual = ExchangeRate.conversion(currentCurrency, EUR, GBP);
        Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void testCNYToJPY() {

        double expected = 16.73;
        double actual = ExchangeRate.conversion(currentCurrency, CNY, JPY);
        Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void testJPYToCNY() {

        double expected = 0.05;
        double actual = ExchangeRate.conversion(currentCurrency, JPY, CNY);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testINRToCAD() {

        double expected = .019;
        double actual = ExchangeRate.conversion(currentCurrency, INR, CAD);
        Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void testAUDToSGD() {

        double expected = 1.05;
        double actual = ExchangeRate.conversion(currentCurrency, AUD, SGD);
        Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void testCHFToMYR() {

        double expected = 4.42;
        double actual = ExchangeRate.conversion(currentCurrency, CHF, MYR);
        Assert.assertEquals(expected, actual, delta);
    }
}
