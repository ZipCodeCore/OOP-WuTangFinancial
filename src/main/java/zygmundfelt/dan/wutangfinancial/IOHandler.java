package zygmundfelt.dan.wutangfinancial;

import java.util.Scanner;

public class IOHandler {

    private static final Scanner scanner = new Scanner(System.in);

    public static void println(String val) {
        System.out.format(val + "\n");
    }

    public static String getStringInput(String prompt) {
        println(prompt);
        return scanner.nextLine();
    }

    public static void printDashes() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 80; i++) {
            sb.append("-");
        }
        println(sb.toString());
    }

    public static void welcomeMessage() {
        println("From the slums of Shaolin, Wu-Tang Clan strikes again\n" +
                "The RZA, the GZA, Ol' Dirty Bastard, Inspectah Deck\n" +
                "Raekwon the Chef, U-God, Ghostface Killah and the Method Man\n");
        printDashes();
        println("Welcome to the 36 chambers of Wu-Tang Financial, Inc.\n\n" +
                "International business is a crazy game, and we're here to\n" +
                "protect ya neck.\n");
    }

    public static CurrencyConverter.ConversionRate getCurrencyType(String prompt) {
        String currency = getStringInput(prompt);
        return CurrencyConverter.ConversionRate.valueOf(currency);
    }

    public static long getMoneyInput(String prompt) {
        String stringInput = getStringInput(prompt);
        double doubleInput = Double.parseDouble(stringInput);
        return Math.round(doubleInput*100);
    }

    public static String moneyToString(long amount) {
        long whole = amount / 100;
        long part = Math.abs(amount % 100);
        return String.format("%d.%02d", whole, part);
    }

    public static void printMoney(long amount, CurrencyConverter.ConversionRate rate) {
        println("That's " + moneyToString(amount) + " in " + rate + ".");
        printDashes();
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

    public static boolean promptContinue() {
        return getStringInput("Press 'N' to leave the building, but Wu-Tang is here forever.\n" +
                "Or press any other key to continue transacting.").equalsIgnoreCase("n");
    }

    public static void exitMessage() {
        printDashes();
        println("C.R.E.A.M., don't forget it. Peace.");
        printDashes();
    }

    @Override
    protected void finalize() throws Throwable {
        scanner.close();
    }
}
