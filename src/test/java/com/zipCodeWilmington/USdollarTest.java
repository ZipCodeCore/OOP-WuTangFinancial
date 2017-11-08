package com.zipCodeWilmington;

import org.junit.Assert;
import org.junit.Test;

public class USdollarTest {

    USdollar uSdollar = new USdollar();
    @Test
    public void USdollarAndEuroTest(){

        double expected = 8.6;
        double actual = uSdollar.usDollarAndEuro(10);
        Assert.assertEquals(expected, actual, 0);

    }
}
