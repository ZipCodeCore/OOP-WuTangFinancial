package com.haasjustin;


import com.haasjustin.wutangfinancial.CurrencyConversion;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by justinhaas on 5/22/17.
 */


public class CurrencyTest {

    public static CurrencyConversion conversion;

    @Test
    public void dollarToEuroValueTest() {
        //:Given
        double total = 100.00;
        double expected = 94;
        conversion = new CurrencyConversion();

        //:When
        double actual = CurrencyConversion.convertCurrency(total, "USD", "EUR");

        //:Then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void euroToDollarValueTest() {
        //:Given
        double total = 100.00;
        double expected = 106.3829;
        conversion = new CurrencyConversion();

        //:When
        double actual = CurrencyConversion.convertCurrency(total, "EUR", "USD");

        //:Then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void euroToBritishPoundValueTest() {
        //:Given
        double total = 100.00;
        double expected = 87.2340;
        conversion = new CurrencyConversion();

        //:When
        double actual = CurrencyConversion.convertCurrency(total, "EUR", "GBP");

        //:Then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void britishPoundToIndianRupeeValueTest() {
        //:Given
        double total = 100.00;
        double expected = 8331.7073;
        conversion = new CurrencyConversion();

        //:When
        double actual = CurrencyConversion.convertCurrency(total, "GBP", "INR");

        //:Then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void indianRupeeToCanadianDollarValueTest() {
        //:Given
        double total = 100.00;
        double expected = 1.9320;
        conversion = new CurrencyConversion();

        //:When
        double actual = CurrencyConversion.convertCurrency(total, "INR", "CAD");

        //:Then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void canadianDollarToSingaporeDollarValueTest() {
        //:Given
        double total = 100.00;
        double expected = 108.3333;
        conversion = new CurrencyConversion();

        //:When
        double actual = CurrencyConversion.convertCurrency(total, "CAD", "SGD");

        //:Then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void singaporeDollarToSwissFrancValueTest() {
        //:Given
        double total = 100.00;
        double expected = 70.6293;
        conversion = new CurrencyConversion();

        //:When
        double actual = CurrencyConversion.convertCurrency(total, "SGD", "CHF");

        //:Then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void swissFrancToMalaysianRinggitValueTest() {
        //:Given
        double total = 100.00;
        double expected = 442.5742;
        conversion = new CurrencyConversion();

        //:When
        double actual = CurrencyConversion.convertCurrency(total, "CHF", "MYR");

        //:Then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void malaysianRinggitToJapaneseYenValueTest() {
        //:Given
        double total = 100.00;
        double expected = 2591.4988;
        conversion = new CurrencyConversion();

        //:When
        double actual = CurrencyConversion.convertCurrency(total, "MYR", "JPY");

        //:Then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void japaneseYenToChineseYuanRenminbiValueTest() {
        //:Given
        double total = 100.00;
        double expected = 5.9737;
        conversion = new CurrencyConversion();

        //:When
        double actual = CurrencyConversion.convertCurrency(total, "JPY", "CNY");

        //:Then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void conversionRateTest() {
        //:Given
        String currency = "GBP";
        double expected = 0.82;
        conversion = new CurrencyConversion();

        //:When
        double actual = CurrencyConversion.conversionRate(currency);

        //:Then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void convertForeignToDollarsTest() {
        //:Given
        String currency = "GBP";
        double total = 100;
        double expected = 121.9512;
        conversion = new CurrencyConversion();

        //:When
        double actual = CurrencyConversion.convertForeignToDollars(currency, total);

        //:Then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void convertUSToFinalTest() {
        //:Given
        String fromCurrency = "GBP";
        double total = 100;
        double expected = 82;
        conversion = new CurrencyConversion();

        //:When
        double actual = CurrencyConversion.convertUSToFinal(fromCurrency, total);

        //:Then
        Assert.assertEquals(expected, actual, .0001);
    }
}