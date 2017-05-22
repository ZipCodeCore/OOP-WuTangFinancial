package com.markbrown.wutangfinancial;

import org.junit.Assert;
import org.junit.Test;

import java.io.InvalidObjectException;

public class InputCheckerTest {

    @Test
    public void testCheckForValidCurrencyInput() {
        boolean expectedResult = InputChecker.checkForValidCurrency("US_Dollars");
        Assert.assertTrue(expectedResult);
    }

    @Test
    public void testCheckForInvalidCurrencyInput() {
        boolean expectedResult = InputChecker.checkForValidCurrency("FakeMoney");
        Assert.assertTrue(!expectedResult);
    }

    @Test
    public void testCheckForValidMoneyInput() {
        boolean expectedResult = InputChecker.checkForValidMoneyInput("1000.00");
        Assert.assertTrue(expectedResult);
    }

    @Test
    public void testCheckForInvalidMoneyInput() {
        boolean expectedResult = InputChecker.checkForValidMoneyInput("Money");
        Assert.assertTrue(!expectedResult);
    }
}
