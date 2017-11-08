package wutang;

import javax.sound.midi.Soundbank;
import java.security.spec.ECField;

import static wutang.ExchangeRates.USD;

public class CurrencyConverter {

    public void currencyExchange() {
        Double currentCurrency;
        Double newCurrency;
        Double newTotal;

        Double num = Console.getDoubleInput("How much money would you like to exchange?");

        int i = 1;
        for(ExchangeRates rate : ExchangeRates.values()) {
            System.out.print(i++ + ") ");
            System.out.println(rate.name());
        }

        Integer currentType = Console.getIntegerInput("\nWhat kind of currency are you exchanging?\n");

        int j = 1;
        for(ExchangeRates rate : ExchangeRates.values()) {
            System.out.print(j++ + ") ");
            System.out.println(rate.name());
        }

        Integer newType = Console.getIntegerInput("\nWhat new currency would you like?");


        currentCurrency = ExchangeRates.valueOf(currentType).getRate();
        newCurrency = ExchangeRates.valueOf(newType).getRate();
        newTotal = num / currentCurrency * newCurrency;

        System.out.printf("%.2f", newTotal);
        //need to fix formatting of round number

    }

}


