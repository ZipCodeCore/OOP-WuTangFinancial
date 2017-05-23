package Matt.WuTang;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;



public class CurrencyConverterTest {

    CurrencyConverter convert;

    @Before
    public void setUp() {
        convert = new CurrencyConverter();
    }

    @Test
    public void dollarToEuro() {

        double expected = 0.94;
        double actual = convert.exchange(1, Currency.usDollar, Currency.euro);

        assertEquals("should return 0.94 which is the current rate", expected, actual, 0);
    }

    @Test
    public void dollarsToEuros() {
        //exchange more than one dollar
        double expected = 4.70;
        double actual = convert.exchange(5, Currency.usDollar, Currency.euro);

        assertEquals("should return the current euroRate(0.94) * 5", expected, actual, 0);
    }

    @Test
    public void zeroAmountInput() {
        //exchange zero dollars which is not change at all
        double expected = 0;
        double actual = convert.exchange(0, Currency.usDollar, Currency.euro);

        assertEquals("should return 0", expected, actual, 0);
    }

    @Test
    public void fractionAmountInput() {
        //fraction amount dollar to euro
        double expected = 0.09;
        double actual = convert.exchange(0.1, Currency.usDollar, Currency.euro);

        assertEquals("should return 0", expected, actual, 0);
    }

    @Test
    public void negativeAmountInput(){

        double expected = 0;
        double actual = convert.exchange(-1, Currency.usDollar, Currency.euro);

        assertEquals("should return 0", expected, actual, 0);
    }


    @Test
    public void zeroAmountInout() {
        //exchange zero dollars which is not change at all
        double expected = 0;
        double actual = convert.exchange(0, Currency.usDollar, Currency.euro);

        assertEquals("should return 0", expected, actual, 0);
    }

    @Test
    public void euroToDollar() {
        //this is the reverse change of dollarToEuro
        double expected = 1.06;
        double actual = convert.exchange(1, Currency.euro, Currency.usDollar);

        assertEquals("should return 1/0.94 which is 1.06", expected, actual, 0);
    }

    @Test
    public void euroToPound() {

        double expected = 0.87;
        double actual = convert.exchange(1, Currency.euro, Currency.britishPound);

        assertEquals("usd/euro*pound should return 1/.94*.82 = 0.87", expected, actual, 0);
    }

    @Test
    public void poundToRupee() {

        double expected = 83.32;
        double actual = convert.exchange(1, Currency.britishPound, Currency.indianRupee);

        assertEquals("usd/pound*Rupee should return 1/0.87*68.32 = 83.32", expected, actual, 0);
    }

    @Test
    public void rupeeToCanadianDollar() {

        double expected = 0.02;
        double actual = convert.exchange(1, Currency.indianRupee, Currency.canadianDollar);

        assertEquals("usd/rupee*CanadianDollar should return 1/68.32*1.32 = 0.02", expected, actual, 0);
    }

    @Test
    public void canadianDollarToSingaporeDollar() {

        double expected = 1.08;
        double actual = convert.exchange(1, Currency.canadianDollar, Currency.singaporeDollar);

        assertEquals("usd/canadian*singapore should return 1/1.32*1.43 = 1.08", expected, actual, 0);
    }

    @Test
    public void singaporeToSwissFranc() {

        double expected = 0.71;
        double actual = convert.exchange(1, Currency.singaporeDollar, Currency.swissFranc);

        assertEquals("usd/singapore*swiss should return 1/1.43*1.01 = 0.71", expected, actual, 0);
    }

    @Test
    public void swissFrancToMalaysianRinggit() {

        double expected = 4.43;
        double actual = convert.exchange(1, Currency.swissFranc, Currency.malaysianRinggit);

        assertEquals("usd/swiss*malaysian should return 1/1.01*4.47 = 4.43", expected, actual, 0);
    }

    @Test
    public void malaysianRinggitToJapaneseYen() {

        double expected = 25.91;
        double actual = convert.exchange(1, Currency.malaysianRinggit, Currency.japaneseYen);

        assertEquals("usd/malaysian*japanese should return 1/4.47*115.84 = 25.91", expected, actual, 0);
    }

    @Test
    public void japaneseYenToChineseYuan() {

        double expected = 0.06;
        double actual = convert.exchange(1, Currency.japaneseYen, Currency.chineseYuan);

        assertEquals("usd/japanese*chinese should return 1/115.84*6.92 = 0.06", expected, actual, 0);
    }

    @Test
    public void chineseYuanToAustralianDollar() {

        double expected = 0.20;
        double actual = convert.exchange(1, Currency.chineseYuan, Currency.australianDollar);

        assertEquals("usd/chinese*australian should return 1/6.92*1.35 = 0.2", expected, actual, 0);
    }


}
















