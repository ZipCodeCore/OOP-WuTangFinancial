import io.zipcoder.wutangfinancial.currency.EuroZCWCurrency;
import io.zipcoder.wutangfinancial.currency.UsDollar;

public class TestEuroToUs extends TestZCWCurrency {

    public TestEuroToUs(){
        super(new EuroZCWCurrency(100.00), new UsDollar(100.00));
    }

}
