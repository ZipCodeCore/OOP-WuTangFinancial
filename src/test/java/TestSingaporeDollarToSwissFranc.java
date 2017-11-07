import io.zipcoder.wutangfinancial.currency.SingaporeDollar;
import io.zipcoder.wutangfinancial.currency.SwissFranc;

public class TestSingaporeDollarToSwissFranc extends TestCurrency{

    public TestSingaporeDollarToSwissFranc(){
        super(new SingaporeDollar(100.00), new SwissFranc(100.00));
    }

}
