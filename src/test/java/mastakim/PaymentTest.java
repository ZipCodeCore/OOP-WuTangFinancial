package mastakim;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static mastakim.Currency.*;

public class PaymentTest {

    Payment usd1;
    Payment eur1;
    Payment gbp1;
    Payment inr1;
    Payment aud1;
    Payment cad1;
    Payment sgd1;
    Payment chf1;
    Payment myr1;
    Payment jpy1;
    Payment cny1;

    Payment usd2;
    Payment eur2;
    Payment gbp2;
    Payment inr2;
    Payment aud2;
    Payment cad2;
    Payment sgd2;
    Payment chf2;
    Payment myr2;
    Payment jpy2;
    Payment cny2;


    @Before
    public void initialize() {
        usd1 = new Payment(1000, USD);
        eur1 = new Payment(1000, EUR);
        gbp1 = new Payment(1000, GBP);
        inr1 = new Payment(1000, INR);
        aud1 = new Payment(1000, AUD);
        cad1 = new Payment(1000, CAD);
        sgd1 = new Payment(1000, SGD);
        chf1 = new Payment(1000, CHF);
        myr1 = new Payment(1000, MYR);
        jpy1 = new Payment(1000, JPY);
        cny1 = new Payment(1000, CNY);

        usd2 = new Payment(5000000, USD);
        eur2 = new Payment(5000000, EUR);
        gbp2 = new Payment(5000000, GBP);
        inr2 = new Payment(5000000, INR);
        aud2 = new Payment(5000000, AUD);
        cad2 = new Payment(5000000, CAD);
        sgd2 = new Payment(5000000, SGD);
        chf2 = new Payment(5000000, CHF);
        myr2 = new Payment(5000000, MYR);
        jpy2 = new Payment(5000000, JPY);
        cny2 = new Payment(5000000, CNY);
    }

    @Test
    public void constructorWithStringTest(){
        //Given
        Payment usdString = new Payment("10.00", USD);
        long expected1 = 1000;

        //When
        long actual1 = usdString.getAmount();

        //Then
        assertEquals("\"10.00\" should be recorded as a value of 1000", expected1, actual1);
    }


    //Convert USD to EUR
    @Test
    public void convertUSDtoEURTest(){
        //Given
        long expected1 = 940;
        long expected2 = 4700000;

        //When
        Payment result1 = usd1.convertTo(EUR);
        long actual1 = result1.getAmount();
        Payment result2 = usd2.convertTo(EUR);
        long actual2 = result2.getAmount();


        //Then
        assertEquals("10.00 USD = 9.40 EUR", expected1, actual1);
        assertEquals("50,000.00 USD = 47,000.00 EUR", expected2, actual2);
    }

    //Convert EUR to USD
    @Test
    public void convertEURtoUSDTest(){
        //Given
        long expected1 = 1064;
        long expected2 = 5319149;

        //When
        Payment result1 = eur1.convertTo(USD);
        long actual1 = result1.getAmount();
        Payment result2 = eur2.convertTo(USD);
        long actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 EUR = 10.64 USD", expected1, actual1);
        assertEquals("50,000.00 EUR = 53,191.49 USD", expected2, actual2);
    }

    //Convert EUR to GBP
    @Test
    public void convertEURtoGBPTest(){
        //Given
        long expected1 = 872;
        long expected2 = 4361702;

        //When
        Payment result1 = eur1.convertTo(GBP);
        long actual1 = result1.getAmount();
        Payment result2 = eur2.convertTo(GBP);
        long actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 EUR = 8.72 GBP", expected1, actual1);
        assertEquals("50,000.00 EUR = 43617.02 GBP", expected2, actual2);
    }

    //Convert GBP to INR
    @Test
    public void convertGBPtoINRTest(){
        //Given
        long expected1 = 83317;
        long expected2 = 416585366;

        //When
        Payment result1 = gbp1.convertTo(INR);
        long actual1 = result1.getAmount();
        Payment result2 = gbp2.convertTo(INR);
        long actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 GBP = 833.17 INR", expected1, actual1);
        assertEquals("50,000.00 GBP = 4165853.66 INR", expected2, actual2);
    }

    //Convert INR to CAD
    @Test
    public void convertINRtoCADTest(){
        //Given
        long expected1 = 19;
        long expected2 = 96604;

        //When
        Payment result1 = inr1.convertTo(CAD);
        long actual1 = result1.getAmount();
        Payment result2 = gbp2.convertTo(INR);
        long actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 INR = 0.19 CAD", expected1, actual1);
        assertEquals("50,000.00 INR = 966.04 CAD", expected2, actual2);
    }

    //Convert CAD to SGD
    @Test
    public void convertCADtoSGDTest(){
        //Given
        long expected1 = 1083;
        long expected2 = 5416667;

                //When
        Payment result1 = cad1.convertTo(SGD);
        long actual1 = result1.getAmount();
        Payment result2 = cad2.convertTo(SGD);
        long actual2 = result2.getAmount();


        //Then
        assertEquals("10.00 CAD = 10.83 SGD", expected1, actual1);
        assertEquals("50,000.00 CAD = 54166.67 SGD", expected2, actual2);
    }

    //Convert SGD to CHF
    @Test
    public void convertSGDtoCHFTest(){
        //Given
        long expected1 = 706;
        long expected2 = 3531469;

        //When
        Payment result1 = sgd1.convertTo(CHF);
        long actual1 = result1.getAmount();
        Payment result2 = sgd2.convertTo(CHF);
        long actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 SGD = 7.06 CHF", expected1, actual1);
        assertEquals("50,000.00 SGD = 35314.69", expected2, actual2);
    }

    //Convert CHF to MYR
    @Test
    public void convertCHFtoMYRTest(){
        //Given
        long expected1 = 4426;
        long expected2 = 22128712;

        //When
        Payment result1 = chf1.convertTo(MYR);
        long actual1 = result1.getAmount();
        Payment result2 = chf2.convertTo(MYR);
        long actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 CHF = 44.26 MYR", expected1, actual1);
        assertEquals("50,000.00 CHF = 221287.12 MYR", expected2, actual2);
    }

    //Convert MYR to JPY
    @Test
    public void convertMYRtoJPYTest(){
        //Given
        long expected1 = 25915;
        long expected2 = 129574944;

                //When
        Payment result1 = myr1.convertTo(JPY);
        long actual1 = result1.getAmount();
        Payment result2 = myr2.convertTo(JPY);
        long actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 MYR = 257.27 JPY", expected1, actual1);
        assertEquals("50,000.00 MYR = 1295749.44 JPY", expected2, actual2);
    }

    //Convert JPY to CNY
    @Test
    public void convertJPYtoCNYTest(){
        //Given
        long expected1 = 60;
        long expected2 = 298688;

                //When
        Payment result1 = jpy1.convertTo(CNY);
        long actual1 = result1.getAmount();
        Payment result2 = jpy2.convertTo(CNY);
        long actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 JPY = 0.60 CNY", expected1, actual1);
        assertEquals("50,000.00 JPY = 2986.88 CNY", expected2, actual2);
    }
}
