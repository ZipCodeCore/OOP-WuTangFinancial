import io.zipcoder.wutangfinancial.currency.EuroCurrency;
import io.zipcoder.wutangfinancial.currency.UsDollar;

public class TestEuroToUs extends TestCurrency{

    public TestEuroToUs(){
        super(new EuroCurrency(100.00), new UsDollar(100.00));
    }

}
