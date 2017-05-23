package com.markbrown.wutangfinancial;

import java.util.Map;

/**
 * Created by markbrown on 5/22/17.
 */
public class CurrencyConverterEngine {

    public static void runEngine() {
        InputSetup asker = new InputSetup(System.in, System.out);
        Map<String,Double> currencyMap = CurrencyConversions.createCurrencyMap();
        Print.printWelcomeMessage();
        while (true) {
            if (Input.askForExit(asker).equalsIgnoreCase("Exit")) {break;}
            Print.printAvailableCurrencies();
            obtainStartingCurrency();
            obtainMoney();
            obtainTargetCurrency();
            CurrencyConversions.performConversion(currencyMap, Currency.getCurrentCurrencyType(), Currency.getTargetCurrencyType());
            Currency.setCurrentCurrencyType(Currency.getTargetCurrencyType());
            Print.printCurrentMonetaryAmount();

        }
    }

    private static void obtainStartingCurrency() {
        InputSetup asker = new InputSetup(System.in, System.out);
        String currencyInput = Input.askForInitialCurrencyType(asker);
        while (!InputChecker.checkForValidCurrency(currencyInput)) {
            currencyInput = Input.askForInitialCurrencyType(asker);
        }
        Currency.setCurrentCurrencyType(currencyInput);
        Print.printCurrentCurrency();
    }

    private static void obtainMoney() {
        InputSetup asker = new InputSetup(System.in, System.out);
        String money = Input.askForMonetaryAmount(asker);
        while (!InputChecker.checkForValidMoneyInput(money)) {
            money = Input.askForInitialCurrencyType(asker);
        }
        long moneyAsLong = Input.convertMoneyToLongType(money);
        Money.setMoneyInOneHundredths(moneyAsLong);
        Print.printCurrentMonetaryAmount();
    }

    private static void obtainTargetCurrency() {
        InputSetup asker = new InputSetup(System.in, System.out);
        String currencyInput = Input.askForCurrencyTargetType(asker);
        while (!InputChecker.checkForValidCurrency(currencyInput)) {
            currencyInput = Input.askForCurrencyTargetType(asker);
        }
        Currency.setTargetCurrencyType(currencyInput);
    }
}
