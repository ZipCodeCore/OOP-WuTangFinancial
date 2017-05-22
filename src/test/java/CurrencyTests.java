import org.junit.Test;

/**
 * Created by cameronsima on 5/22/17.
 */
public class CurrencyTests {

    @Test
    public void testCurrency() {
        System.out.println(Currency.AUSTRALIAN_DOLLAR.toUSD(500));
    }
}
