import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConversionCalculatorTest {

    ConversionCalculator calculator = new ConversionCalculator();


//    This is a testing template
//
//    @Test
//    public void convertTest_XtoY() {
//        Double startingValue = 15.0d;
//        Currency origin = Currency.valueOf("X");
//        Currency exchange = Currency.valueOf("Y");
//
//        String expected = "0";
//
//        String actual = calculator.convert(startingValue, origin, exchange);
//
//        Assert.assertEquals(expected, actual);
//    }


    @Test
    public void convertTest_USDtoEUR() throws Exception {

        Double startingValue = 15.0d;
        Currency origin = Currency.valueOf("USD");
        Currency exchange = Currency.valueOf("EUR");

        String expected = "14.10";

        String actual = calculator.convert(startingValue, origin, exchange);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest_EURtoUSD() throws Exception {

        Double startingValue = 15.0d;
        Currency origin = Currency.valueOf("EUR");
        Currency exchange = Currency.valueOf("USD");

        String expected = "15.96";

        String actual = calculator.convert(startingValue, origin, exchange);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest_EURtoGBP() throws Exception {
        Double startingValue = 15.0d;
        Currency origin = Currency.valueOf("EUR");
        Currency exchange = Currency.valueOf("GBP");

        String expected = "13.09";

        String actual = calculator.convert(startingValue, origin, exchange);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest_GBPtoINR() {
        Double startingValue = 15.0d;
        Currency origin = Currency.valueOf("GBP");
        Currency exchange = Currency.valueOf("INR");

        String expected = "1,249.76";

        String actual = calculator.convert(startingValue, origin, exchange);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest_INRtoCAD() {
        Double startingValue = 15.0d;
        Currency origin = Currency.valueOf("INR");
        Currency exchange = Currency.valueOf("CAD");

        String expected = "0.29";

        String actual = calculator.convert(startingValue, origin, exchange);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest_CADtoSGD() {
        Double startingValue = 15.0d;
        Currency origin = Currency.valueOf("CAD");
        Currency exchange = Currency.valueOf("SGD");

        String expected = "16.25";

        String actual = calculator.convert(startingValue, origin, exchange);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest_SGDtoCHF() {
        Double startingValue = 15.0d;
        Currency origin = Currency.valueOf("SGD");
        Currency exchange = Currency.valueOf("CHF");

        String expected = "10.59";

        String actual = calculator.convert(startingValue, origin, exchange);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest_CHFtoMYR() {
        Double startingValue = 15.0d;
        Currency origin = Currency.valueOf("CHF");
        Currency exchange = Currency.valueOf("MYR");

        String expected = "66.39";

        String actual = calculator.convert(startingValue, origin, exchange);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest_MYRtoJPY() {
        Double startingValue = 15.0d;
        Currency origin = Currency.valueOf("MYR");
        Currency exchange = Currency.valueOf("JPY");

        String expected = "388.72";

        String actual = calculator.convert(startingValue, origin, exchange);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest_JPYtoCNY() {
        Double startingValue = 15.0d;
        Currency origin = Currency.valueOf("JPY");
        Currency exchange = Currency.valueOf("CNY");

        String expected = "0.90";

        String actual = calculator.convert(startingValue, origin, exchange);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest_CNYtoAUD() {
        Double startingValue = 15.0d;
        Currency origin = Currency.valueOf("CNY");
        Currency exchange = Currency.valueOf("AUD");

        String expected = "2.93";

        String actual = calculator.convert(startingValue, origin, exchange);

        Assert.assertEquals(expected, actual);
    }
}