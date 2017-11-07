import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyExchangeTest {

    @Test
    public void exchangeMoneyTest(){
        //: Given
        Currency baseType = Currency.Euro;
        Currency returnedType = Currency.AustralianDollar;
        double amountToConvert = 500.00;
        double expected = 718.09;
        CurrencyExchange currencyExchange = new CurrencyExchange();

        //: When
        double actual = currencyExchange.exchangeMoney(baseType, returnedType, amountToConvert);

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

}