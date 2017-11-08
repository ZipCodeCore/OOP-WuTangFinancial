package susnick_andrea_exchangeRateLab;

public class ConsoleUserInterface {


    public static void display() {
        CurrencyConverter cc = new CurrencyConverter();

        System.out.println("WELCOME TO THE CURRENCY CONVERTER CALCULATOR");
        System.out.println("============================================");
        Double amount = Console.getDoubleUserInput("How much money would you like to exchange?");
        Currency currentCurrencyType = Console.getCurrencyUserInput("What type of currency do you have?");

        Currency newCurrencyType = Console.getCurrencyUserInput("What type would you like to exchange that amount to?");

        cc.currencyConversionCalculator(amount, currentCurrencyType, newCurrencyType);

        System.out.println(cc.currencyConversionCalculator(amount, currentCurrencyType, newCurrencyType));
    }


}
