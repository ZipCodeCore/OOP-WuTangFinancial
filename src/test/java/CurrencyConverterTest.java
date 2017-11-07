import org.junit.Assert;
import org.junit.Test;

public class CurrencyConverterTest {

    @Test
    public void calculateConversionRateTest() throws Exception {
        Double expectedConversionRate = 1.06382978723;
        Double actualConversionRate = CurrencyConverter.calculateConversionRate("Euro", "UsDollar");
        Assert.assertEquals(expectedConversionRate, actualConversionRate, .01);
    }

    @Test
    public void getRateTest() throws Exception {
        Double expectedRate = 1.0;
        Double actualRate = CurrencyConverter.getRate("UsDollar");
        Assert.assertEquals(expectedRate, actualRate, .01);
    }

    @Test
    public void convertFromCurrentCurrencyToDesiredCurrency_USDollarToEuro() throws Exception {
        String currentCurrency = "UsDollar";
        String desiredCurrency = "Euro";
        Double currentDollarAmount = 375.0;
        Double expectedEuros = 352.5;
        Double actualEuros = CurrencyConverter.convertFromCurrentCurrencyToDesiredCurrency(currentDollarAmount, currentCurrency, desiredCurrency);
        Assert.assertEquals(expectedEuros, actualEuros, .01);
    }

    @Test
    public void convertFromCurrentCurrencyToDesiredCurrency_EuroToDollarTest() throws Exception {
        String currentCurrency = "Euro";
        String desiredCurrency = "UsDollar";
        Double currentEuroAmount = .94;
        Double expectedUSDollars = 1.0;
        Double actualUSDollars = CurrencyConverter.convertFromCurrentCurrencyToDesiredCurrency(currentEuroAmount,currentCurrency, desiredCurrency);
        Assert.assertEquals(expectedUSDollars, actualUSDollars, .01);
    }

    @Test
    public void convertFromCurrentCurrencyToDesiredCurrency_EuroToBritishPound() throws Exception {
        String currentCurrency = "Euro";
        String desiredCurrency = "BritishPound";
        Double currentEuroAmount = 575.0;
        Double expectedBritishPounds = 501.595744681;
        Double actualBritishPounds = CurrencyConverter.convertFromCurrentCurrencyToDesiredCurrency(currentEuroAmount,currentCurrency, desiredCurrency);
        Assert.assertEquals(expectedBritishPounds, actualBritishPounds, .01);
    }

    @Test
    public void convertFromCurrentCurrencyToDesiredCurrency_BritishPoundToIndianRupee() throws Exception {
        String currentCurrency = "BritishPound";
        String desiredCurrency = "IndianRupee";
        Double currentBritishPoundAmount = 1584.0;
        Double expectedIndianRupees = 131974.243902;
        Double actualIndianRupees = CurrencyConverter.convertFromCurrentCurrencyToDesiredCurrency(currentBritishPoundAmount, currentCurrency, desiredCurrency);
        Assert.assertEquals(expectedIndianRupees, actualIndianRupees, .01);
    }

    @Test
    public void convertFromCurrentCurrencyToDesiredCurrency_IndianRupeeToCanadianDollars() throws Exception {
        String currentCurrency = "IndianRupee";
        String desiredCurrency = "CanadianDollar";
        Double currentIndianRupeeAmount = 15000.0;
        Double expectedCanadianDollars = 289.81264637;
        Double actualCanadianDollars = CurrencyConverter.convertFromCurrentCurrencyToDesiredCurrency(currentIndianRupeeAmount, currentCurrency, desiredCurrency);
        Assert.assertEquals(expectedCanadianDollars, actualCanadianDollars, .01);
    }

    @Test
    public void convertFromCurrentCurrencyToDesiredCurrency_CanadianDollarToSingaporeDollar() throws Exception {
        String currentCurrency = "CanadianDollar";
        String desiredCurrency = "SingaporeDollar";
        Double currentCanadianDollarAmount = 25000.0;
        Double expectedSingaporeDollars = 27083.3333333;
        Double actualSingaporeDollars = CurrencyConverter.convertFromCurrentCurrencyToDesiredCurrency(currentCanadianDollarAmount, currentCurrency, desiredCurrency);
        Assert.assertEquals(expectedSingaporeDollars, actualSingaporeDollars, .01);
    }

    @Test
    public void convertFromCurrentCurrencyToDesiredCurrency_SingaporeDollarToSwissFranc() throws Exception {
        String currentCurrency = "SingaporeDollar";
        String desiredCurrency = "SwissFranc";
        Double currentSingaporeDollarAmount = 10000.0;
        Double expectedSwissFranc = 7062.93706294;
        Double actualSwissFranc = CurrencyConverter.convertFromCurrentCurrencyToDesiredCurrency(currentSingaporeDollarAmount, currentCurrency, desiredCurrency);
        Assert.assertEquals(expectedSwissFranc, actualSwissFranc, .01);
    }

    @Test
    public void convertFromCurrentCurrencyToDesiredCurrency_SwissFrancToMalaysianRinggit() throws Exception {
        String currentCurrency = "SwissFranc";
        String desiredCurrency = "MalaysianRinggit";
        Double currentSwissFrancAmount = 1000.0;
        Double expectedRinggit = 4425.74257426;
        Double actualRinggit = CurrencyConverter.convertFromCurrentCurrencyToDesiredCurrency(currentSwissFrancAmount, currentCurrency, desiredCurrency);
        Assert.assertEquals(expectedRinggit, actualRinggit, .01);
    }

    @Test
    public void convertFromCurrentCurrencyToDesiredCurrency_MalaysianRinggitToJapaneseYen() throws Exception {
        String currentCurrency = "MalaysianRinggit";
        String desiredCurrency = "JapaneseYen";
        Double currentMalaysianRinggitAmount = 253.0;
        Double expectedYen = 6556.49217002;
        Double actualYen = CurrencyConverter.convertFromCurrentCurrencyToDesiredCurrency(currentMalaysianRinggitAmount, currentCurrency, desiredCurrency);
        Assert.assertEquals(expectedYen, actualYen, .01);
    }

    @Test
    public void convertFromCurrentCurrencyToDesiredCurrency_JapaneseYenToYuanRenminbi() throws Exception {
        String currentCurrency = "JapaneseYen";
        String desiredCurrency = "ChineseYuanRenminbi";
        Double currentYen = 125.0;
        Double expectedChinese = 7.4671961326;
        Double actualChinese = CurrencyConverter.convertFromCurrentCurrencyToDesiredCurrency(currentYen, currentCurrency, desiredCurrency);
        Assert.assertEquals(expectedChinese, actualChinese, .01);
    }
}