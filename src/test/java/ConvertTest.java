import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {
    Convert testConvert = new Convert();
    Currency currencyUS = testConvert.getCurrencyByType("US dollar");
    Currency currencyEURO = testConvert.getCurrencyByType("euro");
    Currency currencyPOUND = testConvert.getCurrencyByType("British pound");
    Currency currencyRUPEE = testConvert.getCurrencyByType("indian rupee");
    Currency currencyAUSTRALIAN = testConvert.getCurrencyByType("australian dollar");
    Currency currencyCANADIAN = testConvert.getCurrencyByType("Canadian Dollar");
    Currency currencySINGAPORE = testConvert.getCurrencyByType("singapore dollar");
    Currency currencyFRANC = testConvert.getCurrencyByType("swiss franc");
    Currency currencyRINGGIT = testConvert.getCurrencyByType("malaysian ringgit");
    Currency currencyYEN = testConvert.getCurrencyByType("japanese yen");
    Currency currencyYUANrENMINBI = testConvert.getCurrencyByType("chinese yuan Renminbi");


    @Test
    public void getCurrencyByTypeTest(){
        double expected = 115.84;

        Currency testCurrency = testConvert.getCurrencyByType("japanese yen");
        double actual = testCurrency.getRate();

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyUSDollarToEuroTest() {
        double expected = 8.46;

        double actual = testConvert.convertCurrency(currencyUS, currencyEURO, 9.00);

        Assert.assertEquals(expected, actual,0);
    }

    @Test
    public void convertCurrencyEuroToUSDollarTest(){
        double expected = 9.57;

        double actual = testConvert.convertCurrency(currencyEURO,currencyUS,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyEuroToPoundTest(){
        double expected = 7.85;

        double actual = testConvert.convertCurrency(currencyEURO,currencyPOUND,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyPoundToRupeeTest(){
        double expected = 749.85;

        double actual = testConvert.convertCurrency(currencyPOUND,currencyRUPEE,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyRupeeToAustralianDollarTest(){
        double expected = 0.18;

        double actual = testConvert.convertCurrency(currencyRUPEE,currencyAUSTRALIAN,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyAustralianDollarToCanadianDollarTest(){
        double expected = 8.80;

        double actual = testConvert.convertCurrency(currencyAUSTRALIAN,currencyCANADIAN,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyCanadianDollarToSingaporeDollarTest(){
        double expected = 9.75;

        double actual = testConvert.convertCurrency(currencyCANADIAN,currencySINGAPORE,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencySingaporeDollarToFrancTest(){
        double expected = 6.36;

        double actual = testConvert.convertCurrency(currencySINGAPORE,currencyFRANC,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyFrancToRinggitTest(){
        double expected = 39.83;

        double actual = testConvert.convertCurrency(currencyFRANC,currencyRINGGIT,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyRinggitToYenTest(){
        double expected = 233.23;

        double actual = testConvert.convertCurrency(currencyRINGGIT,currencyYEN,9.00);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void convertCurrencyYenToYuanRenminbiTest(){
        double expected = 0.54;

        double actual = testConvert.convertCurrency(currencyYEN,currencyYUANrENMINBI,9.00);

        Assert.assertEquals(expected,actual,0);
    }

}
