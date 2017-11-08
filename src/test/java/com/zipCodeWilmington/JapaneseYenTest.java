package com.zipCodeWilmington;

import org.junit.Assert;
import org.junit.Test;

public class JapaneseYenTest {

    JapaneseYen japaneseYen = new JapaneseYen();

    @Test
    public void euroToBritishPoundTest(){

        double expected = 167.40;
        double actual = japaneseYen.japaneseYenToChineseYuanRenminbi(10);

        Assert.assertEquals(expected, actual, 0);
    }
}
