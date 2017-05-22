/**
 * Created by brianmullin on 5/22/17.
 */

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CurrencyConverterTest {

    CurrencyConverter converter;

    @Before

    public void setUp() {
        converter = new CurrencyConverter();
    }

    @Test
    public void testConvertDollarToEuro(){ //dollar to euro
        //:Given
        String firstCountry = "USD";
        String secondCountry = "Euro";
        double amount = 100.00;
        //:When

        //:Then

    }

    @Test
    public void testConvertEuroToDollar(){  //Euro to dollar
        //:Given

        //:When

        //:Then

    }

    @Test
    public void testConvertEuroToBritishPound(){  //Eur to Pound
        //:Given

        //:When

        //:Then

    }

    @Test
    public void testConvertBritishPoundToIndianRupee(){ //Pound to Rupee
        //:Given

        //:When

        //:Then

    }

    @Test
    public void testConvertRupeeToCanadianDollar(){ //Rupee to Can
        //:Given

        //:When

        //:Then

    }

    @Test
    public void testCanadianDollarToSingaporeDollar(){ //Can to Sing
        //:Given

        //:When

        //:Then

    }

    @Test
    public void testSingaporeDollarToSwissFranc(){ //Sing to Franc
        //:Given

        //:When

        //:Then

    }

    @Test
    public void testConvertSwissFrancToMalaysianRinggit(){ //Franc to Ringgit
        //:Given

        //:When

        //:Then

    }

    @Test
    public void testConvertRinggitToJapaneseYen(){ //Ringgit to Yen
        //:Given

        //:When

        //:Then

    }

    @Test
    public void testConvertJapanesYenToChineseYuanRenminbi(){  //Yen to Yuan
        //:Given

        //:When

        //:Then

    }

}
