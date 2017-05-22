package com.markbrown.wutangfinancial;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

public class InputTest {

    @Test
    public void testAskForInitialCurrencyType() {
        //Given:
        InputSetup inputSetup = Mockito.mock(InputSetup.class);
        //When:
        Mockito.when(inputSetup.askForInput("Please enter an initial currency type from the menu")).thenReturn("US_Dollars");
        //Then:
        Assert.assertTrue(Input.askForInitialCurrencyType(inputSetup).equals("US_Dollars"));
    }

    @Test
    public void testAskForCurrencyTargetType() {
        //Given:
        InputSetup inputSetup = Mockito.mock(InputSetup.class);
        //When:
        Mockito.when(inputSetup.askForInput("Please enter a target currency type from the menu")).thenReturn("Euro");
        //Then:
        Assert.assertTrue(Input.askForCurrencyTargetType(inputSetup).equals("Euro"));
    }

    @Test
    public void testAskForMonetaryAmount() {
        //Given:
        InputSetup inputSetup = Mockito.mock(InputSetup.class);
        //When:
        Mockito.when(inputSetup.askForInput("Please enter the amount in currency units. Only first two decimals are accepted.")).thenReturn("100.00");
        //Then:
        Assert.assertTrue(Input.askForMonetaryAmount(inputSetup) == 10000);
    }

    @Test
    public void testAskForExit() {
        //Given:
        InputSetup inputSetup = Mockito.mock(InputSetup.class);
        //When:
        Mockito.when(inputSetup.askForInput("Would you like to exit? Type exit. To stay hit return.")).thenReturn("Exit");
        //Then:
        Assert.assertTrue(Input.askForExit(inputSetup).equals("Exit"));
    }
}
