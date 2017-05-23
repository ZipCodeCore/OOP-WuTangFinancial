/**
 * Created by stephenpegram on 5/22/17.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ConverterTest {

    Converter exchanger;

    @Before
    public void setUp(){
        exchanger = new Converter();
    }

    @Test
    public void testConvertDollarToEuro(){
    //Given
        String startingCurrency = "US Dollar";
        String endingCurrency = "Euro";
        double amount = 150.00;
        String expected = new Money<>(141,0).toString();

    //When
        String actual = exchanger.convert(startingCurrency, endingCurrency, amount).toString();

    //Then
        assertEquals("Amounts should equal", expected, actual);
    }


    @Test
    public void testConvertEuroToDollar(){
        //Given
        String startingCurrency = "Euro";
        String endingCurrency = "US Dollar";
        double amount = 150.00;
        String expected = new Money<>(159,54).toString();

        //When
        String actual = exchanger.convert(startingCurrency, endingCurrency, amount).toString();

        //Then
        assertEquals("Amounts should equal", expected, actual);
    }


    @Test
    public void testConvertEuroToPound(){
        //Given
        String startingCurrency = "Euro";
        String endingCurrency = "British Pound";
        double amount = 150.00;
        String expected = new Money<>(130,82).toString();

        //When
        String actual = exchanger.convert(startingCurrency, endingCurrency, amount).toString();

        //Then
        assertEquals("Amounts should equal", expected, actual);
    }


    @Test
    public void testConvertPoundToRupee(){
        //Given
        String startingCurrency = "British Pound";
        String endingCurrency = "Indian Rupee";
        double amount = 150.00;
        String expected = new Money<>(12486,16).toString();

        //When
        String actual = exchanger.convert(startingCurrency, endingCurrency, amount).toString();

        //Then
        assertEquals("Amounts should equal", expected, actual);
    }


    @Test
    public void testConvertRupeeToCanadianDollar(){
        //Given
        String startingCurrency = "Indian Rupee";
        String endingCurrency = "Canadian Dollar";
        double amount = 150.00;
        String expected = new Money<>(20,28).toString();

        //When
        String actual = exchanger.convert(startingCurrency, endingCurrency, amount).toString();

        //Then
        assertEquals("Amounts should equal", expected, actual);
    }


    @Test
    public void testConvertCanadianDollarToSingaporeDollar(){
        //Given
        String startingCurrency = "Canadian Dollar";
        String endingCurrency = "Singapore Dollar";
        double amount = 150.00;
        String expected = new Money<>(162,79).toString();

        //When
        String actual = exchanger.convert(startingCurrency, endingCurrency, amount).toString();

        //Then
        assertEquals("Amounts should equal", expected, actual);
    }


    @Test
    public void testConvertSingaporeDollarToFranc(){
        //Given
        String startingCurrency = "Singapore Dollar";
        String endingCurrency = "Swiss Franc";
        double amount = 150.00;
        String expected = new Money<>(106,33).toString();

        //When
        String actual = exchanger.convert(startingCurrency, endingCurrency, amount).toString();

        //Then
        assertEquals("Amounts should equal", expected, actual);
    }


    @Test
    public void testConvertFrancToRinggit(){
        //Given
        String startingCurrency = "Swiss Franc";
        String endingCurrency = "Malaysian Ringgit";
        double amount = 150.00;
        String expected = new Money<>(663,88).toString();

        //When
        String actual = exchanger.convert(startingCurrency, endingCurrency, amount).toString();

        //Then
        assertEquals("Amounts should equal", expected, actual);
    }


    @Test
    public void testConvertRinggitToYen(){
        //Given
        String startingCurrency = "Malaysian Ringgit";
        String endingCurrency = "Japanese Yen";
        double amount = 150.00;
        String expected = new Money<>(4111,16).toString();

        //When
        String actual = exchanger.convert(startingCurrency, endingCurrency, amount).toString();

        //Then
        assertEquals("Amounts should equal", expected, actual);
    }


    @Test
    public void testConvertYenToYuan(){
        //Given
        String startingCurrency = "Japanese Yen";
        String endingCurrency = "Chinese Yuan Renminbi";
        double amount = 150.00;
        String expected = new Money<>(243,31).toString();

        //When
        String actual = exchanger.convert(startingCurrency, endingCurrency, amount).toString();

        //Then
        assertEquals("Amounts should equal", expected, actual);
    }
}