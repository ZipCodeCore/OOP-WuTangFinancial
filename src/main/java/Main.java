import Utilities.Console;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Double currentCurrencyAmount = Console.getDoubleInput("How much money do you want to convert? ");

        String currentCurrency = CurrencyConverter.checkCurrencyType("What is your current currency? " + CurrencyConverter.getSupportedCurrencies());

        String desiredCurrency = CurrencyConverter.checkCurrencyType("What currency do you want to convert to? " + CurrencyConverter.getSupportedCurrencies());

        Double newCurrencyAmount = CurrencyConverter.convertFromCurrentCurrencyToDesiredCurrency(currentCurrencyAmount, currentCurrency, desiredCurrency);

        System.out.printf("You have converted your %.2f %s to %.2f %s", currentCurrencyAmount, currentCurrency, newCurrencyAmount, desiredCurrency);
    }
}
