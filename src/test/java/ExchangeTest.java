
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class ExchangeTest {
    private float myAmount;
    private float myCountryMoney;
    private float myOtherCountryMoney;
    private static final float CONVERT_PERCISION = .01f;
    private Exchange myExchange;

    @Before
    public void testSetUp() throws Exception {
        myExchange = new Exchange(50);
    }

    @Test
    public void testDollarToEuro() {
        float expected = 47.00f;
        float actual = myExchange.conversion(myExchange.getAmount(), Exchange.US_DOLLAR, Exchange.EURO );

        Assert.assertEquals(expected, actual, CONVERT_PERCISION);
    }
    @Test
    public void testEruoToDollar() {

        float expected = 53.19f;
        float actual = myExchange.conversion(myExchange.getAmount(), Exchange.EURO, Exchange.US_DOLLAR);

        Assert.assertEquals(expected, actual, CONVERT_PERCISION);
    }

   @Test
    public void testEuroToBritishPound(){
       float expected = 43.62f;
       float actual = myExchange.conversion(myExchange.getAmount(), Exchange.EURO, Exchange.BRITISH_POUND);

       Assert.assertEquals(expected, actual, CONVERT_PERCISION);

   }

    @Test
    public void testBritishPoundToRupee(){
        float expected = 4165.85f;
        float actual = myExchange.conversion(myExchange.getAmount(), Exchange.BRITISH_POUND, Exchange.INDIAN_RUPEE);

        Assert.assertEquals(expected, actual, CONVERT_PERCISION);

    }

    @Test
    public void testRupeeToCanadianDollar(){
        float expected = .96f;
        float actual = myExchange.conversion(myExchange.getAmount(), Exchange.INDIAN_RUPEE, Exchange.CANADIAN_DOLLAR);

        Assert.assertEquals(expected, actual, CONVERT_PERCISION);

    }
    @Test
    public void testCanadianDollarToSingaporeDollar(){
        float expected = 54.17f;
        float actual = myExchange.conversion(myExchange.getAmount(), Exchange.CANADIAN_DOLLAR, Exchange.SINGAPORE_DOLLAR);

        Assert.assertEquals(expected, actual, CONVERT_PERCISION);
    }


    @Test
    public void testSwissFrancToMalaysianRinggit(){
        float expected = 221.29f;
        float actual = myExchange.conversion(myExchange.getAmount(), Exchange.Swiss_FRANC, Exchange.MALAYSIAN_RINGGIT);

        Assert.assertEquals(expected, actual, CONVERT_PERCISION);
    }

    @Test
    public void testJapaneseYenToChineseYaun(){
        float expected = 2.99f;
        float actual = myExchange.conversion(myExchange.getAmount(), Exchange.JAPANESE_YEN, Exchange.CHINESE_YUAN_RENMINBI);

        Assert.assertEquals(expected, actual, CONVERT_PERCISION);
    }

}
