package io.zipcoder.wutang.console;

import io.zipcoder.wutang.converter.Converter;
import io.zipcoder.wutang.currencies.*;

import java.util.HashSet;

public class Console {

    final static HashSet<Currency> currencies = new HashSet<>();
    Converter converter = new Converter();

    static {
        currencies.add(new AUD());
        currencies.add(new CAD());
        currencies.add(new CHF());
        currencies.add(new CNY());
        currencies.add(new EUR());
        currencies.add(new GBP());
        currencies.add(new INR());
        currencies.add(new JPY());
        currencies.add(new SGD());
        currencies.add(new USD());
    }

    public void run() {
        System.out.println("Welcome to Wu-Tang Financial Currency Converter!");
        String input;

        do{
            printChoices();
            input = Input.getStringInput("Pick a currency to convert or [ EXIT ] once you're finished converting your dosh.");

            if("EXIT".equalsIgnoreCase(input)){
                System.out.println("Thank you for using the Wu-Tang Currency Converter, Goodbye!");
                break;
            } else {
                doConversion(input);
            }
        } while (true);
    }

    private void doConversion(String input) {
        Currency currType1 = getCurrOfType(input);

        input = Input.getStringInput("What currency would you like to convert that to?");
        Currency currType2 = getCurrOfType(input);

        Double amount = Input.getPositiveDoubleInput("How much "+currType1.getFullName()+" would you like to convert to "+currType2.getFullName()+"?");
        Double amountConverted = converter.convert(amount, currType1, currType2);

        System.out.println("That comes out to be: "+currType2.printAmountInCurrency(amountConverted)+"\n\n");
    }

    public Currency getCurrOfType(String input) {
        do {
            for (Currency currency : currencies) {
                if (currency.getClass().getSimpleName().equalsIgnoreCase(input))
                    return currency;
            }
            input = Input.getStringInput("Please try again.");
        } while (true);
    }

    private static void printChoices(){
        String choices = "We can convert between these currencies: ";
        for (Currency currency: currencies) {
            choices += "\n[ "+currency.getClass().getSimpleName()+" ] - "+currency.getFullName();
        }
        System.out.println(choices);
    }
}
