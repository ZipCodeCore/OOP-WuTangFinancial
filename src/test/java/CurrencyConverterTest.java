
/*
 *
 * Created by amazing amy 2/16/18
 *
 * have a nice day
 *
 *
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ConverterTest {

    enum testCurrencyEnum {USD,EUR,GBP, INR, AUD, CAD, SGD, CHF, MYR, JPY, CNY};

    private double getExchangeRate (testCurrencyEnum theCurrency){

        switch(theCurrency){
            case USD: return 1.00;
            break;

            case EUR: return 0.94;
            break;

            case GBP: return 0.82;
            break;

            case INR: return 68.32;
            break;

            case AUD: return 1.35;
            break;

            case CAD: return 1.32;
            break;

            case SGD: return 1.43;
            break;

            case CHF: return 1.01;
            break;

            case MYR: return 4.47;
            break;

            case JPY: return 115.84;
            break;

            case CNY: return 6.92;
            break;

            default:
                return 0.00;

        }
    }

    public static void main(String[] args) {

    }

    Converter testConverter;

    @Before
    public void setup (){

        testConverter = new Converter();

    }

    @Test
    public void dollarToEuroTest(){
        CurrencyConverter.dollarToEuroTest("EUR");
        double expected = 0;
        double actual = 0;
        Assert.assertequals(expected, actual, 0.001);
    }



    //end
}
