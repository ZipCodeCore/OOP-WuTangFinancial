import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ExchangeTester {


    @Test
    public void testFormatter() {
        ExchangeMaster m = new ExchangeMaster();
        double numberToFormat = 36.7569;
        String expected = "36.76";
        String actual = m.formatCurrency(numberToFormat);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFormatter2() {
        ExchangeMaster m = new ExchangeMaster();
        double numberToFormat = 0.1;
        String expected = "0.10";
        String actual = m.formatCurrency(numberToFormat);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDollarToEuro() {
        ExchangeMaster m = new ExchangeMaster();
        double originalAmount = 10.00;
        String originalCurrency = "US Dollar";
        String convertTo = "Euro";
        String expected = "9.40";
        String actual = m.converter(originalAmount, originalCurrency, convertTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEuroToDollar() {
        ExchangeMaster m = new ExchangeMaster();
        double originalAmount = 10.00;
        String originalCurrency = "EURO";
        String convertTo = "us DOLLAR";
        String expected = "10.64";
        String actual = m.converter(originalAmount, originalCurrency, convertTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEuroToPound() {
        ExchangeMaster m = new ExchangeMaster();
        double originalAmount = 10.00;
        String originalCurrency = "eurO";
        String convertTo = "british POUnd";
        String expected = "8.72";
        String actual = m.converter(originalAmount, originalCurrency, convertTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPoundToRupee() {
        ExchangeMaster m = new ExchangeMaster();
        double originalAmount = 10.00;
        String originalCurrency = "British Pound";
        String convertTo = "indian rupee";
        String expected = "833.17";
        String actual = m.converter(originalAmount, originalCurrency, convertTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRupeeToCanada() {
        ExchangeMaster m = new ExchangeMaster();
        double originalAmount = 10.00;
        String originalCurrency = "indian ruPEE";
        String convertTo = "canadian dollar";
        String expected = "0.19";
        String actual = m.converter(originalAmount, originalCurrency, convertTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCanadaToSingapore() {
        ExchangeMaster m = new ExchangeMaster();
        double originalAmount = 10.00;
        String originalCurrency = "canadian dollar";
        String convertTo = "singAPORE Dollar";
        String expected = "10.83";
        String actual = m.converter(originalAmount, originalCurrency, convertTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSingaporeToFranc() {
        ExchangeMaster m = new ExchangeMaster();
        double originalAmount = 10.00;
        String originalCurrency = "singapore dollar";
        String convertTo = "swiss franc";
        String expected = "7.06";
        String actual = m.converter(originalAmount, originalCurrency, convertTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFrancToRinggit() {
        ExchangeMaster m = new ExchangeMaster();
        double originalAmount = 10.00;
        String originalCurrency = "SWISS franc";
        String convertTo = "malaysian ringgit";
        String expected = "44.26";
        String actual = m.converter(originalAmount, originalCurrency, convertTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRinggitToYen() {
        ExchangeMaster m = new ExchangeMaster();
        double originalAmount = 10.00;
        String originalCurrency = "MALAYSIAN RINGGIT";
        String convertTo = "japanese yen";
        String expected = "259.15";
        String actual = m.converter(originalAmount, originalCurrency, convertTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testYenToRenminbi() {
        ExchangeMaster m = new ExchangeMaster();
        double originalAmount = 10.00;
        String originalCurrency = "japanese YEN";
        String convertTo = "Chinese Yuan Renminbi";
        String expected = "0.60";
        String actual = m.converter(originalAmount, originalCurrency, convertTo);
        Assert.assertEquals(expected, actual);
    }

}
