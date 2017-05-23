import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/22/17.
 */
public class TestCurrencyConverter {

    CurrencyConverter currencyConverter;

    @Before
    public void setup(){
        currencyConverter = new CurrencyConverter();
    }



    @Test
    public void testForeignCurrencyToUsDollar1(){
        //: Given
        String currency = "euro";
        double money = 42.63;
        double expectedDollarAmount = 45.35;
        //: When
        double actualDollarAmount = currencyConverter.foreignCurrencyToUsDollar(currency,money);
        //: Then
        Assert.assertEquals("The expected return value should be 45.35 dollars", expectedDollarAmount, actualDollarAmount,0.001);
    }


    @Test
    public void testForeignCurrencyToUsDollar2(){
        //: Given
        String currency = "rupee";
        double money = 226.47;
        double expectedDollarAmount = 3.31;
        //: When
        double actualDollarAmount = currencyConverter.foreignCurrencyToUsDollar(currency,money);
        //: Then
        Assert.assertEquals("The expected return value should be 3.31 dollars", expectedDollarAmount, actualDollarAmount,0.001);
    }

    @Test
    public void testForeignCurrencyToUsDollar(){
        //: Given
        String currency = "dollar";
        double money = 22154.14;
        double expectedDollarAmount = money;
        //: When
        double actualDollarAmount = currencyConverter.foreignCurrencyToUsDollar(currency,money);
        //: Then
        Assert.assertEquals("The expected return value should be 22154.14 dollars", expectedDollarAmount, actualDollarAmount,0.001);
    }

    @Test
    public void testUSDollarsToForeignCurrency(){
        //: Given
        String exchangeCurrency = "franc";
        double dollarAmount = 81.94;
        double expectedFrancs = 82.76;
        //: When
        double actualDollarAmount = currencyConverter.usDollarToForeignCurrency(exchangeCurrency,dollarAmount);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollars to franc is 81.76 Francs", expectedFrancs, actualDollarAmount,0.001);

    }

    @Test
    public void testConverter(){
        //:Given
        String currentCurrency = "pound";
        double loot = 2004.50;
        String exchangeCurrency = "euro";
        double expectedExchangeValue = 2297.84;
        //: When
        double actualExchangeValue = currencyConverter.converter(currentCurrency,loot,exchangeCurrency);

        //: Then
        Assert.assertEquals("2004.50 Pounds should return 2297.84 Euros", expectedExchangeValue,actualExchangeValue,0.001);

    }


















}
