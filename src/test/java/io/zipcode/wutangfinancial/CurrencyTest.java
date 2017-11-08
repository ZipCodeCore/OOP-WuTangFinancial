package io.zipcode.wutangfinancial;

import org.junit.Assert;
import org.junit.Test;

public class CurrencyTest {
    Currency currency = new Currency();
    @Test
    public void testUSDToEuro(){
        double expected = 47.0;
        double actual = currency.getTargetAmount("USD",50,"EURO");
        Assert.assertEquals(expected,actual,.01);
    }
    @Test
    public void testEuroToUSD(){
        double expected = 53.19;
        double actual = currency.getTargetAmount("EURO",50,"USD");
        Assert.assertEquals(expected,actual,.01);
    }
    @Test
    public void testEuroToPounds(){
        double expected = 43.61;
        double actual = currency.getTargetAmount("EURO",50,"POUNDS");
        Assert.assertEquals(expected,actual,.01);
    }
    @Test
    public void testPoundsToRupee(){
        double expected = 4165.85;
        double actual = currency.getTargetAmount("POUNDS",50,"INDIAN RUPEE");
        Assert.assertEquals(expected,actual,.01);
    }
    @Test
    public void testRupeeToCanadian(){
        double expected = 1.93;
        double actual = currency.getTargetAmount("INDIAN RUPEE",100,"CANADIAN DOLLAR");
        Assert.assertEquals(expected,actual,.01);
    }
    @Test
    public void testCanadianToSingapore(){
        double expected = 54.17;
        double actual = currency.getTargetAmount("CANADIAN DOLLAR",50,"SINGAPORE DOLLAR");
        Assert.assertEquals(expected,actual,.01);
    }
    @Test
    public void testSingaporeToFranc(){
        double expected = 42.38;
        double actual = currency.getTargetAmount("SINGAPORE DOLLAR",60,"SWISS FRANC");
        Assert.assertEquals(expected,actual,.01);
    }
    @Test
    public void testFrancToRinggit(){
        double expected = 132.78;
        double actual = currency.getTargetAmount("SWISS FRANC",30,"MALAYSIAN RINGGIT");
        Assert.assertEquals(expected,actual,.01);
    }
    @Test
    public void testRinggitToYen(){
        double expected = 259.15;
        double actual = currency.getTargetAmount("MALAYSIAN RINGGIT",10,"JAPANESE YEN");
        Assert.assertEquals(expected,actual,.01);
    }
    @Test
    public void testYenToYuan(){
        double expected = 59.74;
        double actual = currency.getTargetAmount("JAPANESE YEN",1000,"CHINESE YUAN");
        Assert.assertEquals(expected,actual,.01);
    }
}

