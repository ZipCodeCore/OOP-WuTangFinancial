package zygmundfelt.dan.wutangfinancial;

import java.util.Scanner;

public class IOHandler {

    private static final Scanner scanner = new Scanner(System.in);

    public static void print(String val, Object... args) {
        System.out.format(val, args);
    }

    public static void println(String val, Object... vals) {
        print(val + "\n", vals);
    }

    public static String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return scanner.nextLine();
    }

    public static void repeatPrint(int numberOfRepeats, String val) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfRepeats; i++) {
            sb.append(val);
        }
        print(sb.toString());
    }

    public static void printDashes() {
        repeatPrint(80, "-");
        println("");
    }

    public static void welcomeMessage() {
        println("Welcome to the 36 chambers of Wu-Tang Financial, Inc.\n\n" +
                    "International business is a crazy game, and we're here to\n" +
                    "protect ya neck.\n");
    }

    public static CurrencyConverter.ConversionRate getInitialCurrencyType() {
        String initialCurrency = getStringInput("What sort of currency are you starting with?");
        return CurrencyConverter.ConversionRate.valueOf(initialCurrency);
    }

    public static CurrencyConverter.ConversionRate getFinalCurrencyType() {
        String finalCurrency = getStringInput("What sort of currency you leaving with?");
        return CurrencyConverter.ConversionRate.valueOf(finalCurrency);
    }

    public static long getMoneyInput(String prompt, Object... args) {
        String stringInput = getStringInput(prompt, args);
        try {
            double doubleInput = Double.parseDouble(stringInput);
            return Math.round(doubleInput*100);
        } catch (NumberFormatException nfe) {
            println("[ %s ] is an invalid input!", stringInput);
            println("Try inputting a numeric value!");
            return getMoneyInput(prompt, args);
        }
    }

    public static String moneyToString(long amount) {
        long whole = amount / 100;
        long part = amount % 100;
        return String.format("%d.%02d", whole, part);
    }

    public static void printMoney(long amount, CurrencyConverter.ConversionRate rate) {
        println("That's " + moneyToString(amount) + " in " + rate + ".\n\nC.R.E.A.M., don't forget it.\nPeace.");
    }

    public static void printCurrencyMenu(String name) {
        printDashes();
        println("OK, " + name + ". Your choices are...\n" +
                "US_DOLLAR\n" +
                "EURO\n" +
                "BRITISH_POUND\n" +
                "INDIAN_RUPEE\n" +
                "AUSTRALIAN_DOLLAR\n" +
                "CANADIAN_DOLLAR\n" +
                "SINGAPORE_DOLLAR\n" +
                "SWISS_FRANC\n" +
                "MALAYSIAN_RINGGIT\n" +
                "JAPANESE_YEN\n" +
                "and last but not least,\n" +
                "CHINESE_YUAN_RENMINBI\n");
        printDashes();
    }

    @Override
    protected void finalize() throws Throwable {
        scanner.close();
    }
}
