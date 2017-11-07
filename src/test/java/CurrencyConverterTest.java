import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CurrencyConverterTest {


    @Test
    public void convertToDesiredCurrencyValue_USDollarToEuro() throws Exception {
        String currentCurrency = "UsDollar";
        String desiredCurrency = "Euro";
        Double currentDollarAmount = 375.0;
        Double expectedEuros = 352.5;
        Double actualEuros = CurrencyConverter.convertToDesiredCurrencyValue(currentDollarAmount, currentCurrency, desiredCurrency);
        Assert.assertEquals(expectedEuros, actualEuros, .01);
    }

    @Test
    public void convertToDesiredCurrencyValue_EuroToDollarTest() throws Exception {
        String currentCurrency = "Euro";
        String desiredCurrency = "UsDollar";
        Double currentEuroAmount = .94;
        Double expectedUSDollars = 1.0;
        Double actualUSDollars = CurrencyConverter.convertToDesiredCurrencyValue(currentEuroAmount,currentCurrency, desiredCurrency);
        Assert.assertEquals(expectedUSDollars, actualUSDollars, .01);
    }

    @Test
    public void convertToDesiredCurrencyValue_EuroToBritishPound() throws Exception {
        String currentCurrency = "Euro";
        String desiredCurrency = "BritishPound";
        Double currentEuroAmount = 575.0;
        Double expectedBritishPounds = 501.595744681;
        Double actualBritishPounds = CurrencyConverter.convertToDesiredCurrencyValue(currentEuroAmount,currentCurrency, desiredCurrency);
        Assert.assertEquals(expectedBritishPounds, actualBritishPounds, .01);
    }

    @Test
    public void convertToDesiredCurrencyValue_BritishPoundToIndianRupee() throws Exception {
        String currentCurrency = "BritishPound";
        String desiredCurrency = "IndianRupee";
        Double currentBritishPoundAmount = 1584.0;
        Double expectedIndianRupees = 131974.243902;
        Double actualIndianRupees = CurrencyConverter.convertToDesiredCurrencyValue(currentBritishPoundAmount, currentCurrency, desiredCurrency);
        Assert.assertEquals(expectedIndianRupees, actualIndianRupees, .01);
    }


}