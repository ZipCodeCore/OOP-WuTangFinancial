import org.junit.Test;

/**
 * Created by cameronsima on 5/22/17.
 */
public class CurrencyExchangerTests {

    @Test
    public void DollarToEuroTest() {

        int result = CurrencyConverter.convert(Currency.US_DOLLAR, Currency.EURO, 500);
    }
}
