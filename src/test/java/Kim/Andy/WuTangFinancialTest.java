package Kim.Andy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.sun.tools.doclint.Entity.delta;

/**
 * Created by andykim on 2/16/17.
 */
public class WuTangFinancialTest {
    ExchangeRates exchangeRates;

    @Before
    public void setUp(){
        exchangeRates = new ExchangeRates();
    }
    @Test
    public void CurrencyMapTest(){
        int expected = 10;
        int actual = exchangeRates.getCurrencyMap().size();
        Assert.assertEquals("I expect this to grab the number of currencies in the hashmap", expected, actual);

    }
    @Test
    public void DollarToEuro(){
        String expected = "3.44";
        String actual = exchangeRates.exchanger("USD", 1, "EUR");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void EuroToDollar(){
        String expected = "3.44";
        String actual = exchangeRates.exchanger("EUR", 1, "USD");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void EuroToGBP(){
        String expected = "3.44";
        String actual = exchangeRates.exchanger("USD", 1, "EUR");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void GbpToIDR(){
        String expected = "3.44";
        String actual = exchangeRates.exchanger("GDP", 1, "IDR");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void IdrToCND(){
        String expected = "3.44";
        String actual = exchangeRates.exchanger("IDR", 1, "CND");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void SGDtoSWF(){
        String expected = "3.44";
        String actual = exchangeRates.exchanger("SGD", 1, "SWF");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void SWFToMRT(){
        String expected = "3.44";
        String actual = exchangeRates.exchanger("SWF", 1, "MRT");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void MRTToJPY(){
        String expected = "3.44";
        String actual = exchangeRates.exchanger("MRT", 1, "JPY");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void JPYtoCYR(){
        String expected = "3.44";
        String actual = exchangeRates.exchanger("JPY", 1, "CYR");
        Assert.assertEquals(expected, actual);
    }


}
