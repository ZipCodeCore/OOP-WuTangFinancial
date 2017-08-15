/**
 * Created by brianmullin on 5/22/17.
 */

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.math.BigDecimal;

public class CurrencyConverterTest {

    CurrencyConverter converter;

    @Before
    public void setUp() {
        converter = new CurrencyConverter();

    }

    @Test
    public void testConvertDollarToEuro(){ //dollar to euro
        //:Given
        String firstCountry = "USD";
        String secondCountry = "EUR";
        double amount = 100.1456;
        BigDecimal expectedAmount = new BigDecimal("94.14");

        //:When
        BigDecimal actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from USD to EURO is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertEuroToDollar(){  //Euro to dollar
        //:Given
        String firstCountry = "EUR";
        String secondCountry = "USD";
        double amount = 100.00;
        BigDecimal expectedAmount = new BigDecimal("106.39");

        //:When
        BigDecimal actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from EURO to USD is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertEuroToBritishPound(){  //Euro to Pound
        //:Given
        String firstCountry = "EUR";
        String secondCountry = "GBP";
        double amount = 100.00;
        BigDecimal expectedAmount = new BigDecimal("87.24");

        //:When
        BigDecimal actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from EURO to POUND is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertBritishPoundToIndianRupee(){ //Pound to Rupee
        //:Given
        String firstCountry = "GBP";
        String secondCountry = "INR";
        double amount = 100.00;
        BigDecimal expectedAmount = new BigDecimal("8331.71");

        //:When
        BigDecimal actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from POUND to RUPEE is ", expectedAmount, actualAmount);


    }

    @Test
    public void testConvertRupeeToCanadianDollar(){ //Rupee to Can
        //:Given
        String firstCountry = "INR";
        String secondCountry = "CAD";
        double amount = 100.00;
        BigDecimal expectedAmount = new BigDecimal("1.94");

        //:When
        BigDecimal actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from RUP to CAN is ", expectedAmount, actualAmount);


    }

    @Test
    public void testCanadianDollarToSingaporeDollar(){ //Can to Sing
        //:Given
        String firstCountry = "CAD";
        String secondCountry = "SGD";
        double amount = 100.00;
        BigDecimal expectedAmount = new BigDecimal("108.34");

        //:When
        BigDecimal actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from CAN to SING is ", expectedAmount, actualAmount);


    }

    @Test
    public void testSingaporeDollarToSwissFranc(){ //Sing to Franc
        //:Given
        String firstCountry = "SGD";
        String secondCountry = "CHF";
        double amount = 100.00;
        BigDecimal expectedAmount = new BigDecimal("70.63");

        //:When
        BigDecimal actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from SING to FRANC is ", expectedAmount, actualAmount);


    }

    @Test
    public void testConvertSwissFrancToMalaysianRinggit(){ //Franc to Ringgit
        //:Given
        String firstCountry = "CHF";
        String secondCountry = "MYR";
        double amount = 100.00;
        BigDecimal expectedAmount = new BigDecimal("442.58");

        //:When
        BigDecimal actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from FRANC to RINGGIT is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertRinggitToJapaneseYen(){ //Ringgit to Yen
        //:Given
        String firstCountry = "MYR";
        String secondCountry = "JPY";
        double amount = 100.00;
        BigDecimal expectedAmount = new BigDecimal("2591.50"); // fix this single decimal

        //:When
        BigDecimal actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from RINGGIT to YEN is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertJapaneseYenToChineseYuanRenminbi(){  //Yen to Yuan
        //:Given
        String firstCountry = "JPY";
        String secondCountry = "CNY";
        double amount = 100.00;
        BigDecimal expectedAmount = new BigDecimal("5.98");

        //:When
        BigDecimal actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from YEN to YUAN is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertChineseYuanRenminbiToBitcoin(){  //Yuan to Bitcoin
        //:Given
        String firstCountry = "CNY";
        String secondCountry = "BTC";
        double amount = 100.00;
        BigDecimal expectedAmount = new BigDecimal("0.01"); //Probably not correct, will fix

        //:When
        BigDecimal actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from YEN to YUAN is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertBitcoinToEthereum(){  //Bitcoin to Ether
        //:Given
        String firstCountry = "BTC";
        String secondCountry = "ETH";
        double amount = 100.00;
        BigDecimal expectedAmount = new BigDecimal("1257.87");

        //:When
        BigDecimal actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from BITCOIN to ETHER is ", expectedAmount, actualAmount);

    }

    @Test
    public void testConvertEtherToAustralianDollars(){  //ETH to AUD
        //:Given
        String firstCountry = "ETH";
        String secondCountry = "AUD";
        double amount = 100.00;
        BigDecimal expectedAmount = new BigDecimal("23870.70"); //fix that decimal place111111

        //:When
        BigDecimal actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from ETH to AUD is ", expectedAmount, actualAmount);

    }

}
