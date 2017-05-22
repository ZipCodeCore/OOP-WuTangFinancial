/**
 * Created by eugenevendensky on 2/16/17.
 */
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class ConverterTest {
        con converter;

        @Before
        public void setUp(){converter = new con();}

    @Test
    public void converterTest(){
        double actual = converter.converter(CurrencyRateCollection.usDollar, CurrencyRateCollection.usDollar, 100);
        double expected = 100;
        assertEquals("I expect the conversion to be 100", expected, actual);

    }

    @Test
    public void converterTestDollarToEuro(){
        double actual = converter.converter(CurrencyRateCollection.usDollar, CurrencyRateCollection.euro, 100);
        double expected = 94.0;
        assertEquals("I expect the conversion to be 100", expected, actual);

    }


    @Test
    public void converterTestBritishPoundToIndianRupee(){
        double actual = converter.converter(CurrencyRateCollection.britishPound, CurrencyRateCollection.indianRupee, 100);
        double expected = 8331.71;
        assertEquals("I expect the conversion to be 100", expected, actual);

    }
    @Test
    public void converterTestRupeeToCanadianDollar(){
        double actual = converter.converter(CurrencyRateCollection.indianRupee, CurrencyRateCollection.canadianDollar, 100);
        double expected = 1.94;
        assertEquals("I expect the conversion to be 100", expected, actual);

    }
    @Test
    public void converterTestCanadianDollarToSingaporeDollar(){
        double actual = converter.converter(CurrencyRateCollection.canadianDollar, CurrencyRateCollection.singaporeDollar, 100);
        double expected = 108.34;
        assertEquals("I expect the conversion to be 100", expected, actual);

    }
    @Test
    public void converterTestSingaporeDollarToSwissFranc(){
        double actual = converter.converter(CurrencyRateCollection.singaporeDollar, CurrencyRateCollection.swissFrance, 100);
        double expected = 70.63;
        assertEquals("I expect the conversion to be 100", expected, actual);

    }
    @Test
    public void converterTestSwissFrancToMalaysianRinggit(){
        double actual = converter.converter(CurrencyRateCollection.swissFrance, CurrencyRateCollection.malaysianRinggit, 100);
        double expected = 442.58;
        assertEquals("I expect the conversion to be 100", expected, actual);

    }
    @Test
    public void converterTestMalaysianRinggitToJapaneseYen(){
        double actual = converter.converter(CurrencyRateCollection.malaysianRinggit, CurrencyRateCollection.japaneseYen, 100);
        double expected = 2591.5;
        assertEquals("I expect the conversion to be 100", expected, actual);

    }

    @Test
    public void converterTestJapaneseYenToChineseYuanRenminbi(){
        double actual = converter.converter(CurrencyRateCollection.japaneseYen, CurrencyRateCollection.chineseYuanRenminbi, 100);
        double expected = 5.98;
        assertEquals("I expect the conversion to be 100", expected, actual);

    }






}
