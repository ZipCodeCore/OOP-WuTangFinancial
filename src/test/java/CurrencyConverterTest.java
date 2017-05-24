/**
 * Created by brianmullin on 5/22/17.
 */

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CurrencyConverterTest {

    CurrencyConverter converter;

    @Before

    public void setUp() {
        converter = new CurrencyConverter();
    }

    @Test
    public void testGetFirstExchangeRate(){


    }

    @Test
    public void testGetSecondExchangeRate(){


    }

    @Test
    public void testConvertDollarToEuro(){ //dollar to euro
        //:Given
        String firstCountry = "USD";
        String secondCountry = "EURO";
        double amount = 100.1456;
        String expectedAmount = "94.14";

        //:When
        String actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from USD to EURO is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertEuroToDollar(){  //Euro to dollar
        //:Given
        String firstCountry = "EURO";
        String secondCountry = "USD";
        double amount = 100.00;
        String expectedAmount = "106.38";

        //:When
        String actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from EURO to USD is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertEuroToBritishPound(){  //Eur to Pound
        //:Given
        String firstCountry = "EURO";
        String secondCountry = "POUND";
        double amount = 100.00;
        String expectedAmount = "87.23";

        //:When
        String actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from EURO to POUND is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertBritishPoundToIndianRupee(){ //Pound to Rupee
        //:Given
        String firstCountry = "POUND";
        String secondCountry = "RUP";
        double amount = 100.00;
        String expectedAmount = "8331.71";

        //:When
        String actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from POUND to RUPEE is ", expectedAmount, actualAmount);


    }

    @Test
    public void testConvertRupeeToCanadianDollar(){ //Rupee to Can
        //:Given
        String firstCountry = "RUP";
        String secondCountry = "CAN";
        double amount = 100.00;
        String expectedAmount = "1.93";

        //:When
        String actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from RUP to CAN is ", expectedAmount, actualAmount);


    }

    @Test
    public void testCanadianDollarToSingaporeDollar(){ //Can to Sing
        //:Given
        String firstCountry = "CAN";
        String secondCountry = "SING";
        double amount = 100.00;
        String expectedAmount = "108.33";

        //:When
        String actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from CAN to SING is ", expectedAmount, actualAmount);


    }

    @Test
    public void testSingaporeDollarToSwissFranc(){ //Sing to Franc
        //:Given
        String firstCountry = "SING";
        String secondCountry = "FRANC";
        double amount = 100.00;
        String expectedAmount = "70.63";

        //:When
        String actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from SING to FRANC is ", expectedAmount, actualAmount);


    }

    @Test
    public void testConvertSwissFrancToMalaysianRinggit(){ //Franc to Ringgit
        //:Given
        String firstCountry = "FRANC";
        String secondCountry = "RINGGIT";
        double amount = 100.00;
        String expectedAmount = "442.57";

        //:When
        String actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from FRANC to RINGGIT is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertRinggitToJapaneseYen(){ //Ringgit to Yen
        //:Given
        String firstCountry = "RINGGIT";
        String secondCountry = "YEN";
        double amount = 100.00;
        String expectedAmount = "2591.5"; // fix this single decimal

        //:When
        String actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from RINGGIT to YEN is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertJapaneseYenToChineseYuanRenminbi(){  //Yen to Yuan
        //:Given
        String firstCountry = "YEN";
        String secondCountry = "YUAN";
        double amount = 100.00;
        String expectedAmount = "5.97";

        //:When
        String actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from YEN to YUAN is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertChineseYuanRenminbiToBitcoin(){  //Yuan to Bitcoin
        //:Given
        String firstCountry = "YUAN";
        String secondCountry = "BITCOIN";
        double amount = 100.00;
        String expectedAmount = "0.01"; //Probably not correct, will fix

        //:When
        String actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from YEN to YUAN is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertBitcoinToEthereum(){  //Bitcoin to Ether
        //:Given
        String firstCountry = "BITCOIN";
        String secondCountry = "ETHER";
        double amount = 100.00;
        String expectedAmount = "1257.86";

        //:When
        String actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from BITCOIN to ETHER is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertEtherToAustralianDollars(){  //Ether to AUS
        //:Given
        String firstCountry = "ETHER";
        String secondCountry = "AUS";
        double amount = 100.00;
        String expectedAmount = "23870.7"; //fix that decimal place111111

        //:When
        String actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from YEN to YUAN is ", expectedAmount, actualAmount);

    }

}
