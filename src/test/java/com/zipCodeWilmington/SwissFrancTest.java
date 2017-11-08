package com.zipCodeWilmington;

import org.junit.Assert;
import org.junit.Test;

public class SwissFrancTest {

    SwissFranc swissFranc = new SwissFranc();

    @Test
    public void euroToBritishPoundTest(){

        double expected = 2.26;
        double actual = swissFranc.swissFrancToMalaysianRinggit(10);

        Assert.assertEquals(expected, actual, 0);
    }
}
