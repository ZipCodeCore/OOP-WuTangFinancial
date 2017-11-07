package io.zipcoder.wutang;

import io.zipcoder.wutang.converter.Converter;
import io.zipcoder.wutang.currencies.*;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    Converter converter = new Converter();
    Double currencyAmount1 = 1000d;

    @Test
    public void usDollarToEuroTest() {
        Currency currencyType1 = new USD();
        Currency currencyType2 = new EUR();

        String expected = "€940.00";
        String actual = currencyType2.printAmountInCurrency(converter.convert(currencyAmount1, currencyType1, currencyType2));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void euroToUsDollarTest() {
        Currency currencyType1 = new EUR();
        Currency currencyType2 = new USD();

        String expected = "$1,063.83";
        String actual = currencyType2.printAmountInCurrency(converter.convert(currencyAmount1, currencyType1, currencyType2));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void euroToBpTest() {
        Currency currencyType1 = new EUR();
        Currency currencyType2 = new GBP();

        String expected = "£872.34";
        String actual = currencyType2.printAmountInCurrency(converter.convert(currencyAmount1, currencyType1, currencyType2));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bpToRupeeTest() {
        Currency currencyType1 = new GBP();
        Currency currencyType2 = new INR();

        String expected = "₹83,317.07";
        String actual = currencyType2.printAmountInCurrency(converter.convert(currencyAmount1, currencyType1, currencyType2));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rupeeToCanadianDollarTest() {
        Currency currencyType1 = new INR();
        Currency currencyType2 = new CAD();

        String expected = "$19.32";
        String actual = currencyType2.printAmountInCurrency(converter.convert(currencyAmount1, currencyType1, currencyType2));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void canadianDollarToSingaporeDollarTest() {
        Currency currencyType1 = new CAD();
        Currency currencyType2 = new SGD();
        
        String expected = "$1,083.33";
        String actual = currencyType2.printAmountInCurrency(converter.convert(currencyAmount1, currencyType1, currencyType2));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void singaporeDollarToSwissFrancTest() {
        Currency currencyType1 = new SGD();
        Currency currencyType2 = new CHF();

        String expected = "CHF706.29";
        String actual = currencyType2.printAmountInCurrency(converter.convert(currencyAmount1, currencyType1, currencyType2));;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void swissFrancToMalaysianRinggitTest() {
        Currency currencyType1 = new CHF();
        Currency currencyType2 = new MYR();

        String expected = "RM4,425.74";
        String actual = currencyType2.printAmountInCurrency(converter.convert(currencyAmount1, currencyType1, currencyType2));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void malaysianRinggitToJapaneseYenTest() {
        Currency currencyType1 = new MYR();
        Currency currencyType2 = new JPY();

        String expected = "¥25,914.99";
        String actual = currencyType2.printAmountInCurrency(converter.convert(currencyAmount1, currencyType1, currencyType2));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void japaneseYenToChineseYuanTest() {
        Currency currencyType1 = new JPY();
        Currency currencyType2 = new CNY();

        String expected = "¥59.74";
        String actual = currencyType2.printAmountInCurrency(converter.convert(currencyAmount1, currencyType1, currencyType2));

        Assert.assertEquals(expected, actual);
    }

}
