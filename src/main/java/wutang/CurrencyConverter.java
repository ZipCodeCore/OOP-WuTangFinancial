package wutang;


public class CurrencyConverter {

    public void currencyExchange() {

        ExchangeRates currentCurrency;
        ExchangeRates newCurrency;
        Double newTotal;

        Double moneyInput = Console.getDoubleInput("How much money would you like to exchange?");

        Console.printCurrencyOptions();
        currentCurrency = Console.getCurrency("What kind of currency are you exchanging? Choose a number from above.");


        Console.printCurrencyOptions();
        newCurrency = Console.getCurrency("What new currency would you like to receive? Choose a number from above.");

        newTotal = CurrencyCalculator.convert(moneyInput, currentCurrency, newCurrency);


        System.out.printf("Your %,.2f in %s was converted to %s which totaled: %,.2f", moneyInput, currentCurrency, newCurrency, newTotal);

    }

}


