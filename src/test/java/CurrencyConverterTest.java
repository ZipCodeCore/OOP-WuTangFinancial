import org.junit.Assert;
import org.junit.Test;

public class CurrencyConverterTest {

    @Test
    public void convertDollartoEuro() {
        //Arrange
        double initialValue = 1; //starting currency
        double expectedValue = .94; //what you want your currency to exchange
        String startingCurrency = "USD";
        String endingCurrency = "EUR";

        //Act - what we are actually doing
        CurrencyConverter currencyConverter = new CurrencyConverter(); //new object to test method
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);
        //call on our method 'convert; with values to test

        //Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
        //delta means how long we want our decimal to go!!

    }
    @Test
    public void convertEurotoDollar() {
        //Arrange
        double initialValue = .94; //starting currency
        double expectedValue = 1; //what you want your currency to exchange
        String startingCurrency = "EUR";
        String endingCurrency = "USD";

        //Act
        CurrencyConverter currencyConverter = new CurrencyConverter(); //new object to test method
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);
        //call on our method 'convert; with values to test

        //Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
        //delta means how long we want our decimal to go

    }
    @Test
    public void convertEurotoPound() {
        //Arrange
        double initialValue = .94; //starting currency
        double expectedValue = .82; //what you want your currency to exchange
        String startingCurrency = "EUR";
        String endingCurrency = "GBP";

        //Act
        CurrencyConverter currencyConverter = new CurrencyConverter(); //new object to test method
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);
        //call on our method 'convert; with values to test

        //Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
        //delta means how long we want our decimal to go

    }
    @Test
    public void convertPoundtoRupee() {
        //Arrange
        double initialValue = .82; //starting currency
        double expectedValue = 68.32; //what you want your currency to exchange
        String startingCurrency = "GBP";
        String endingCurrency = "RUPEE";

        //Act
        CurrencyConverter currencyConverter = new CurrencyConverter(); //new object to test method
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);
        //call on our method 'convert; with values to test

        //Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
        //delta means how long we want our decimal to go

    }
    @Test
    public void convertRupeetoAUD() {
        //Arrange
        double initialValue = 68.32; //starting currency
        double expectedValue = 1.35; //what you want your currency to exchange
        String startingCurrency = "RUPEE";
        String endingCurrency = "AUD";

        //Act
        CurrencyConverter currencyConverter = new CurrencyConverter(); //new object to test method
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);
        //call on our method 'convert; with values to test

        //Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
        //delta means how long we want our decimal to go

    }
    @Test
    public void convertAUDtoCAD() {
        //Arrange
        double initialValue = 1.35; //starting currency
        double expectedValue = 1.32; //what you want your currency to exchange
        String startingCurrency = "AUD";
        String endingCurrency = "CAD";

        //Act
        CurrencyConverter currencyConverter = new CurrencyConverter(); //new object to test method
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);
        //call on our method 'convert; with values to test

        //Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
        //delta means how long we want our decimal to go

    }
    @Test
    public void convertCADtoSGD() {
        //Arrange
        double initialValue = 1.32; //starting currency
        double expectedValue = 1.43; //what you want your currency to exchange
        String startingCurrency = "CAD";
        String endingCurrency = "SGD";

        //Act
        CurrencyConverter currencyConverter = new CurrencyConverter(); //new object to test method
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);
        //call on our method 'convert; with values to test

        //Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
        //delta means how long we want our decimal to go

    }
    @Test
    public void convertSGDtoFranc() {
        //Arrange
        double initialValue = 1.43; //starting currency
        double expectedValue = 1.01; //what you want your currency to exchange
        String startingCurrency = "SGD";
        String endingCurrency = "FRANC";

        //Act
        CurrencyConverter currencyConverter = new CurrencyConverter(); //new object to test method
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);
        //call on our method 'convert; with values to test

        //Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
        //delta means how long we want our decimal to go

    }
    @Test
    public void convertFranctoRinggit() {
        //Arrange
        double initialValue = 1.01; //starting currency
        double expectedValue = 4.47; //what you want your currency to exchange
        String startingCurrency = "FRANC";
        String endingCurrency = "RINGGIT";

        //Act
        CurrencyConverter currencyConverter = new CurrencyConverter(); //new object to test method
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);
        //call on our method 'convert; with values to test

        //Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
        //delta means how long we want our decimal to go

    }
    @Test
    public void convertRinggittoYen() {
        //Arrange
        double initialValue = 4.47; //starting currency
        double expectedValue = 115.84; //what you want your currency to exchange
        String startingCurrency = "RINGGIT";
        String endingCurrency = "YEN";

        //Act
        CurrencyConverter currencyConverter = new CurrencyConverter(); //new object to test method
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);
        //call on our method 'convert; with values to test

        //Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
        //delta means how long we want our decimal to go

    }
    @Test
    public void convertYentoYuan() {
        //Arrange
        double initialValue = 115.84; //starting currency
        double expectedValue = 6.92; //what you want your currency to exchange
        String startingCurrency = "YEN";
        String endingCurrency = "YUAN";

        //Act
        CurrencyConverter currencyConverter = new CurrencyConverter(); //new object to test method
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);
        //call on our method 'convert; with values to test

        //Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
        //delta means how long we want our decimal to go

    }

}