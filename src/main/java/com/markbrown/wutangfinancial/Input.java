package com.markbrown.wutangfinancial;

/**
 * Created by markbrown on 5/22/17.
 */
public class Input {

    private Input () {}

    public static String askForInitialCurrencyType(InputSetup asker) {
        return asker.askForInput("Please enter an initial currency type from the menu");
    }

    public static String askForCurrencyTargetType(InputSetup asker) {
        return asker.askForInput("Please enter a target currency type from the menu");
    }

    public static String askForMonetaryAmount(InputSetup asker) {
        return asker.askForInput("Please enter the amount in currency units. Only first two decimals are accepted.");
    }

    public static long convertMoneyToLongType(String input) {
        return (long) (Double.parseDouble(input)*100);
    }

    public static String askForExit(InputSetup asker) {
        return asker.askForInput("Would you like to exit? Type exit. To stay hit return.");
    }
}
