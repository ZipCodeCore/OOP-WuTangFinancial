import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;

public class WuTangFinancialTest {

    public WuTangFinancial test = new WuTangFinancial();

    @Before
    public void setUp() {

    }

@Test
  public void testCurrencyConverter() {
    String expected = "470.00";
    String actual = test.currencyConverter("USD","Euro",500.00);

    Assert.assertEquals(expected,actual);
}




}