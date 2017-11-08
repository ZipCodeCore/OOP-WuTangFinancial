import org.junit.Assert;
import org.junit.Test;

public class CurrencyExchangeTest {
    private CurrencyExchange currencyExchange = new CurrencyExchange();
    private Currency baseType;
    private Currency returnedType;
    private double amountToConvert;
    private double expected;
    private double actual;

    @Test
    public void exchangeUSDollarToEuroTest(){
        //: Given
        baseType = Currency.UsDollar;
        returnedType = Currency.Euro;
        amountToConvert = 500.00;
        expected = 470.00;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeUSDollarToBritishPoundTest(){
        //: Given
        baseType = Currency.UsDollar;
        returnedType = Currency.BritishPound;
        amountToConvert = 500.00;
        expected = 410.00;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeUSDollarToIndianRupeeTest(){
        //: Given
        baseType = Currency.UsDollar;
        returnedType = Currency.IndianRupee;
        amountToConvert = 500.00;
        expected = 34160.00;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeUSDollarToAusDollarTest(){
        //: Given
        baseType = Currency.UsDollar;
        returnedType = Currency.AustralianDollar;
        amountToConvert = 500.00;
        expected = 675.00;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeUSDollarToCanadianDollarTest(){
        //: Given
        baseType = Currency.UsDollar;
        returnedType = Currency.CanadianDollar;
        amountToConvert = 500.00;
        expected = 660.00;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeUSDollarToSingaporeDollarTest(){
        //: Given
        baseType = Currency.UsDollar;
        returnedType = Currency.SingaporeDollar;
        amountToConvert = 500.00;
        expected = 715.00;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeUSDollarToSwissFrancTest(){
        //: Given
        baseType = Currency.UsDollar;
        returnedType = Currency.SwissFranc;
        amountToConvert = 500.00;
        expected = 505.00;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeUSDollarToMalaysianRinggitTest(){
        //: Given
        baseType = Currency.UsDollar;
        returnedType = Currency.MalaysianRinggit;
        amountToConvert = 500.00;
        expected = 2235.00;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeUSDollarToJapYenTest(){
        //: Given
        baseType = Currency.UsDollar;
        returnedType = Currency.JapaneseYen;
        amountToConvert = 500.00;
        expected = 57920.00;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeUSDollarToChineseYuanTest(){
        //: Given
        baseType = Currency.UsDollar;
        returnedType = Currency.ChineseYuanRenminbi;
        amountToConvert = 500.00;
        expected = 3460.00;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeEuroToUSDollarTest(){
        //: Given
        baseType = Currency.Euro;
        returnedType = Currency.UsDollar;
        amountToConvert = 500.00;
        expected = 531.91;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeEuroToBritishPoundTest(){
        //: Given
        baseType = Currency.Euro;
        returnedType = Currency.BritishPound;
        amountToConvert = 500.00;
        expected = 436.17;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeEuroToIndianRupeeTest(){
        //: Given
        baseType = Currency.Euro;
        returnedType = Currency.IndianRupee;
        amountToConvert = 500.00;
        expected = 36340.43;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeEuroToAusDollarTest(){
        //: Given
        baseType = Currency.Euro;
        returnedType = Currency.AustralianDollar;
        amountToConvert = 500.00;
        expected = 718.09;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeEuroToCanadianDollarTest(){
        //: Given
        baseType = Currency.Euro;
        returnedType = Currency.CanadianDollar;
        amountToConvert = 500.00;
        expected = 702.13;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeEuroToSingaporeDollarTest(){
        //: Given
        baseType = Currency.Euro;
        returnedType = Currency.SingaporeDollar;
        amountToConvert = 500.00;
        expected = 760.64;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeEuroToSwissFrancTest(){
        //: Given
        baseType = Currency.Euro;
        returnedType = Currency.SwissFranc;
        amountToConvert = 500.00;
        expected = 537.23;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeEuroToMalaysianRinggitTest(){
        //: Given
        baseType = Currency.Euro;
        returnedType = Currency.MalaysianRinggit;
        amountToConvert = 500.00;
        expected = 2377.66;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeEuroToJapYenTest(){
        //: Given
        baseType = Currency.Euro;
        returnedType = Currency.JapaneseYen;
        amountToConvert = 500.00;
        expected = 61617.02;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeEuroToChineseYuanTest(){
        //: Given
        baseType = Currency.Euro;
        returnedType = Currency.ChineseYuanRenminbi;
        amountToConvert = 500.00;
        expected = 3680.85;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeBritishPoundToUSDollarTest(){
        //: Given
        baseType = Currency.BritishPound;
        returnedType = Currency.UsDollar;
        amountToConvert = 500.00;
        expected = 609.76;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeBritishPoundToEuroTest(){
        //: Given
        baseType = Currency.BritishPound;
        returnedType = Currency.Euro;
        amountToConvert = 500.00;
        expected = 573.17;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeBritishPoundToIndianRupeeTest(){
        //: Given
        baseType = Currency.BritishPound;
        returnedType = Currency.IndianRupee;
        amountToConvert = 500.00;
        expected = 41658.54;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeBritishPoundToAusDollarTest(){
        //: Given
        baseType = Currency.BritishPound;
        returnedType = Currency.AustralianDollar;
        amountToConvert = 500.00;
        expected = 823.17;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeBritishPoundToCanadianDollarTest(){
        //: Given
        baseType = Currency.BritishPound;
        returnedType = Currency.CanadianDollar;
        amountToConvert = 500.00;
        expected = 804.88;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeBritishPoundToSingaporeDollarTest(){
        //: Given
        baseType = Currency.BritishPound;
        returnedType = Currency.SingaporeDollar;
        amountToConvert = 500.00;
        expected = 871.95;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeBritishPoundToSwissFrancTest(){
        //: Given
        baseType = Currency.BritishPound;
        returnedType = Currency.SwissFranc;
        amountToConvert = 500.00;
        expected = 615.85;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeBritishPoundToMalaysianRinggitTest(){
        //: Given
        baseType = Currency.BritishPound;
        returnedType = Currency.MalaysianRinggit;
        amountToConvert = 500.00;
        expected = 2725.61;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeBritishPoundToJapYenTest(){
        //: Given
        baseType = Currency.BritishPound;
        returnedType = Currency.JapaneseYen;
        amountToConvert = 500.00;
        expected = 70634.15;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeBritishPoundToChineseYuanTest(){
        //: Given
        baseType = Currency.BritishPound;
        returnedType = Currency.ChineseYuanRenminbi;
        amountToConvert = 500.00;
        expected = 4219.51;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeIndianRupeeToUSDollarTest(){
        //: Given
        baseType = Currency.IndianRupee;
        returnedType = Currency.UsDollar;
        amountToConvert = 500.00;
        expected = 7.32;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeIndianRupeeToEuroTest(){
        //: Given
        baseType = Currency.IndianRupee;
        returnedType = Currency.Euro;
        amountToConvert = 500.00;
        expected = 6.88;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeIndianRupeeToBritishPoundTest(){
        //: Given
        baseType = Currency.IndianRupee;
        returnedType = Currency.BritishPound;
        amountToConvert = 500.00;
        expected = 6.00;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeIndianRupeeToAusDollarTest(){
        //: Given
        baseType = Currency.IndianRupee;
        returnedType = Currency.AustralianDollar;
        amountToConvert = 500.00;
        expected = 9.88;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeIndianRupeeToCanadianDollarTest(){
        //: Given
        baseType = Currency.IndianRupee;
        returnedType = Currency.CanadianDollar;
        amountToConvert = 500.00;
        expected = 9.66;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeIndianRupeeToSingaporeDollarTest(){
        //: Given
        baseType = Currency.IndianRupee;
        returnedType = Currency.SingaporeDollar;
        amountToConvert = 500.00;
        expected = 10.47;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeIndianRupeeToSwissFrancTest(){
        //: Given
        baseType = Currency.IndianRupee;
        returnedType = Currency.SwissFranc;
        amountToConvert = 500.00;
        expected = 7.39;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeIndianRupeeToMalaysianRinggitTest(){
        //: Given
        baseType = Currency.IndianRupee;
        returnedType = Currency.MalaysianRinggit;
        amountToConvert = 500.00;
        expected = 32.71;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeIndianRupeeToJapYenTest(){
        //: Given
        baseType = Currency.IndianRupee;
        returnedType = Currency.JapaneseYen;
        amountToConvert = 500.00;
        expected = 847.78;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeIndianRupeeToChineseYuanTest(){
        //: Given
        baseType = Currency.IndianRupee;
        returnedType = Currency.ChineseYuanRenminbi;
        amountToConvert = 500.00;
        expected = 50.64;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeAusDollarToUSDollarTest(){
        //: Given
        baseType = Currency.AustralianDollar;
        returnedType = Currency.UsDollar;
        amountToConvert = 500.00;
        expected = 370.37;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeAusDollarToEuroTest(){
        //: Given
        baseType = Currency.AustralianDollar;
        returnedType = Currency.Euro;
        amountToConvert = 500.00;
        expected = 348.15;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeAusDollarToBritishPoundTest(){
        //: Given
        baseType = Currency.AustralianDollar;
        returnedType = Currency.BritishPound;
        amountToConvert = 500.00;
        expected = 303.70;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeAusDollarToIndianRupeeTest(){
        //: Given
        baseType = Currency.AustralianDollar;
        returnedType = Currency.IndianRupee;
        amountToConvert = 500.00;
        expected = 25303.70;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeAusDollarToCanadianDollarTest(){
        //: Given
        baseType = Currency.AustralianDollar;
        returnedType = Currency.CanadianDollar;
        amountToConvert = 500.00;
        expected = 488.89;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeAusDollarToSingaporeDollarTest(){
        //: Given
        baseType = Currency.AustralianDollar;
        returnedType = Currency.SingaporeDollar;
        amountToConvert = 500.00;
        expected = 529.63;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeAusDollarToSwissFrancTest(){
        //: Given
        baseType = Currency.AustralianDollar;
        returnedType = Currency.SwissFranc;
        amountToConvert = 500.00;
        expected = 374.07;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeAusDollarToMalaysianRinggitTest(){
        //: Given
        baseType = Currency.AustralianDollar;
        returnedType = Currency.MalaysianRinggit;
        amountToConvert = 500.00;
        expected = 1655.56;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeAusDollarToJapYenTest(){
        //: Given
        baseType = Currency.AustralianDollar;
        returnedType = Currency.JapaneseYen;
        amountToConvert = 500.00;
        expected = 42903.70;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeAusDollarToChineseYuanTest(){
        //: Given
        baseType = Currency.AustralianDollar;
        returnedType = Currency.ChineseYuanRenminbi;
        amountToConvert = 500.00;
        expected = 2562.96;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeCanadianDollarToUSDollarTest(){
        //: Given
        baseType = Currency.CanadianDollar;
        returnedType = Currency.UsDollar;
        amountToConvert = 500.00;
        expected = 378.79;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeCanadianDollarToEuroTest(){
        //: Given
        baseType = Currency.CanadianDollar;
        returnedType = Currency.Euro;
        amountToConvert = 500.00;
        expected = 356.06;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeCanadianDollarToBritishPoundTest(){
        //: Given
        baseType = Currency.CanadianDollar;
        returnedType = Currency.BritishPound;
        amountToConvert = 500.00;
        expected = 310.61;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeCanadianDollarToIndianRupeeTest(){
        //: Given
        baseType = Currency.CanadianDollar;
        returnedType = Currency.IndianRupee;
        amountToConvert = 500.00;
        expected = 25878.79;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeCanadianDollarToAusDollarTest(){
        //: Given
        baseType = Currency.CanadianDollar;
        returnedType = Currency.AustralianDollar;
        amountToConvert = 500.00;
        expected = 511.36;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeCanadianDollarToSingaporeDollarTest(){
        //: Given
        baseType = Currency.CanadianDollar;
        returnedType = Currency.SingaporeDollar;
        amountToConvert = 500.00;
        expected = 541.67;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeCanadianDollarToSwissFrancTest(){
        //: Given
        baseType = Currency.CanadianDollar;
        returnedType = Currency.SwissFranc;
        amountToConvert = 500.00;
        expected = 382.58;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeCanadianDollarToMalaysianRinggitTest(){
        //: Given
        baseType = Currency.CanadianDollar;
        returnedType = Currency.MalaysianRinggit;
        amountToConvert = 500.00;
        expected = 1693.18;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeCanadianDollarToJapYenTest(){
        //: Given
        baseType = Currency.CanadianDollar;
        returnedType = Currency.JapaneseYen;
        amountToConvert = 500.00;
        expected = 43878.79;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeCanadianDollarToChineseYuanTest(){
        //: Given
        baseType = Currency.CanadianDollar;
        returnedType = Currency.ChineseYuanRenminbi;
        amountToConvert = 500.00;
        expected = 2621.21;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSingaporeDollarToUSDollarTest(){
        //: Given
        baseType = Currency.SingaporeDollar;
        returnedType = Currency.UsDollar;
        amountToConvert = 500.00;
        expected = 349.65;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSingaporeDollarToEuroTest(){
        //: Given
        baseType = Currency.SingaporeDollar;
        returnedType = Currency.Euro;
        amountToConvert = 500.00;
        expected = 328.67;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSingaporeDollarToBritishPoundTest(){
        //: Given
        baseType = Currency.SingaporeDollar;
        returnedType = Currency.BritishPound;
        amountToConvert = 500.00;
        expected = 286.71;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSingaporeDollarToIndianRupeeTest(){
        //: Given
        baseType = Currency.SingaporeDollar;
        returnedType = Currency.IndianRupee;
        amountToConvert = 500.00;
        expected = 23888.11;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSingaporeDollarToAusDollarTest(){
        //: Given
        baseType = Currency.SingaporeDollar;
        returnedType = Currency.AustralianDollar;
        amountToConvert = 500.00;
        expected = 472.03;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSingaporeDollarToCanadianDollarTest(){
        //: Given
        baseType = Currency.SingaporeDollar;
        returnedType = Currency.CanadianDollar;
        amountToConvert = 500.00;
        expected = 461.54;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSingaporeDollarToSwissFrancTest(){
        //: Given
        baseType = Currency.SingaporeDollar;
        returnedType = Currency.SwissFranc;
        amountToConvert = 500.00;
        expected = 353.15;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSingaporeDollarToMalaysianRinggitTest(){
        //: Given
        baseType = Currency.SingaporeDollar;
        returnedType = Currency.MalaysianRinggit;
        amountToConvert = 500.00;
        expected = 1562.94;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSingaporeDollarToJapYenTest(){
        //: Given
        baseType = Currency.SingaporeDollar;
        returnedType = Currency.JapaneseYen;
        amountToConvert = 500.00;
        expected = 40503.50;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSingaporeDollarToChineseYuanTest(){
        //: Given
        baseType = Currency.SingaporeDollar;
        returnedType = Currency.ChineseYuanRenminbi;
        amountToConvert = 500.00;
        expected = 2419.58;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSwissFrancToUSDollarTest(){
        //: Given
        baseType = Currency.SwissFranc;
        returnedType = Currency.UsDollar;
        amountToConvert = 500.00;
        expected = 495.05;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSwissFrancToEuroTest(){
        //: Given
        baseType = Currency.SwissFranc;
        returnedType = Currency.Euro;
        amountToConvert = 500.00;
        expected = 465.35;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSwissFrancToBritishPoundTest(){
        //: Given
        baseType = Currency.SwissFranc;
        returnedType = Currency.BritishPound;
        amountToConvert = 500.00;
        expected = 405.94;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSwissFrancToIndianRupeeTest(){
        //: Given
        baseType = Currency.SwissFranc;
        returnedType = Currency.IndianRupee;
        amountToConvert = 500.00;
        expected = 33821.78;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSwissFrancToAusDollarTest(){
        //: Given
        baseType = Currency.SwissFranc;
        returnedType = Currency.AustralianDollar;
        amountToConvert = 500.00;
        expected = 668.32;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSwissFrancToCanadianDollarTest(){
        //: Given
        baseType = Currency.SwissFranc;
        returnedType = Currency.CanadianDollar;
        amountToConvert = 500.00;
        expected = 653.47;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSwissFrancToSingaporeDollarTest(){
        //: Given
        baseType = Currency.SwissFranc;
        returnedType = Currency.SingaporeDollar;
        amountToConvert = 500.00;
        expected = 707.92;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSwissFrancToMalaysianRinggitTest(){
        //: Given
        baseType = Currency.SwissFranc;
        returnedType = Currency.MalaysianRinggit;
        amountToConvert = 500.00;
        expected = 2212.87;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSwissFrancToJapYenTest(){
        //: Given
        baseType = Currency.SwissFranc;
        returnedType = Currency.JapaneseYen;
        amountToConvert = 500.00;
        expected = 57346.53;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeSwissFrancToChineseYuanTest(){
        //: Given
        baseType = Currency.SwissFranc;
        returnedType = Currency.ChineseYuanRenminbi;
        amountToConvert = 500.00;
        expected = 3425.74;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeMalaysianRinggitToUSDollarTest(){
        //: Given
        baseType = Currency.MalaysianRinggit;
        returnedType = Currency.UsDollar;
        amountToConvert = 500.00;
        expected = 111.86;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeMalaysianRinggitToEuroTest(){
        //: Given
        baseType = Currency.MalaysianRinggit;
        returnedType = Currency.Euro;
        amountToConvert = 500.00;
        expected = 105.15;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeMalaysianRinggitToBritishPoundTest(){
        //: Given
        baseType = Currency.MalaysianRinggit;
        returnedType = Currency.BritishPound;
        amountToConvert = 500.00;
        expected = 91.72;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeMalaysianRinggitToIndianRupeeTest(){
        //: Given
        baseType = Currency.MalaysianRinggit;
        returnedType = Currency.IndianRupee;
        amountToConvert = 500.00;
        expected = 7642.06;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeMalaysianRinggitToAusDollarTest(){
        //: Given
        baseType = Currency.MalaysianRinggit;
        returnedType = Currency.AustralianDollar;
        amountToConvert = 500.00;
        expected = 151.01;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeMalaysianRinggitToCanadianDollarTest(){
        //: Given
        baseType = Currency.MalaysianRinggit;
        returnedType = Currency.CanadianDollar;
        amountToConvert = 500.00;
        expected = 147.65;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeMalaysianRinggitToSingaporeDollarTest(){
        //: Given
        baseType = Currency.MalaysianRinggit;
        returnedType = Currency.SingaporeDollar;
        amountToConvert = 500.00;
        expected = 159.96;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeMalaysianRinggitToSwissFrancTest(){
        //: Given
        baseType = Currency.MalaysianRinggit;
        returnedType = Currency.SwissFranc;
        amountToConvert = 500.00;
        expected = 112.98;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeMalaysianRinggitToJapYenTest(){
        //: Given
        baseType = Currency.MalaysianRinggit;
        returnedType = Currency.JapaneseYen;
        amountToConvert = 500.00;
        expected = 12957.49;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeMalaysianRinggitToChineseYuanTest(){
        //: Given
        baseType = Currency.MalaysianRinggit;
        returnedType = Currency.ChineseYuanRenminbi;
        amountToConvert = 500.00;
        expected = 774.05;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeJapYenToUSDollarTest(){
        //: Given
        baseType = Currency.JapaneseYen;
        returnedType = Currency.UsDollar;
        amountToConvert = 500.00;
        expected = 4.32;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeJapYenToEuroTest(){
        //: Given
        baseType = Currency.JapaneseYen;
        returnedType = Currency.Euro;
        amountToConvert = 500.00;
        expected = 4.06;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeJapYenToBritishPoundTest(){
        //: Given
        baseType = Currency.JapaneseYen;
        returnedType = Currency.BritishPound;
        amountToConvert = 500.00;
        expected = 3.54;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeJapYenToIndianRupeeTest(){
        //: Given
        baseType = Currency.JapaneseYen;
        returnedType = Currency.IndianRupee;
        amountToConvert = 500.00;
        expected = 294.89;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeJapYenToAusDollarTest(){
        //: Given
        baseType = Currency.JapaneseYen;
        returnedType = Currency.AustralianDollar;
        amountToConvert = 500.00;
        expected = 5.83;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeJapYenToCanadianDollarTest(){
        //: Given
        baseType = Currency.JapaneseYen;
        returnedType = Currency.CanadianDollar;
        amountToConvert = 500.00;
        expected = 5.70;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeJapYenToSingaporeDollarTest(){
        //: Given
        baseType = Currency.JapaneseYen;
        returnedType = Currency.SingaporeDollar;
        amountToConvert = 500.00;
        expected = 6.17;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeJapYenToSwissFrancTest(){
        //: Given
        baseType = Currency.JapaneseYen;
        returnedType = Currency.SwissFranc;
        amountToConvert = 500.00;
        expected = 4.36;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeJapYenToMalaysianRinggitTest(){
        //: Given
        baseType = Currency.JapaneseYen;
        returnedType = Currency.MalaysianRinggit;
        amountToConvert = 500.00;
        expected = 19.29;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeJapYenToChineseYuanTest(){
        //: Given
        baseType = Currency.JapaneseYen;
        returnedType = Currency.ChineseYuanRenminbi;
        amountToConvert = 500.00;
        expected = 29.87;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeChineseYuanToUSDollarTest(){
        //: Given
        baseType = Currency.ChineseYuanRenminbi;
        returnedType = Currency.UsDollar;
        amountToConvert = 500.00;
        expected = 72.25;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeChineseYuanToEuroTest(){
        //: Given
        baseType = Currency.ChineseYuanRenminbi;
        returnedType = Currency.Euro;
        amountToConvert = 500.00;
        expected = 67.92;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeChineseYuanToBritishPoundTest(){
        //: Given
        baseType = Currency.ChineseYuanRenminbi;
        returnedType = Currency.BritishPound;
        amountToConvert = 500.00;
        expected = 59.25;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeChineseYuanToIndianRupeeTest(){
        //: Given
        baseType = Currency.ChineseYuanRenminbi;
        returnedType = Currency.IndianRupee;
        amountToConvert = 500.00;
        expected = 4936.42;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeChineseYuanToAusDollarTest(){
        //: Given
        baseType = Currency.ChineseYuanRenminbi;
        returnedType = Currency.AustralianDollar;
        amountToConvert = 500.00;
        expected = 97.54;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeChineseYuanToCanadianDollarTest(){
        //: Given
        baseType = Currency.ChineseYuanRenminbi;
        returnedType = Currency.CanadianDollar;
        amountToConvert = 500.00;
        expected = 95.38;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeChineseYuanToSingaporeDollarTest(){
        //: Given
        baseType = Currency.ChineseYuanRenminbi;
        returnedType = Currency.SingaporeDollar;
        amountToConvert = 500.00;
        expected = 103.32;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeChineseYuanToSwissFrancTest(){
        //: Given
        baseType = Currency.ChineseYuanRenminbi;
        returnedType = Currency.SwissFranc;
        amountToConvert = 500.00;
        expected = 72.98;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeChineseYuanToMalaysianRinggitTest(){
        //: Given
        baseType = Currency.ChineseYuanRenminbi;
        returnedType = Currency.MalaysianRinggit;
        amountToConvert = 500.00;
        expected = 322.98;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exchangeChineseYuanToJapYenTest(){
        //: Given
        baseType = Currency.ChineseYuanRenminbi;
        returnedType = Currency.JapaneseYen;
        amountToConvert = 500.00;
        expected = 8369.94;

        //: When
        actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

}
