/*
*
* Created by amazing amy 2/16/18
*
* have a nice day
*
*
*
 */

public class CurrencyConverter {

    private double getExchangeRate(testCurrencyEnum desiredXRate) {

        //i am not yet sure if i need to use return or System.out.println(). I think it's the latter.
        switch (desiredXRate) {
            case USD:
                System.out.println(1.00);
                break;

            case EUR:
                return 0.94;
            break;

            case GBP:
                return 0.82;
            break;

            case INR:
                return 68.32;
            break;

            case AUD:
                return 1.35;
            break;

            case CAD:
                return 1.32;
            break;

            case SGD:
                return 1.43;
            break;

            case CHF:
                return 1.01;
            break;

            case MYR:
                return 4.47;
            break;

            case JPY:
                return 115.84;
            break;

            case CNY:
                return 6.92;
            break;

            default:
                return 0.00;

        }

        return 0.0;

    }
}
