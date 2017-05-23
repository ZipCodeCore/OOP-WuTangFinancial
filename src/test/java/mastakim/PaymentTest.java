package mastakim;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

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
        usd1 = new Payment(new BigDecimal("1000"),  USD);
        eur1 = new Payment(new BigDecimal("1000"),  EUR);
        gbp1 = new Payment(new BigDecimal("1000"),  GBP);
        inr1 = new Payment(new BigDecimal("1000"),  INR);
        aud1 = new Payment(new BigDecimal("1000"),  AUD);
        cad1 = new Payment(new BigDecimal("1000"),  CAD);
        sgd1 = new Payment(new BigDecimal("1000"),  SGD);
        chf1 = new Payment(new BigDecimal("1000"),  CHF);
        myr1 = new Payment(new BigDecimal("1000"),  MYR);
        jpy1 = new Payment(new BigDecimal("1000"),  JPY);
        cny1 = new Payment(new BigDecimal("1000"),  CNY);

        usd2 = new Payment(new BigDecimal("5000000"),  USD);
        eur2 = new Payment(new BigDecimal("5000000"),  EUR);
        gbp2 = new Payment(new BigDecimal("5000000"),  GBP);
        inr2 = new Payment(new BigDecimal("5000000"),  INR);
        aud2 = new Payment(new BigDecimal("5000000"),  AUD);
        cad2 = new Payment(new BigDecimal("5000000"),  CAD);
        sgd2 = new Payment(new BigDecimal("5000000"),  SGD);
        chf2 = new Payment(new BigDecimal("5000000"),  CHF);
        myr2 = new Payment(new BigDecimal("5000000"),  MYR);
        jpy2 = new Payment(new BigDecimal("5000000"),  JPY);
        cny2 = new Payment(new BigDecimal("5000000"),  CNY);
    }

    @Test
    public void constructorWithStringTest(){
        //Given
        Payment usdString = new Payment("10.00", USD);
        BigDecimal expected1 = new BigDecimal("1000");

        //When
        BigDecimal actual1 = usdString.getAmount();

        //Then
        assertEquals("\"10.00\" should be recorded as a value of 1000", expected1, actual1);
    }


    //Convert USD to EUR
    @Test
    public void convertUSDtoEURTest(){
        //Given
        BigDecimal expected1 = new BigDecimal("940");
        BigDecimal expected2 = new BigDecimal("4700000");

        //When
        Payment result1 = usd1.convertTo(EUR);
        BigDecimal actual1 = result1.getAmount();
        Payment result2 = usd2.convertTo(EUR);
        BigDecimal actual2 = result2.getAmount();


        //Then
        assertEquals("10.00 USD = 9.40 EUR", expected1, actual1);
        assertEquals("50000.00 USD = 47000.00 EUR", expected2, actual2);
    }

    //Convert EUR to USD
    @Test
    public void convertEURtoUSDTest(){
        //Given
        BigDecimal expected1 = new BigDecimal("1064");
        BigDecimal expected2 = new BigDecimal("5319149");

        //When
        Payment result1 = eur1.convertTo(USD);
        BigDecimal actual1 = result1.getAmount();
        Payment result2 = eur2.convertTo(USD);
        BigDecimal actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 EUR = 10.64 USD", expected1, actual1);
        assertEquals("50000.00 EUR = 53191.49 USD", expected2, actual2);
    }

    //Convert EUR to GBP
    @Test
    public void convertEURtoGBPTest(){
        //Given
        BigDecimal expected1 = new BigDecimal("872");
        BigDecimal expected2 = new BigDecimal("4361702");

        //When
        Payment result1 = eur1.convertTo(GBP);
        BigDecimal actual1 = result1.getAmount();
        Payment result2 = eur2.convertTo(GBP);
        BigDecimal actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 EUR = 872 GBP", expected1, actual1);
        assertEquals("50000.00 EUR = 4361702 GBP", expected2, actual2);
    }

    //Convert GBP to INR
    @Test
    public void convertGBPtoINRTest(){
        //Given
        BigDecimal expected1 = new BigDecimal("83317");
        BigDecimal expected2 = new BigDecimal("416585366");

        //When
        Payment result1 = gbp1.convertTo(INR);
        BigDecimal actual1 = result1.getAmount();
        Payment result2 = gbp2.convertTo(INR);
        BigDecimal actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 GBP = 83317 INR", expected1, actual1);
        assertEquals("50000.00 GBP = 416585366 INR", expected2, actual2);
    }

    //Convert INR to CAD
    @Test
    public void convertINRtoCADTest(){
        //Given
        BigDecimal expected1 = new BigDecimal("19");
        BigDecimal expected2 = new BigDecimal("96604");

        //When
        Payment result1 = inr1.convertTo(CAD);
        BigDecimal actual1 = result1.getAmount();
        Payment result2 = inr2.convertTo(CAD);
        BigDecimal actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 INR = 19 CAD", expected1, actual1);
        assertEquals("50000.00 INR = 96604 CAD", expected2, actual2);
    }

    //Convert CAD to SGD
    @Test
    public void convertCADtoSGDTest(){
        //Given
        BigDecimal expected1 = new BigDecimal("1083");
        BigDecimal expected2 = new BigDecimal("5416667");

                //When
        Payment result1 = cad1.convertTo(SGD);
        BigDecimal actual1 = result1.getAmount();
        Payment result2 = cad2.convertTo(SGD);
        BigDecimal actual2 = result2.getAmount();


        //Then
        assertEquals("10.00 CAD = 1083 SGD", expected1, actual1);
        assertEquals("50000.00 CAD = 5416667 SGD", expected2, actual2);
    }

    //Convert SGD to CHF
    @Test
    public void convertSGDtoCHFTest(){
        //Given
        BigDecimal expected1 = new BigDecimal("706");
        BigDecimal expected2 = new BigDecimal("3531469");

        //When
        Payment result1 = sgd1.convertTo(CHF);
        BigDecimal actual1 = result1.getAmount();
        Payment result2 = sgd2.convertTo(CHF);
        BigDecimal actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 SGD = 706.29 CHF", expected1, actual1);
        assertEquals("50000.00 SGD = 3531468.53", expected2, actual2);
    }

    //Convert CHF to MYR
    @Test
    public void convertCHFtoMYRTest(){
        //Given
        BigDecimal expected1 = new BigDecimal("4426");
        BigDecimal expected2 = new BigDecimal("22128713");

        //When
        Payment result1 = chf1.convertTo(MYR);
        BigDecimal actual1 = result1.getAmount();
        Payment result2 = chf2.convertTo(MYR);
        BigDecimal actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 CHF = 4426 MYR", expected1, actual1);
        assertEquals("50000.00 CHF = 22128713 MYR", expected2, actual2);
    }

    //Convert MYR to JPY
    @Test
    public void convertMYRtoJPYTest(){
        //Given
        BigDecimal expected1 = new BigDecimal("25915");
        BigDecimal expected2 = new BigDecimal("129574944");

                //When
        Payment result1 = myr1.convertTo(JPY);
        BigDecimal actual1 = result1.getAmount();
        Payment result2 = myr2.convertTo(JPY);
        BigDecimal actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 MYR = 25915 JPY", expected1, actual1);
        assertEquals("50000.00 MYR = 129574944 JPY", expected2, actual2);
    }

    //Convert JPY to CNY
    @Test
    public void convertJPYtoCNYTest(){
        //Given
        BigDecimal expected1 = new BigDecimal("60");
        BigDecimal expected2 = new BigDecimal("298688");

                //When
        Payment result1 = jpy1.convertTo(CNY);
        BigDecimal actual1 = result1.getAmount();
        Payment result2 = jpy2.convertTo(CNY);
        BigDecimal actual2 = result2.getAmount();

        //Then
        assertEquals("10.00 JPY = 60 CNY", expected1, actual1);
        assertEquals("50000.00 JPY = 298688 CNY", expected2, actual2);
    }

}
