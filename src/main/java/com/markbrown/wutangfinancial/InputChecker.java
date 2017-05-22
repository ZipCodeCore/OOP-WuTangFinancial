package com.markbrown.wutangfinancial;


import org.apache.commons.lang3.math.NumberUtils;

public class InputChecker {

    private InputChecker() {}

    public static boolean checkForValidCurrency(String input) {
        if (!AvailableCurrencies.searchForCurrency(input)) {
            Print.printInvalidInput(input);
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkForValidMoneyInput(String input) {
        if (!NumberUtils.isParsable(input)) {
            Print.printInvalidInput(input);
            return false;
        } else {
            return true;
        }
    }
}
