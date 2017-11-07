import io.zipcoder.wutangfinancial.currency.CanadianDollar;
import io.zipcoder.wutangfinancial.currency.IndianRupee;

public class TestIndianRupeeToCanadianDollar extends TestCurrency{

    public TestIndianRupeeToCanadianDollar(){
        super(new IndianRupee(100.00), new CanadianDollar(100.00));
    }

}
