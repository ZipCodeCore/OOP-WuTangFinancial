package io.zipcoder.wutang;

import io.zipcoder.wutang.currencies.*;
import org.junit.Assert;
import org.junit.Test;

import io.zipcoder.wutang.console.*;

public class ConsoleTest {

    Console console = new Console();

    @Test
    public void getCurrOfTypeTest(){
        Currency actual = console.getCurrOfType("USD");

        Assert.assertTrue(actual instanceof USD);
    }
}
