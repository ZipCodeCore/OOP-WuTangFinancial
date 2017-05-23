package com.markbrown.wutangfinancial;

import org.junit.Assert;
import org.junit.Test;

public class MoneyTest {

    @Test
    public void testSetAndGetCurrentMoneyAmount() {
        long expectedOutcome = 100000;
        Input.convertMoneyToLongType("1000");
        Money.setMoneyInOneHundredths(Input.convertMoneyToLongType("1000"));
        //Then:
        Assert.assertTrue(Money.getMoneyInOneHundredths() == expectedOutcome);
    }
}
