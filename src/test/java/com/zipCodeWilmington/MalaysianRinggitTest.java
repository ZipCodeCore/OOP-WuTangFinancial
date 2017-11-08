package com.zipCodeWilmington;

import org.junit.Assert;
import org.junit.Test;

public class MalaysianRinggitTest {

    MalaysianRinggit malaysianRinggit = new MalaysianRinggit();

    @Test
    public void MalaysianRinggittoJapaneseYenTest(){

        double expected = 0.39;
        double actual = malaysianRinggit.MalaysianRinggittoJapaneseYen(10);

        Assert.assertEquals(expected, actual, 0);
    }

}
