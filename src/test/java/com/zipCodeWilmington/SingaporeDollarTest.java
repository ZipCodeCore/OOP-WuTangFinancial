package com.zipCodeWilmington;

import org.junit.Assert;
import org.junit.Test;

public class SingaporeDollarTest {

    SingaporeDollar singaporeDollar = new SingaporeDollar();

    @Test
    public void euroToBritishPoundTest(){

        double expected = 14.16;
        double actual = singaporeDollar.singaporeDollartoSwissFranc(10);

        Assert.assertEquals(expected, actual, 0);
    }
}
