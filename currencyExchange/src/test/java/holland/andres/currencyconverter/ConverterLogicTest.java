package holland.andres.currencyconverter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterLogicTest {

    @Test
    public void usDollarToEuro() {
        ConverterLogic converterLogic = new ConverterLogic();
        Double expected = 0.94;
        Double actual = converterLogic.converter(1, "USD", "EURO");
        Assert.assertEquals("USD 1 is equivalent to EURO 0.94", expected, actual, 0);
    }

    @Test
    public void euroToUSDollar() {
        ConverterLogic converterLogic = new ConverterLogic();
        Double expected = 1.06;
        Double actual = converterLogic.converter(1, "EURO", "USD");
        Assert.assertEquals("EURO 1 is equivalent to USD 1.06", expected, actual, 0);
    }

    @Test
    public void euroToPound() {
        ConverterLogic converterLogic = new ConverterLogic();
        Double expected = 0.87;
        Double actual = converterLogic.converter(1, "EURO", "GDP");
        Assert.assertEquals("EURO 1 is equivalent to GDP 0.87", expected, actual, 0);
    }

    @Test
    public void poundToRupee() {
        ConverterLogic converterLogic = new ConverterLogic();
        Double expected = 83.32;
        Double actual = converterLogic.converter(1, "GDP", "IND");
        Assert.assertEquals("GDP 1 is equivalent to IND 83.32", expected, actual, 0);
    }

    @Test
    public void rupeeToCanDollar() {
        ConverterLogic converterLogic = new ConverterLogic();
        Double expected = 0.02;
        Double actual = converterLogic.converter(1, "IND", "CAD");
        Assert.assertEquals("IND 1 is equivalent to CAD 0.02", expected, actual, 0);
    }

    @Test
    public void canDollarToSingaporeDollar() {
        ConverterLogic converterLogic = new ConverterLogic();
        Double expected = 1.08;
        Double actual = converterLogic.converter(1, "CAD", "SIG");
        Assert.assertEquals("CAD 1 is equivalent to SIG 1.08", expected, actual, 0);
    }

    @Test
    public void signaporeDollarToFranc() {
        ConverterLogic converterLogic = new ConverterLogic();
        Double expected = 0.71;
        Double actual = converterLogic.converter(1, "SIG", "SWISS");
        Assert.assertEquals("SIG 1 is equivalent to SWISS 0.71", expected, actual, 0);
    }

    @Test
    public void francToRinggit() {
        ConverterLogic converterLogic = new ConverterLogic();
        Double expected = 4.43;
        Double actual = converterLogic.converter(1, "SWISS", "MAL");
        Assert.assertEquals("SWISS 1 is equivalent to MAL 4.43", expected, actual, 0);
    }

    @Test
    public void ringgitToYen() {
        ConverterLogic converterLogic = new ConverterLogic();
        Double expected = 25.91;
        Double actual = converterLogic.converter(1, "MAL", "JAP");
        Assert.assertEquals("MAL 1 is equivalent to JAP 25.91", expected, actual, 0);
    }

    @Test
    public void yenToRenminbi() {
        ConverterLogic converterLogic = new ConverterLogic();
        Double expected = 0.06;
        Double actual = converterLogic.converter(1, "JAP", "CHI");
        Assert.assertEquals("JAP 1 is equivalent to CHI 0.06", expected, actual, 0);
    }
}
