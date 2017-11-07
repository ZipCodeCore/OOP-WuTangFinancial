import org.junit.Assert;
import org.junit.Test;


public class ConsoleTest {

    @Test
    public void verifyCurrencyPassTest(){
        Console console = new Console();
        boolean expected = true;

        boolean actual = console.verifyCurrency("usdollar");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void verifyCurrencyFailTest(){
        Console console = new Console();
        boolean expected = false;

        boolean actual = console.verifyCurrency("galleons");

        Assert.assertEquals(expected, actual);
    }

}