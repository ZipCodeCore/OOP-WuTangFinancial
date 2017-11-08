package Mohammed.Abrar;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonDollarCurrenciesTest {

    NonDollarCurrencies nonDollarCurrencies = new NonDollarCurrencies();

    @Test
    void dollarCovertorTest() {

        double expected = 0;
        double actual = nonDollarCurrencies.getDollarCurrency();

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    void euroCovertorTest() {
        double expected = 23*0.94;
        double actual = nonDollarCurrencies.euroConvertor(23);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    void britishPoundCovertorTest() {

        double expected = 23*0.82;
        double actual = nonDollarCurrencies.britishPoundConvertor(23);

        Assert.assertEquals(expected,actual,0);

    }

    @Test
    void indianRupeeCovertorTest() {
        double expected = 23*68.32;
        double actual = nonDollarCurrencies.indianRupeeConvertor(23);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    void australianDollarCovertorTest() {

        double expected = 23*1.35;
        double actual = nonDollarCurrencies.australianDollarConvertor(23);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    void canadianDollarCovertorTest() {
        double expected = 23*1.32;
        double actual = nonDollarCurrencies.canadianDollarConvertor(23);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    void singaporeCovertorTest() {
        double expected = 23*1.43;
        double actual = nonDollarCurrencies.singaporeDollarConvertor(23);

        Assert.assertEquals(expected,actual,0);

    }

    @Test
    void swissFrancCovertorTest() {
        double expected = 23*1.01;
        double actual = nonDollarCurrencies.swissFrancConvertor(23);

        Assert.assertEquals(expected,actual,0);

    }

    @Test
    void malaysianRinggitCovertorTest() {
        double expected = 23*4.47;
        double actual = nonDollarCurrencies.malaysianRinggitConvertor(23);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    void japaneseYenCovertorTest() {
        double expected = 23*115.84;
        double actual = nonDollarCurrencies.japaneseYenConvertor(23);

        Assert.assertEquals(expected,actual,0);

    }

    @Test
    void chineseYaunRenminibiCovertorTest() {
        double expected = 23*6.92;
        double actual = nonDollarCurrencies.chineseYuanRenminbi(23);
        Assert.assertEquals(expected,actual,0);

    }

}