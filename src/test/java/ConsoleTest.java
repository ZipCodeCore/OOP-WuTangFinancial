import org.junit.Assert;
import org.junit.Test;

public class ConsoleTest {

    @Test
    public void numToEnumTest(){
        Console console = new Console();
        Currency expected = console.numToEnum(2);
        Currency actual = Currency.values()[2 -1];
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dollarToEuro() throws Exception{
        Console console = new Console();
        Currency firstOption = console.numToEnum(1);
        Currency secondOption = console.numToEnum(2);
        Double amountInput = 10.0;
        Double expected = 9.399999999999999;
        Double actual = Convert.convertCurency(firstOption, secondOption, amountInput);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void euroToDollar() throws Exception{
        Console console = new Console();
        Currency firstOption = console.numToEnum(2);
        Currency secondOption = console.numToEnum(1);
        Double amountInput = 10.0;
        Double expected = 10.638297872340425;
        Double actual = Convert.convertCurency(firstOption, secondOption, amountInput);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void euroToBritishPound() throws Exception{
        Console console = new Console();
        Currency firstOption = console.numToEnum(2);
        Currency secondOption = console.numToEnum(3);
        Double amountInput = 10.0;
        Double expected = 8.723404255319148;
        Double actual = Convert.convertCurency(firstOption,secondOption,amountInput);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void britishPoundToIndianRupee()throws Exception{
        Console console = new Console();
        Currency firstOption = console.numToEnum(3);
        Currency secondOption = console.numToEnum(4);
        Double amountInput = 10.0;
        Double expected = 833.170731707317;
        Double actual = Convert.convertCurency(firstOption, secondOption, amountInput);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rupeeToCanadian()throws Exception{
        Console console = new Console();
        Currency firstOption = console.numToEnum(4);
        Currency secondOption = console.numToEnum(6);
        Double amountInput = 10.0;
        Double expected = 0.193208430913349;
        Double actual = Convert.convertCurency(firstOption, secondOption, amountInput);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void canadianToSingapore()throws Exception{
        Console console = new Console();
        Currency firstOption = console.numToEnum(6);
        Currency secondOption = console.numToEnum(7);
        Double amountInput = 10.0;
        Double expected = 10.833333333333332;
        Double actual = Convert.convertCurency(firstOption, secondOption, amountInput);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void singaporeToSwiss()throws Exception{
        Console console = new Console();
        Currency firstOption = console.numToEnum(7);
        Currency secondOption = console.numToEnum(8);
        Double amountInput = 10.0;
        Double expected = 7.062937062937063;
        Double actual = Convert.convertCurency(firstOption, secondOption, amountInput);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void swissToMalaysianRinggit()throws Exception{
        Console console = new Console();
        Currency firstOption = console.numToEnum(8);
        Currency secondOption = console.numToEnum(9);
        Double amountInput = 10.0;
        Double expected = 44.257425742574256;
        Double actual = Convert.convertCurency(firstOption, secondOption, amountInput);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ringgitToYen()throws Exception{
        Console console = new Console();
        Currency firstOption = console.numToEnum(9);
        Currency secondOption = console.numToEnum(10);
        Double amountInput = 10.0;
        Double expected = 259.1498881431767;
        Double actual = Convert.convertCurency(firstOption, secondOption, amountInput);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void yenToYuan()throws Exception{
        Console console = new Console();
        Currency firstOption = console.numToEnum(10);
        Currency secondOption = console.numToEnum(11);
        Double amountInput = 10.0;
        Double expected = 0.5973756906077348;
        Double actual = Convert.convertCurency(firstOption, secondOption, amountInput);
        Assert.assertEquals(expected, actual);
    }
}
