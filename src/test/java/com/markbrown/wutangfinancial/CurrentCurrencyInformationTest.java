package com.markbrown.wutangfinancial;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;

import java.io.InvalidObjectException;

public class CurrentCurrencyInformationTest {

    @Test
    public void testSetAndGetCurrentCurrencyType() {
        //Given:
        InputSetup inputSetup = Mockito.mock(InputSetup.class);
        //When:
        Mockito.when(inputSetup.askForInput("Please enter an initial currency type from the menu")).thenReturn("US_Dollars");
        CurrentCurrencyInformation.setCurrentCurrencyType("US_Dollars");
        //Then:
        Assert.assertTrue(Input.askForInitialCurrencyType(inputSetup).equals(CurrentCurrencyInformation.getCurrentCurrencyType()));
    }

    @Test
    public void testSetAndGetTargetCurrencyType() {
        //Given:
        InputSetup inputSetup = Mockito.mock(InputSetup.class);
        //When:
        Mockito.when(inputSetup.askForInput("Please enter a target currency type from the menu")).thenReturn("Euro");
        CurrentCurrencyInformation.setTargetCurrencyType("Euro");
        //Then:
        Assert.assertTrue(Input.askForCurrencyTargetType(inputSetup).equals(CurrentCurrencyInformation.getTargetCurrencyType()));
    }


}
