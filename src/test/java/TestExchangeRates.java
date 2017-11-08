import org.junit.Assert;
import org.junit.Test;
import wutang.ExchangeRates;

public class TestExchangeRates {

    double currentCurrency = 50;

    double USD = ExchangeRates.USD.getRate();
    double Euro = ExchangeRates.EURO.getRate();
    double BritishPound = ExchangeRates.BRITISHPOUND.getRate();
    double IndianRupee = ExchangeRates.INDIANRUPEE.getRate();
    double AustralianDollar = ExchangeRates.AUSTRALIANDOLLAR.getRate();
    double CanadianDollar = ExchangeRates.CANADIANDOLLAR.getRate();
    double SingaporeDollar = ExchangeRates.SINGAPOREDOLLAR.getRate();
    double SwissFranc = ExchangeRates.SWISSFRANC.getRate();
    double MalaysianRinggit = ExchangeRates.MALAYSIANRINGGIT.getRate();
    double JapaneseYen = ExchangeRates.JAPANESEYEN.getRate();
    double ChineseYuanRenmimbi = ExchangeRates.CHINESEYUANRENMINBI.getRate();

    @Test
    public void usdToEuro(){
        double expected = 47.0;
        double actual = currentCurrency / USD * Euro;
        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void euroToUSD(){
        double expected = 53.19;
        double actual = currentCurrency / Euro * USD;
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void euroToBritishPound(){
        double expected = 43.62;
        double actual = currentCurrency / Euro * BritishPound;
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void britishPoundToIndianRupee(){
        double expected = 4165.85;
        double actual = currentCurrency / BritishPound * IndianRupee;
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void rupeeToCanadianDollar(){
        double expected = 0.97;
        double actual = currentCurrency / IndianRupee * CanadianDollar;
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void canadianDollarToSingaporeDollar(){
        double expected = 54.17;
        double actual = currentCurrency / CanadianDollar * SingaporeDollar;
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void singaporeDollarToSwissFranc(){
        double expected = 35.31;
        double actual = currentCurrency / SingaporeDollar * SwissFranc;
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void swissFrancToMalaysianRinggit(){
        double expected = 221.29;
        double actual = currentCurrency / SwissFranc * MalaysianRinggit;
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void malaysianRinggitToJapaneseYen(){
        double expected = 1295.75;
        double actual = currentCurrency / MalaysianRinggit * JapaneseYen;
        Assert.assertEquals(expected , actual, 0.1);
    }

    @Test
    public void japaneseYenToChineseYuanRenminbi(){
        double expected = 2.99;
        double actual = currentCurrency / JapaneseYen * ChineseYuanRenmimbi;
        Assert.assertEquals(expected , actual, 0.1);
    }
}
