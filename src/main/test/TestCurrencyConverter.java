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


                                    // Convert Dollar to Euro
    @Test
    public void testConverterDollarToEuro(){
        //:Given
        String currentCurrency = "dollar";
        double loot = 150;
        String exchangeCurrency = "euro";
        double expectedExchangeValue = 141.0;
        //: When
        double actualExchangeValue = currencyConverter.converter(currentCurrency,loot,exchangeCurrency);

        //: Then
        Assert.assertEquals("150 Dollars should return 141.00 Euros", expectedExchangeValue,actualExchangeValue,0.001);

    }

                                    // Convert Euro to Dollar
    @Test
    public void testConverterEuroToDollar(){
        //:Given
        String currentCurrency = "euro";
        double loot = 150;
        String exchangeCurrency = "dollar";
        double expectedExchangeValue = 159.57;
        //: When
        double actualExchangeValue = currencyConverter.converter(currentCurrency,loot,exchangeCurrency);

        //: Then
        Assert.assertEquals("150 Euros should return 159.57 Dollars", expectedExchangeValue,actualExchangeValue,0.001);

    }
                                // Convert Euro to British Pound
    @Test
    public void testConverterEuroToPound(){
        //:Given
        String currentCurrency = "euro";
        double loot = 317.15;
        String exchangeCurrency = "pound";
        double expectedExchangeValue = 276.66;
        //: When
        double actualExchangeValue = currencyConverter.converter(currentCurrency,loot,exchangeCurrency);

        //: Then
        Assert.assertEquals("317.15 Euros should return 276.66 Pounds", expectedExchangeValue,actualExchangeValue,0.001);

    }
                             // Convert British Pound to Indian Rupee
    @Test
    public void testConverterPoundToRupee(){
        //:Given
        String currentCurrency = "pound";
        double loot = 77.13;
        String exchangeCurrency = "rupee";
        double expectedExchangeValue = 6426.18;
        //: When
        double actualExchangeValue = currencyConverter.converter(currentCurrency,loot,exchangeCurrency);

        //: Then
        Assert.assertEquals("77.13 Pounds should return 6426.18 Rupees", expectedExchangeValue,actualExchangeValue,0.001);

    }
                                // Convert Rupee to Canadian Dollar
    @Test
    public void testConverterRupeeToCanadianDollar(){
        //:Given
        String currentCurrency = "rupee";
        double loot = 98.45;
        String exchangeCurrency = "canadianDollar";
        double expectedExchangeValue = 1.90;
        //: When
        double actualExchangeValue = currencyConverter.converter(currentCurrency,loot,exchangeCurrency);

        //: Then
        Assert.assertEquals("98.45 Rupees should return 1.90 Maple Leafs", expectedExchangeValue,actualExchangeValue,0.001);

    }

                            // Convert Canadian Dollar to Singapore Dollar
    @Test
    public void testConverterCanadianDollarToSingaporeDollar(){
        //:Given
        String currentCurrency = "canadianDollar";
        double loot = 2004.50;
        String exchangeCurrency = "singaporeDollar";
        double expectedExchangeValue = 2171.54;
        //: When
        double actualExchangeValue = currencyConverter.converter(currentCurrency,loot,exchangeCurrency);

        //: Then
        Assert.assertEquals("2004.50 Maple Leafs should return 2171.54 Singapore Dollars", expectedExchangeValue,actualExchangeValue,0.001);

    }
                                // Convert Singapore Dollar to Swiss Franc
    @Test
    public void testConverterSingaporeDollarToSwissFranc(){
        //:Given
        String currentCurrency = "singaporeDollar";
        double loot = 81.43;
        String exchangeCurrency = "franc";
        double expectedExchangeValue = 57.51;
        //: When
        double actualExchangeValue = currencyConverter.converter(currentCurrency,loot,exchangeCurrency);

        //: Then
        Assert.assertEquals("81.43 Singapore Dollars should return 57.51 Francs", expectedExchangeValue,actualExchangeValue,0.001);

    }
                                // Convert Swiss Franc to Malaysian Ringgit
    @Test
    public void testConverterFrancToRinggit(){
        //:Given
        String currentCurrency = "franc";
        double loot = 850;
        String exchangeCurrency = "ringgit";
        double expectedExchangeValue = 3761.86;
        //: When
        double actualExchangeValue = currencyConverter.converter(currentCurrency,loot,exchangeCurrency);

        //: Then
        Assert.assertEquals("850 Francs should return 3761.86 Ringgits", expectedExchangeValue,actualExchangeValue,0.001);

    }
                            // Convert Malaysian Ringgit to Japanese Yen
    @Test
    public void testConverterRinggittToYen(){
        //:Given
        String currentCurrency = "ringgit";
        double loot = 78.22;
        String exchangeCurrency = "yen";
        double expectedExchangeValue = 2027.20;
        //: When
        double actualExchangeValue = currencyConverter.converter(currentCurrency,loot,exchangeCurrency);

        //: Then
        Assert.assertEquals("78.22 Ringgits should return 2027.20 Yen", expectedExchangeValue,actualExchangeValue,0.001);

    }
                            // Convert Japanese Yen to Chinese Yuan Renminbi
    @Test
    public void testConverterYenToRenminbi(){
        //:Given
        String currentCurrency = "yen";
        double loot = 155.13;
        String exchangeCurrency = "renminbi";
        double expectedExchangeValue = 9.27;
        //: When
        double actualExchangeValue = currencyConverter.converter(currentCurrency,loot,exchangeCurrency);

        //: Then
        Assert.assertEquals("155.13 Yen should return 9.27 Renminbi", expectedExchangeValue,actualExchangeValue,0.001);

    }















}
