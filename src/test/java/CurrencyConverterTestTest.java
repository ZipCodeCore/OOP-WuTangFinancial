import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CurrencyConverterTestTest {
    private static CurrencyConverter tester;

    @Before
    public void setUp() {
        HashMap<String, Float> originalRecord = new HashMap<String, Float>() {{
            put("USD", 1.00F);
            put("EUR", 0.94F);
            put("GBP", 0.82F);
            put("INR", 68.32F);
            put("AUD", 1.35F);
            put("CAD", 1.32F);
            put("SGD", 1.43F);
            put("CHF", 1.01F);
            put("MYR", 4.47F);
            put("JPY", 115.84F);
            put("CNY", 6.92F);
        }};
        tester = new CurrencyConverter();
    }



    @Test
    public void GBP_to_USD() {
        String expected = "$609.76";
        String actual = tester.makeConversion("GBP", "USD", 500.00F);

        Assert.assertEquals(expected, actual);
    }


    // 1.
    @Test
    public void USD_to_EUR() {
        String expected = "$470.00";
        String actual = tester.makeConversion("USD", "EUR", 500.00F);

        Assert.assertEquals(expected, actual);
    }

    // 2.
    @Test
    public void EUR_to_USD() {
        String expected = "$531.91";
        String actual = tester.makeConversion("EUR", "USD", 500.00F);

        Assert.assertEquals(expected, actual);
    }

    // 3.
    @Test
    public void EUR_to_GBP() {
        String expected = "$436.17";
        String actual = tester.makeConversion("EUR", "GBP", 500.00F);

        Assert.assertEquals(expected, actual);
    }

    // 4.
    @Test
    public void GBP_to_INR() {
        String expected = "$41,658.54";
        String actual = tester.makeConversion("GBP", "INR", 500.00F);

        Assert.assertEquals(expected, actual);
    }

    // 5.
    @Test
    public void INR_to_CAD() {
        String expected = "$9.66";
        String actual = tester.makeConversion("INR", "CAD", 500.00F);

        Assert.assertEquals(expected, actual);
    }

    // 6.
    @Test
    public void CAD_to_SGD() {
        String expected = "$541.67";
        String actual = tester.makeConversion("CAD", "SGD", 500.00F);

        Assert.assertEquals(expected, actual);
    }

    // 7.
    @Test
    public void SGD_to_CHF() {
        String expected = "$353.15";
        String actual = tester.makeConversion("SGD", "CHF", 500.00F);

        Assert.assertEquals(expected, actual);
    }

    // 8.
    @Test
    public void CHF_to_MYR() {
        String expected = "$2,212.87";
        String actual = tester.makeConversion("CHF", "MYR", 500.00F);

        Assert.assertEquals(expected, actual);
    }

    // 9.
    @Test
    public void MYR_to_JPY() {
        String expected = "$12,957.50";
        String actual = tester.makeConversion("MYR", "JPY", 500.00F);

        Assert.assertEquals(expected, actual);
    }

    // 10.
    @Test
    public void JPY_to_CNY() {
        String expected = "$29.87";
        String actual = tester.makeConversion("JPY", "CNY", 500.00F);

        Assert.assertEquals(expected, actual);
    }


}
//        Convert Japanese Yen to Chinese Yuan Renminbi