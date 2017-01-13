package mattern.william;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/12/17.
 */
public class WuTangFinancialTest {

    @Test
    public void caseIdentifierSwitchTestA(){
        WuTangFinancial w = new WuTangFinancial();
        Double expected = .94;
        w.convertCaseIdToRelativeExchangeRate('a');
        Double actual = w.relativeExchangeRate;
        assertEquals("We expect the conversion rate to be 1.0", actual,expected);
    }

    @Test
    public void caseIdentifierSwitchTestB(){
        WuTangFinancial w = new WuTangFinancial();
        Double expected = 1.063829787234043;
        w.convertCaseIdToRelativeExchangeRate('b');
        Double actual = w.relativeExchangeRate;
        assertEquals("We expect the conversion rate to be 1.063829787234043", actual,expected);
    }

    @Test
    public void caseIdentifierSwitchTestC(){
        WuTangFinancial w = new WuTangFinancial();
        Double expected = 0.872340425531915;
        w.convertCaseIdToRelativeExchangeRate('c');
        Double actual = w.relativeExchangeRate;
        assertEquals("We expect the conversion rate to be 0.872340425531915", actual,expected);
    }

    @Test
    public void caseIdentifierSwitchTestD(){
        WuTangFinancial w = new WuTangFinancial();
        Double expected = 83.317073170731707;
        w.convertCaseIdToRelativeExchangeRate('d');
        Double actual = w.relativeExchangeRate;
        assertEquals("We expect the conversion rate to be 83.317073170731707", actual,expected);
    }

    @Test
    public void caseIdentifierSwitchTestE(){
        WuTangFinancial w = new WuTangFinancial();
        Double expected = 0.019320843091335;
        w.convertCaseIdToRelativeExchangeRate('e');
        Double actual = w.relativeExchangeRate;
        assertEquals("We expect the conversion rate to be 0.019320843091335", actual,expected);
    }

    @Test
    public void caseIdentifierSwitchTestF(){
        WuTangFinancial w = new WuTangFinancial();
        Double expected = 1.083333333333333;
        w.convertCaseIdToRelativeExchangeRate('f');
        Double actual = w.relativeExchangeRate;
        assertEquals("We expect the conversion rate to be 1.083333333333333", actual,expected);
    }

    @Test
    public void caseIdentifierSwitchTestG(){
        WuTangFinancial w = new WuTangFinancial();
        Double expected = 0.706293706293706;
        w.convertCaseIdToRelativeExchangeRate('g');
        Double actual = w.relativeExchangeRate;
        assertEquals("We expect the conversion rate to be 0.706293706293706", actual,expected);
    }

    @Test
    public void caseIdentifierSwitchTestH(){
        WuTangFinancial w = new WuTangFinancial();
        Double expected = 4.425742574257426;
        w.convertCaseIdToRelativeExchangeRate('h');
        Double actual = w.relativeExchangeRate;
        assertEquals("We expect the conversion rate to be 4.425742574257426", actual,expected);
    }

@Test
    public void caseIdentifierSwitchTestI(){
        WuTangFinancial w = new WuTangFinancial();
        Double expected = 0.03858770718232;
        w.convertCaseIdToRelativeExchangeRate('i');
        Double actual = w.relativeExchangeRate;
        assertEquals("We expect the conversion rate to be 0.03858770718232", actual,expected);
    }

    @Test
    public void caseIdentifierSwitchTestJ(){
        WuTangFinancial w = new WuTangFinancial();
        Double expected = 0.059737569060773;
        w.convertCaseIdToRelativeExchangeRate('j');
        Double actual = w.relativeExchangeRate;
        assertEquals("We expect the conversion rate to be 0.059737569060773", actual,expected);
    }
    @Test
    public void caseIdentifierSwitchTestK(){
        WuTangFinancial w = new WuTangFinancial();
        Double expected = -1.0;
        w.convertCaseIdToRelativeExchangeRate('k');
        Double actual = w.relativeExchangeRate;
        assertEquals("We expect the conversion rate to be -1.0", actual,expected);
    }

    @Test
    public void callCurrencyConverterTest(){
        WuTangFinancial w = new WuTangFinancial();
        Double expected = 940.00;
        Double actual = w.callCurrencyConverter(0.94,1000.00);
        assertEquals(expected,actual);
    }

    @Test
    public void runTest(){
        WuTangFinancial w = new WuTangFinancial();
        Double actual = w.run('a',1000.00);
        Double expected = 940.00;
        assertEquals("We expect the run test to return 940.00",actual, expected);

    }

    @Test
    public void runTest2(){
        WuTangFinancial w = new WuTangFinancial();
        Double actual = w.run('b',10000.00);
        Double expected = 10638.30;
        assertEquals("We expect 10000 EUR to convert to 10638.30 USD", actual, expected);
    }



}