import io.zipcoder.wutangfinancial.currency.BritishPound;
import io.zipcoder.wutangfinancial.currency.IndianRupee;

public class TestBritishPoundToIndianRupee extends TestCurrency{

    public TestBritishPoundToIndianRupee(){
        super(new BritishPound(100.00), new IndianRupee(100.00));
    }

}
