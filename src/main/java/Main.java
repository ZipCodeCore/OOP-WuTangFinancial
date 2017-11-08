
public class Main {

    public static void main(String[] args) {
        Console console = new Console();
        Console.startMainMenu();
        do {
            ExchangeRates currencyToChoice = console.getExchangeType(
                    console.getStringInput("What currency would you like to convert to?"));

            ExchangeRates currencyFromChoice = console.getExchangeType(
                    console.getStringInput("Looking at the menu, what currency are you converting from?"));

            double amount = console.getDoubleInput("How much would you like to convert?");

            CurrencyConverter converter = new CurrencyConverter();
            double convertedAmount = converter.convertCurrency(amount, currencyFromChoice, currencyToChoice);
            System.out.printf("$%.2f %s is $%.2f in %s!", amount, currencyFromChoice, convertedAmount, currencyToChoice);

        } while (console.exitOrContinueApplication());
    }
}