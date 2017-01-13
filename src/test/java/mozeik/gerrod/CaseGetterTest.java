package mozeik.gerrod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class CaseGetterTest {

    @Test

    public void caseIdentifierSwitchTestA() {
        CaseGetter caseGetter = new CaseGetter();
        Double expected = 0.94;
        caseGetter.convertCaseIDToRelativeExchangeRate('a');
        Double actual = caseGetter.relativeExchangeRate;
        assertEquals("I expect this conversion rate to be 0.94", actual, expected);
    }

    @Test

    public void caseIdentifierSwitchTestB() {
        CaseGetter caseGetter = new CaseGetter();
        Double expected = 1.063829787234043;
        caseGetter.convertCaseIDToRelativeExchangeRate('b');
        Double actual = caseGetter.relativeExchangeRate;
        assertEquals("I expect this conversion rate to be 1.063829787234043", actual, expected);
    }

    @Test

    public void caseIdentifierSwitchTestC() {
        CaseGetter caseGetter = new CaseGetter();
        Double expected = 0.872340425531915;
        caseGetter.convertCaseIDToRelativeExchangeRate('c');
        Double actual = caseGetter.relativeExchangeRate;
        assertEquals("I expect this conversion rate to be 0.872340425531915", actual, expected);
    }

    @Test

    public void caseIdentifierSwitchTestD() {
        CaseGetter caseGetter = new CaseGetter();
        Double expected = 83.317073170731707;
        caseGetter.convertCaseIDToRelativeExchangeRate('d');
        Double actual = caseGetter.relativeExchangeRate;
        assertEquals("I expect this conversion rate to be 83.317073170731707", actual, expected);
    }


    @Test

    public void caseIdentifierSwitchTestE() {
        CaseGetter caseGetter = new CaseGetter();
        Double expected = 0.019320843091335;
        caseGetter.convertCaseIDToRelativeExchangeRate('e');
        Double actual = caseGetter.relativeExchangeRate;
        assertEquals("I expect this conversion rate to be 0.019320843091335", actual, expected);
    }

    @Test

    public void caseIdentifierSwitchTestF() {
        CaseGetter caseGetter = new CaseGetter();
        Double expected = 1.083333333333333;
        caseGetter.convertCaseIDToRelativeExchangeRate('f');
        Double actual = caseGetter.relativeExchangeRate;
        assertEquals("I expect this conversion rate to be 1.083333333333333", actual, expected);
    }

    @Test

    public void caseIdentifierSwitchTestG() {
        CaseGetter caseGetter = new CaseGetter();
        Double expected = 0.706293706293706;
        caseGetter.convertCaseIDToRelativeExchangeRate('g');
        Double actual = caseGetter.relativeExchangeRate;
        assertEquals("I expect this conversion rate to be 0.706293706293706", actual, expected);
    }

    @Test

    public void caseIdentifierSwitchTestH() {
        CaseGetter caseGetter = new CaseGetter();
        Double expected = 4.425742574257426;
        caseGetter.convertCaseIDToRelativeExchangeRate('h');
        Double actual = caseGetter.relativeExchangeRate;
        assertEquals("I expect this conversion rate to be 4.425742574257426", actual, expected);
    }

    @Test

    public void caseIdentifierSwitchTestI() {
        CaseGetter caseGetter = new CaseGetter();
        Double expected = 0.03858770718232;
        caseGetter.convertCaseIDToRelativeExchangeRate('i');
        Double actual = caseGetter.relativeExchangeRate;
        assertEquals("I expect this conversion rate to be 0.03858770718232", actual, expected);
    }

    @Test

    public void caseIdentifierSwitchTestJ() {
        CaseGetter caseGetter = new CaseGetter();
        Double expected = 0.059737569060773;
        caseGetter.convertCaseIDToRelativeExchangeRate('j');
        Double actual = caseGetter.relativeExchangeRate;
        assertEquals("I expect this conversion rate to be 0.059737569060773", actual, expected);
    }

    @Test

    public void caseIdentifierSwitchTestK() {
        CaseGetter caseGetter = new CaseGetter();
        Double expected = -1.0;
        caseGetter.convertCaseIDToRelativeExchangeRate('k');
        Double actual = caseGetter.relativeExchangeRate;
        assertEquals("I expect this conversion rate to be -1.0", actual, expected);
    }

}