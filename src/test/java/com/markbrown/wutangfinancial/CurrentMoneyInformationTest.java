package com.markbrown.wutangfinancial;

import org.junit.Assert;
import org.junit.Test;

public class CurrentMoneyInformationTest {

    @Test
    public void testSetAndGetCurrentMoneyAmount() {
        long expectedOutcome = 100000;
        Input.convertMoneyToLongType("1000");
        CurrentMoneyInformation.setMoneyInOneHundredths(Input.convertMoneyToLongType("1000"));
        //Then:
        Assert.assertTrue(CurrentMoneyInformation.getMoneyInOneHundredths() == expectedOutcome);
    }
}
