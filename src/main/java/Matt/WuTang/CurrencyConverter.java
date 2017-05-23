package Matt.WuTang;

import java.text.DecimalFormat;

/**
 * Created by mattwu on 5/22/17.
 */
public class CurrencyConverter {


    public double exchange(double amountToExchange, double currencyIn, double currencyOut) {

        double amountChanged =  Math.round (amountToExchange * currencyOut/currencyIn * 100.0) / 100.0;

            if(amountChanged < 0){    //prevent negative number
                return 0;
            }

        return amountChanged;
    }

}
