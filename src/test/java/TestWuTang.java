import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestWuTang {
    double initialValue;


    @Before
    public void setup() {
        initialValue = 1.00;
    }

    @Test
    public void testDollartoEuro() {
        double expected = 0.94;
        double actual = Currency.currency(initialValue, Currency.USD, Currency.EURO);
        Assert.assertEquals(actual, expected, 0.001);
    }


    //Convert Euro to Dollar
    @Test
    public void testEurotoDollar() {
        double expected = 1.063;
        double actual = Currency.currency(initialValue, Currency.EURO, Currency.USD);
        Assert.assertEquals(actual, expected, 0.001);
    }


//Convert Euro to British Pound
    @Test
    public void testEurotoPound(){
        double expected = 0.872;
        double actual = Currency.currency(initialValue, Currency.EURO, Currency.BPOUND);
            Assert.assertEquals(actual, expected, 0.001);
        }


//Convert British Pound to Indian Rupee
    @Test
    public void testPoundtoRupee(){
        double expected = 83.317;
        double actual = Currency.currency(initialValue, Currency.BPOUND, Currency.RUPEE);
            Assert.assertEquals(actual, expected, 0.001);
        }


//Convert Rupee to Canadian Dollar
    @Test
    public void testRupeetoCanadian(){
        double expected = 0.019;
        double actual = Currency.currency(initialValue, Currency.RUPEE, Currency.CAN);
            Assert.assertEquals(actual, expected, 0.001);
        }

//Convert Canadian Dollar to Singapore Dollar
    @Test
    public void testCantoSing(){
        double expected = 1.083;
        double actual = Currency.currency(initialValue, Currency.CAN, Currency.SING);
            Assert.assertEquals(actual, expected, 0.001);
        }

//Convert Singapore Dollar to Swiss Franc
    @Test
    public void testSingtoFranc(){
        double expected = 0.706;
        double actual = Currency.currency(initialValue, Currency.SING, Currency.FRANC);
            Assert.assertEquals(actual, expected, 0.001);
        }


//Convert Swiss Franc to Malaysian Ringgit
    @Test
    public void testFranctoRinggit(){
        double expected = 4.425;
        double actual = Currency.currency(initialValue, Currency.FRANC, Currency.RINGGIT);
            Assert.assertEquals(actual, expected, 0.001);
        }

//Convert Malaysian Ringgit to Japanese Yen

    @Test
    public void testRinggittoYen(){
        double expected = 25.914;
        double actual = Currency.currency(initialValue, Currency.RINGGIT, Currency.YEN);
            Assert.assertEquals(actual, expected, 0.001);
        }
//Convert Japanese Yen to Chinese Yuan Renminbi

    @Test
    public void testYentoChina(){
        double expected = 0.059;
        double actual = Currency.currency(initialValue, Currency.YEN, Currency.CHINA);
            Assert.assertEquals(actual, expected, 0.001);
        }




}