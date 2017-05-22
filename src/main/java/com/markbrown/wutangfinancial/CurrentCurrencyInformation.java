package com.markbrown.wutangfinancial;

/**
 * Created by markbrown on 5/22/17.
 */
public class CurrentCurrencyInformation {

    private static String currentCurrencyType;

    private CurrentCurrencyInformation() {}

    public static void setCurrentCurrencyType(String currencyType) {
        currentCurrencyType = currencyType;
    }

    public static String getCurrentCurrencyType() {
        return currentCurrencyType;
    }

}
