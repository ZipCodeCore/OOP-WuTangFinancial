import io.zipcoder.wutangfinancial.Conversion;
import io.zipcoder.wutangfinancial.ConversionRates;
import org.junit.Assert;
import org.junit.Test;


public class ConversionTest {
    Conversion toBeConverted = new Conversion();

    @Test
    public void usToEUROConversionTest(){

        double expected = 14.10;
        double actual = toBeConverted.convert(15, ConversionRates.USDOLLAR, ConversionRates.EURO);

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void ConvertEurotoDollarTest(){
        double expected = 15.90;
        double actual = toBeConverted.convert(15, ConversionRates.EURO, ConversionRates.USDOLLAR);

        Assert.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void ConvertEurotoBritishPound() {
        double expected = 13.09;
        double actual = toBeConverted.convert(15, ConversionRates.EURO, ConversionRates.BRITISHPOUND);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void ConvertBritishPoundtoIndianRupee(){
        double expected = 1249.76;
        double actual = toBeConverted.convert(15, ConversionRates.BRITISHPOUND, ConversionRates.INDIANRUPEE);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void ConvertRupeetoCanadianDollar(){
        double expected = 0.29;
        double actual = toBeConverted.convert(15, ConversionRates.INDIANRUPEE, ConversionRates.CANADIANDOLLAR);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void ConvertCanadianDollartoSingaporeDollar(){
        double expected = 16.25;
        double actual = toBeConverted.convert(15, ConversionRates.CANADIANDOLLAR, ConversionRates.SINGAPOREDOLLAR);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void  ConvertSingaporeDollartoSwissFranc(){
        double expected = 10.60;
        double actual = toBeConverted.convert(15, ConversionRates.SINGAPOREDOLLAR, ConversionRates.SWISSFRANC);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void ConvertSwissFranctoMalaysianRinggit(){
        double expected = 66.39;
        double actual = toBeConverted.convert(15, ConversionRates.SWISSFRANC, ConversionRates.MALAYSIANRINGGIT);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void ConvertMalaysianRinggittoJapaneseYen(){
        double expected = 388.73;
        double actual = toBeConverted.convert(15, ConversionRates.MALAYSIANRINGGIT, ConversionRates.JAPANESEYEN);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void  ConvertJapaneseYentoChineseYuanRenminbi(){
        double expected = 0.90;
        double actual = toBeConverted.convert(15, ConversionRates.JAPANESEYEN, ConversionRates.CHINESEYUANRENMINIBI);

        Assert.assertEquals(expected, actual, 0.1);
    }

}
