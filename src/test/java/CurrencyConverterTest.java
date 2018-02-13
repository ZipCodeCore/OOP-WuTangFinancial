import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class CurrencyConverterTest {

    Selector selector = new Selector();

    @Test
    public void testDollarToEuro() {
        selector.firstCurrencyAnswer(1);
        selector.secondCurrencyAnswer(2);
        selector.setValueToBeConvertedInput(100);
        String actual = selector.convertCurrencies();
        String expected = "100.00 converted is equal to 94.00";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEurotoDollar() {
        selector.firstCurrencyAnswer(2);
        selector.secondCurrencyAnswer(1);
        selector.setValueToBeConvertedInput(100);
        String actual = selector.convertCurrencies();
        String expected = "100.00 converted is equal to 106.38";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEuroToBritishPound() {
        selector.firstCurrencyAnswer(2);
        selector.secondCurrencyAnswer(3);
        selector.setValueToBeConvertedInput(100);
        String actual = selector.convertCurrencies();
        String expected = "100.00 converted is equal to 87.23";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testBritishPoundToIndianRupee() {
        selector.firstCurrencyAnswer(3);
        selector.secondCurrencyAnswer(4);
        selector.setValueToBeConvertedInput(100);
        String actual = selector.convertCurrencies();
        String expected = "100.00 converted is equal to 8331.71";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testIndianRupeeToCanadianDollar() {
        selector.firstCurrencyAnswer(4);
        selector.secondCurrencyAnswer(6);
        selector.setValueToBeConvertedInput(100);
        String actual = selector.convertCurrencies();
        String expected = "100.00 converted is equal to 1.93";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCanadianDollarToSingaporeDollar() {
        selector.firstCurrencyAnswer(6);
        selector.secondCurrencyAnswer(7);
        selector.setValueToBeConvertedInput(100);
        String actual = selector.convertCurrencies();
        String expected = "100.00 converted is equal to 108.33";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSingaporeDollarToSwissFranc() {
        selector.firstCurrencyAnswer(7);
        selector.secondCurrencyAnswer(8);
        selector.setValueToBeConvertedInput(100);
        String actual = selector.convertCurrencies();
        String expected = "100.00 converted is equal to 70.63";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSwissFrancToMalaysianRinggit() {
        selector.firstCurrencyAnswer(8);
        selector.secondCurrencyAnswer(9);
        selector.setValueToBeConvertedInput(100);
        String actual = selector.convertCurrencies();
        String expected = "100.00 converted is equal to 442.57";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMalaysianRinggitToJapaneseYen() {
        selector.firstCurrencyAnswer(9);
        selector.secondCurrencyAnswer(10);
        selector.setValueToBeConvertedInput(100);
        String actual = selector.convertCurrencies();
        String expected = "100.00 converted is equal to 2591.50";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testJapaneseYenToChineseYuanRenminbi() {
        selector.firstCurrencyAnswer(10);
        selector.secondCurrencyAnswer(11);
        selector.setValueToBeConvertedInput(100);
        String actual = selector.convertCurrencies();
        String expected = "100.00 converted is equal to 5.97";
        Assert.assertEquals(expected, actual);
    }

}


