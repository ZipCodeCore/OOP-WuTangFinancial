package com.markbrown.wutangfinancial;
import org.junit.Assert;
import org.junit.Test;
import java.util.Map;

public class CurrencyConversionsTest {

    @Test
    public void testConvertUSDollarsToUSDollars() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("US_Dollar");
        Currency.setTargetCurrencyType("US_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = 1000;

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertUSDollarsToEuro() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("US_Dollar");
        Currency.setTargetCurrencyType("Euro");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = 940;

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertUSDollarsToBritishPound() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("US_Dollar");
        Currency.setTargetCurrencyType("British_Pound");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = 820;

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertUSDollarsToIndianRupee() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("US_Dollar");
        Currency.setTargetCurrencyType("Indian_Rupee");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = 68320;

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertUSDollarsToAustralianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("US_Dollar");
        Currency.setTargetCurrencyType("Australian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = 1350;

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertUSDollarsToCanadianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("US_Dollar");
        Currency.setTargetCurrencyType("Canadian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = 1320;

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertUSDollarsToSingaporeDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("US_Dollar");
        Currency.setTargetCurrencyType("Singapore_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = 1430;

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertUSDollarsToSwissFranc() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("US_Dollar");
        Currency.setTargetCurrencyType("Swiss_Franc");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = 1010;

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertUSDollarsToMalaysianRinggit() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("US_Dollar");
        Currency.setTargetCurrencyType("Malaysian_Ringgit");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = 4470;

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertUSDollarsToJapaneseYen() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("US_Dollar");
        Currency.setTargetCurrencyType("Japanese_Yen");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = 115840;

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertUSDollarsToChineseYuanRenminbi() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("US_Dollar");
        Currency.setTargetCurrencyType("Chinese_Yuan_Renminbi");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = 6920;

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertEuroToUSDollars() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Euro");
        Currency.setTargetCurrencyType("US_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1/0.94));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertEuroToEuro() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Euro");
        Currency.setTargetCurrencyType("Euro");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.94/0.94));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertEuroToBritishPound() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Euro");
        Currency.setTargetCurrencyType("British_Pound");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.82/0.94));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertEuroToIndianRupee() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Euro");
        Currency.setTargetCurrencyType("Indian_Rupee");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (68.32/0.94));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertEuroToAustralianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Euro");
        Currency.setTargetCurrencyType("Australian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.35/0.94));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertEuroToCanadianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Euro");
        Currency.setTargetCurrencyType("Canadian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.32/0.94));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertEuroToSingaporeDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Euro");
        Currency.setTargetCurrencyType("Singapore_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.43/0.94));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertEuroToSwissFranc() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Euro");
        Currency.setTargetCurrencyType("Swiss_Franc");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.01/0.94));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertEuroToMalaysianRinggit() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Euro");
        Currency.setTargetCurrencyType("Malaysian_Ringgit");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (4.47/0.94));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertEuroToJapaneseYen() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Euro");
        Currency.setTargetCurrencyType("Japanese_Yen");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (115.84/0.94));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertEuroToChineseYuanRenminbi() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Euro");
        Currency.setTargetCurrencyType("Chinese_Yuan_Renminbi");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (6.92/0.94));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertBritishPoundToUSDollars() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("British_Pound");
        Currency.setTargetCurrencyType("US_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1/0.82));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertBritishPoundToEuro() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("British_Pound");
        Currency.setTargetCurrencyType("Euro");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.94/0.82));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertBritishPoundToBritishPound() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("British_Pound");
        Currency.setTargetCurrencyType("British_Pound");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.82/0.82));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertBritishPoundToIndianRupee() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("British_Pound");
        Currency.setTargetCurrencyType("Indian_Rupee");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (68.32/0.82));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertBritishPoundToAustralianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("British_Pound");
        Currency.setTargetCurrencyType("Australian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.35/0.82));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertBritishPoundToCanadianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("British_Pound");
        Currency.setTargetCurrencyType("Canadian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.32/0.82));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertBritishPoundToSingaporeDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("British_Pound");
        Currency.setTargetCurrencyType("Singapore_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.43/0.82));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertBritishPoundToSwissFranc() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("British_Pound");
        Currency.setTargetCurrencyType("Swiss_Franc");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.01/0.82));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertBritishPoundToMalaysianRinggit() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("British_Pound");
        Currency.setTargetCurrencyType("Malaysian_Ringgit");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (4.47/0.82));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertBritishPoundToJapaneseYen() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("British_Pound");
        Currency.setTargetCurrencyType("Japanese_Yen");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (115.84/0.82));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertBritishPoundToChineseYuanRenminbi() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("British_Pound");
        Currency.setTargetCurrencyType("Chinese_Yuan_Renminbi");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (6.92/0.82));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertIndianRupeeToUSDollars() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Indian_Rupee");
        Currency.setTargetCurrencyType("US_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1/68.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertIndianRupeeToEuro() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Indian_Rupee");
        Currency.setTargetCurrencyType("Euro");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.94/68.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertIndianRupeeToBritishPound() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Indian_Rupee");
        Currency.setTargetCurrencyType("British_Pound");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.82/68.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertIndianRupeeToIndianRupee() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Indian_Rupee");
        Currency.setTargetCurrencyType("Indian_Rupee");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (68.32/68.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertIndianRupeeToAustralianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Indian_Rupee");
        Currency.setTargetCurrencyType("Australian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.35/68.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertIndianRupeeToCanadianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Indian_Rupee");
        Currency.setTargetCurrencyType("Canadian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.32/68.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertIndianRupeeToSingaporeDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Indian_Rupee");
        Currency.setTargetCurrencyType("Singapore_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.43/68.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertIndianRupeeToSwissFranc() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Indian_Rupee");
        Currency.setTargetCurrencyType("Swiss_Franc");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.01/68.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertIndianRupeeToMalaysianRinggit() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Indian_Rupee");
        Currency.setTargetCurrencyType("Malaysian_Ringgit");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (4.47/68.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertIndianRupeeToJapaneseYen() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Indian_Rupee");
        Currency.setTargetCurrencyType("Japanese_Yen");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (115.84/68.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertIndianRupeeToChineseYuanRenminbi() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Indian_Rupee");
        Currency.setTargetCurrencyType("Chinese_Yuan_Renminbi");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (6.92/68.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertAustralianDollarToUSDollars() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Australian_Dollar");
        Currency.setTargetCurrencyType("US_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1/1.35));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertAustralianDollarToEuro() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Australian_Dollar");
        Currency.setTargetCurrencyType("Euro");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.94/1.35));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertAustralianDollarToBritishPound() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Australian_Dollar");
        Currency.setTargetCurrencyType("British_Pound");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.82/1.35));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertAustralianDollarToIndianRupee() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Australian_Dollar");
        Currency.setTargetCurrencyType("Indian_Rupee");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (68.32/1.35));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertAustralianDollarToAustralianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Australian_Dollar");
        Currency.setTargetCurrencyType("Australian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.35/1.35));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertAustralianDollarToCanadianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Australian_Dollar");
        Currency.setTargetCurrencyType("Canadian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.32/1.35));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertAustralianDollarToSingaporeDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Australian_Dollar");
        Currency.setTargetCurrencyType("Singapore_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.43/1.35));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertAustralianDollarToSwissFranc() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Australian_Dollar");
        Currency.setTargetCurrencyType("Swiss_Franc");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.01/1.35));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertAustralianDollarToMalaysianRinggit() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Australian_Dollar");
        Currency.setTargetCurrencyType("Malaysian_Ringgit");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (4.47/1.35));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertAustralianDollarToJapaneseYen() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Australian_Dollar");
        Currency.setTargetCurrencyType("Japanese_Yen");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (115.84/1.35));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertAustralianDollarToChineseYuanRenminbi() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Australian_Dollar");
        Currency.setTargetCurrencyType("Chinese_Yuan_Renminbi");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (6.92/1.35));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertCanadianDollarToUSDollars() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Canadian_Dollar");
        Currency.setTargetCurrencyType("US_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1/1.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertCanadianDollarToEuro() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Canadian_Dollar");
        Currency.setTargetCurrencyType("Euro");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.94/1.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertCanadianDollarToBritishPound() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Canadian_Dollar");
        Currency.setTargetCurrencyType("British_Pound");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.82/1.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertCanadianDollarToIndianRupee() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Canadian_Dollar");
        Currency.setTargetCurrencyType("Indian_Rupee");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (68.32/1.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertCanadianDollarToAustralianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Canadian_Dollar");
        Currency.setTargetCurrencyType("Australian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.35/1.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertCanadianDollarToCanadianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Canadian_Dollar");
        Currency.setTargetCurrencyType("Canadian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.32/1.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertCanadianDollarToSingaporeDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Canadian_Dollar");
        Currency.setTargetCurrencyType("Singapore_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.43/1.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertCanadianDollarToSwissFranc() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Canadian_Dollar");
        Currency.setTargetCurrencyType("Swiss_Franc");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.01/1.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertCanadianDollarToMalaysianRinggit() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Canadian_Dollar");
        Currency.setTargetCurrencyType("Malaysian_Ringgit");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (4.47/1.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertCanadianDollarToJapaneseYen() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Canadian_Dollar");
        Currency.setTargetCurrencyType("Japanese_Yen");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (115.84/1.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertCanadianDollarToChineseYuanRenminbi() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Canadian_Dollar");
        Currency.setTargetCurrencyType("Chinese_Yuan_Renminbi");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (6.92/1.32));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSingaporeDollarToUSDollars() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Singapore_Dollar");
        Currency.setTargetCurrencyType("US_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1/1.43));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSingaporeDollarToEuro() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Singapore_Dollar");
        Currency.setTargetCurrencyType("Euro");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.94/1.43));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSingaporeDollarToBritishPound() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Singapore_Dollar");
        Currency.setTargetCurrencyType("British_Pound");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.82/1.43));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSingaporeDollarToIndianRupee() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Singapore_Dollar");
        Currency.setTargetCurrencyType("Indian_Rupee");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (68.32/1.43));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSingaporeDollarToAustralianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Singapore_Dollar");
        Currency.setTargetCurrencyType("Australian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.35/1.43));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSingaporeDollarToCanadianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Singapore_Dollar");
        Currency.setTargetCurrencyType("Canadian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.32/1.43));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSingaporeDollarToSingaporeDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Singapore_Dollar");
        Currency.setTargetCurrencyType("Singapore_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.43/1.43));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertSingaporeDollarToSwissFranc() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Singapore_Dollar");
        Currency.setTargetCurrencyType("Swiss_Franc");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.01/1.43));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertSingaporeDollarToMalaysianRinggit() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Singapore_Dollar");
        Currency.setTargetCurrencyType("Malaysian_Ringgit");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (4.47/1.43));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSingaporeDollarToJapaneseYen() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Singapore_Dollar");
        Currency.setTargetCurrencyType("Japanese_Yen");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (115.84/1.43));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSingaporeDollarToChineseYuanRenminbi() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Singapore_Dollar");
        Currency.setTargetCurrencyType("Chinese_Yuan_Renminbi");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (6.92/1.43));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSwissFrancToUSDollars() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Swiss_Franc");
        Currency.setTargetCurrencyType("US_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1/1.01));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSwissFrancToEuro() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Swiss_Franc");
        Currency.setTargetCurrencyType("Euro");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.94/1.01));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSwissFrancToBritishPound() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Swiss_Franc");
        Currency.setTargetCurrencyType("British_Pound");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.82/1.01));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSwissFrancToIndianRupee() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Swiss_Franc");
        Currency.setTargetCurrencyType("Indian_Rupee");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (68.32/1.01));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSwissFrancToAustralianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Swiss_Franc");
        Currency.setTargetCurrencyType("Australian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.35/1.01));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSwissFrancToCanadianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Swiss_Franc");
        Currency.setTargetCurrencyType("Canadian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.32/1.01));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSwissFrancToSingaporeDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Swiss_Franc");
        Currency.setTargetCurrencyType("Singapore_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.43/1.01));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertSwissFrancToSwissFranc() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Swiss_Franc");
        Currency.setTargetCurrencyType("Swiss_Franc");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.01/1.01));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertSwissFrancToMalaysianRinggit() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Swiss_Franc");
        Currency.setTargetCurrencyType("Malaysian_Ringgit");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (4.47/1.01));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSwissFrancToJapaneseYen() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Swiss_Franc");
        Currency.setTargetCurrencyType("Japanese_Yen");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (115.84/1.01));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertSwissFrancToChineseYuanRenminbi() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Swiss_Franc");
        Currency.setTargetCurrencyType("Chinese_Yuan_Renminbi");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (6.92/1.01));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertMalaysianRinggitToUSDollars() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Malaysian_Ringgit");
        Currency.setTargetCurrencyType("US_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1/4.47));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertMalaysianRinggitToEuro() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Malaysian_Ringgit");
        Currency.setTargetCurrencyType("Euro");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.94/4.47));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertMalaysianRinggitToBritishPound() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Malaysian_Ringgit");
        Currency.setTargetCurrencyType("British_Pound");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.82/4.47));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertMalaysianRinggitToIndianRupee() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Malaysian_Ringgit");
        Currency.setTargetCurrencyType("Indian_Rupee");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (68.32/4.47));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertMalaysianRinggitToAustralianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Malaysian_Ringgit");
        Currency.setTargetCurrencyType("Australian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.35/4.47));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertMalaysianRinggitToCanadianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Malaysian_Ringgit");
        Currency.setTargetCurrencyType("Canadian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.32/4.47));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertMalaysianRinggitToSingaporeDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Malaysian_Ringgit");
        Currency.setTargetCurrencyType("Singapore_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.43/4.47));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertMalaysianRinggitToSwissFranc() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Malaysian_Ringgit");
        Currency.setTargetCurrencyType("Swiss_Franc");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.01/4.47));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertMalaysianRinggitToMalaysianRinggit() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Malaysian_Ringgit");
        Currency.setTargetCurrencyType("Malaysian_Ringgit");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (4.47/4.47));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertMalaysianRinggitToJapaneseYen() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Malaysian_Ringgit");
        Currency.setTargetCurrencyType("Japanese_Yen");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (115.84/4.47));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertMalaysianRinggitToChineseYuanRenminbi() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Malaysian_Ringgit");
        Currency.setTargetCurrencyType("Chinese_Yuan_Renminbi");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (6.92/4.47));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertJapaneseYenToUSDollars() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Japanese_Yen");
        Currency.setTargetCurrencyType("US_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1/115.84));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertJapaneseYenToEuro() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Japanese_Yen");
        Currency.setTargetCurrencyType("Euro");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.94/115.84));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertJapaneseYenToBritishPound() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Japanese_Yen");
        Currency.setTargetCurrencyType("British_Pound");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.82/115.84));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertJapaneseYenToIndianRupee() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Japanese_Yen");
        Currency.setTargetCurrencyType("Indian_Rupee");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (68.32/115.84));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertJapaneseYenToAustralianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Japanese_Yen");
        Currency.setTargetCurrencyType("Australian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.35/115.84));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertJapaneseYenToCanadianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Japanese_Yen");
        Currency.setTargetCurrencyType("Canadian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.32/115.84));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertJapaneseYenToSingaporeDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Japanese_Yen");
        Currency.setTargetCurrencyType("Singapore_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.43/115.84));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertJapaneseYenToSwissFranc() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Japanese_Yen");
        Currency.setTargetCurrencyType("Swiss_Franc");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.01/115.84));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertJapaneseYenToMalaysianRinggit() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Japanese_Yen");
        Currency.setTargetCurrencyType("Malaysian_Ringgit");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (4.47/115.84));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertJapaneseYenToJapaneseYen() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Japanese_Yen");
        Currency.setTargetCurrencyType("Japanese_Yen");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (115.84/115.84));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertJapaneseYenToChineseYuanRenminbi() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Japanese_Yen");
        Currency.setTargetCurrencyType("Chinese_Yuan_Renminbi");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (6.92/115.84));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertChineseYuanRenminbiToUSDollars() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Chinese_Yuan_Renminbi");
        Currency.setTargetCurrencyType("US_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1/6.92));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertChineseYuanRenminbiToEuro() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Chinese_Yuan_Renminbi");
        Currency.setTargetCurrencyType("Euro");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.94/6.92));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertChineseYuanRenminbiToBritishPound() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Chinese_Yuan_Renminbi");
        Currency.setTargetCurrencyType("British_Pound");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (0.82/6.92));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertChineseYuanRenminbiToIndianRupee() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Chinese_Yuan_Renminbi");
        Currency.setTargetCurrencyType("Indian_Rupee");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (68.32/6.92));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertChineseYuanRenminbiToAustralianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Chinese_Yuan_Renminbi");
        Currency.setTargetCurrencyType("Australian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.35/6.92));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertChineseYuanRenminbiToCanadianDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Chinese_Yuan_Renminbi");
        Currency.setTargetCurrencyType("Canadian_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.32/6.92));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertChineseYuanRenminbiToSingaporeDollar() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Chinese_Yuan_Renminbi");
        Currency.setTargetCurrencyType("Singapore_Dollar");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.43/6.92));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertChineseYuanRenminbiToSwissFranc() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Chinese_Yuan_Renminbi");
        Currency.setTargetCurrencyType("Swiss_Franc");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (1.01/6.92));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }
    @Test
    public void testConvertChineseYuanRenminbiToMalaysianRinggit() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Chinese_Yuan_Renminbi");
        Currency.setTargetCurrencyType("Malaysian_Ringgit");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (4.47/6.92));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertChineseYuanRenminbiToJapaneseYen() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Chinese_Yuan_Renminbi");
        Currency.setTargetCurrencyType("Japanese_Yen");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (115.84/6.92));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }

    @Test
    public void testConvertChineseYuanRenminbiToChineseYuanRenminbi() {
        //Given:
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Currency.setCurrentCurrencyType("Chinese_Yuan_Renminbi");
        Currency.setTargetCurrencyType("Chinese_Yuan_Renminbi");
        Money.setMoneyInOneHundredths(1000);
        long expectedOutcome = (long) (1000 * (6.92/6.92));

        //When:
        CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
        long actualOutcome = Money.getMoneyInOneHundredths();

        //Then:
        Assert.assertTrue(expectedOutcome == actualOutcome);
    }


}
