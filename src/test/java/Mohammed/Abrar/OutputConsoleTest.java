package Mohammed.Abrar;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputConsoleTest {


    @Test
    void printCurrencyConvertedValueTest() {

        String expected = "The conversion value is 130,330.35";

        String actual = outputConsole.printCurrencyConvertedValue(130330.355);
        Assert.assertEquals("The two values are equal", expected, actual);

    }

    OutputConsole outputConsole = new OutputConsole();


    @Test
    void dollarToOutput() {

//        double expected =120;
//        double actual = outputConsole.dollarToOutput(1, 120);// testing dollar to dollar conversion
//        Assert.assertEquals(expected,actual,0);


//        double expected =120*.94;
//        double actual = outputConsole.dollarToOutput(2, 120);
//        Assert.assertEquals(expected,actual,0);// dollar to euro conversion passed


//        double expected =120 * 0.82;
//        double actual = outputConsole.dollarToOutput(3, 120);
//        Assert.assertEquals(expected,actual,0);// dollar to british pound conversion passed
//

//        double expected =120*68.32;
//        double actual = outputConsole.dollarToOutput(4, 120);
//        Assert.assertEquals(expected,actual,0);// dollar to indian rupee passed


//         double expected =120*115.84;
//        double actual = outputConsole.dollarToOutput(10, 120);
//        Assert.assertEquals(expected,actual,0);


//        double expected =120*1.35;
//        double actual = outputConsole.dollarToOutput(5, 120);
//        Assert.assertEquals(expected,actual,0);// dollar to Australian dollar passed


//        double expected =120 * 1.32;
//        double actual = outputConsole.dollarToOutput(6, 120);
//        Assert.assertEquals(expected,actual,0);// dollar to Canadian dollar passed


//        double expected =120*1.43;
//        double actual = outputConsole.dollarToOutput(7, 120);
//        Assert.assertEquals(expected,actual,0); // dpllar to Singapore dollar passed


//       double expected =120*1.01;
//        double actual = outputConsole.dollarToOutput(8, 120);
//        Assert.assertEquals(expected,actual,0); // dollar to Swiss franc passed


//        double expected =120 * 4.47;
//        double actual = outputConsole.dollarToOutput(9, 120);
//        Assert.assertEquals(expected,actual,0); // dollar to Malaysian ringgit passed

//
//         double expected =120 * 115.84;
//        double actual = outputConsole.dollarToOutput(10, 120);
//        Assert.assertEquals(expected,actual,0); // dollar to Japanese yen passed


        double expected = 120 * 6.92;
        double actual = outputConsole.dollarToOutput(11, 120);
        Assert.assertEquals(expected, actual, 0);  // dollar to chinese yaun passed


    }

}