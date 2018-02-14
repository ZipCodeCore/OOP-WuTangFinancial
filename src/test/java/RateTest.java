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
        Assert.assertEquals(expectedAmount, actualAmount);


    }
    @Test
    public void convertEuroToDollar() {
        String country1 = "EUR";
        String country2 = "USD";
        double amount = 250.50;
        BigDecimal expectedAmount = new BigDecimal("266.49");

        //:When
        BigDecimal actualAmount = testRate.conversion(country1, country2, amount);

        //:Then
        Assert.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void ConvertEuroToBritishPound() {
        String country1 = "EUR";
        String country2 = "GBP";
        double amount = 656.354;
        BigDecimal expectedAmount = new BigDecimal("572.57");

        //:When
        BigDecimal actualAmount = testRate.conversion(country1, country2, amount);

        //:Then
        Assert.assertEquals(expectedAmount, actualAmount);
   }
     @Test
     public void ConvertBritishPoundToIndianRupee() {
         String country1 = "GBP";
         String country2 = "INR";
         double amount = 345.00;
         BigDecimal expectedAmount = new BigDecimal("28744.40");

         //:When
         BigDecimal actualAmount = testRate.conversion(country1, country2, amount);

         //:Then
         Assert.assertEquals(expectedAmount, actualAmount);
        }

     @Test
     public void ConvertRupeeToCanadianDollar() {
         String country1 = "INR";
         String country2 = "CAD";
         double amount = 97.47;
         BigDecimal expectedAmount = new BigDecimal("1.89");

         //:When
         BigDecimal actualAmount = testRate.conversion(country1, country2, amount);

         //:Then
         Assert.assertEquals(expectedAmount, actualAmount);
     }

   @Test

   public void ConvertCanadianDollarToSingaporeDollar(){
       String country1 = "CAD";
       String country2 = "SGD";
       double amount = 1000.00;
       BigDecimal expectedAmount = new BigDecimal("1083.34");

       //:When
       BigDecimal actualAmount = testRate.conversion(country1, country2, amount);

       //:Then
       Assert.assertEquals(expectedAmount, actualAmount);

    }

   @Test
   public void ConvertSingaporeDollarToSwissFranc(){
       String country1 = "SGD";
       String country2 = "CHF";
       double amount = 1526.35;
       BigDecimal expectedAmount = new BigDecimal("1078.06");

       //:When
       BigDecimal actualAmount = testRate.conversion(country1, country2, amount);

       //:Then
       Assert.assertEquals(expectedAmount, actualAmount);

    }

   @Test
   public void ConvertSwissFranctoMalaysianRinggit(){
       String country1 = "CHF";
       String country2 = "MYR";
       double amount = 345.00;
       BigDecimal expectedAmount = new BigDecimal("1526.89");

       //:When
       BigDecimal actualAmount = testRate.conversion(country1, country2, amount);

       //:Then
       Assert.assertEquals(expectedAmount, actualAmount);

    }

    @Test
    public void ConvertMalaysianRinggitToJapaneseYen(){
        String country1 = "MYR";
        String country2 = "JPY";
        double amount = 345.00;
        BigDecimal expectedAmount = new BigDecimal("8940.68");

        //:When
        BigDecimal actualAmount = testRate.conversion(country1, country2, amount);

        //:Then
        Assert.assertEquals(expectedAmount, actualAmount);

    }

    @Test

   public void ConvertJapaneseYenToChineseYuan(){
        String country1 = "JPY";
        String country2 = "CNY";
        double amount = 345.00;
        BigDecimal expectedAmount = new BigDecimal("20.61");

        //:When
        BigDecimal actualAmount = testRate.conversion(country1, country2, amount);

        //:Then
        Assert.assertEquals(expectedAmount, actualAmount);

    }
}
