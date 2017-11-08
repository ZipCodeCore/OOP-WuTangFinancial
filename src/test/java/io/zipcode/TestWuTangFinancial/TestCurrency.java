package io.zipcode.TestWuTangFinancial;

import io.zipcode.WuTangFinancial.Currency;
import org.junit.Assert;
import org.junit.Test;

public class TestCurrency {

    @Test
    public void testCHINESE_YUAN_RENMINBItoBRITISH_POUND(){
        Currency currency = new Currency();
        double expected = 2.46;
        double actual = currency.toExchangeMoney(
                20.76,"CHINESE YUAN RENMINBI","BRITISH POUND");
        System.out.println(actual);
        Assert.assertEquals(expected,actual,1.00);
    }
    @Test
    public  void testJapanese_YentoChinese_Yuan_Renminbi(){
        Currency currency = new Currency();
        double expected = 13.84;
        double actual = currency.toExchangeMoney(
                231.68,"JAPANESE YEN","CHINESE YUAN RENMINBI");
        System.out.println(actual);
        Assert.assertEquals(expected,actual,1.00);
    }
    @Test
    public void malaysian_Ringgit_to_Japanese_Yen(){
        Currency currency = new Currency();
        double expected = 347.52;
        double actual = currency.toExchangeMoney(
                13.41,"MALAYSIAN RINGGIT","JAPANESE YEN");
        System.out.println(actual);
        Assert.assertEquals(expected,actual,1.00);
    }
    @Test
    public void  swiss_Franc_to_Malaysian_Ringgit(){
        Currency currency = new Currency();
        double expected = 4.47;
        double actual = currency.toExchangeMoney(
                1.01,"SWISS FRANC","MALAYSIAN RINGGIT");
        System.out.println(actual);
        Assert.assertEquals(expected,actual,1.00);
    }
    @Test
    public void  Singapore_Dollar_to_Swiss_Franc(){
        Currency currency = new Currency();
        double expected = 1.01;
        double actual = currency.toExchangeMoney(
                1.43,"SINGAPORE DOLLAR","SWISS FRANC");
        System.out.println(actual);
        Assert.assertEquals(expected,actual,1.00);
    }
    @Test
    public void  Canadian_Dollar_to_Singapore_Dollar(){
        Currency currency = new Currency();
        double expected = 1.43;
        double actual = currency.toExchangeMoney(
                1.32,"CANADIAN DOLLAR","SINGAPORE DOLLAR");
        System.out.println(actual);
        Assert.assertEquals(expected,actual,1.00);
    }
    @Test
    public void  Rupee_to_Canadian_Dollar(){
        Currency currency = new Currency();
        double expected = 1.32;
        double actual = currency.toExchangeMoney(
                68.32,"INDIAN RUPEE","CANADIAN DOLLAR");
        System.out.println(actual);
        Assert.assertEquals(expected,actual,1.00);
    }
    @Test
    public void  Euro_to_British_Pound(){
        Currency currency = new Currency();
        double expected = 0.82;
        double actual = currency.toExchangeMoney(
                0.94,"EURO","BRITISH POUND");
        System.out.println(actual);
        Assert.assertEquals(expected,actual,1.00);
    }
    @Test
    public void  Euro_to_Dollar(){
        Currency currency = new Currency();
        double expected = 1.00;
        double actual = currency.toExchangeMoney(
                0.94,"EURO","USD");
        System.out.println(actual);
        Assert.assertEquals(expected,actual,1.00);
    }
    @Test
    public void  Dollar_to_Euro(){
        Currency currency = new Currency();
        double expected = 0.94;
        double actual = currency.toExchangeMoney(
                1.00,"USD","EURO");
        System.out.println(actual);
        Assert.assertEquals(expected,actual,1.00);
    }

}
