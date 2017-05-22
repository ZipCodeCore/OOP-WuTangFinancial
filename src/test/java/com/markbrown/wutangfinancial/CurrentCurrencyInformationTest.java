package com.markbrown.wutangfinancial;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;

public class CurrentCurrencyInformationTest {

    @Test
    public void testSetAndGetCurrentCurrencyType() {
        //Given:
        InputSetup inputSetup = Mockito.mock(InputSetup.class);
        //When:
        Mockito.when(inputSetup.askForInput("Please enter an initial currency type from the menu")).thenReturn("US Dollars");
        CurrentCurrencyInformation.setCurrentCurrencyType("US Dollars");
        //Then:
        Assert.assertTrue(Input.askForInitialCurrencyType(inputSetup).equals(CurrentCurrencyInformation.getCurrentCurrencyType()));
    }


}
