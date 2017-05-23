package com.markbrown.wutangfinancial;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;

public class CurrencyTest {

    @Test
    public void testSetAndGetCurrentCurrencyType() {
        //Given:
        InputSetup inputSetup = Mockito.mock(InputSetup.class);
        //When:
        Mockito.when(inputSetup.askForInput("Please enter an initial currency type from the menu")).thenReturn("US_Dollars");
        Currency.setCurrentCurrencyType("US_Dollars");
        //Then:
        Assert.assertTrue(Input.askForInitialCurrencyType(inputSetup).equals(Currency.getCurrentCurrencyType()));
    }

    @Test
    public void testSetAndGetTargetCurrencyType() {
        //Given:
        InputSetup inputSetup = Mockito.mock(InputSetup.class);
        //When:
        Mockito.when(inputSetup.askForInput("Please enter a target currency type from the menu")).thenReturn("Euro");
        Currency.setTargetCurrencyType("Euro");
        //Then:
        Assert.assertTrue(Input.askForCurrencyTargetType(inputSetup).equals(Currency.getTargetCurrencyType()));
    }


}
