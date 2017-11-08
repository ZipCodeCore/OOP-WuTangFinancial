import io.zipcoder.wutangfinancial.currency.ChineseYuan;
import io.zipcoder.wutangfinancial.currency.JapaneseYen;

public class TestJapaneseYenToChineseYuan extends TestZCWCurrency {

    public TestJapaneseYenToChineseYuan(){
        super(new JapaneseYen(100.00), new ChineseYuan(100.00));
    }
}
