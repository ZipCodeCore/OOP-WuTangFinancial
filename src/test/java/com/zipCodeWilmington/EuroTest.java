package com.zipCodeWilmington;

import org.junit.Assert;
import org.junit.Test;

public class EuroTest {

    Euro euro = new Euro();

    @Test
    public void euroToBritishPoundTest(){

        double expected = 10.49;
        double actual = euro.euroToBritishPound(10);

        Assert.assertEquals(expected, actual, 0);
    }


}
