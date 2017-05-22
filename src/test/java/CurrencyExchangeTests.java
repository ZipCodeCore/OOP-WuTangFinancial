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
        BigDecimal expected = new BigDecimal("1.06");
        //Assert.assertTrue(expected.compareTo(actual)==0);//objs with same value
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void euroToDollarTest(){
        BigDecimal actual = CurrencyExchange.euroToDollar(1);
        BigDecimal expected = new BigDecimal("0.94");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void euroToBritishPoundTest(){
        BigDecimal actual = CurrencyExchange.euroToBritishPound(1);
        BigDecimal expected = new BigDecimal("1.15");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void britishPoundToIndianPupeeTest(){
        BigDecimal actual = CurrencyExchange.britishPoundToIndianRupee(1);
        BigDecimal expected = new BigDecimal("0.01");
        Assert.assertEquals(expected,actual);
    }

}
