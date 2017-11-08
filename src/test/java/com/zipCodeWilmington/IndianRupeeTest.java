package com.zipCodeWilmington;

import org.junit.Assert;
import org.junit.Test;

public class IndianRupeeTest {

    IndianRupee britishPound = new IndianRupee();

    @Test
    public void rupeeToCanadianDollarTest(){

        double expected  = 517.58;
        double actual = britishPound.rupeeToCanadianDollar(10);
        Assert.assertEquals(expected, actual, 0);
    }
}
