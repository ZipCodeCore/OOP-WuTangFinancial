import io.zipcoder.wutangfinancial.currency.EuroCurrency;
import io.zipcoder.wutangfinancial.currency.UsDollar;

public class TestUsToEuro extends TestCurrency {

    public TestUsToEuro(){
        super(new UsDollar(100.00), new EuroCurrency(100.00));
    }
}