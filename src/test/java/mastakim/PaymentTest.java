package mastakim;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static mastakim.Currency.*;

public class PaymentTest {

    Payment usd;
    Payment eur;
    Payment gbp;
    Payment inr;
    Payment aud;
    Payment cad;
    Payment sgd;
    Payment chf;
    Payment myr;
    Payment jpy;
    Payment cny;


    @Before
    public void initialize() {
        usd = new Payment(1000, USD);
        eur = new Payment(1000, EUR);
        gbp = new Payment(1000, GBP);
        inr = new Payment(1000, INR);
        aud = new Payment(1000, AUD);
        cad = new Payment(1000, CAD);
        sgd = new Payment(1000, SGD);
        chf = new Payment(1000, CHF);
        myr = new Payment(1000, MYR);
        jpy = new Payment(1000, JPY);
        cny = new Payment(1000, CNY);
    }

    @Test
    public void constructorWithStringTest(){
        //Given
        Payment usdString = new Payment("10.00", USD);
        int expected = 1000;

        //When
        int actual = usdString.getAmount();

        //Then
        assertEquals("\"10.00\" should be recorded as a value of 1000", expected, actual);
    }


    //Convert USD to EUR
    @Test
    public void convertUSDtoEURTest(){
        //Given
        int expected = 940;

        //When
        Payment result = usd.convertTo(EUR);
        int actual = result.getAmount();

        //Then
        assertEquals("Using a conversion of 0.94 EUR per USD, $10.00 USD = 9.40 EUR", expected, actual);
    }

    //Convert EUR to USD
    @Test
    public void convertEURtoUSDTest(){
        //Given
        int expected = 1063;

        //When
        Payment result = eur.convertTo(USD);
        int actual = result.getAmount();

        //Then
        assertEquals("Using a conversion of 1.06383 EUR per USD, 10.00 EUR = 10.63 USD", expected, actual);
    }

    //Convert EUR to GBP
    @Test
    public void convertEURtoGBPTest(){
        //Given
        int expected = 872;

        //When

        //Then
    }

    //Convert GBP to INR
    @Test
    public void convertGBPtoINRTest(){
        //Given
        int expected = 83317;

        //When

        //Then
    }

    //Convert INR to CAD
    @Test
    public void convertINRtoCADTest(){
        //Given

        //When

        //Then
    }

    //Convert CAD to SGD
    @Test
    public void convertCADtoSGDTest(){
        //Given

        //When

        //Then
    }

    //Convert SGD to CHF
    @Test
    public void convertSGDtoCHFTest(){
        //Given

        //When

        //Then
    }

    //Convert CHF to MYR
    @Test
    public void convertCHFtoMYRTest(){
        //Given

        //When

        //Then
    }

    //Convert MYR to JPY
    @Test
    public void convertMYRtoJPYTest(){
        //Given

        //When

        //Then
    }

    //Convert JPY to CNY
    @Test
    public void convertJPYtoCNYTest(){
        //Given

        //When

        //Then
    }
}
