package com.markbrown.wutangfinancial;

import java.io.InputStream;

/**
 * Created by markbrown on 5/22/17.
 */
public class CurrencyConverterEngine {

    public static void runEngine() {
        InputSetup asker = new InputSetup(System.in, System.out);
        Print.printWelcomeMessage();
        while (true) {
            if (Input.askForExit(asker).equalsIgnoreCase("Exit")) {break;}
            Print.printAvailableCurrencies();
            obtainStartingCurrency();


        }

    }

    private static void obtainStartingCurrency() {
        InputSetup asker = new InputSetup(System.in, System.out);
        String currencyInput = Input.askForInitialCurrencyType(asker);
        while (!InputChecker.checkForValidCurrency(currencyInput)) {
            currencyInput = Input.askForInitialCurrencyType(asker);
        }
        CurrentCurrencyInformation.setCurrentCurrencyType(currencyInput);
        Print.printCurrentCurrency();
    }
}
