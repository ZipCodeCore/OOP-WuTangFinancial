import io.zipcoder.wutangfinancial.currency.JapaneseYen;
import io.zipcoder.wutangfinancial.currency.MalaysianRinggit;

public class TestMalaysianRinggitToJapaneseYen extends TestCurrency{

    public TestMalaysianRinggitToJapaneseYen(){
        super(new MalaysianRinggit(100.00), new JapaneseYen(100.00));
    }

}
