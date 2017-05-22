package ibikunle.tolani;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by tolaniibikunle on 2/16/17.
 */
public class ConverterTest {
    Converter converter;

    @Before
    public void setUp(){
        converter = new Converter("British Pound","Indian Rupee",10.00);
    }

    @Test
    public void converterTest(){
        double expected = 833.17;
        double actual = converter.convert();
        Assert.assertEquals("Testing converting method",expected,actual,0);
    }

}
