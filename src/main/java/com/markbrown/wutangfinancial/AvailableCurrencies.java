package com.markbrown.wutangfinancial;

/**
 * Created by markbrown on 5/22/17.
 */
public enum AvailableCurrencies {

    US_Dollar, Euro, British_Pound, Indian_Rupee, Australian_Dollar,
    Canadian_Dollar, Singapore_Dollar, Swiss_Franc, Malaysian_Ringgit, Japanese_Yen, Chinese_Yuan_Renminbi;

    public static boolean searchForCurrency(String currency) {
        for (AvailableCurrencies availableCurrencies : values()) {
            if (availableCurrencies.toString().equals(currency)) {
                return true;
            }
        }
        return false;
    }
}
