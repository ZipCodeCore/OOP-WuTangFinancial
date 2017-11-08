import io.zipcoder.wutangfinancial.currency.MalaysianRinggit;
import io.zipcoder.wutangfinancial.currency.SwissFranc;

public class TestSwissFrancToMalaysianRinggit extends TestZCWCurrency {

    public TestSwissFrancToMalaysianRinggit(){
        super(new SwissFranc(100.00), new MalaysianRinggit(100.00));
    }
}
