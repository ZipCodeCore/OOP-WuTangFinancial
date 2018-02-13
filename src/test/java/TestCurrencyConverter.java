import org.junit.Assert;
//import org.junit.Before;
import org.junit.Test;

public class TestCurrencyConverter {

    @Test
    public void testMultiplyBy100(){
        double expectedNumber = 6832;
        double actual = CurrencyConverter.multiplyBy100(CurrencyConverter.INDIAN_RUPEE);
        System.out.println(actual);
        Assert.assertTrue(actual == expectedNumber);
    }

    @Test
    public void testDivideBy100(){
        double expectedNumber = 68.32;
        double actual = CurrencyConverter.divideBy100(CurrencyConverter.multiplyBy100(CurrencyConverter.INDIAN_RUPEE));
        System.out.println(actual);
        Assert.assertTrue(actual == expectedNumber);
    }

    @Test
    public void testConvertFromDollars(){
        double expectedNumber = 68.32;
        double actual = CurrencyConverter.convertFromDollars(1, CurrencyConverter.INDIAN_RUPEE);
        System.out.println(actual);
        Assert.assertTrue(actual == expectedNumber);
    }

    @Test
    public void testConvertFromDollarsWithDecimal(){
        double expectedNumber = 102.48;
        double actual = CurrencyConverter.convertFromDollars(1.5, CurrencyConverter.INDIAN_RUPEE);
        System.out.println(actual);
        Assert.assertTrue(actual == expectedNumber);
    }


    @Test
    public void testConvertFromDollarsWithDecimal2(){
        double expectedNumber = 136.3;
        double actual = CurrencyConverter.convertFromDollars(100.96, CurrencyConverter.AUSTRALIAN_DOLLAR);
        System.out.println(actual);
        Assert.assertTrue(actual == expectedNumber);
    }

    @Test
    public void testConvertToDollars(){
        double expectedNumber = 1;
        double actual = CurrencyConverter.convertToDollars(68.32, CurrencyConverter.INDIAN_RUPEE);
        System.out.println(actual);
        Assert.assertTrue(actual == expectedNumber);
    }

    @Test
    public void testConvertToDollarsWithDecimal(){
        double expectedNumber = 14.56;
        double actual = CurrencyConverter.convertToDollars(100.76, CurrencyConverter.CHINESE_YUAN);
        System.out.println(actual);
        Assert.assertTrue(actual == expectedNumber);
    }

    @Test
    public void testConvertToDollarsWithDecimal2(){
        double expectedNumber = 9531.84;
        double actual = CurrencyConverter.convertToDollars(12582.03, CurrencyConverter.CANADIAN_DOLLAR);
        System.out.println(actual);
        Assert.assertTrue(actual == expectedNumber);
    }

    @Test
    public void testDollarToEuro(){
        double expectedNumber = 94;
        double actual = CurrencyConverter.convertFromDollars(100,CurrencyConverter.EURO);
        System.out.println(actual);
        Assert.assertTrue(actual == expectedNumber);
    }

    @Test
    public void testEuroToDollar(){
        double expectedNumber = 106.38;
        double actual = CurrencyConverter.convertToDollars(100,CurrencyConverter.EURO);
        System.out.println(actual);
        Assert.assertTrue(actual == expectedNumber);
    }



}
