package susnick_andrea_exchangeRateLab;

public class ConsoleUserInterface {

    public static void display() {
        CurrencyConverter cc = new CurrencyConverter();

        System.out.println("        CURRENCY CONVERTER CALCULATOR       ");
        System.out.println("============================================");

        Currency currentCurrencyType = Console.getCurrencyUserInput("Please choose the type of currency you'd like to exchange:");

        Double amount = Console.getDoubleUserInput("Please write the amount you'd like to exchange:");

        Currency newCurrencyType = Console.getCurrencyUserInput("Please choose the type of currency you are exchanging to:");

        cc.currencyConversionCalculator(amount, currentCurrencyType, newCurrencyType);

        System.out.println("Your new amount is: $" + cc.currencyConversionCalculator(amount, currentCurrencyType, newCurrencyType));
    }


}
