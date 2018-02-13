import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.math.BigDecimal;

import org.junit.Test;

public class RateTest {

    Rate testRate;

    @Before
    public void setUp(){
        testRate = new Rate();
    }


    @Test
    public void testConvertDollarToEuro() {
        String country1 = "USD";
        String country2 = "EUR";
        double amount = 100.1456;
        BigDecimal expectedAmount = new BigDecimal("94.14");

        //:When
        BigDecimal actualAmount = testRate.conversion(country1, country2, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from USD to EURO is ", expectedAmount, actualAmount);


    }
    @Test
    public void convertEuroToDollar() {

    }
//    ConvertEuroToBritishPound() {
//
//    }
//    ConvertBritishPoundToIndianRupee() {
//
//    }
//    ConvertRupeeToCanadianDollar() {
//
//    }
//    ConvertCanadianDollarToSingaporeDollar(){
//
//    }
//    ConvertSingaporeDollarToSwissFranc(){
//
//    }
//    ConvertSwissFranctoMalaysianRinggit(){
//
//    }
//    ConvertMalaysianRinggitToJapaneseYen(){
//
//    }
//    ConvertJapaneseYenToChineseYuan(){}
}
