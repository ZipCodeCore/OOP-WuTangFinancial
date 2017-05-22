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
            obtainMoney();
            obtainMoneyInTargetCurrency();

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

    private static void obtainMoney() {
        InputSetup asker = new InputSetup(System.in, System.out);
        String money = Input.askForMonetaryAmount(asker);
        while (!InputChecker.checkForValidMoneyInput(money)) {
            money = Input.askForInitialCurrencyType(asker);
        }
        long moneyAsLong = Input.convertMoneyToLongType(money);
        CurrentMoneyInformation.setMoneyInOneHundredths(moneyAsLong);
        Print.printCurrentMonetaryAmount();
    }

    private static void obtainMoneyInTargetCurrency() {}
}
