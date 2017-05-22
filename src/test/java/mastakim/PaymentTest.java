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
        long expected = 1000;

        //When
        long actual = usdString.getAmount();

        //Then
        assertEquals("\"10.00\" should be recorded as a value of 1000", expected, actual);
    }


    //Convert USD to EUR
    @Test
    public void convertUSDtoEURTest(){
        //Given
        long expected = 940;

        //When
        Payment result = usd.convertTo(EUR);
        long actual = result.getAmount();

        //Then
        assertEquals("Using a conversion of 0.94 EUR per USD, $10.00 USD = 9.40 EUR", expected, actual);
    }

    //Convert EUR to USD
    @Test
    public void convertEURtoUSDTest(){
        //Given
        long expected = 1064;

        //When
        Payment result = eur.convertTo(USD);
        long actual = result.getAmount();

        //Then
        assertEquals("Using a conversion of 1.06383 EUR per USD, 10.00 EUR = 10.64 USD", expected, actual);
    }

    //Convert EUR to GBP
    @Test
    public void convertEURtoGBPTest(){
        //Given
        long expected = 872;

        //When
        Payment result = eur.convertTo(GBP);
        long actual = result.getAmount();

        //Then
        assertEquals("10.00 EUR = 8.72 GBP", expected, actual);
    }

    //Convert GBP to INR
    @Test
    public void convertGBPtoINRTest(){
        //Given
        long expected = 83317;

        //When
        Payment result = gbp.convertTo(INR);
        long actual = result.getAmount();

        //Then
        assertEquals("10.00 GBP = 833.17 INR", expected, actual);
    }

    //Convert INR to CAD
    @Test
    public void convertINRtoCADTest(){
        //Given
        long expected = 19;

        //When
        Payment result = inr.convertTo(CAD);
        long actual = result.getAmount();

        //Then
        assertEquals("10.00 INR = 0.19 CAD", expected, actual);
    }

    //Convert CAD to SGD
    @Test
    public void convertCADtoSGDTest(){
        //Given
        long expected = 1083;

        //When
        Payment result = cad.convertTo(SGD);
        long actual = result.getAmount();

        //Then
        assertEquals("10.00 CAD = 10.83 SGD", expected, actual);
    }

    //Convert SGD to CHF
    @Test
    public void convertSGDtoCHFTest(){
        //Given
        long expected = 706;

        //When
        Payment result = sgd.convertTo(CHF);
        long actual = result.getAmount();

        //Then
        assertEquals("10.00 SGD = 7.06 CHF", expected, actual);
    }

    //Convert CHF to MYR
    @Test
    public void convertCHFtoMYRTest(){
        //Given
        long expected = 4426;

        //When
        Payment result = chf.convertTo(MYR);
        long actual = result.getAmount();

        //Then
        assertEquals("10.00 CHF = 44.26 MYR", expected, actual);
    }

    //Convert MYR to JPY
    @Test
    public void convertMYRtoJPYTest(){
        //Given
        long expected = 25915;

        //When
        Payment result = myr.convertTo(JPY);
        long actual = result.getAmount();

        //Then
        assertEquals("10.00 MYR = 257.27 JPY", expected, actual);
    }

    //Convert JPY to CNY
    @Test
    public void convertJPYtoCNYTest(){
        //Given
        long expected = 60;

        //When
        Payment result = jpy.convertTo(CNY);
        long actual = result.getAmount();

        //Then
        assertEquals("10.00 JPY = 0.60 CNY", expected, actual);
    }
}
