package com.markbrown.wutangfinancial;

/**
 * Created by markbrown on 5/22/17.
 */
public class Print {

    private Print() {}

    public static void printInvalidInput(String input) {
        String formattedInput = String.format("[%s]", input);
        System.out.println(formattedInput + " is not a valid input.");
    }

    public static void printWelcomeMessage() {
        System.out.println("---------------------------------------------");
        System.out.println("Welcome to the Currency Calculator!");
        System.out.println();
    }

    public static void printAvailableCurrencies() {
        System.out.println("---------------------------------------------");
        System.out.println("Available Currencies: \n");
        for (AvailableCurrencies availableCurrencies: AvailableCurrencies.values()) {
            System.out.println(availableCurrencies.toString());
        }
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println();
    }

    public static void printCurrentCurrency() {
        System.out.println();
        System.out.println("Currency is " + Currency.getCurrentCurrencyType());
        System.out.println();
    }

    public static void printCurrentMonetaryAmount() {
        System.out.println();
        System.out.print("Currency amount: ");
        System.out.printf("%,.2f", Money.getMoneyInCurrency());
        System.out.print(" " + Currency.getCurrentCurrencyType());
        System.out.println();
    }


}
