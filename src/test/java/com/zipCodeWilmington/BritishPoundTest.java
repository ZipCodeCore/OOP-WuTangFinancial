package com.zipCodeWilmington;

import com.zipCodeWilmington.BritishPound;
import org.junit.Assert;
import org.junit.Test;

public class BritishPoundTest {

    BritishPound britishPound = new BritishPound();

    @Test
    public void BritishPoundToIndianRupeeTest(){

        double expected  = 560.22;
        double actual = britishPound.britishPoundToIndianRupee(10);
        Assert.assertEquals(expected, actual, 0);
    }
}
