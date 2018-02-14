
import org.junit.Assert;
import org.junit.Test;


public class CurrencyExchangeTest {

    @Test
    public void testCurrencyRateConversion() {
        //Given:
        //public Double currencyRateConversion(Double firstRate, Double secondRate, Double money)
        Double firstRate = CurrencyExchange.BRITISH_POUND;
        Double secondRate = CurrencyExchange.AUSTRALIAN_DOLLAR;
        Double money = (double)100000;
        Double expectedAmount = 100000*(Math.round((1 / firstRate)*secondRate)*100d)/100d;

        Double expected = currencyRateConversion(firstRate, secondRate, money);

    }
}
