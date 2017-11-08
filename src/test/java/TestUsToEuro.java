import io.zipcoder.wutangfinancial.currency.EuroZCWCurrency;
import io.zipcoder.wutangfinancial.currency.UsDollar;

public class TestUsToEuro extends TestZCWCurrency {

    public TestUsToEuro(){
        super(new UsDollar(100.00), new EuroZCWCurrency(100.00));
    }
}