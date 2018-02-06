package stimmel.zachary;

import org.junit.Assert;
import org.junit.Test;


import static stimmel.zachary.Currency.*;


public class ConverterTest {
    @Test
    public void convertUSD_EURO() {

        String expected = "94.00";
        String actual = Converter.convert(100, USD, EUR);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void convertEuro_USD() {

        String expected = "106.38";
        String actual = Converter.convert(100, EUR, USD);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertEuro_BritishPound() {

        String expected = "87.23";
        String actual = Converter.convert(100, EUR, GBP);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertBritishPound_IndianRupee() {

        String expected = "8331.71";
        String actual = Converter.convert(100, GBP, INR);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertRupee_Canadian() {

        String expected = "1.93";
        String actual = Converter.convert(100, INR, CAD);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertCanadian_Singapore() {

        String expected = "108.33";
        String actual = Converter.convert(100, CAD, SGD);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertSingapore_SwissFranc() {

        String expected = "70.63";
        String actual = Converter.convert(100, SGD, CHF);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void convertSwissFranc_MalaysianRinggit(){

        String expected = "442.57";
        String actual = Converter.convert(100,CHF,MYR);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void convertMalaysianRinggit_JapaneseYen(){

        String expected = "2591.50";
        String actual = Converter.convert(100,MYR,JPY);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void convertJapaneseYen_ChineseYuan(){

        String expected = "5.97";
        String actual = Converter.convert(100,JPY,CNY);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void convertUSD_AUD(){

        String expected = "135.00";
        String actual = Converter.convert(100,USD,AUD);

        Assert.assertEquals(expected,actual);
    }
}