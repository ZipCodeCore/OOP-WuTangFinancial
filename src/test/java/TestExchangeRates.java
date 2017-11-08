import org.junit.Assert;
import org.junit.Test;
import wutang.CurrencyCalculator;
import wutang.ExchangeRates;

public class TestExchangeRates {

    double currentCurrency = 50;
    ExchangeRates USD = ExchangeRates.USD;
    ExchangeRates Euro = ExchangeRates.Euro;
    ExchangeRates BritishPound = ExchangeRates.BritishPound;
    ExchangeRates IndianRupee = ExchangeRates.IndianRupee;
    ExchangeRates AustralianDollar = ExchangeRates.AustralianDollar;
    ExchangeRates CanadianDollar = ExchangeRates.CanadianDollar;
    ExchangeRates SingaporeDollar = ExchangeRates.SingaporeDollar;
    ExchangeRates SwissFranc = ExchangeRates.SwissFranc;
    ExchangeRates MalaysianRinggit = ExchangeRates.MalaysianRinggit;
    ExchangeRates JapaneseYen = ExchangeRates.JapaneseYen;
    ExchangeRates ChineseYuanRenmimbi = ExchangeRates.ChineseYuanRenminbi;

    @Test
    public void usdToEuro(){
        double expected = 47.0;
        double actual = CurrencyCalculator.convert(currentCurrency, USD, Euro);
        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void euroToUSD(){
        double expected = 53.19;
        double actual = CurrencyCalculator.convert(currentCurrency, Euro, USD);
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void euroToBritishPound(){
        double expected = 43.62;
        double actual = CurrencyCalculator.convert(currentCurrency, Euro, BritishPound);
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void britishPoundToIndianRupee(){
        double expected = 4165.85;
        double actual = CurrencyCalculator.convert(currentCurrency, BritishPound, IndianRupee);
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void rupeeToCanadianDollar(){
        double expected = 0.97;
        double actual = CurrencyCalculator.convert(currentCurrency, IndianRupee, CanadianDollar);
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void canadianDollarToSingaporeDollar(){
        double expected = 54.17;
        double actual = CurrencyCalculator.convert(currentCurrency, CanadianDollar, SingaporeDollar);
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void singaporeDollarToSwissFranc(){
        double expected = 35.31;
        double actual = CurrencyCalculator.convert(currentCurrency, SingaporeDollar, SwissFranc);
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void swissFrancToMalaysianRinggit(){
        double expected = 221.29;
        double actual = CurrencyCalculator.convert(currentCurrency, SwissFranc, MalaysianRinggit);
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void malaysianRinggitToJapaneseYen(){
        double expected = 1295.75;
        double actual = CurrencyCalculator.convert(currentCurrency, MalaysianRinggit, JapaneseYen);
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void japaneseYenToChineseYuanRenminbi(){
        double expected = 2.99;
        double actual = CurrencyCalculator.convert(currentCurrency, JapaneseYen, ChineseYuanRenmimbi);
        Assert.assertEquals(expected , actual, 0.1);
    }
}
