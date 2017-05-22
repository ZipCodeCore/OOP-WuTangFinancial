import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jarrydstamatelos on 5/22/17.
 */

public class testConversion {
    @Test
    public void testDollarToEuro() {
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.USDOLLAR, Currency.EURO);
        double expected = 0.94;
        Assert.assertEquals(expected,actual,0.00001);
    }

    @Test
    public void testEuroToDollar() {
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.EURO, Currency.USDOLLAR);
        double expected = 1.06;
        Assert.assertEquals(expected,actual,0.004);

    }
    @Test
    public void testEuroToPound() {
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.EURO, Currency.BRITISHHPOUND);
        double expected = 0.87;
        Assert.assertEquals(expected,actual,0.003);

    }
    @Test
    public void testPoundToEuro() {
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.BRITISHHPOUND, Currency.EURO);
        double expected = 1.14;
        Assert.assertEquals(expected,actual,0.01);

    }

    @Test
    public void testPoundToRupee() {
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.BRITISHHPOUND, Currency.INDIANRUPEE);
        double expected = 83.32;
        Assert.assertEquals(expected,actual,0.003);
    }
    @Test
    public void testRupeeToPound() {
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.INDIANRUPEE, Currency.BRITISHHPOUND);
        double expected = 0.01;
        Assert.assertEquals(expected,actual,0.003);
    }

    @Test
    public void testRupeeToCanadaDollar() {
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.INDIANRUPEE, Currency.CANADADOLLAR);
        double expected = 0.02;
        Assert.assertEquals(expected,actual,0.01);
    }
    @Test
    public void testCanadaDollarToIndianRupee() {
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.CANADADOLLAR, Currency.INDIANRUPEE);
        double expected = 51.75;
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void testSingaporeDollarToSwissFranc() {
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.SINGAPOREDOLLAR, Currency.SWISSFRANC);
        double expected = 0.71;
        Assert.assertEquals(expected,actual,0.01);
    }
    @Test
    public void testSwissFrancToSingaporeDollar() {
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.SWISSFRANC, Currency.SINGAPOREDOLLAR);
        double expected = 1.41;
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void testSwissFrancToRinggit() {
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.SWISSFRANC, Currency.RINGGIT);
        double expected = 4.42;
        Assert.assertEquals(expected,actual,0.01);
    }
    @Test
    public void testRinggitToSwissFranc() {
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.RINGGIT, Currency.SWISSFRANC);
        double expected = 0.22;
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void testRinggitToYen(){
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.RINGGIT, Currency.YEN);
        double expected = 25.91;
        Assert.assertEquals(expected,actual,0.01);
    }
    @Test
    public void testYenToRinggit(){
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.YEN, Currency.RINGGIT);
        double expected = 0.03;
        Assert.assertEquals(expected,actual,0.01);
    }
    @Test
    public void testYenToYuan(){
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.YEN, Currency.CHINESEYUAN);
        double expected = .06;
        Assert.assertEquals(expected,actual,0.01);

    }
    @Test
    public void testYuanToYet(){
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.CHINESEYUAN, Currency.YEN);
        double expected = 16.73;
        Assert.assertEquals(expected,actual,0.01);
    }
    @Test
    public void testUsDollarToAussieDollar(){
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.USDOLLAR, Currency.AUSSIEDOLLAR);
        double expected = 1.35;
        Assert.assertEquals(expected,actual,0.000001);
    }
    @Test
    public void testAussieDollarToUsDollar(){
        Currency money = new Currency();
        double actual = money.CurrencyConversion(Currency.AUSSIEDOLLAR, Currency.USDOLLAR);
        double expected = 0.74;
        Assert.assertEquals(expected,actual,0.001);
    }


}

