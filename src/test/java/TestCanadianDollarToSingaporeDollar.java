import io.zipcoder.wutangfinancial.currency.CanadianDollar;
import io.zipcoder.wutangfinancial.currency.SingaporeDollar;

public class TestCanadianDollarToSingaporeDollar extends TestZCWCurrency {

    public TestCanadianDollarToSingaporeDollar(){
        super(new CanadianDollar(100.00), new SingaporeDollar(100.00));
    }

}
