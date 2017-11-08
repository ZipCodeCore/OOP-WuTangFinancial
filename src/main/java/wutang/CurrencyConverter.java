package wutang;

import javax.sound.midi.Soundbank;
import java.security.spec.ECField;

import static wutang.ExchangeRates.USD;

public class CurrencyConverter {

    public void currencyExchange() {
        ExchangeRates currentCurrency;
        ExchangeRates newCurrency;
        Double newTotal;

        Double num = Console.getDoubleInput("How much money would you like to exchange?");

        int i = 1;
        for(ExchangeRates rate : ExchangeRates.values()) {
            System.out.print(i++ + ") ");
            System.out.println(rate.name());
        }

        Integer currentType = Console.getIntegerInput("\nWhat kind of currency are you exchanging? Choose a number from above.\n");

        int j = 1;
        for(ExchangeRates rate : ExchangeRates.values()) {
            System.out.print(j++ + ") ");
            System.out.println(rate.name());
        }

        Integer newType = Console.getIntegerInput("\nWhat new currency would you like? Choose a number from above.");

        

        currentCurrency = ExchangeRates.values()[currentType - 1];
        newCurrency = ExchangeRates.values()[newType - 1];
        newTotal = num / currentCurrency.getRate() * newCurrency.getRate();

        System.out.printf("Your new currency is: " + "%.2f", newTotal);
        //need to fix formatting of round number
        //need to add exceptions
        //math conversion should be done in separate class
        //print out the type of new currency

    }

}


