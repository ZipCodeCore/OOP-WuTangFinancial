package com.markbrown.wutangfinancial;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;

public class CurrentMoneyInformationTest {

    @Test
    public void testSetAndGetCurrentMoneyAmount() {
        //Given:
        InputSetup inputSetup = Mockito.mock(InputSetup.class);
        //When:
        Mockito.when(inputSetup.askForInput("Please enter the amount in currency units. Only first two decimals are accepted.")).thenReturn("1000");
        CurrentMoneyInformation.setMoneyInOneHundredths(100000);
        //Then:
        Assert.assertTrue(Input.askForMonetaryAmount(inputSetup) == (CurrentMoneyInformation.getMoneyInOneHundredths()));
    }
}
