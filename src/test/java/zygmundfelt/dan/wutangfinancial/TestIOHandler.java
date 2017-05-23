package zygmundfelt.dan.wutangfinancial;

import org.junit.*;

public class TestIOHandler {

    @Test
    public void moneyToStringNormalTest() {
        String expected = "1234.56";

        String actual = IOHandler.moneyToString(123456);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void moneyToStringZerosTest() {
        String expected = "4321.00";

        String actual = IOHandler.moneyToString(432100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void moneyToStringNegativeTest() {
        String expected = "-100.01";

        String actual = IOHandler.moneyToString(-10001);

        Assert.assertEquals(expected, actual);
    }

}
