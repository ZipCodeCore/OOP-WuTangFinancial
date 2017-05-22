package WuTangFinancialTest;

import WuTangFinancial.CurrencyConverter;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by randallcrame on 1/11/17.
 */
public class CurrencyConverterTest {
    @Test
    public void convertDollarToEuro() {
        CurrencyConverter myMoney = new CurrencyConverter();
        Double expected = 0.94;
        Double actual = myMoney.convertCurrency(myMoney.usDollar, myMoney.euro);
        Assert.assertEquals( expected, actual, 0);
    }
    @Test
    public void convertEuroToDollar() {
        CurrencyConverter myMoney = new CurrencyConverter();
        Double expected = 1.06;
        Double actual = myMoney.convertCurrency(myMoney.euro, myMoney.usDollar);
        Assert.assertEquals( expected, actual, 0.004);
    }
    @Test
    public void convertEuroToBritishPound() {
        CurrencyConverter myMoney = new CurrencyConverter();
        Double expected = 0.87;
        Double actual = myMoney.convertCurrency(myMoney.euro, myMoney.britishPound);
        Assert.assertEquals( expected, actual, 0.003);
    }
    @Test
    public void convertBritishPoundToIndianRupee() {
        CurrencyConverter myMoney = new CurrencyConverter();
        Double expected = 83.31;
        Double actual = myMoney.convertCurrency(myMoney.britishPound, myMoney.indianRupee);
        Assert.assertEquals( expected, actual, 0.008);
    }
    @Test
    public void convertIndianRupeeToCanadianDollar() {
        CurrencyConverter myMoney = new CurrencyConverter();
        Double expected = 0.01;
        Double actual = myMoney.convertCurrency(myMoney.indianRupee, myMoney.canadianDollar);
        Assert.assertEquals( expected, actual, 0.02);
    }
    @Test
    public void convertCanadianDollarToSingaporeDollar() {
        CurrencyConverter myMoney = new CurrencyConverter();
        Double expected = 1.08;
        Double actual = myMoney.convertCurrency(myMoney.canadianDollar, myMoney.singaporeDollar);
        Assert.assertEquals( expected, actual, 0.004);
    }
    @Test
    public void convertSingaporeDollarToSwissFranc() {
        CurrencyConverter myMoney = new CurrencyConverter();
        Double expected = 0.70;
        Double actual = myMoney.convertCurrency(myMoney.singaporeDollar, myMoney.swissFranc);
        Assert.assertEquals( expected, actual, 0.007);
    }
    @Test
    public void convertSwissFrancToMalaysianRinggit() {
        CurrencyConverter myMoney = new CurrencyConverter();
        Double expected = 4.42;
        Double actual = myMoney.convertCurrency(myMoney.swissFranc, myMoney.malaysianRinggit);
        Assert.assertEquals( expected, actual, 0.03);
    }
    @Test
    public void convertMalaysianRinggitToJapaneseYen() {
        CurrencyConverter myMoney = new CurrencyConverter();
        Double expected = 25.91;
        Double actual = myMoney.convertCurrency(myMoney.malaysianRinggit, myMoney.japaneseYen);
        Assert.assertEquals( expected, actual, 0.02);
    }
    @Test
    public void convertJapaneseYenToChineseYuanRenminbi() {
        CurrencyConverter myMoney = new CurrencyConverter();
        Double expected = 0.05;
        Double actual = myMoney.convertCurrency(myMoney.japaneseYen, myMoney.chineseYuanRenminbi);
        Assert.assertEquals( expected, actual, 0.06);
    }

}