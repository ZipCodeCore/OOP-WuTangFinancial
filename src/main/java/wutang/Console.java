package wutang;

import java.util.Scanner;

public class Console {

    public static Double getDoubleInput(String prompt){
        String userInputString;

        do {
            userInputString = getStringInput(prompt);
            try {
                Double userInputAsDouble = Double.parseDouble(userInputString);
                return userInputAsDouble;
            } catch (IllegalArgumentException iae){
                System.out.println("Please enter a valid number.");
                continue;
            }

        } while (true);
    } // end getDoubleInput method

    public static int getIntegerInput(String prompt) {

        return getDoubleInput(prompt).intValue();
    }

    public static String getStringInput(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static ExchangeRates getCurrency(String prompt) {
        Integer currentType = Console.getIntegerInput("\n" + prompt);
        ExchangeRates currentCurrency;
        try {
            currentCurrency = ExchangeRates.values()[currentType - 1];
            System.out.println("\nThe currency you chose is: " + currentCurrency);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nInvalid number choice. Please choose numbers from 1 to 11.");
            printCurrencyOptions();
            currentCurrency = getCurrency(prompt);
        }
        return currentCurrency;
    }

    public static void printCurrencyOptions() {
        System.out.println();
        int j = 1;
        for(ExchangeRates rate : ExchangeRates.values()) {
            System.out.print(j++ + ") ");
            System.out.println(rate.name());
        }
    }

}
