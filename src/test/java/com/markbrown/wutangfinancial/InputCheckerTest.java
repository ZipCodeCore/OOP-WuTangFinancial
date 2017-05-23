package com.markbrown.wutangfinancial;

import org.junit.Assert;
import org.junit.Test;

import java.io.InvalidObjectException;

public class InputCheckerTest {

    @Test
    public void testCheckForValidCurrencyInput() {
        boolean expectedResult = InputChecker.checkForValidCurrency("US_Dollar");
        Assert.assertTrue(expectedResult);
    }

    @Test
    public void testCheckForInvalidCurrencyInput() {
        boolean expectedResult = InputChecker.checkForValidCurrency("FakeMoney");
        Assert.assertTrue(!expectedResult);
    }

    @Test
    public void testCheckForValidMoneyInput() {
        boolean result = InputChecker.checkForValidMoneyInput("1000.00");
        Assert.assertTrue(result);
    }

    @Test
    public void testCheckForInvalidMoneyInput() {
        boolean expectedResult = InputChecker.checkForValidMoneyInput("Money");
        Assert.assertTrue(!expectedResult);
    }

    @Test
    public void testCheckForInvalidNegativeMoneyInput() {
        boolean expectedResult = InputChecker.checkForValidMoneyInput("-10");
        Assert.assertTrue(!expectedResult);
    }
}
