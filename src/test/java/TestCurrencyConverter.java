import org.junit.Assert;
//import org.junit.Before;
import org.junit.Test;

public class TestCurrencyConverter {

    @Test
    public void testMultiplyBy100(){
        //Given
        double initialValue = 68.32;

        //When
        double actual = CurrencyConverter.multiplyBy100(initialValue);

        //Then
        double expectedValue = 6832;
        Assert.assertTrue(actual == expectedValue);


    }

    @Test
    public void testDivideBy100(){
        //Given
        double initialValue = CurrencyConverter.multiplyBy100(CurrencyConverter.INDIAN_RUPEE);

        //When
        double actual = CurrencyConverter.divideBy100(initialValue);

        //Then
        double expectedValue = 68.32;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testConvertFromDollars(){
        //Given
        double initialValue = 1;

        //When
        double actual = CurrencyConverter.convertFromDollars(initialValue, CurrencyConverter.INDIAN_RUPEE);

        //Then
        double expectedValue = 68.32;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testConvertFromDollarsWithDecimal(){
        //Given
        double initialValue = 1.5;

        //When
        double actual = CurrencyConverter.convertFromDollars(initialValue, CurrencyConverter.INDIAN_RUPEE);

        //Then
        double expectedValue = 102.48;
        Assert.assertTrue(actual == expectedValue);
    }


    @Test
    public void testConvertFromDollarsWithDecimal2(){
        //Given
        double initialValue = 100.96;

        //When
        double actual = CurrencyConverter.convertFromDollars(initialValue, CurrencyConverter.AUSTRALIAN_DOLLAR);

        //Then
        double expectedValue =136.3;
        Assert.assertTrue(actual == expectedValue);

    }

    @Test
    public void testConvertToDollars(){
        //Given
        double initialValue = 68.32;

        //When
        double actual = CurrencyConverter.convertToDollars(initialValue, CurrencyConverter.INDIAN_RUPEE);

        //Then
        double expectedValue = 1;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testConvertToDollarsWithDecimal(){
        //Given
        double initialValue = 100.76;

        //When
        double actual = CurrencyConverter.convertToDollars(initialValue, CurrencyConverter.CHINESE_YUAN);

        //Then
        double expectedValue = 14.56;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testConvertToDollarsWithDecimal2(){
        //Given
        double initialValue = 12582.03;

        //When
        double actual = CurrencyConverter.convertToDollars(initialValue, CurrencyConverter.CANADIAN_DOLLAR);

        //Then
        double expectedValue = 9531.84;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testDollarToEuro(){
        //Given
        double initialValue = 100;

        //When
        double actual = CurrencyConverter.convertFromDollars(initialValue, CurrencyConverter.EURO);

        //Then
        double expectedValue =94;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testEuroToDollar(){
        //Given
        double initialValue = 100;

        //When
        double actual = CurrencyConverter.convertToDollars(initialValue, CurrencyConverter.EURO);

        //Then
        double expectedValue = 106.38;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testEuroToBritishPound(){
        //Given
        double initialValue = 100;

        //When
        double actual = CurrencyConverter.convertFromForeignAToForiegnB
                (initialValue,CurrencyConverter.EURO, CurrencyConverter.BRITISH_POUND);

        //Then
        double expectedValue = 87.23;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testBritishPoundToIndianRupee(){
        //Given
        double initialValue = 100;

        //When
        double actual = CurrencyConverter.convertFromForeignAToForiegnB
                (initialValue,CurrencyConverter.BRITISH_POUND, CurrencyConverter.INDIAN_RUPEE);

        //Then
        double expectedValue = 8331.62;
        Assert.assertTrue(actual == expectedValue);
    }

    @Test
    public void testIndianRupeeToCanadianDollar(){
        //Given
        double initialValue = 100;

        //When
        double actual = CurrencyConverter.convertFromForeignAToForiegnB
                (initialValue,CurrencyConverter.INDIAN_RUPEE, CurrencyConverter.CANADIAN_DOLLAR);

        //Then
        double expectedValue = 1.93;
        Assert.assertTrue(actual == expectedValue);;
    }

    @Test
    public void testCanadianDollarToSingaporeDollar(){
        //Given
        double initialValue = 100;

        //When
        double actual = CurrencyConverter.convertFromForeignAToForiegnB
                (initialValue,CurrencyConverter.CANADIAN_DOLLAR, CurrencyConverter.SINGAPORE_DOLLAR);

        //Then
        double expectedValue = 108.34;
        Assert.assertTrue(actual == expectedValue);;
    }

    @Test
    public void testSingaporeDollarToSwissFranc(){
        //Given
        double initialValue = 100;

        //When
        double actual = CurrencyConverter.convertFromForeignAToForiegnB
                (initialValue,CurrencyConverter.SINGAPORE_DOLLAR, CurrencyConverter.SWISS_FRANC);

        //Then
        double expectedValue = 70.63;
        Assert.assertTrue(actual == expectedValue);;
    }

    @Test
    public void testSwissFrancToMalaysianRinggit(){
        //Given
        double initialValue = 100;

        //When
        double actual = CurrencyConverter.convertFromForeignAToForiegnB
                (initialValue,CurrencyConverter.SWISS_FRANC, CurrencyConverter.MALAYSIAN_RINGGIT);

        //Then
        double expectedValue = 442.57;
        Assert.assertTrue(actual == expectedValue);;
    }


}
