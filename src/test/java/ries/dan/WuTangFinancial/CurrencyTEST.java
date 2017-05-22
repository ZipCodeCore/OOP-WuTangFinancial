package ries.dan.WuTangFinancial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by danries on 1/11/17.
 */
public class CurrencyTEST {

    Converter c;
    Currency cu;

    @Before
    public void setUp(){
        c = new Converter();
        cu = new Currency();
    }

    @Test
    public void euroToUSTEST(){
        double actual = c.conversion(cu.usDollar , cu.euro);
        double expected = 1.06;
        assertEquals("Should get 1.06", expected, actual);
    }

    @Test
    public void usToEuroTEST(){
        double actual = c.conversion(cu.euro , cu.usDollar);
        double expected = 0.94;
        assertEquals("Should get 0.94", expected, actual);
    }

    @Test
    public void euroTOBritishPoundTEST(){
        double actual = c.conversion(cu.britishPound , cu.euro);
        double expected = 0.87;
        assertEquals("Should get 0.87",expected , actual);
    }

    @Test
    public void britishPoundToRupeeTEST(){
        double actual = c.conversion(cu.indianRupee , cu.britishPound);
        double expected = 83.32;
        assertEquals("Should get 83.32", expected , actual);
    }

    @Test
    public void rupeetoCanadianTEST(){
        double actual = c.conversion(cu.canadianDollar , cu.indianRupee);
        double expected = .02;
        assertEquals("Should get .01", expected, actual);
    }

    @Test
    public void canadianToSingaporeTEST(){
        double actual = c.conversion(cu.singaporeDollar , cu.canadianDollar);
        double expected = 1.08;
        assertEquals("Should get 1.08", expected, actual);
    }

    @Test
    public void singaporeToSwissTEST(){
        double actual = c.conversion(cu.swissFranc , cu.singaporeDollar);
        double expected = 0.71;
        assertEquals("We expect to get 0.71", expected, actual);
    }

    @Test
    public void swissToMalaysianTEST(){
        double actual = c.conversion(cu.malaysianRinggit , cu.swissFranc);
        double expected = 4.43;
        assertEquals("We expect to get 4.41", expected, actual);
    }

    @Test
    public void malaysianToJapaneseTEST(){
        double actual = c.conversion(cu.japaneseYen , cu.malaysianRinggit);
        double expected = 25.91;
        assertEquals("We expect to get 25.78", expected , actual);
    }

    @Test
    public void japaneseToChineseTEST(){
        double actual = c.conversion(cu.chineseYuanRenminbi , cu.japaneseYen);
        double expected = .06;
        assertEquals("We expect to get .06", expected, actual);
    }


}
