package stimmel.zachary;

import java.text.DecimalFormat;

public class Converter {

    static DecimalFormat formatter = new DecimalFormat("#.00");

    public void start() {

        printCurrencies();
        Currency currencyToExchange = Console.getEnum("Currency to exchange: ");
        Currency convertToCurrency = Console.getEnum("Currency to convert to: ");
        double amount = Console.getDouble(currencyToExchange + " Amount: ");

        String convertedAmount = convert(amount, currencyToExchange, convertToCurrency);

        System.out.println("Converted " + formatter.format(amount) + " " + currencyToExchange + " to " + convertedAmount + " " + convertToCurrency + ".");

        start();

    }

    public static String convert(double amountFromUser, Currency fromCurrency, Currency toCurrency) {

        double convertedamount = (amountFromUser / fromCurrency.getValue()) * toCurrency.getValue();
        return formatter.format(convertedamount);
    }

    public void printCurrencies() {
        System.out.println("\n======================================================");
        for (Enum e : Currency.values()) {
            System.out.print(e + "  ");
        }
        System.out.println("\n======================================================");
    }

}
