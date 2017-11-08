package Mohammed.Abrar;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class InputConsoleTest {
    InputConsole inputConsole = new InputConsole();
    NonDollarCurrencies nonDollarCurrencies = new NonDollarCurrencies();
    @Test
    void inputCurrencyType() {

    }

    @Test
    void inputCurrencyAmount() {
    }

    @Test
    void inputToDollarTest() {



        double expected =120 / .94;
        double actual = inputConsole.inputToDollar(2, 120);
        Assert.assertEquals(expected,actual,0);//  euro to dollar  conversion passed


//        double expected =120 / 0.82;
//        double actual = inputConsole.inputToDollar(3, 120);
//        Assert.assertEquals(expected,actual,0);// British pound  to dollar conversion passed
//

//        double expected =120 / 68.32;
//        double actual = inputConsole.inputToDollar(4, 120);
//        Assert.assertEquals(expected,actual,0);// dollar to indian rupee passed



//        double expected =120 / 1.35;
//        double actual = inputConsole.inputToDollar(5, 120);
//        Assert.assertEquals(expected,actual,0);//  Australian dollar to dollar passed


//        double expected =120 / 1.32;
//        double actual = inputConsole.inputToDollar(6, 120);
//        Assert.assertEquals(expected,actual,0);// dollar to Canadian dollar passed


//        double expected =120 / 1.43;
//        double actual = inputConsole.inputToDollar(7, 120);
//        Assert.assertEquals(expected,actual,0); // Singapore dollar to dollar  passed


//       double expected =120 / 1.01;
//        double actual = inputConsole.inputToDollar(8, 120);
//        Assert.assertEquals(expected,actual,0); // Swiss franc to dollar passed


//        double expected =120 / 4.47;
//        double actual = inputConsole.inputToDollar(9, 120);
//        Assert.assertEquals(expected,actual,0); //  Malaysian ringgit to dollar passed


//         double expected =120 / 115.84;
//        double actual = inputConsole.inputToDollar(10, 120);
//        Assert.assertEquals(expected,actual,0); //  Japanese yen to dollar passed


//        double expected = 120 / 6.92;
//        double actual = inputConsole.inputToDollar(11, 120);
//        Assert.assertEquals(expected, actual, 0);  //  chinese yaun to dollar passed



    }

}