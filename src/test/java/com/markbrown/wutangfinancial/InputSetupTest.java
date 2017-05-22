package com.markbrown.wutangfinancial;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class InputSetupTest {

    @Test
    public void testAskForInput() {
        //Given:
        InputSetup inputSetup = Mockito.mock(InputSetup.class);
        //When:
        Mockito.when(inputSetup.askForInput("Test Input")).thenReturn("This is a mock");
        //Then:
        Assert.assertTrue(inputSetup.askForInput("Test Input").equals("This is a mock"));
    }


}
