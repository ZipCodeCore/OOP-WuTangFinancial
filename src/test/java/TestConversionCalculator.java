import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mollyarant on 5/22/17.
 */
public class TestConversionCalculator {
    ConversionCalculator conversionCalculator;

    @Before
    public void setUp() {
        conversionCalculator = new ConversionCalculator();
    }

    @Test
    public void calculateCurrencyEuroToPound() {
        //given
        double amountToConvert = 10.00;
        //when
        double actual = conversionCalculator.calculateCurrencyEuroToPound(amountToConvert);

        //then
        Assert.assertEquals("should return euros converted to a pound", 8.72, actual, 0.01);
    }

    @Test
    public void calculateCurrencyEuroToRupee(){
        //given
        double amountToConvert=10.00;
        //when
        double actual= conversionCalculator.calculateCurrencyEuroToRupee(amountToConvert);
        //then
        Assert.assertEquals("should return euros converted to rupees",726.80, actual, 0.01 );
    }

    @Test
    public void calculateCurrencyPoundToRupee(){
        //given
        double amountToConvert=10.00;
        //when
        double actual= conversionCalculator.calculateCurrencyPoundToRupee(amountToConvert);
        //then
        Assert.assertEquals("should return pounds to rupees",833.17, actual, 0.01 );
    }

    @Test
    public void calculateCurrencyRupeetoCanadianDollar(){
        //given
        double amountToConvert=10.00;
        //when
        double actual= conversionCalculator.calculateCurrencyRupeeToCanadianDollar(amountToConvert);
        //then
        Assert.assertEquals("should return Rupees converted to canadian dollars",0.19, actual, 0.01 );
    }

    @Test
    public void calculateCurrencyCanadianToSingapore(){
        //given
        double amountToConvert=10.00;
        //when
        double actual= conversionCalculator.calculateCurrencyCanadianDollarToSingaporeDollar(amountToConvert);
        //then
        Assert.assertEquals("should return canadian dollars converted to Singapore dollars",10.833, actual, 0.01 );
    }

    @Test
    public void calculateCurrencySingaporeToMalaysia(){
        //given
        double amountToConvert=10.00;
        //when
        double actual= conversionCalculator.calculateCurrencySingaporeDollarToMalaysianRinggit(amountToConvert);
        //then
        Assert.assertEquals("should return euros converted to rupees",31.25, actual, 0.01 );
    }

    @Test
    public void calculateCurrencySingaporeToSwissFranc(){
        //given
        double amountToConvert=10.00;
        //when
        double actual= conversionCalculator.calculateCurrencySingaporeDollarToSwissFranc(amountToConvert);
        //then
        Assert.assertEquals("should return  singapore dollars to swiss franc",7.06, actual, 0.01 );
    }
    @Test
    public void calculateCurrencySwissFrancToRinggit(){
        //given
        double amountToConvert=10.00;
        //when
        double actual= conversionCalculator.calculateCurrencySwissFranctoMalaysianRinggit(amountToConvert);
        //then
        Assert.assertEquals("should return  franc to ringgit",44.25, actual, 0.01 );
    }

    @Test
    public void calculateCurrencyRinggitToYen(){
        //given
        double amountToConvert=10.00;
        //when
        double actual= conversionCalculator.calculateCurrencyRinggitToYen(amountToConvert);
        //then
        Assert.assertEquals("should return Ringgit to Yen",259.15, actual, 0.01 );
    }

    @Test
    public void calculateCurrencyYentoYuan(){
        //given
        double amountToConvert=10.00;
        //when
        double actual= conversionCalculator.calculateCurrencyYenToYuan(amountToConvert);
        //then
        Assert.assertEquals("should return yen to yuan",0.60, actual, 0.01 );
    }



}
