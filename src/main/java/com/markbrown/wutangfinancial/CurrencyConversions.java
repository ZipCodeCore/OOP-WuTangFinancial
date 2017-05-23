package com.markbrown.wutangfinancial;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by markbrown on 5/22/17.
 */
public class CurrencyConversions {

    public static Map<String, Double> createCurrencyMap() {
        Map<String, Double> currencyConversionMap = new TreeMap<>();
        currencyConversionMap.put("US_Dollar", 1.00);
        currencyConversionMap.put("Euro", 0.94);
        currencyConversionMap.put("British_Pound", 0.82);
        currencyConversionMap.put("Indian_Rupee", 68.32);
        currencyConversionMap.put("Australian_Dollar", 1.35);
        currencyConversionMap.put("Canadian_Dollar", 1.32);
        currencyConversionMap.put("Singapore_Dollar", 1.43);
        currencyConversionMap.put("Swiss_Franc", 1.01);
        currencyConversionMap.put("Malaysian_Ringgit", 4.47);
        currencyConversionMap.put("Japanese_Yen", 115.84);
        currencyConversionMap.put("Chinese_Yuan_Renminbi", 6.92);
        return currencyConversionMap;
    }

    public static void performConversion(Map<String, Double> currencyMap, String currentCurrency, String targetCurrency) {
        long moneyBeforeConversion = Money.getMoneyInOneHundredths();
        double conversionRate = currencyMap.get(targetCurrency) / currencyMap.get(currentCurrency);
        Money.setMoneyInOneHundredths((long)((double) moneyBeforeConversion * conversionRate));
    }




}
