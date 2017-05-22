import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by byung-chunyoo on 5/22/17.
 */



public class CurrencyConversionToolBoxTest {

    @Test
    public void testConvertDollarToEuro(){
        double euro = CurrencyConversionToolBox.convertDollarToEuro(2);
        assertEquals(1.88, euro, 0.0);
    }

    @Test
    public void testConvertEuroToDollar(){
        double dollar = CurrencyConversionToolBox.convertEuroToDollar(2);
        assertEquals(2.127659574468085, dollar, 0.0);
    }

    @Test
    public void testConvertEuroToBritishPound(){
        double pound = CurrencyConversionToolBox.convertEuroToBritishPound(0.94);
        assertEquals(0.82, pound, 0.0);
    }

    @Test
    public void testConvertBritishPoundToIndianRupee(){
        double pound = CurrencyConversionToolBox.convertBritishPoundToIndianRupee(0.82);
        assertEquals(68.32, pound, 0.0);
    }

    @Test
    public void testConvertIndianRupeeToCanadianDollar(){
        double canadianDollar = CurrencyConversionToolBox.convertIndianRupeeToCanadianDollar(68.32);
        assertEquals(1.32, canadianDollar, 0.0);
    }

    @Test
    public void testConvertCanadianDollarToSingaporeDollar(){
        double singaporeDollar = CurrencyConversionToolBox.convertCanadianDollarToSingaporeDollar(1.32);
        assertEquals(1.43, singaporeDollar, 0.0);
    }

    @Test
    public void testConvertSingaporeDollarToSwissFranc(){
        double swissFranc = CurrencyConversionToolBox.convertSingaporeDollarToSwissFranc(1.43);
        assertEquals(1.01, swissFranc, 0.0);
    }

    @Test
    public void testConvertSwissFrancToMalaysianRinggit(){
        double malaysianRinggit = CurrencyConversionToolBox.convertSwissFrancToMalaysianRinggit(1.01);
        assertEquals(4.47, malaysianRinggit, 0.0);
    }

    @Test
    public void testConvertMalaysianRinggitToJapaneseYen(){
        double japaneseYen = CurrencyConversionToolBox.convertMalaysianRinggitToJapaneseYen(4.47);
        assertEquals(115.84, japaneseYen, 0.0);
    }

    @Test
    public void testConvertJapaneseYenToChineseYuan(){
        double chineseYuan = CurrencyConversionToolBox.convertJapaneseYenToChineseYuan(115.84);
        assertEquals(6.92, chineseYuan, 0.0);
    }


}
