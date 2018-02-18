import org.junit.Test;
import org.omg.CORBA.CODESET_INCOMPATIBLE;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ConverterTest {

    @Test
    public void convertToDollarTest(){
        //Euro to Dollar
        double expected = 1.06;
        double actual = Converter.convertToDollar(ExchangeRates.Euro);
        assertEquals(expected, actual, 0.5);
        }
//    @Test
//    public void convertFromDollarTest(){
//        double expected = 0.94;
//        double actual = Converter.convertFromDollar(ExchangeRates.Euro);
//        assertEquals(expected, actual);
//    }
    @Test
    public void convertCurrencyTest2(){
        //Dollar to Euro
        double expected = 0.94;
        double actual = Converter.convertCurrency(ExchangeRates.USDollar, ExchangeRates.Euro);
        assertEquals(expected, actual);
        }
    @Test
    public void convertCurrencyTest3(){
        //Euro to BritishPound
        double expected = 0.86;
        double actual = Converter.convertCurrency(ExchangeRates.Euro, ExchangeRates.BritishPound);
        assertEquals(expected, actual, 0.5);
        }
    @Test
    public void convertCurrencyTest4(){
        //British Pound to Indian Rupee
        double expected = 83.32;
        double actual = Converter.convertCurrency(ExchangeRates.BritishPound, ExchangeRates.IndianRupee);
        assertEquals(expected, actual, 0.5);
        }
    @Test
    public void convertCurrencyTest5(){
        //Indian Rupee to Canadian Dollar
        double expected = 0.02;
        double actual = Converter.convertCurrency(ExchangeRates.IndianRupee, ExchangeRates.CanadianDollar);
        assertEquals(expected, actual, 0.5);
        }
        @Test
    public void convertCurrencyTest6(){
        //Canadian Dollar to Singapore Dollar
            double expected = 1.08;
            double actual = Converter.convertCurrency(ExchangeRates.CanadianDollar, ExchangeRates.SingaporeDollar);
            assertEquals(expected,actual, 0.5);
        }
        @Test
    public void convertCurrencyTest7(){
        //Singapore Dollar to Swiss Franc
            double expected = 0.71;
            double actual = Converter.convertCurrency(ExchangeRates.SingaporeDollar, ExchangeRates.SwissFranc);
            assertEquals(expected, actual,0.5);
        }
        @Test
    public void convertCurrencyTest8(){
        //Swiss Franc to Malaysian Ringgit
            double expected= 4.43;
            double actual = Converter.convertCurrency(ExchangeRates.SwissFranc, ExchangeRates.MalaysianRinggit);
            assertEquals(expected, actual,0.5);
        }
        @Test
    public void convertCurrencyTest9(){
        //Malaysian Ringgit to Japanese Yen
            double expected = 25.91;
            double actual = Converter.convertCurrency(ExchangeRates.MalaysianRinggit, ExchangeRates.JapaneseYen);
            assertEquals(expected, actual,0.5);
        }
        @Test
    public void convertCurrencyTest10(){
        //Japanese Yen to Chinese Yuan Renminbi
            double expected = 0.06;
            double actual = Converter.convertCurrency(ExchangeRates.JapaneseYen, ExchangeRates.ChineseYuanRenminbi);
            assertEquals(expected, actual,0.5);
        }





}
