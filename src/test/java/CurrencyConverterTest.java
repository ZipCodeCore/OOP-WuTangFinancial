import org.junit.Assert;
import org.junit.Test;

public class CurrencyConverterTest {

    @Test
    public void convert_DollarToEuro() {
        // Arrange
        double initialValue = 1;
        double expectedValue = .94;
        String startingCurrency = "USD";
        String endingCurrency = "EUR";

        // Act
        CurrencyConverter currencyConverter = new CurrencyConverter();
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);

        // Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
    }

    @Test
    public void convert_EuroToDollar() {
        // Arrange
        double initialValue = .94;
        double expectedValue = 1;
        String startingCurrency = "EUR";
        String endingCurrency = "USD";

        // Act
        CurrencyConverter currencyConverter = new CurrencyConverter();
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);

        // Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
    }
    @Test
    public void convert_EuroToGBP() {
        // Arrange
        double initialValue = .94;
        double expectedValue = .82;
        String startingCurrency = "EUR";
        String endingCurrency = "GBP";

        // Act
        CurrencyConverter currencyConverter = new CurrencyConverter();
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);

        // Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
    }

    @Test
    public void convert_GBPToRUPEE() {
        // Arrange
        double initialValue = .82;
        double expectedValue = 68.32;
        String startingCurrency = "GBP";
        String endingCurrency = "RUPEE";

        // Act
        CurrencyConverter currencyConverter = new CurrencyConverter();
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);

        // Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
    }

    @Test
    public void convert_RUPEEToCAD() {
        // Arrange
        double initialValue = 68.32;
        double expectedValue = 1.32;
        String startingCurrency = "RUPEE";
        String endingCurrency = "CAD";

        // Act
        CurrencyConverter currencyConverter = new CurrencyConverter();
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);

        // Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
    }

    @Test
    public void convert_CADToSGD() {
        // Arrange
        double initialValue = 1.32;
        double expectedValue = 1.43;
        String startingCurrency = "CAD";
        String endingCurrency = "SGD";

        // Act
        CurrencyConverter currencyConverter = new CurrencyConverter();
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);

        // Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
    }

    @Test
    public void convert_SGDToFRANC() {
        // Arrange
        double initialValue = 1.43;
        double expectedValue = 1.01;
        String startingCurrency = "SGD";
        String endingCurrency = "FRANC";

        // Act
        CurrencyConverter currencyConverter = new CurrencyConverter();
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);

        // Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
    }

    @Test
    public void convert_FRANCToRINGGIT() {
        // Arrange
        double initialValue = 1.01;
        double expectedValue = 4.47;
        String startingCurrency = "FRANC";
        String endingCurrency = "RINGGIT";

        // Act
        CurrencyConverter currencyConverter = new CurrencyConverter();
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);

        // Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
    }

    @Test
    public void convert_RINGGIToYEN() {
        // Arrange
        double initialValue = 4.47;
        double expectedValue = 115.84;
        String startingCurrency = "RINGGIT";
        String endingCurrency = "YEN";

        // Act
        CurrencyConverter currencyConverter = new CurrencyConverter();
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);

        // Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
    }

    @Test
    public void convert_YENToYUAN() {
        // Arrange
        double initialValue = 115.84;
        double expectedValue = 6.92;
        String startingCurrency = "YEN";
        String endingCurrency = "YUAN";

        // Act
        CurrencyConverter currencyConverter = new CurrencyConverter();
        double actual = currencyConverter.convert(initialValue, startingCurrency, endingCurrency);

        // Assert
        Assert.assertEquals(expectedValue, actual, .000000001);
    }


}
