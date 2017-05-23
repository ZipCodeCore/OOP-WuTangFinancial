package prahl.daniel;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by danielprahl on 5/22/17.
 */
public class CurrencyConverter {
    /* Formula:
    *                 sourceAmount
    * targetAmount = -------------- * rateToTarget
    *                  rateToUSD
     */

    public static HashMap<String, Double> rateTable;

    public CurrencyConverter() {
        rateTable = new HashMap<>();
        rateTable.put("Us Dollar", 1.00);
        rateTable.put("Euro", 0.94);
        rateTable.put("British Pound", 0.82);
        rateTable.put("Indian Rupee", 68.32);
        rateTable.put("Australian Dollar", 1.35);
        rateTable.put("Canadian Dollar", 1.32);
        rateTable.put("Singapore Dollar", 1.43);
        rateTable.put("Swiss Franc", 1.01);
        rateTable.put("Malaysian Ringgit", 4.47);
        rateTable.put("Japanese Yen", 115.84);
        rateTable.put("Chinese Yuan Renminbi", 6.92);
    }

    public static double convert(String sourceCurrency, double sourceAmount, String targetCurrency){
        double dollarAmount = convertSourceToDollars(sourceCurrency, sourceAmount);
        return convertDollarsToTarget(targetCurrency, dollarAmount);
    }

    public static double getConversionRate(String currency){
        return rateTable.get(currency);
    }

    public static double convertSourceToDollars(String sourceCurrency, double sourceAmount){
        return sourceAmount / getConversionRate(sourceCurrency);
    }

    public static double convertDollarsToTarget(String targetCurrency, double sourceAmount){
        return sourceAmount * getConversionRate(targetCurrency);
    }

// End of Class
}
