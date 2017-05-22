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
    public void testGetFirstExchangeRate(){


    }

    @Test
    public void testGetSecondExchangeRate(){


    }

    @Test
    public void testConvertDollarToEuro(){ //dollar to euro
        //:Given
        String firstCountry = "USD";
        String secondCountry = "EURO";
        double amount = 100.00;
        double expectedAmount = 94.00;

        //:When
        double actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from USD to EURO is ", expectedAmount, actualAmount, 0.001);

    }

    @Test
    public void testConvertEuroToDollar(){  //Euro to dollar
        //:Given
        String firstCountry = "EURO";
        String secondCountry = "USD";
        double amount = 94.00;
        double expectedAmount = 100.00;

        //:When
        double actualAmount = converter.convertTo(firstCountry, secondCountry, amount);

        //:Then
        Assert.assertEquals("The expected converted amount from USD to EURO is ", expectedAmount, actualAmount, 0.001);

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
