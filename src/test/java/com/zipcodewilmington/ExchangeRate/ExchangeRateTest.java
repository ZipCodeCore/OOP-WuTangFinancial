package com.zipcodewilmington.ExchangeRate;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ExchangeRateTest {

//    private ExchangeRate testExchangeRate;
    double currentCurrency = 100;
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

//    @Before
//    public void createExchangeRate(){
//        this.testExchangeRate = new ExchangeRate();
//    }

@Test
public void testUSDtoEuro(){

    double expected = 94.0;
    double actual = ExchangeRateTest.conversion(currentCurrency, USD, EUR);
    Assert.assertEquals(expected, actual, 0.1);
}



}
