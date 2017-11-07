import io.zipcoder.wutangfinancial.currency.BritishPound;
import io.zipcoder.wutangfinancial.currency.EuroCurrency;

public class TestEuroToBritishPound extends TestCurrency{

    public TestEuroToBritishPound(){
        super(new EuroCurrency(100.00), new BritishPound(100.00));
    }
}
