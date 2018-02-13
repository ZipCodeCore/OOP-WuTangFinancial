
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class ExchangeTest {
   private float myCountryMoney;
   private float myOtherCountryMoney;
   private static final float CONVERT_PERCISION = .0001f;
private Exchange myExchange;
    @Before
    public void testSetUp() throws Exception {
        myExchange = new Exchange();
    }
    @Test
    public void testConversion() {
    myCountryMoney = 1.00f;
    myOtherCountryMoney = 0.94f;
    float expected = 1.0638298f;
    float actual = myExchange.conversion(myCountryMoney, myOtherCountryMoney);

        Assert.assertEquals(expected,actual , CONVERT_PERCISION);
    }

    @Test
    public void printConvertedMoney() {

    }
}
