import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class WuTangConverterTest {

    WuTangConverter wuTangConverter;
    @Before
    public void setup(){ wuTangConverter = new WuTangConverter();}
    @Test
    public void converterTestDollarToEuro(){
        double expected = 1;
        double actual = wuTangConverter.converter("Us Dollar", "Euro", 1);
        assertEquals(expected, actual);

    }
    @Test
    public void converterTestEuroToDollar(){
        double expected = 1;
        double actual = wuTangConverter.converter("Euro", "Us Dollar", 1);
        assertEquals(expected, actual);

    }
    @Test
    public void converterTestEuroToBritishPound(){
        double expected = 1;
        double actual = wuTangConverter.converter("Euro", "British Pound", 1);
        assertEquals(expected, actual);

    }
    @Test
    public void converterTestBritishPoundToIndianRupee(){
        double expected = 1;
        double actual = wuTangConverter.converter("British Pound", "Indian Rupee", 1);
        assertEquals(expected, actual);

    }
    @Test
    public void converterTestRupeeToCanadianDollar(){
        double expected = 1;
        double actual = wuTangConverter.converter("Indian Rupee", "Canadian Dollar", 1);
        assertEquals(expected, actual);

    }
    @Test
    public void converterTestCanadianDollarToSingaporeDollar(){
        double expected = 1;
        double actual = wuTangConverter.converter("Canadian Dollar", "Singapore Dollar", 1);
        assertEquals(expected, actual);

    }
    @Test
    public void converterTestDollarToSwissFranc(){
        double expected = 1;
        double actual = wuTangConverter.converter("Dollar", "Swiss Franc", 1);
        assertEquals(expected, actual);

    }
    @Test
    public void converterTestSwissFrancToMalaysianRinggit(){
        double expected = 1;
        double actual = wuTangConverter.converter("Swiss Franc", "Malaysian Ringgit", 1);
        assertEquals(expected, actual);

    }
    @Test
    public void converterTestMalaysianRinggitToJapaneseYen(){
        double expected = 1;
        double actual = wuTangConverter.converter("Euro", "Us Dollar", 1);
        assertEquals(expected, actual);

    }
    @Test
    public void converterTestJapaneseYenToChineseYuan(){
        double expected = 1;
        double actual = wuTangConverter.converter("Euro", "Us Dollar", 1);
        assertEquals(expected, actual);

    }




}
