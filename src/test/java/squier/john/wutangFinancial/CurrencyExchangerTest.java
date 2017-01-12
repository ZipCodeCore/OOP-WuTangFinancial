package squier.john.wutangFinancial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/12/17.
 */
public class CurrencyExchangerTest {

    CurrencyExchanger currencyExchanger;

    @Before
    public void setup() { currencyExchanger = new CurrencyExchanger(); }

    @Test
    public void convertCurrencyDollarToEuro() {
        Double amountToConvert = 100.0;
        Double expected = 94.0;
        Double actual = currencyExchanger.convertCurrency("dollar", "euro", amountToConvert);
        Assert.assertEquals("I expect actual to be 94.0", expected, actual);
    }

    @Test
    public void convertCurrencyEuroToDollar() {
        Double amountToConvert = 100.0;
        Double expected = 106.38;
        Double actual = currencyExchanger.convertCurrency("euro", "dollar", amountToConvert);
        Assert.assertEquals("I expect actual to be 106.38", expected, actual);
    }

    @Test
    public void convertCurrencyEuroToPound() {
        Double amountToConvert = 100.0;
        Double expected = 87.23;
        Double actual = currencyExchanger.convertCurrency("euro", "pound", amountToConvert);
        Assert.assertEquals("I expect actual to be 87.23", expected, actual);
    }

    @Test
    public void convertCurrencyPoundToRupee() {
        Double amountToConvert = 100.0;
        Double expected = 8331.70;
        Double actual = currencyExchanger.convertCurrency("pound", "rupee", amountToConvert);
        Assert.assertEquals("I expect actual to be 8331.70", expected, actual);
    }

    @Test
    public void convertCurrencyRupeeToCANDollar() {
        Double amountToConvert = 100.0;
        Double expected = 1.93;
        Double actual = currencyExchanger.convertCurrency("rupee", "candollar", amountToConvert);
        Assert.assertEquals("I expect actual to be 1.93", expected, actual);
    }

    @Test
    public void convertCurrencyCANDollarToSGPDollar() {
        Double amountToConvert = 100.0;
        Double expected = 108.33;
        Double actual = currencyExchanger.convertCurrency("candollar", "sgpdollar", amountToConvert);
        Assert.assertEquals("I expect actual to be 108.33", expected, actual);
    }

    @Test
    public void convertCurrencySGPDollarToFranc() {
        Double amountToConvert = 100.0;
        Double expected = 70.62;
        Double actual = currencyExchanger.convertCurrency("sgpdollar", "franc", amountToConvert);
        Assert.assertEquals("I expect actual to be 70.62", expected, actual);
    }

    @Test
    public void convertCurrencyFrancToRinggit() {
        Double amountToConvert = 100.0;
        Double expected = 442.57;
        Double actual = currencyExchanger.convertCurrency("franc", "ringgit", amountToConvert);
        Assert.assertEquals("I expect actual to be 442.57", expected, actual);
    }

    @Test
    public void convertCurrencyRinggitToYen() {
        Double amountToConvert = 100.0;
        Double expected = 2591.49;
        Double actual = currencyExchanger.convertCurrency("ringgit", "yen", amountToConvert);
        Assert.assertEquals("I expect actual to be 2591.49", expected, actual);
    }

    @Test
    public void convertCurrencyYenToYuan() {
        Double amountToConvert = 100.0;
        Double expected = 5.97;
        Double actual = currencyExchanger.convertCurrency("yen", "yuan", amountToConvert);
        Assert.assertEquals("I expect actual to be 5.97", expected, actual);
    }
}
