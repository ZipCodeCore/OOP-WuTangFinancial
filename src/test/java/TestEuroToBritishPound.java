import io.zipcoder.wutangfinancial.currency.BritishPound;
import io.zipcoder.wutangfinancial.currency.EuroZCWCurrency;

public class TestEuroToBritishPound extends TestZCWCurrency {

    public TestEuroToBritishPound(){
        super(new EuroZCWCurrency(100.00), new BritishPound(100.00));
    }
}
