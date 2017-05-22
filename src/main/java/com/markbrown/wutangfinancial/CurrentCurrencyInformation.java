package com.markbrown.wutangfinancial;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.InvalidObjectException;

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
