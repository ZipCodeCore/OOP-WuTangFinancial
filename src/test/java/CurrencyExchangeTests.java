import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by vilenalivinsky on 5/22/17.
 */
public class CurrencyExchangeTests {

    @Test
    public void dollartoEuroTest(){
        BigDecimal actual = CurrencyExchange.dollarToEuro(1);
        BigDecimal expected = new BigDecimal("0.94");
        //Assert.assertTrue(expected.compareTo(actual)==0);//objs with same value
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void euroToDollarTest(){
        BigDecimal actual = CurrencyExchange.euroToDollar(1);
        BigDecimal expected = new BigDecimal("1.06");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void euroToBritishPoundTest(){
        BigDecimal actual = CurrencyExchange.euroToBritishPound(1);
        BigDecimal expected = new BigDecimal("0.87");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void britishPoundToIndianRupeeTest(){
        BigDecimal actual = CurrencyExchange.britishPoundToIndianRupee(1);
        BigDecimal expected = new BigDecimal("83.333");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void rupeeToCanDollarTest(){
        BigDecimal actual = CurrencyExchange.rupeeToCanDollar(1);
        BigDecimal expected = new BigDecimal("0.02");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void canDollarToSingaporeDollarTest(){
        BigDecimal actual = CurrencyExchange.canDollarToSingaporeDollar(1);
        BigDecimal expected = new BigDecimal("1.08");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void singaporeDollarToSwissTest(){
        BigDecimal actual = CurrencyExchange.singaporeDollarToSwiss(1);
        BigDecimal expected = new BigDecimal("0.71");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void swissToMalaysianRTest(){
        BigDecimal actual = CurrencyExchange.swissToMalaysianR(1);
        BigDecimal expected = new BigDecimal("4.43");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void malayToYenTest(){
        BigDecimal actual = CurrencyExchange.malayToYen(1);
        BigDecimal expected = new BigDecimal("25.92");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void yenToYuanTest(){
        BigDecimal actual = CurrencyExchange.yenToYuan(1);
        BigDecimal expected = new BigDecimal("0.06");
        Assert.assertEquals(expected,actual);
    }


}
