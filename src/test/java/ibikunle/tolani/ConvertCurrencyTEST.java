package ibikunle.tolani;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by tolaniibikunle on 1/13/17.
 */
public class ConvertCurrencyTEST {
    ConvertCurrency cc = new ConvertCurrency();


    @Test
    public void convertCurrencyDollarToEuroTEST() {
        double actual = cc.convert(cc.usDollar, cc.euro);
        double expected = 0.94;
        assertEquals("Expected 1.06", expected, actual);

    }

    @Test
    public void convertCurrencyEuroToDollarTEST() {
        double actual = cc.convert(cc.euro, cc.usDollar);
        double expected = 1.06;
        assertEquals("Expected 1.06", expected,actual);

    }

    @Test
    public void convertCurrencyEuroToBritishPoundTEST() {
        double actual = cc.convert(cc.euro, cc.britshPound);
        double expected = 0.87;
        assertEquals("Expected 0.87", expected, actual);
    }

    @Test
    public void convertCurrencyBritishPoundToIndianRupeeTEST() {
        double actual = cc.convert(cc.britshPound, cc.indianRupee);
        double expected = 83.32;
        assertEquals("Expected 83.32", expected, actual);
    }


    @Test
    public void convertCurrencyIndianRupeeToCanadianDollarTEST() {
        double actual = cc.convert(cc.indianRupee, cc.canadianDollar);
        double expected = 0.02;
        assertEquals("Expected 0.02", expected, actual);
    }

    @Test
    public void convertCurrencyCanadianDollarToSingaporeDollarTEST() {
        double actual = cc.convert(cc.canadianDollar, cc.singaporeDollar);
        double expected = 1.08;
        assertEquals("Expected 1.08", expected, actual);
    }

    @Test
    public void convertCurrencySingaporeDollarToSwissFrancTEST() {
        double actual = cc.convert(cc.singaporeDollar, cc.swissFranc);
        double expected = 0.71;
        assertEquals("Expected 0.71", expected, actual);
    }

    @Test
    public void convertCurrencySwissFrancToMalaysianRinggitTEST() {
        double actual = cc.convert(cc.swissFranc, cc.malysianRinggit);
        double expected = 4.43;
        assertEquals("Expected 4.43", expected, actual);
    }

    @Test
    public void convertCurrencyMalaysianRinggitToJapaneseYenTEST() {
        double actual = cc.convert(cc.malysianRinggit, cc.japaneseYen);
        double expected = 25.91;
        assertEquals("Expected 25.91", expected, actual);
    }

    @Test
    public void convertCurrencyJapanseYenToChineseYuanRenminbiTEST() {
        double actual = cc.convert(cc.japaneseYen, cc.chineseYuanRenminbi);
        double expected = 0.06;
        assertEquals("Expected 0.06", expected, actual);

    }

}
