import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Console console = new Console();
    console.startMainMenu();

    ExchangeRates currencyToChoice = console.getExchangeType("What currency would you like to convert to?");
    ExchangeRates currencyFromChoice = console.getExchangeType("Looking at the menu, what currency are you converting from?");
    System.out.println("How much would you like to convert?");
    double amount = sc.nextInt();

    CurrencyConverter converter = new CurrencyConverter();
    double convertedAmount = converter.convertCurrency(amount, currencyFromChoice, currencyToChoice);
        System.out.printf("$%.2f %s is $%.2f in %s!", amount, currencyFromChoice, convertedAmount, currencyToChoice);
    }
}

