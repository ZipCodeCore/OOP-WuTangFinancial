package com.zipCodeWilmington;

import org.junit.Assert;
import org.junit.Test;

public class CanadianDollarTest {

    CanadianDollar canadianDollar = new CanadianDollar();

    @Test
    public void canadianDollarToSingaporeDollarTest(){

        double expected = 9.23;
        double actual = canadianDollar.canadianDollarToSingaporeDollar(10);

        Assert.assertEquals(expected, actual, 0);
    }

}
